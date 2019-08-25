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
@ApiModel(value="Yxpurchaseenquiry对象", description="")
public class Yxpurchaseenquiry extends Model<Yxpurchaseenquiry> {

    private static final long serialVersionUID = 1L;

    @TableId("billNO")
    private String billNO;

    @TableField("billDate")
    private LocalDate billDate;

    @TableField("customerID")
    private Integer customerID;

    @TableField("custShortName")
    private String custShortName;

    @TableField("addressID")
    private Integer addressID;

    @TableField("custAddress")
    private String custAddress;

    @TableField("validDate")
    private LocalDate validDate;

    private String curr;

    @TableField("exchRate")
    private Double exchRate;

    @TableField("priceOfTax")
    private Integer priceOfTax;

    @TableField("salesID")
    private Integer salesID;

    @TableField("salesName")
    private String salesName;

    @TableField("departID")
    private Integer departID;

    @TableField("departName")
    private String departName;

    @TableField("outAddress")
    private String outAddress;

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

    public static final String CUSTOMERID = "customerID";

    public static final String CUSTSHORTNAME = "custShortName";

    public static final String ADDRESSID = "addressID";

    public static final String CUSTADDRESS = "custAddress";

    public static final String VALIDDATE = "validDate";

    public static final String CURR = "curr";

    public static final String EXCHRATE = "exchRate";

    public static final String PRICEOFTAX = "priceOfTax";

    public static final String SALESID = "salesID";

    public static final String SALESNAME = "salesName";

    public static final String DEPARTID = "departID";

    public static final String DEPARTNAME = "departName";

    public static final String OUTADDRESS = "outAddress";

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
