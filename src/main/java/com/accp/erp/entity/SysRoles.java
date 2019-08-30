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
@ApiModel(value="SysRoles对象", description="")
public class SysRoles extends Model<SysRoles> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String role;

    private String description;

    private Boolean available;
    @TableField(exist = false)
    private List<SysPermissions> permissionsList;

    public static final String ID = "id";

    public static final String ROLE = "role";

    public static final String DESCRIPTION = "description";

    public static final String AVAILABLE = "available";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
