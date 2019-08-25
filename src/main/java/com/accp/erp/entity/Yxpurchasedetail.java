package com.accp.erp.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;

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
@ApiModel(value="Yxpurchasedetail对象", description="")
public class Yxpurchasedetail extends Model<Yxpurchasedetail> {

    private static final long serialVersionUID = 1L;

    @TableId("billNO")
    private String billNO;

    @TableField("billDate")
    private LocalDate billDate;

    @TableField("serNO")
    private Integer serNO;

    @TableField("prodID")
    private Integer prodID;

    @TableField("prodName")
    private String prodName;

    @TableField("prodSize")
    private String prodSize;

    @TableField("SUnit")
    private String SUnit;

    @TableField("sQuantity")
    private Integer sQuantity;

    @TableField("oldPrice")
    private Double oldPrice;

    private Double discount;

    @TableField("sPrice")
    private Double sPrice;

    private Double amount;

    @TableField("taxRate")
    private Double taxRate;

    @TableField("taxAmt")
    private Double taxAmt;

    @TableField("vFTotal")
    private Double vFTotal;

    @TableField("preInDate")
    private LocalDate preInDate;

    @TableField("qtyRemein")
    private Integer qtyRemein;

    @TableField("isGift")
    private Integer isGift;

    @TableField("itemRemark")
    private String itemRemark;

    @TableField("tranType")
    private String tranType;

    @TableField("fromNO")
    private Integer fromNO;

    private Integer bills;

    private String data1;

    private String data2;

    private String data3;

    private String data4;

    private String data5;


    public static final String BILLNO = "billNO";

    public static final String BILLDATE = "billDate";

    public static final String SERNO = "serNO";

    public static final String PRODID = "prodID";

    public static final String PRODNAME = "prodName";

    public static final String PRODSIZE = "prodSize";

    public static final String SUNIT = "SUnit";

    public static final String SQUANTITY = "sQuantity";

    public static final String OLDPRICE = "oldPrice";

    public static final String DISCOUNT = "discount";

    public static final String SPRICE = "sPrice";

    public static final String AMOUNT = "amount";

    public static final String TAXRATE = "taxRate";

    public static final String TAXAMT = "taxAmt";

    public static final String VFTOTAL = "vFTotal";

    public static final String PREINDATE = "preInDate";

    public static final String QTYREMEIN = "qtyRemein";

    public static final String ISGIFT = "isGift";

    public static final String ITEMREMARK = "itemRemark";

    public static final String TRANTYPE = "tranType";

    public static final String FROMNO = "fromNO";

    public static final String BILLS = "bills";

    public static final String DATA1 = "data1";

    public static final String DATA2 = "data2";

    public static final String DATA3 = "data3";

    public static final String DATA4 = "data4";

    public static final String DATA5 = "data5";

    @Override
    protected Serializable pkVal() {
        return this.billNO;
    }

}
