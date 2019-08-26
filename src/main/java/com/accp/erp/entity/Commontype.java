package com.accp.erp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
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
 * @since 2019-08-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Commontype对象", description="")
public class Commontype extends Model<Commontype> {

    private static final long serialVersionUID = 1L;
    // 1 采购请购类型 2 采购入库类型 3采购订单类型 4销售订单类型 5销售出库类型 6入库类型 7出库类型
    private Integer flag;

    @TableField("typeId")
    private String typeId;

    @TableField("typeName")
    private String typeName;

    @TableField("engName")
    private String engName;

    private String memo;


    public static final String FLAG = "flag";

    public static final String TYPEID = "typeId";

    public static final String TYPENAME = "typeName";

    public static final String ENGNAME = "engName";

    public static final String MEMO = "memo";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
