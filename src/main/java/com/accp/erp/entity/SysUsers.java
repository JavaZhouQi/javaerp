package com.accp.erp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zq
 * @since 2019-08-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysUsers对象", description="")
public class SysUsers extends Model<SysUsers> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String username;

    private String password;

    private String salt;

    private Boolean locked;

    @TableField(exist=false)
    private List<SysRoles> rolesList;

    @TableField(exist=false)
    private List<Long> rolesIdList;

    public static final String ID = "id";

    public static final String USERNAME = "username";

    public static final String PASSWORD = "password";

    public static final String SALT = "salt";

    public static final String LOCKED = "locked";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
