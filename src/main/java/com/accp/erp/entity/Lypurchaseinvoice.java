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
@ApiModel(value="Lypurchaseinvoice对象", description="")
public class Lypurchaseinvoice extends Model<Lypurchaseinvoice> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据号码")
    @TableId("FundBillNo")
    private String  FundBillNo;

    @ApiModelProperty(value = "单据日期")
    @TableField("BillDate")
    private LocalDate BillDate;

    @ApiModelProperty(value = "供应商")
    @TableField("CustID")
    private Integer CustID;

    @ApiModelProperty(value = "供应商全称")
    @TableField("FullName")
    private String FullName;

    @ApiModelProperty(value = "账款归属")
    @TableField("DueTo")
    private String DueTo;

    @ApiModelProperty(value = "账款月份")
    @TableField("AccMonth")
    private LocalDate AccMonth;

    @ApiModelProperty(value = "发票号码")
    @TableField("InvoiceNo")
    private Integer InvoiceNo;

    @ApiModelProperty(value = "币别")
    @TableField("CurrID")
    private Integer CurrID;

    @ApiModelProperty(value = "币别名称")
    @TableField("CurrencyName")
    private String CurrencyName;

    @ApiModelProperty(value = "汇率")
    @TableField("ExchRate")
    private Float ExchRate;

    @ApiModelProperty(value = "发票金额")
    @TableField("Total")
    private Double Total;

    @ApiModelProperty(value = "结算方式一金额")
    @TableField("CashPay")
    private Double CashPay;

    @ApiModelProperty(value = "结算方式二金额")
    @TableField("VisaPay")
    private Double VisaPay;

    @ApiModelProperty(value = "已冲款金额")
    @TableField("OffSet")
    private Double OffSet;

    @ApiModelProperty(value = "冲款单折让金额")
    @TableField("Discount")
    private Double Discount;

    @ApiModelProperty(value = "付款日期")
    @TableField("PrepayDay")
    private LocalDate PrepayDay;

    @ApiModelProperty(value = "所属部门")
    @TableField("DaptID")
    private Integer DaptID;

    @ApiModelProperty(value = "部门名称")
    @TableField("DaptName")
    private String DaptName;

    @ApiModelProperty(value = "所属项目")
    @TableField("ProjectID")
    private Integer ProjectID;

    @ApiModelProperty(value = "项目名称")
    @TableField("ProjectName")
    private String ProjectName;

    @ApiModelProperty(value = "采购人员")
    @TableField("Salesman")
    private Integer Salesman;

    @ApiModelProperty(value = "人员姓名")
    @TableField("PersonName")
    private String PersonName;

    @ApiModelProperty(value = "结算方式一")
    @TableField("CashPayStyle")
    private Integer CashPayStyle;

    @ApiModelProperty(value = "结算方式一名称")
    @TableField("CashPayStyleName")
    private String CashPayStyleName;

    @ApiModelProperty(value = "结算方式二")
    @TableField("VisaPayStyle")
    private Integer VisaPayStyle;

    @ApiModelProperty(value = "结算方式二名称")
    @TableField("VisaPayStyleName")
    private String VisaPayStyleName;

    @ApiModelProperty(value = "结算方式三")
    @TableField("OtherPayStyle")
    private Integer OtherPayStyle;

    @ApiModelProperty(value = "结算方式三名称")
    @TableField("OtherPayStyleName")
    private String OtherPayStyleName;

    @ApiModelProperty(value = "结算方式三金额")
    @TableField("OtherPay")
    private Double OtherPay;

    @ApiModelProperty(value = "单价是否含税")
    @TableField("PriceOfTax")
    private Integer PriceOfTax;

    @ApiModelProperty(value = "凭证编号")
    @TableField("VoucherNo")
    private Integer VoucherNo;

    @ApiModelProperty(value = "差价凭证编号")
    @TableField("CVoucherNo")
    private Integer CVoucherNo;

    @ApiModelProperty(value = "制单人员编号")
    @TableField("MakerID")
    private Integer MakerID;

    @ApiModelProperty(value = "制单人员")
    @TableField("Maker")
    private String Maker;

    @ApiModelProperty(value = "复核人员编号")
    @TableField("PermitterID")
    private Integer PermitterID;

    @ApiModelProperty(value = "复核人员")
    @TableField("Permitter")
    private String Permitter;

    @ApiModelProperty(value = "备注")
    @TableField("Remark")
    private String Remark;

    @ApiModelProperty(value = "单据类型编号")
    @TableField("BillTypeID")
    private Integer BillTypeID;

    @ApiModelProperty(value = "单据类型")
    @TableField("BillType")
    private String BillType;

    @ApiModelProperty(value = "采购核对状态编号")
    @TableField("AffirmStateID")
    private Integer AffirmStateID;

    @ApiModelProperty(value = "采购核对状态")
    @TableField("AffirmState")
    private String AffirmState;

    @ApiModelProperty(value = "付款条件编号")
    @TableField("PayTermID")
    private Integer PayTermID;

    @ApiModelProperty(value = "付款条件")
    @TableField("PayTerm")
    private String PayTerm;

    @ApiModelProperty(value = "付款延迟天数")
    @TableField("DelayDays")
    private Integer DelayDays;

    @ApiModelProperty(value = "发票类型编号")
    @TableField("InvoTypeID")
    private Integer InvoTypeID;

    @ApiModelProperty(value = "发票类型名称")
    @TableField("InvotypeName")
    private String InvotypeName;

    @ApiModelProperty(value = "其他收款方式描述")
    @TableField("GatherOther")
    private String GatherOther;

    @ApiModelProperty(value = "制单人签名")
    @TableField("MakerSign")
    private String MakerSign;

    @ApiModelProperty(value = "复核人签名")
    @TableField("PermitterSign")
    private String PermitterSign;

    @ApiModelProperty(value = "发票税额")
    @TableField("Tax")
    private Double Tax;


    public static final String FUNDBILLNO = "FundBillNo";

    public static final String BILLDATE = "BillDate";

    public static final String CUSTID = "CustID";

    public static final String FULLNAME = "FullName";

    public static final String DUETO = "DueTo";

    public static final String ACCMONTH = "AccMonth";

    public static final String INVOICENO = "InvoiceNo";

    public static final String CURRID = "CurrID";

    public static final String CURRENCYNAME = "CurrencyName";

    public static final String EXCHRATE = "ExchRate";

    public static final String TOTAL = "Total";

    public static final String CASHPAY = "CashPay";

    public static final String VISAPAY = "VisaPay";

    public static final String OFFSET = "OffSet";

    public static final String DISCOUNT = "Discount";

    public static final String PREPAYDAY = "PrepayDay";

    public static final String DAPTID = "DaptID";

    public static final String DAPTNAME = "DaptName";

    public static final String PROJECTID = "ProjectID";

    public static final String PROJECTNAME = "ProjectName";

    public static final String SALESMAN = "Salesman";

    public static final String PERSONNAME = "PersonName";

    public static final String CASHPAYSTYLE = "CashPayStyle";

    public static final String CASHPAYSTYLENAME = "CashPayStyleName";

    public static final String VISAPAYSTYLE = "VisaPayStyle";

    public static final String VISAPAYSTYLENAME = "VisaPayStyleName";

    public static final String OTHERPAYSTYLE = "OtherPayStyle";

    public static final String OTHERPAYSTYLENAME = "OtherPayStyleName";

    public static final String OTHERPAY = "OtherPay";

    public static final String PRICEOFTAX = "PriceOfTax";

    public static final String VOUCHERNO = "VoucherNo";

    public static final String CVOUCHERNO = "CVoucherNo";

    public static final String MAKERID = "MakerID";

    public static final String MAKER = "Maker";

    public static final String PERMITTERID = "PermitterID";

    public static final String PERMITTER = "Permitter";

    public static final String REMARK = "Remark";

    public static final String BILLTYPEID = "BillTypeID";

    public static final String BILLTYPE = "BillType";

    public static final String AFFIRMSTATEID = "AffirmStateID";

    public static final String AFFIRMSTATE = "AffirmState";

    public static final String PAYTERMID = "PayTermID";

    public static final String PAYTERM = "PayTerm";

    public static final String DELAYDAYS = "DelayDays";

    public static final String INVOTYPEID = "InvoTypeID";

    public static final String INVOTYPENAME = "InvotypeName";

    public static final String GATHEROTHER = "GatherOther";

    public static final String MAKERSIGN = "MakerSign";

    public static final String PERMITTERSIGN = "PermitterSign";

    public static final String TAX = "Tax";

    @Override
    protected Serializable pkVal() {
        return this.FundBillNo;
    }

}
