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
@ApiModel(value="Lypurchaselist对象", description="")
public class Lypurchaselist extends Model<Lypurchaselist> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "栏号")
    @TableId("SerNo")
    private Integer SerNo;

    @ApiModelProperty(value = "物料编号")
    @TableField("ProdID")
    private Integer ProdID;

    @ApiModelProperty(value = "物料名称")
    @TableField("ProdName")
    private String ProdName;

    @ApiModelProperty(value = "规格型号")
    @TableField("ProdSize")
    private String ProdSize;

    @ApiModelProperty(value = "单价")
    @TableField("SourcePrice")
    private Double SourcePrice;

    @ApiModelProperty(value = "金额")
    @TableField("SourceAmount")
    private Double SourceAmount;

    @ApiModelProperty(value = "数量")
    @TableField("Quantity")
    private Integer Quantity;

    @ApiModelProperty(value = "税率%")
    @TableField("TaxRate")
    private Float TaxRate;

    @ApiModelProperty(value = "含税金额")
    @TableField("TaxAmt")
    private Float TaxAmt;

    @ApiModelProperty(value = "价差")
    @TableField("AmountWithTax")
    private Double AmountWithTax;

    @ApiModelProperty(value = "来源单别")
    @TableField("BalanceAmt")
    private Integer BalanceAmt;

    @ApiModelProperty(value = "来源单号")
    @TableField("SourceType")
    private String SourceType;

    @ApiModelProperty(value = "汇差")
    @TableField("RateBalanceAmt")
    private Integer RateBalanceAmt;

    @ApiModelProperty(value = "差额合计")
    @TableField("TotalBalanceAmt")
    private Integer TotalBalanceAmt;

    @ApiModelProperty(value = "分录备注")
    @TableField("Remark")
    private Integer Remark;

    @ApiModelProperty(value = "单位编号")
    @TableField("StdUnitID")
    private Integer StdUnitID;

    @ApiModelProperty(value = "单位")
    @TableField("StdUnitName")
    private String StdUnitName;


    public static final String SERNO = "SerNo";

    public static final String PRODID = "ProdID";

    public static final String PRODNAME = "ProdName";

    public static final String PRODSIZE = "ProdSize";

    public static final String SOURCEPRICE = "SourcePrice";

    public static final String SOURCEAMOUNT = "SourceAmount";

    public static final String QUANTITY = "Quantity";

    public static final String TAXRATE = "TaxRate";

    public static final String TAXAMT = "TaxAmt";

    public static final String AMOUNTWITHTAX = "AmountWithTax";

    public static final String BALANCEAMT = "BalanceAmt";

    public static final String SOURCETYPE = "SourceType";

    public static final String RATEBALANCEAMT = "RateBalanceAmt";

    public static final String TOTALBALANCEAMT = "TotalBalanceAmt";

    public static final String REMARK = "Remark";

    public static final String STDUNITID = "StdUnitID";

    public static final String STDUNITNAME = "StdUnitName";

    @Override
    protected Serializable pkVal() {
        return this.SerNo;
    }

}
