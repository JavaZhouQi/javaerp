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
@ApiModel(value="Yxpurchaseorder对象", description="")
public class Yxpurchaseorder extends Model<Yxpurchaseorder> {

    private static final long serialVersionUID = 1L;

    @TableId("billNO")
    private String billNO;

    @TableField("billDate")
    private LocalDate billDate;

    @TableField("billStatus")
    private Integer billStatus;

    @TableField("priceOfTax")
    private Integer priceOfTax;

    @TableField("billStyleID")
    private Integer billStyleID;

    @TableField("billStyleName")
    private String billStyleName;

    @TableField("customerID")
    private Integer customerID;

    @TableField("custShortName")
    private String custShortName;

    @TableField("addressID")
    private Integer addressID;

    @TableField("custAddress")
    private String custAddress;

    private String curr;

    @TableField("exchRate")
    private Double exchRate;

    @TableField("outAddress")
    private String outAddress;

    @TableField("factFundsAttribution")
    private String factFundsAttribution;

    @TableField("prepayDay")
    private LocalDate prepayDay;

    @TableField("accMonth")
    private LocalDate accMonth;

    @TableField("gatherStyle")
    private String gatherStyle;

    @TableField("gatherDelay")
    private Integer gatherDelay;

    @TableField("salesID")
    private Integer salesID;

    @TableField("salesName")
    private String salesName;

    @TableField("departID")
    private Integer departID;

    @TableField("departName")
    private String departName;

    @TableField("projectID")
    private Integer projectID;

    @TableField("projectName")
    private String projectName;

    private String maker;

    private String permitter;

    private String remark;

    private String data1;

    private String data2;

    private String data3;

    private String data4;

    private String data5;


    public static final String BILLNO = "billNO";

    public static final String BILLDATE = "billDate";

    public static final String BILLSTATUS = "billStatus";

    public static final String PRICEOFTAX = "priceOfTax";

    public static final String BILLSTYLEID = "billStyleID";

    public static final String BILLSTYLENAME = "billStyleName";

    public static final String CUSTOMERID = "customerID";

    public static final String CUSTSHORTNAME = "custShortName";

    public static final String ADDRESSID = "addressID";

    public static final String CUSTADDRESS = "custAddress";

    public static final String CURR = "curr";

    public static final String EXCHRATE = "exchRate";

    public static final String OUTADDRESS = "outAddress";

    public static final String FACTFUNDSATTRIBUTION = "factFundsAttribution";

    public static final String PREPAYDAY = "prepayDay";

    public static final String ACCMONTH = "accMonth";

    public static final String GATHERSTYLE = "gatherStyle";

    public static final String GATHERDELAY = "gatherDelay";

    public static final String SALESID = "salesID";

    public static final String SALESNAME = "salesName";

    public static final String DEPARTID = "departID";

    public static final String DEPARTNAME = "departName";

    public static final String PROJECTID = "projectID";

    public static final String PROJECTNAME = "projectName";

    public static final String MAKER = "maker";

    public static final String PERMITTER = "permitter";

    public static final String REMARK = "remark";

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
