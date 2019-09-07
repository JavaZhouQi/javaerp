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
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 销售主表
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Smlordbillmain对象", description="销售主表")
public class Smlordbillmain extends Model<Smlordbillmain> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "标识字段")
    private Integer flag;

    @ApiModelProperty(value = "单据号码")
    @TableField("billNo")
    private String billNo;

    @DateTimeFormat(pattern="yyyy-MM-dd'T'")
    @ApiModelProperty(value = "单据日期")
    @TableField("billDate")
    private Date billDate;

    @ApiModelProperty(value = "客户编号")
    @TableField("customerID")
    private String customerID;

    @ApiModelProperty(value = "账款归属")
    @TableField("dueTo")
    private String dueTo;

    @ApiModelProperty(value = "送货地址名称")
    @TableField("custAddres")
    private String custAddres;

    @ApiModelProperty(value = "销售订单类型")
    @TableField("billStyle")
    private Integer billStyle;

    @ApiModelProperty(value = "业务员编号")
    @TableField("salesMan")
    private String salesMan;
    
    @ApiModelProperty(value = "审核状态")
    @TableField("auditStatus")
    private Integer auditStatus;

    @ApiModelProperty(value = "币别")
    @TableField("currID")
    private String currID;
    

    @ApiModelProperty(value = "正式客户")
    @TableField("formalCust")
    private Integer formalCust;

    @ApiModelProperty(value = "有效日期")
    @TableField("validDate")
    private Date validDate;

    @ApiModelProperty(value = "所属部门")
    @TableField("departID")
    private String departID;

    @ApiModelProperty(value = "审核人")
    private String maker;

    @ApiModelProperty(value = "复核人员")
    private String permitter;

    @ApiModelProperty(value = "描述编号")
    private String detail;

    @ApiModelProperty(value = "已转采购建议")
    @TableField("isTrans")
    private String isTrans;

    @ApiModelProperty(value = "金额合计")
    @TableField("sumBTaxAmt")
    private Float sumBTaxAmt;

    @ApiModelProperty(value = "课税类别")
    @TableField("taxType")
    private String taxType;

    @ApiModelProperty(value = "税额合计")
    @TableField("sumTax")
    private Float sumTax;

    @ApiModelProperty(value = "数量合计")
    @TableField("sumQty")
    private Integer sumQty;

    @ApiModelProperty(value = "单况")
    @TableField("billStatus")
    private Integer billStatus;

    @ApiModelProperty(value = "抛出状态")
    @TableField("mergeOutState")
    private String mergeOutState;

    @ApiModelProperty(value = "联络人员")
    @TableField("linkMan")
    private String linkMan;

    @ApiModelProperty(value = "联络电话")
    @TableField("linkTelephone")
    private String linkTelephone;

    @ApiModelProperty(value = "单价是否含税")
    @TableField("priceOfTax")
    private Integer priceOfTax;

    @ApiModelProperty(value = "收款条件")
    @TableField("gatherStyle")
    private String gatherStyle;

    @ApiModelProperty(value = "收款天数")
    @TableField("gatherDelay")
    private Integer gatherDelay;

    @ApiModelProperty(value = "票期方式")
    @TableField("checkStyle")
    private Integer checkStyle;

    @ApiModelProperty(value = "票期天数")
    @TableField("checkDelay")
    private Integer checkDelay;

    @ApiModelProperty(value = "收款日期")
    @TableField("prepayDay")
    private LocalDate prepayDay;

    @ApiModelProperty(value = "预兑日期")
    @TableField("encashDay")
    private LocalDate encashDay;

    @ApiModelProperty(value = "账款月份")
    @TableField("accMonth")
    private String accMonth;

    @ApiModelProperty(value = "制单人员")
    @TableField("makerID")
    private Integer makerID;

    @ApiModelProperty(value = "复核人员")
    @TableField("permitterID")
    private Integer permitterID;

    @ApiModelProperty(value = "签回")
    @TableField("signBack")
    private String signBack;

    @ApiModelProperty(value = "是否过账")
    @TableField("hasCheck")
    private Integer hasCheck;

    @ApiModelProperty(value = "含税金额合计")
    @TableField("sumAmtATax")
    private Float sumAmtATax;

    @ApiModelProperty(value = "本币未税")
    @TableField("localTotal")
    private Float localTotal;

    @ApiModelProperty(value = "税额本位币合计")
    @TableField("localTax")
    private Float localTax;

    @ApiModelProperty(value = "总计误差")
    @TableField("totalErrAmount")
    private Float totalErrAmount;

    @ApiModelProperty(value = "金额合计本位币")
    @TableField("mlSumBTaxAmt")
    private Float mlSumBTaxAmt;

    @ApiModelProperty(value = "含税金额本位币合计")
    @TableField("mlSumAmtATax")
    private Float mlSumAmtATax;
    
    //明细表集合
    @TableField(exist=false)
    private List<Smlordbillsub> subList;

    //客户名称
    @TableField(exist=false)
    private String fullName;
    
    //客户对象
    @TableField(exist=false)
    private Comcustomer comcustomer;
    
    public static final String AUDITSTATUS = "auditStatus";
    
    
    public static final String FULLNAME = "fullName";

    
    public static final String FLAG = "flag";

    public static final String BILLNO = "billNo";

    public static final String BILLDATE = "billDate";

    public static final String CUSTOMERID = "customerID";

    public static final String DUETO = "dueTo";

    public static final String CUSTADDRES = "custAddres";

    public static final String BILLSTYLE = "billStyle";

    public static final String SALESMAN = "salesMan";

    public static final String CURRID = "currID";

    public static final String FORMALCUST = "formalCust";

    public static final String VALIDDATE = "validDate";

    public static final String DEPARTID = "departID";

    public static final String MAKER = "maker";

    public static final String PERMITTER = "permitter";

    public static final String DETAIL = "detail";

    public static final String ISTRANS = "isTrans";

    public static final String SUMBTAXAMT = "sumBTaxAmt";

    public static final String TAXTYPE = "taxType";

    public static final String SUMTAX = "sumTax";

    public static final String SUMQTY = "sumQty";

    public static final String BILLSTATUS = "billStatus";

    public static final String MERGEOUTSTATE = "mergeOutState";

    public static final String LINKMAN = "linkMan";

    public static final String LINKTELEPHONE = "linkTelephone";

    public static final String PRICEOFTAX = "priceOfTax";

    public static final String GATHERSTYLE = "gatherStyle";

    public static final String GATHERDELAY = "gatherDelay";

    public static final String CHECKSTYLE = "checkStyle";

    public static final String CHECKDELAY = "checkDelay";

    public static final String PREPAYDAY = "prepayDay";

    public static final String ENCASHDAY = "encashDay";

    public static final String ACCMONTH = "accMonth";

    public static final String MAKERID = "makerID";

    public static final String PERMITTERID = "permitterID";

    public static final String SIGNBACK = "signBack";

    public static final String HASCHECK = "hasCheck";

    public static final String SUMAMTATAX = "sumAmtATax";

    public static final String LOCALTOTAL = "localTotal";

    public static final String LOCALTAX = "localTax";

    public static final String TOTALERRAMOUNT = "totalErrAmount";

    public static final String MLSUMBTAXAMT = "mlSumBTaxAmt";

    public static final String MLSUMAMTATAX = "mlSumAmtATax";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
