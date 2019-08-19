package com.accp.erp.shiro;


import com.accp.erp.entity.SysPermissions;
import com.accp.erp.entity.SysRoles;
import com.accp.erp.entity.SysUsers;
import com.accp.erp.service.ISysUsersService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

public class AuthRealm extends AuthorizingRealm {

    @Resource
    ISysUsersService usersService;

    /**
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        // 获取用户账号
        SysUsers user = (SysUsers) principalCollection.getPrimaryPrincipal();

        // 授权对象
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        // 获取用户角色
        Set<String> roles = new HashSet<>();
        // 获取用户权限
        Set<String> setPermission = new HashSet<String>();
        for (SysRoles sysRoles : user.getRolesList()) {
            roles.add(sysRoles.getRole());
            for (SysPermissions sysPermissions : sysRoles.getPermissionsList()) {
                setPermission.add(sysPermissions.getPermission());
            }
        }
        authorizationInfo.setRoles(roles);
        authorizationInfo.setStringPermissions(setPermission);
        return authorizationInfo;
    }

    /**
     * 认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //获取用户输入的账号
        String username = (String) token.getPrincipal();
        //通过username从数据库中查到user实体
        SysUsers user = usersService.findByUsername(username);
        if (user == null) {
            return null;
        }
        //通过SimpleAuthenticationInfo做身份处理
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(user,user.getPassword(),this.getName());
        //返回身份处理对象
        return simpleAuthenticationInfo;
    }
}
