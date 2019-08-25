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

/**
 * <p>
 * 
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Lypurchaseinvoicedetails对象", description="")
public class Lypurchaseinvoicedetails extends Model<Lypurchaseinvoicedetails> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "物料编号")
    @TableId("ProdID")
    private Integer ProdID;

    @ApiModelProperty(value = "基本单位")
    @TableField("StdUnitName")
    private String StdUnitName;

    @ApiModelProperty(value = "单位编号")
    @TableField("StdUnitID")
    private Integer StdUnitID;

    @ApiModelProperty(value = "金额")
    @TableField("Amount")
    private Double Amount;

    @ApiModelProperty(value = "税率%")
    @TableField("TaxAmt")
    private Float TaxAmt;

    @ApiModelProperty(value = "含税金额")
    @TableField("AmountWithTax")
    private Float AmountWithTax;

    @ApiModelProperty(value = "栏号")
    @TableField("SerNo")
    private Integer SerNo;

    @ApiModelProperty(value = "未进数量")
    @TableField("LQty")
    private Integer LQty;

    @ApiModelProperty(value = "分录备注")
    @TableField("Remark")
    private Integer Remark;

    @ApiModelProperty(value = "物料名称")
    @TableField("ProdName")
    private String ProdName;

    @ApiModelProperty(value = "规格型号")
    @TableField("ProdSize")
    private String ProdSize;

    @ApiModelProperty(value = "采购订单号")
    @TableField("FormNo")
    private Integer FormNo;

    @ApiModelProperty(value = "单位编号")
    @TableField("SUnitID")
    private Integer SUnitID;

    @ApiModelProperty(value = "单位名称")
    @TableField("SUnit")
    private String SUnit;

    @ApiModelProperty(value = "单价")
    @TableField("SPriice")
    private Double SPriice;

    @ApiModelProperty(value = "数量")
    @TableField("SQuantity")
    private Integer SQuantity;


    public static final String PRODID = "ProdID";

    public static final String STDUNITNAME = "StdUnitName";

    public static final String STDUNITID = "StdUnitID";

    public static final String AMOUNT = "Amount";

    public static final String TAXAMT = "TaxAmt";

    public static final String AMOUNTWITHTAX = "AmountWithTax";

    public static final String SERNO = "SerNo";

    public static final String LQTY = "LQty";

    public static final String REMARK = "Remark";

    public static final String PRODNAME = "ProdName";

    public static final String PRODSIZE = "ProdSize";

    public static final String FORMNO = "FormNo";

    public static final String SUNITID = "SUnitID";

    public static final String SUNIT = "SUnit";

    public static final String SPRIICE = "SPriice";

    public static final String SQUANTITY = "SQuantity";

    @Override
    protected Serializable pkVal() {
        return this.ProdID;
    }

}
