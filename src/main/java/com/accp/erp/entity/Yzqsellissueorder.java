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
@ApiModel(value="Yzqsellissueorder对象", description="")
public class Yzqsellissueorder extends Model<Yzqsellissueorder> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据号码")
    @TableId("billNo")
    private String billNo;

    @ApiModelProperty(value = "单据日期")
    @TableField("billDate")
    private LocalDate billDate;

    @ApiModelProperty(value = "国外贸易")
    @TableField("hasForeignTrade")
    private String hasForeignTrade;

    @ApiModelProperty(value = "客户编号")
    @TableField("custId")
    private String custId;

    @ApiModelProperty(value = "客户简称")
    @TableField("custShortName")
    private String custShortName;

    @ApiModelProperty(value = "地址编号")
    @TableField("addrId")
    private String addrId;

    @ApiModelProperty(value = "地址")
    @TableField("custAddress")
    private String custAddress;

    @ApiModelProperty(value = "单价是否含税")
    @TableField("priceOfTax")
    private String priceOfTax;

    @ApiModelProperty(value = "仓库编号")
    @TableField("wareId")
    private String wareId;

    @ApiModelProperty(value = "仓库名称")
    @TableField("wareName")
    private String wareName;

    @ApiModelProperty(value = "凭证编号")
    @TableField("voucherNo")
    private String voucherNo;

    @ApiModelProperty(value = "复核后是否自动生成发票")
    @TableField("hasAutoInv")
    private String hasAutoInv;

    @ApiModelProperty(value = "业务人员编号")
    @TableField("salesId")
    private String salesId;

    @ApiModelProperty(value = "业务人员")
    @TableField("salesName")
    private String salesName;

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

    @ApiModelProperty(value = "合计数量")
    @TableField("sumNum")
    private Double sumNum;

    @ApiModelProperty(value = "合计金额")
    private Double total;

    @ApiModelProperty(value = "合计税额")
    @TableField("Tax")
    private Double Tax;

    @ApiModelProperty(value = "合计含税金额")
    @TableField("totalTaxMoney")
    private Double totalTaxMoney;

    @ApiModelProperty(value = "账款归属")
    @TableField("dueTo")
    private String dueTo;

    @ApiModelProperty(value = "收款日期")
    @TableField("prepayDay")
    private LocalDate prepayDay;

    @ApiModelProperty(value = "收款条件")
    @TableField("recvWay")
    private String recvWay;

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

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "保留字段1")
    private String safetyone;

    @ApiModelProperty(value = "保留字段2")
    private String safetytwo;

    @ApiModelProperty(value = "审核状态")
    private Integer checkstate;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;


    public static final String BILLNO = "billNo";

    public static final String BILLDATE = "billDate";

    public static final String HASFOREIGNTRADE = "hasForeignTrade";

    public static final String CUSTID = "custId";

    public static final String CUSTSHORTNAME = "custShortName";

    public static final String ADDRID = "addrId";

    public static final String CUSTADDRESS = "custAddress";

    public static final String PRICEOFTAX = "priceOfTax";

    public static final String WAREID = "wareId";

    public static final String WARENAME = "wareName";

    public static final String VOUCHERNO = "voucherNo";

    public static final String HASAUTOINV = "hasAutoInv";

    public static final String SALESID = "salesId";

    public static final String SALESNAME = "salesName";

    public static final String DEPARTID = "departId";

    public static final String DEPARTNAME = "departName";

    public static final String MAKER = "maker";

    public static final String PERMITTER = "permitter";

    public static final String PROJECTID = "projectId";

    public static final String PROJECTNAME = "projectName";

    public static final String SUMNUM = "sumNum";

    public static final String TOTAL = "total";

    public static final String TAX = "Tax";

    public static final String TOTALTAXMONEY = "totalTaxMoney";

    public static final String DUETO = "dueTo";

    public static final String PREPAYDAY = "prepayDay";

    public static final String RECVWAY = "recvWay";

    public static final String GATHERDELAY = "gatherDelay";

    public static final String ACCMONTH = "accMonth";

    public static final String UDEF1 = "UDef1";

    public static final String UDEF2 = "UDef2";

    public static final String REMARK = "remark";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    public static final String CHECKSTATE = "checkstate";

    public static final String ENABLES = "enables";

    @Override
    protected Serializable pkVal() {
        return this.billNo;
    }

}
