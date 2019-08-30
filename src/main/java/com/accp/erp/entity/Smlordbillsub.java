package com.accp.erp.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 销售报价、订单明细表
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Smlordbillsub对象", description="销售报价、订单明细表")
public class Smlordbillsub extends Model<Smlordbillsub> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "标识字段")
    private Integer flag;

    @ApiModelProperty(value = "单据号码")
    @TableField("billNo")
    private String billNo;

    @ApiModelProperty(value = "行号")
    @TableField("rowNO")
    private Integer rowNO;

    @ApiModelProperty(value = "行号")
    @TableField("serNO")
    private Integer serNO;

    @ApiModelProperty(value = "单据日期")
    @TableField("billDate")
    private LocalDate billDate;

    @ApiModelProperty(value = "物料编号")
    @TableField("prodID")
    private String prodID;
    

    @ApiModelProperty(value = "物料名称")
    @TableField("prodName")
    private String prodName;

    @ApiModelProperty(value = "物料规格")
    @TableField("prodSize")
    private String prodSize;

    @ApiModelProperty(value = "基本数量")
    private Integer quantity;

    @ApiModelProperty(value = "基本单位")
    private String unit;

    @ApiModelProperty(value = "折扣前单价")
    @TableField("oldPrice")
    private Float oldPrice;

    @ApiModelProperty(value = "基本单价")
    private Float price;

    @ApiModelProperty(value = "金额")
    private Float amount;

    @ApiModelProperty(value = "税率")
    @TableField("taxRate")
    private Float taxRate;

    @ApiModelProperty(value = "税额")
    @TableField("taxAmt")
    private Float taxAmt;

    @ApiModelProperty(value = "税额本位币")
    @TableField("mlTaxAmt")
    private Float mlTaxAmt;

    @ApiModelProperty(value = "折数")
    private Float discount;

    @ApiModelProperty(value = "赠品")
    @TableField("isGift")
    private Integer isGift;

    @ApiModelProperty(value = "分录备注")
    @TableField("itemRemark")
    private String itemRemark;

    @ApiModelProperty(value = "细项描述")
    private String detail;

    @ApiModelProperty(value = "预交货日期")
    @TableField("preInDate")
    private LocalDate preInDate;

    @ApiModelProperty(value = "验货")
    @TableField("needExamine")
    private String needExamine;

    @ApiModelProperty(value = "排程单号")
    @TableField("arrangeNO")
    private String arrangeNO;

    @ApiModelProperty(value = "来源栏号")
    @TableField("fromRow")
    private Integer fromRow;

    @ApiModelProperty(value = "来源单号")
    @TableField("fromNO")
    private String fromNO;

    @ApiModelProperty(value = "来源别")
    @TableField("tranType")
    private Integer tranType;

    @ApiModelProperty(value = "未转数量")
    @TableField("qtyRemain")
    private Integer qtyRemain;

    @ApiModelProperty(value = "换算率")
    @TableField("converRate")
    private Integer converRate;

    @ApiModelProperty(value = "数量1")
    @TableField("outQty")
    private Integer outQty;

    @ApiModelProperty(value = "客户订单")
    @TableField("custBillNo")
    private String custBillNo;

    @ApiModelProperty(value = "标记")
    private String mark;

    @ApiModelProperty(value = "金额本位币")
    @TableField("mlAmount")
    private Float mlAmount;

    @ApiModelProperty(value = "是否过账")
    @TableField("hasCheck")
    private Integer hasCheck;

    @ApiModelProperty(value = "单价")
    @TableField("sPrice")
    private Float sPrice;

    @ApiModelProperty(value = "数量")
    @TableField("sQuantity")
    private Integer sQuantity;

    @ApiModelProperty(value = "换算率")
    @TableField("unitRelation")
    private Float unitRelation;

    @ApiModelProperty(value = "单位编号")
    @TableField("sUnitID")
    private Integer sUnitID;

    @ApiModelProperty(value = "辅助数量")
    @TableField("eQuantity")
    private Integer eQuantity;

    @ApiModelProperty(value = "辅助单位")
    @TableField("eUnitID")
    private String eUnitID;

    @ApiModelProperty(value = "辅助换算率")
    @TableField("eUnitRelation")
    private Float eUnitRelation;
    //物料对象
    @TableField(exist=false)
    private Comproduct comproduct;


    public static final String FLAG = "flag";

    public static final String BILLNO = "billNo";

    public static final String ROWNO = "rowNO";

    public static final String SERNO = "serNO";

    public static final String BILLDATE = "billDate";

    public static final String PRODID = "prodID";

    public static final String PRODNAME = "prodName";

    public static final String PRODSIZE = "prodSize";

    public static final String QUANTITY = "quantity";

    public static final String UNIT = "unit";

    public static final String OLDPRICE = "oldPrice";

    public static final String PRICE = "price";

    public static final String AMOUNT = "amount";

    public static final String TAXRATE = "taxRate";

    public static final String TAXAMT = "taxAmt";

    public static final String MLTAXAMT = "mlTaxAmt";

    public static final String DISCOUNT = "discount";

    public static final String ISGIFT = "isGift";

    public static final String ITEMREMARK = "itemRemark";

    public static final String DETAIL = "detail";

    public static final String PREINDATE = "preInDate";

    public static final String NEEDEXAMINE = "needExamine";

    public static final String ARRANGENO = "arrangeNO";

    public static final String FROMROW = "fromRow";

    public static final String FROMNO = "fromNO";

    public static final String TRANTYPE = "tranType";

    public static final String QTYREMAIN = "qtyRemain";

    public static final String CONVERRATE = "converRate";

    public static final String OUTQTY = "outQty";

    public static final String CUSTBILLNO = "custBillNo";

    public static final String MARK = "mark";

    public static final String MLAMOUNT = "mlAmount";

    public static final String HASCHECK = "hasCheck";

    public static final String SPRICE = "sPrice";

    public static final String SQUANTITY = "sQuantity";

    public static final String UNITRELATION = "unitRelation";

    public static final String SUNITID = "sUnitID";

    public static final String EQUANTITY = "eQuantity";

    public static final String EUNITID = "eUnitID";

    public static final String EUNITRELATION = "eUnitRelation";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
