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
@ApiModel(value="Yzqsellshouldgatheringmain对象", description="")
public class Yzqsellshouldgatheringmain extends Model<Yzqsellshouldgatheringmain> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID(单据号码)")
    @TableId("costBillNo")
    private String costBillNo;

    @ApiModelProperty(value = "来源单别")
    @TableField("originSysId")
    private String originSysId;

    @ApiModelProperty(value = "来源单号")
    @TableField("originNo")
    private String originNo;

    @ApiModelProperty(value = "来源单据日期")
    @TableField("billDate")
    private LocalDate billDate;

    @ApiModelProperty(value = "客户编号")
    @TableField("ftyId")
    private String ftyId;

    @ApiModelProperty(value = "客户全称")
    @TableField("ftyName")
    private String ftyName;

    @ApiModelProperty(value = "客户简称")
    @TableField("custShortName")
    private String custShortName;

    @ApiModelProperty(value = "发票号码")
    @TableField("invoiceNo")
    private String invoiceNo;

    @ApiModelProperty(value = "凭证编号")
    @TableField("voucherNo")
    private String voucherNo;

    @ApiModelProperty(value = "备注")
    private String memo;

    @ApiModelProperty(value = "合计金额")
    private Double total;

    @ApiModelProperty(value = "合计税额")
    private Double tax;

    @ApiModelProperty(value = "合计含税金额")
    @TableField("sumAmtATax")
    private Double sumAmtATax;

    @ApiModelProperty(value = "业务人员编号")
    @TableField("personId")
    private String personId;

    @ApiModelProperty(value = "业务人员")
    @TableField("personName")
    private String personName;

    @ApiModelProperty(value = "部门编号")
    @TableField("departId")
    private String departId;

    @ApiModelProperty(value = "所属部门")
    @TableField("departName")
    private String departName;

    @ApiModelProperty(value = "制单人员")
    private String maker;

    @ApiModelProperty(value = "复核人员")
    private String permitter;

    @ApiModelProperty(value = "项目编号")
    @TableField("projectId")
    private String projectId;

    @ApiModelProperty(value = "所属项目")
    @TableField("projectName")
    private String projectName;

    @ApiModelProperty(value = "账款归属")
    @TableField("dueTo")
    private String dueTo;

    @ApiModelProperty(value = "收款日期")
    @TableField("prepayDay")
    private LocalDate prepayDay;

    @ApiModelProperty(value = "收款条件")
    @TableField("gatherStyle")
    private String gatherStyle;

    @ApiModelProperty(value = "收款天数")
    @TableField("gatherDelay")
    private Integer gatherDelay;

    @ApiModelProperty(value = "账款月份")
    @TableField("accMonth")
    private LocalDate accMonth;

    @ApiModelProperty(value = "自定义栏1")
    @TableField("UDef1")
    private String UDef1;

    @ApiModelProperty(value = "自定义栏2")
    @TableField("UDef2")
    private String UDef2;

    @ApiModelProperty(value = "结算方式一")
    @TableField("cashPayStyleId")
    private String cashPayStyleId;

    @ApiModelProperty(value = "结算方式二")
    @TableField("visaPayStyleId")
    private String visaPayStyleId;

    @ApiModelProperty(value = "结算方式三")
    @TableField("otherPayStyleId")
    private String otherPayStyleId;

    @ApiModelProperty(value = "金额1")
    @TableField("cashPayStyleMoney")
    private Double cashPayStyleMoney;

    @ApiModelProperty(value = "金额2")
    @TableField("visaPayStyleMoney")
    private Double visaPayStyleMoney;

    @ApiModelProperty(value = "金额3")
    @TableField("otherPayStyleMoney")
    private Double otherPayStyleMoney;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;

    @ApiModelProperty(value = "审核状态")
    private Integer checkstate;


    public static final String COSTBILLNO = "costBillNo";

    public static final String ORIGINSYSID = "originSysId";

    public static final String ORIGINNO = "originNo";

    public static final String BILLDATE = "billDate";

    public static final String FTYID = "ftyId";

    public static final String FTYNAME = "ftyName";

    public static final String CUSTSHORTNAME = "custShortName";

    public static final String INVOICENO = "invoiceNo";

    public static final String VOUCHERNO = "voucherNo";

    public static final String MEMO = "memo";

    public static final String TOTAL = "total";

    public static final String TAX = "tax";

    public static final String SUMAMTATAX = "sumAmtATax";

    public static final String PERSONID = "personId";

    public static final String PERSONNAME = "personName";

    public static final String DEPARTID = "departId";

    public static final String DEPARTNAME = "departName";

    public static final String MAKER = "maker";

    public static final String PERMITTER = "permitter";

    public static final String PROJECTID = "projectId";

    public static final String PROJECTNAME = "projectName";

    public static final String DUETO = "dueTo";

    public static final String PREPAYDAY = "prepayDay";

    public static final String GATHERSTYLE = "gatherStyle";

    public static final String GATHERDELAY = "gatherDelay";

    public static final String ACCMONTH = "accMonth";

    public static final String UDEF1 = "UDef1";

    public static final String UDEF2 = "UDef2";

    public static final String CASHPAYSTYLEID = "cashPayStyleId";

    public static final String VISAPAYSTYLEID = "visaPayStyleId";

    public static final String OTHERPAYSTYLEID = "otherPayStyleId";

    public static final String CASHPAYSTYLEMONEY = "cashPayStyleMoney";

    public static final String VISAPAYSTYLEMONEY = "visaPayStyleMoney";

    public static final String OTHERPAYSTYLEMONEY = "otherPayStyleMoney";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    public static final String CHECKSTATE = "checkstate";

    @Override
    protected Serializable pkVal() {
        return this.costBillNo;
    }

}
