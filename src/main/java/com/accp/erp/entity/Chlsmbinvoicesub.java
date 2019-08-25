package com.accp.erp.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 销售发票从表
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Chlsmbinvoicesub对象", description="销售发票从表")
public class Chlsmbinvoicesub extends Model<Chlsmbinvoicesub> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据号码，主键，PK")
    @TableId("BillNo")
    private String BillNo;

    @ApiModelProperty(value = "标记，主键，PK，")
    @TableField("Flag")
    private Integer Flag;

    @ApiModelProperty(value = "物料编号")
    @TableField("ProdId")
    private String ProdId;

    @ApiModelProperty(value = "数量")
    @TableField("Quantity")
    private BigDecimal Quantity;

    @ApiModelProperty(value = "价格")
    @TableField("Price")
    private Float Price;

    @ApiModelProperty(value = "金额")
    @TableField("Amount")
    private BigDecimal Amount;

    @ApiModelProperty(value = "税率%")
    @TableField("TaxRate")
    private Float TaxRate;

    @ApiModelProperty(value = "税额")
    @TableField("TaxAmt")
    private BigDecimal TaxAmt;

    @ApiModelProperty(value = "含税金额")
    @TableField("AmountWithTax")
    private BigDecimal AmountWithTax;

    @ApiModelProperty(value = "金额本位币")
    @TableField("LocalAmount")
    private BigDecimal LocalAmount;

    @ApiModelProperty(value = "税额本位币")
    @TableField("LocalTaxAmt")
    private BigDecimal LocalTaxAmt;

    @ApiModelProperty(value = "含税金额本位币")
    @TableField("LocalAmountWithTax")
    private BigDecimal LocalAmountWithTax;

    @ApiModelProperty(value = "栏号")
    @TableField("SerNo")
    private Integer SerNo;

    @ApiModelProperty(value = "行号，主键，PK")
    @TableField("RowNo")
    private Integer RowNo;

    @ApiModelProperty(value = "单据日期")
    @TableField("BillDate")
    private Integer BillDate;

    @ApiModelProperty(value = "未出数量")
    @TableField("LQty")
    private BigDecimal LQty;

    @ApiModelProperty(value = "审核状态")
    @TableField("HasCheck")
    private Boolean HasCheck;

    @ApiModelProperty(value = "备注")
    @TableField("Remark")
    private String Remark;

    @ApiModelProperty(value = "物料名称")
    @TableField("ProdName")
    private String ProdName;

    @ApiModelProperty(value = "规格型号")
    @TableField("ProdSize")
    private String ProdSize;

    @ApiModelProperty(value = "来源单号")
    @TableField("FromNo")
    private String FromNo;

    @ApiModelProperty(value = "来源行号")
    @TableField("FromRow")
    private Integer FromRow;

    @ApiModelProperty(value = "转录")
    @TableField("TranType")
    private Integer TranType;

    @ApiModelProperty(value = "未出详情")
    @TableField("QtyRemain")
    private Integer QtyRemain;

    @ApiModelProperty(value = "合并")
    @TableField("IsMerge")
    private Boolean IsMerge;

    @ApiModelProperty(value = "单位编号")
    @TableField("SUnitID")
    private String SUnitID;

    @ApiModelProperty(value = "实际金额")
    @TableField("SPrice")
    private Float SPrice;

    @ApiModelProperty(value = "实际数量")
    @TableField("SQuantity")
    private BigDecimal SQuantity;

    @ApiModelProperty(value = "单位关系")
    @TableField("UnitRelation")
    private Float UnitRelation;


    public static final String BILLNO = "BillNo";

    public static final String FLAG = "Flag";

    public static final String PRODID = "ProdId";

    public static final String QUANTITY = "Quantity";

    public static final String PRICE = "Price";

    public static final String AMOUNT = "Amount";

    public static final String TAXRATE = "TaxRate";

    public static final String TAXAMT = "TaxAmt";

    public static final String AMOUNTWITHTAX = "AmountWithTax";

    public static final String LOCALAMOUNT = "LocalAmount";

    public static final String LOCALTAXAMT = "LocalTaxAmt";

    public static final String LOCALAMOUNTWITHTAX = "LocalAmountWithTax";

    public static final String SERNO = "SerNo";

    public static final String ROWNO = "RowNo";

    public static final String BILLDATE = "BillDate";

    public static final String LQTY = "LQty";

    public static final String HASCHECK = "HasCheck";

    public static final String REMARK = "Remark";

    public static final String PRODNAME = "ProdName";

    public static final String PRODSIZE = "ProdSize";

    public static final String FROMNO = "FromNo";

    public static final String FROMROW = "FromRow";

    public static final String TRANTYPE = "TranType";

    public static final String QTYREMAIN = "QtyRemain";

    public static final String ISMERGE = "IsMerge";

    public static final String SUNITID = "SUnitID";

    public static final String SPRICE = "SPrice";

    public static final String SQUANTITY = "SQuantity";

    public static final String UNITRELATION = "UnitRelation";

    @Override
    protected Serializable pkVal() {
        return this.BillNo;
    }

}
