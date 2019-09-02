package com.accp.erp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.security.Permission;
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
@ApiModel(value="SysPermissions对象", description="")
public class SysPermissions extends Model<SysPermissions> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String permission;

    private String description;

    private Boolean available;

    private String path;

    private Boolean catalog;

    private String icon;

    private String component;

    private String name;

    private Long pid;

    @TableField(exist = false)
    private List<SysPermissions> permissionsList;

    public static final String ID = "id";

    public static final String PERMISSION = "permission";

    public static final String DESCRIPTION = "description";

    public static final String AVAILABLE = "available";

    public static final String PATH = "path";

    public static final String CATALOG = "catalog";

    public static final String ICON = "icon";

    public static final String COMPONENT = "component";

    public static final String NAME = "name";

    public static final String PID = "pid";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
