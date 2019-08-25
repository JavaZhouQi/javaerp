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
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * <p>
 * 预收款主表
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Chladvancegather对象", description="预收款主表")
public class Chladvancegather extends Model<Chladvancegather> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据号码")
    @TableId("Billid")
    private String Billid;

    @ApiModelProperty(value = "单据日期")
    @TableField("Billdate")
    private LocalDate Billdate;

    @ApiModelProperty(value = "单据类型singleType(sinId)")
    @TableField("Sinid")
    private Integer Sinid;

    @ApiModelProperty(value = "客户编号client(cliid)")
    @TableField("Cliid")
    private String Cliid;

    @ApiModelProperty(value = "客户简称")
    @TableField("Clishortname")
    private String Clishortname;

    @ApiModelProperty(value = "币别")
    @TableField("Currencytype")
    private String Currencytype;

    @ApiModelProperty(value = "结算方式一")
    @TableField("Reckontypef")
    private String Reckontypef;

    @ApiModelProperty(value = "结算方式一")
    @TableField("Reckontypes")
    private String Reckontypes;

    @ApiModelProperty(value = "结算方式一")
    @TableField("Reckontypet")
    private String Reckontypet;

    @ApiModelProperty(value = "金额")
    @TableField("Reckonmoneyf")
    private BigDecimal Reckonmoneyf;

    @ApiModelProperty(value = "金额")
    @TableField("Reckonmoneys")
    private BigDecimal Reckonmoneys;

    @ApiModelProperty(value = "金额")
    @TableField("Reckonmoneyt")
    private BigDecimal Reckonmoneyt;

    @ApiModelProperty(value = "折扣率")
    @TableField("Gatherdiscount")
    private BigDecimal Gatherdiscount;

    @ApiModelProperty(value = "终止帐月")
    @TableField("Gatherendaccountmonth")
    private LocalDate Gatherendaccountmonth;

    @ApiModelProperty(value = "业务人员编号，也就是人员编号employee(empid)")
    @TableField("Empid")
    private String Empid;

    @ApiModelProperty(value = "业务人员")
    @TableField("Empname")
    private String Empname;

    @ApiModelProperty(value = "部门编号depttab(depid)")
    @TableField("Depid")
    private String Depid;

    @ApiModelProperty(value = "所属部门")
    @TableField("Depname")
    private String Depname;

    @ApiModelProperty(value = "制单人员")
    @TableField("Makeempname")
    private String Makeempname;

    @ApiModelProperty(value = "复核人员")
    @TableField("Auditingempname")
    private String Auditingempname;

    @ApiModelProperty(value = "审核状态")
    @TableField("Checkstate")
    private Integer Checkstate;

    @ApiModelProperty(value = "备注")
    @TableField("Remark")
    private String Remark;

    @ApiModelProperty(value = "标识是否删除")
    @TableField("Enables")
    private Integer Enables;

    @ApiModelProperty(value = "保留字段")
    @TableField("Safetyone")
    private String Safetyone;

    @ApiModelProperty(value = "保留字段")
    @TableField("Safetytwo")
    private String Safetytwo;

    @ApiModelProperty(value = "扩展字段0")
    @TableField("Extend0")
    private String Extend0;

    @ApiModelProperty(value = "扩展字段1")
    @TableField("Extend1")
    private String Extend1;

    @ApiModelProperty(value = "扩展字段2")
    @TableField("Extend2")
    private String Extend2;

    @ApiModelProperty(value = "扩展字段3")
    @TableField("Extend3")
    private String Extend3;

    @ApiModelProperty(value = "扩展字段4")
    @TableField("Extend4")
    private String Extend4;


    public static final String BILLID = "Billid";

    public static final String BILLDATE = "Billdate";

    public static final String SINID = "Sinid";

    public static final String CLIID = "Cliid";

    public static final String CLISHORTNAME = "Clishortname";

    public static final String CURRENCYTYPE = "Currencytype";

    public static final String RECKONTYPEF = "Reckontypef";

    public static final String RECKONTYPES = "Reckontypes";

    public static final String RECKONTYPET = "Reckontypet";

    public static final String RECKONMONEYF = "Reckonmoneyf";

    public static final String RECKONMONEYS = "Reckonmoneys";

    public static final String RECKONMONEYT = "Reckonmoneyt";

    public static final String GATHERDISCOUNT = "Gatherdiscount";

    public static final String GATHERENDACCOUNTMONTH = "Gatherendaccountmonth";

    public static final String EMPID = "Empid";

    public static final String EMPNAME = "Empname";

    public static final String DEPID = "Depid";

    public static final String DEPNAME = "Depname";

    public static final String MAKEEMPNAME = "Makeempname";

    public static final String AUDITINGEMPNAME = "Auditingempname";

    public static final String CHECKSTATE = "Checkstate";

    public static final String REMARK = "Remark";

    public static final String ENABLES = "Enables";

    public static final String SAFETYONE = "Safetyone";

    public static final String SAFETYTWO = "Safetytwo";

    public static final String EXTEND0 = "Extend0";

    public static final String EXTEND1 = "Extend1";

    public static final String EXTEND2 = "Extend2";

    public static final String EXTEND3 = "Extend3";

    public static final String EXTEND4 = "Extend4";

    @Override
    protected Serializable pkVal() {
        return this.Billid;
    }

}
