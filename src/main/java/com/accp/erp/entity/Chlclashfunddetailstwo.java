package com.accp.erp.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 冲款款明细表2
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Chlclashfunddetailstwo对象", description="冲款款明细表2")
public class Chlclashfunddetailstwo extends Model<Chlclashfunddetailstwo> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据号码clashfund(billId)")
    @TableId("Billid")
    private String Billid;

    @ApiModelProperty(value = "栏号")
    @TableField("Cotemark")
    private Integer Cotemark;

    @ApiModelProperty(value = "预收款单单号")
    @TableField("Gatherid")
    private String Gatherid;

    @ApiModelProperty(value = "来源单别(销售订单)")
    @TableField("Sinname")
    private String Sinname;

    @ApiModelProperty(value = "来源单号（销售订单号）")
    @TableField("Originbillid")
    private String Originbillid;

    @ApiModelProperty(value = "来源单号(行号)")
    @TableField("Originoddrowid")
    private Integer Originoddrowid;

    @ApiModelProperty(value = "预收金额")
    @TableField("Advancemoney")
    private BigDecimal Advancemoney;

    @ApiModelProperty(value = "预收余额")
    @TableField("Advancebalance")
    private BigDecimal Advancebalance;

    @ApiModelProperty(value = "取用预收金额")
    @TableField("Adoptadvancemoney")
    private BigDecimal Adoptadvancemoney;

    @ApiModelProperty(value = "标识是否删除")
    @TableField("Enables")
    private Integer Enables;

    @ApiModelProperty(value = "保留字段")
    @TableField("Safetyone")
    private String Safetyone;

    @ApiModelProperty(value = "保留字段")
    @TableField("Safetytwo")
    private String Safetytwo;

    @ApiModelProperty(value = "扩展字段0")
    @TableField("Extend0")
    private String Extend0;

    @ApiModelProperty(value = "扩展字段1")
    @TableField("Extend1")
    private String Extend1;

    @ApiModelProperty(value = "扩展字段2")
    @TableField("Extend2")
    private String Extend2;

    @ApiModelProperty(value = "扩展字段3")
    @TableField("Extend3")
    private String Extend3;

    @ApiModelProperty(value = "扩展字段4")
    @TableField("Extend4")
    private String Extend4;


    public static final String BILLID = "Billid";

    public static final String COTEMARK = "Cotemark";

    public static final String GATHERID = "Gatherid";

    public static final String SINNAME = "Sinname";

    public static final String ORIGINBILLID = "Originbillid";

    public static final String ORIGINODDROWID = "Originoddrowid";

    public static final String ADVANCEMONEY = "Advancemoney";

    public static final String ADVANCEBALANCE = "Advancebalance";

    public static final String ADOPTADVANCEMONEY = "Adoptadvancemoney";

    public static final String ENABLES = "Enables";

    public static final String SAFETYONE = "Safetyone";

    public static final String SAFETYTWO = "Safetytwo";

    public static final String EXTEND0 = "Extend0";

    public static final String EXTEND1 = "Extend1";

    public static final String EXTEND2 = "Extend2";

    public static final String EXTEND3 = "Extend3";

    public static final String EXTEND4 = "Extend4";

    @Override
    protected Serializable pkVal() {
        return this.Billid;
    }

}
