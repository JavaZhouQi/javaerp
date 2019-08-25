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
@ApiModel(value="Yzqsellcanceldetails对象", description="")
public class Yzqsellcanceldetails extends Model<Yzqsellcanceldetails> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据号码")
    @TableId("billNo")
    private String billNo;

    @ApiModelProperty(value = "栏号")
    @TableField("serNo")
    private String serNo;

    @ApiModelProperty(value = "物料编号")
    @TableField("prodId")
    private String prodId;

    @ApiModelProperty(value = "物料名称")
    @TableField("prodName")
    private String prodName;

    @ApiModelProperty(value = "规格型号")
    @TableField("prodSize")
    private String prodSize;

    @ApiModelProperty(value = "单位名称")
    @TableField("sUnit")
    private String sUnit;

    @ApiModelProperty(value = "数量")
    @TableField("sQuantity")
    private Integer sQuantity;

    @ApiModelProperty(value = "折扣前单价")
    @TableField("oldPrice")
    private Double oldPrice;

    @ApiModelProperty(value = "折数")
    private Double discount;

    @ApiModelProperty(value = "单价")
    @TableField("sPrice")
    private Double sPrice;

    @ApiModelProperty(value = "金额")
    private Double amount;

    @ApiModelProperty(value = "税率")
    @TableField("taxRate")
    private Double taxRate;

    @ApiModelProperty(value = "税额")
    @TableField("taxAmt")
    private Double taxAmt;

    @ApiModelProperty(value = "含税金额")
    @TableField("amountATax")
    private Double amountATax;

    @ApiModelProperty(value = "赠品")
    @TableField("isGift")
    private String isGift;

    @ApiModelProperty(value = "来源单别")
    @TableField("tranType")
    private String tranType;

    @ApiModelProperty(value = "来源单号")
    @TableField("fromNo")
    private String fromNo;

    @ApiModelProperty(value = "批号")
    @TableField("haveBatch")
    private Integer haveBatch;

    @ApiModelProperty(value = "物料组合")
    @TableField("hasCombine")
    private Integer hasCombine;

    @ApiModelProperty(value = "发票明细")
    @TableField("hasInv")
    private Integer hasInv;

    @ApiModelProperty(value = "未开票数量")
    @TableField("noInvCount")
    private Integer noInvCount;

    @ApiModelProperty(value = "分录备注")
    @TableField("itemRemark")
    private String itemRemark;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段2")
    private String safetytwo;


    public static final String BILLNO = "billNo";

    public static final String SERNO = "serNo";

    public static final String PRODID = "prodId";

    public static final String PRODNAME = "prodName";

    public static final String PRODSIZE = "prodSize";

    public static final String SUNIT = "sUnit";

    public static final String SQUANTITY = "sQuantity";

    public static final String OLDPRICE = "oldPrice";

    public static final String DISCOUNT = "discount";

    public static final String SPRICE = "sPrice";

    public static final String AMOUNT = "amount";

    public static final String TAXRATE = "taxRate";

    public static final String TAXAMT = "taxAmt";

    public static final String AMOUNTATAX = "amountATax";

    public static final String ISGIFT = "isGift";

    public static final String TRANTYPE = "tranType";

    public static final String FROMNO = "fromNo";

    public static final String HAVEBATCH = "haveBatch";

    public static final String HASCOMBINE = "hasCombine";

    public static final String HASINV = "hasInv";

    public static final String NOINVCOUNT = "noInvCount";

    public static final String ITEMREMARK = "itemRemark";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.billNo;
    }

}
