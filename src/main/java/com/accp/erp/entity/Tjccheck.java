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
@ApiModel(value="Tjccheck对象", description="")
public class Tjccheck extends Model<Tjccheck> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "盘点单ID")
    @TableId("checkID")
    private Integer checkID;

    @ApiModelProperty(value = "单据号码")
    @TableField("billNo")
    private Integer billNo;

    @ApiModelProperty(value = "单据日期")
    @TableField("adjustDate")
    private LocalDate adjustDate;

    @ApiModelProperty(value = "制单人员")
    private String maker;

    @ApiModelProperty(value = "复核人员")
    private String permitter;

    @ApiModelProperty(value = "自定栏一")
    private String udef1;

    @ApiModelProperty(value = "自定栏二")
    private String udef2;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "盘点仓库")
    @TableField("wareID")
    private Integer wareID;

    @ApiModelProperty(value = "盘点仓库名称")
    @TableField("wareName")
    private String wareName;

    @ApiModelProperty(value = "盘亏数量合计")
    @TableField("sumQty")
    private Integer sumQty;

    @ApiModelProperty(value = "盘亏金额合计")
    @TableField("sumCost")
    private Double sumCost;

    @ApiModelProperty(value = "凭证编号")
    @TableField("voucherNo")
    private Integer voucherNo;

    @ApiModelProperty(value = "盘点人员")
    @TableField("salesID")
    private Integer salesID;

    @ApiModelProperty(value = "盘点人员名称")
    @TableField("salesName")
    private String salesName;

    @ApiModelProperty(value = "所属部门")
    @TableField("departID")
    private Integer departID;

    @ApiModelProperty(value = "所属部门名称")
    @TableField("departName")
    private String departName;

    @ApiModelProperty(value = "英文名称")
    @TableField("engName")
    private String engName;

    @ApiModelProperty(value = "帐面数量为零载入")
    @TableField("zeroFilter")
    private Integer zeroFilter;

    @ApiModelProperty(value = "帐面数量合计")
    @TableField("sumCurQty")
    private Integer sumCurQty;

    @ApiModelProperty(value = "盘点数量合计")
    @TableField("sumCheckQty")
    private Integer sumCheckQty;

    @ApiModelProperty(value = "增值科目")
    @TableField("incSubjectID")
    private Integer incSubjectID;

    @ApiModelProperty(value = "增值科目名称")
    @TableField("incSubjectName")
    private String incSubjectName;

    @ApiModelProperty(value = "减值科目")
    @TableField("decSujectID")
    private Integer decSujectID;

    @ApiModelProperty(value = "减值科目名称")
    @TableField("decSujectName")
    private String decSujectName;

    @ApiModelProperty(value = "制单人")
    @TableField("makerSign")
    private String makerSign;

    @ApiModelProperty(value = "复核人")
    @TableField("permitterSign")
    private String permitterSign;

    @ApiModelProperty(value = "单据状态")
    @TableField("billStatus")
    private Integer billStatus;

    @ApiModelProperty(value = "调整类别")
    @TableField("adjustType")
    private String adjustType;

    @ApiModelProperty(value = "调整方式")
    @TableField("adjustStyle")
    private String adjustStyle;

    @ApiModelProperty(value = "单据抛转状态标识")
    @TableField("mergeOutState")
    private Integer mergeOutState;

    @ApiModelProperty(value = "制单人员编号")
    @TableField("makerID")
    private Integer makerID;

    @ApiModelProperty(value = "复核人员编号")
    @TableField("permitterID")
    private Integer permitterID;

    @ApiModelProperty(value = "数据版本")
    @TableField("dateVer")
    private String dateVer;

    @ApiModelProperty(value = "是否过账")
    @TableField("hasCheck")
    private Integer hasCheck;

    @ApiModelProperty(value = "是否存在附件")
    @TableField("hasBillAttach")
    private Integer hasBillAttach;

    @ApiModelProperty(value = "无权限查看当前记录")
    @TableField("noPowerToViewAdvPerms")
    private String noPowerToViewAdvPerms;


    public static final String CHECKID = "checkID";

    public static final String BILLNO = "billNo";

    public static final String ADJUSTDATE = "adjustDate";

    public static final String MAKER = "maker";

    public static final String PERMITTER = "permitter";

    public static final String UDEF1 = "udef1";

    public static final String UDEF2 = "udef2";

    public static final String REMARK = "remark";

    public static final String WAREID = "wareID";

    public static final String WARENAME = "wareName";

    public static final String SUMQTY = "sumQty";

    public static final String SUMCOST = "sumCost";

    public static final String VOUCHERNO = "voucherNo";

    public static final String SALESID = "salesID";

    public static final String SALESNAME = "salesName";

    public static final String DEPARTID = "departID";

    public static final String DEPARTNAME = "departName";

    public static final String ENGNAME = "engName";

    public static final String ZEROFILTER = "zeroFilter";

    public static final String SUMCURQTY = "sumCurQty";

    public static final String SUMCHECKQTY = "sumCheckQty";

    public static final String INCSUBJECTID = "incSubjectID";

    public static final String INCSUBJECTNAME = "incSubjectName";

    public static final String DECSUJECTID = "decSujectID";

    public static final String DECSUJECTNAME = "decSujectName";

    public static final String MAKERSIGN = "makerSign";

    public static final String PERMITTERSIGN = "permitterSign";

    public static final String BILLSTATUS = "billStatus";

    public static final String ADJUSTTYPE = "adjustType";

    public static final String ADJUSTSTYLE = "adjustStyle";

    public static final String MERGEOUTSTATE = "mergeOutState";

    public static final String MAKERID = "makerID";

    public static final String PERMITTERID = "permitterID";

    public static final String DATEVER = "dateVer";

    public static final String HASCHECK = "hasCheck";

    public static final String HASBILLATTACH = "hasBillAttach";

    public static final String NOPOWERTOVIEWADVPERMS = "noPowerToViewAdvPerms";

    @Override
    protected Serializable pkVal() {
        return this.checkID;
    }

}
