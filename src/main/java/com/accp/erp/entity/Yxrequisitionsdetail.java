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
@ApiModel(value="Yxrequisitionsdetail对象", description="")
public class Yxrequisitionsdetail extends Model<Yxrequisitionsdetail> {

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

    @TableField("sUnit")
    private String sUnit;

    @TableField("sQuantity")
    private Integer sQuantity;

    private String curr;

    @TableField("stdPrice")
    private Double stdPrice;

    private Double amount;

    @TableField("lastestCurr")
    private String lastestCurr;

    @TableField("lastestPrice")
    private Double lastestPrice;

    @TableField("lastestAmount")
    private Double lastestAmount;

    @TableField("preInDate")
    private LocalDate preInDate;

    @TableField("suggestPurDate")
    private LocalDate suggestPurDate;

    @TableField("qtyRemain")
    private Integer qtyRemain;

    @TableField("itemRemark")
    private String itemRemark;

    @TableField("fromNO")
    private Integer fromNO;

    @TableField("tranType")
    private String tranType;

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

    public static final String SUNIT = "sUnit";

    public static final String SQUANTITY = "sQuantity";

    public static final String CURR = "curr";

    public static final String STDPRICE = "stdPrice";

    public static final String AMOUNT = "amount";

    public static final String LASTESTCURR = "lastestCurr";

    public static final String LASTESTPRICE = "lastestPrice";

    public static final String LASTESTAMOUNT = "lastestAmount";

    public static final String PREINDATE = "preInDate";

    public static final String SUGGESTPURDATE = "suggestPurDate";

    public static final String QTYREMAIN = "qtyRemain";

    public static final String ITEMREMARK = "itemRemark";

    public static final String FROMNO = "fromNO";

    public static final String TRANTYPE = "tranType";

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
