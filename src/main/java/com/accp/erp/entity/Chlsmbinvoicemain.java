package com.accp.erp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 销售发票主表
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Chlsmbinvoicemain对象", description="销售发票主表")
public class Chlsmbinvoicemain extends Model<Chlsmbinvoicemain> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据号码，主键，PK")
    @TableId("BillNo")
    private String BillNo;

    @ApiModelProperty(value = "标记，主键，PK，")
    @TableField("Flag")
    private Integer Flag;

    @ApiModelProperty(value = "销售核对状态")
    @TableField("AffirmState")
    private Integer AffirmState;

    @ApiModelProperty(value = "单据类型")
    @TableField("BillType")
    private Integer BillType;

    @ApiModelProperty(value = "收款条件")
    @TableField("PayTerm")
    private Integer PayTerm;

    @ApiModelProperty(value = "收款天数")
    @TableField("DelayDays")
    private Integer DelayDays;

    @ApiModelProperty(value = "发票类型")
    @TableField("InvoTypeId")
    private String InvoTypeId;

    @ApiModelProperty(value = "其他收款方式")
    @TableField("GatherOther")
    private String GatherOther;

    @ApiModelProperty(value = "导出日期")
    @TableField("ExportDate")
    private Integer ExportDate;

    @ApiModelProperty(value = "导出人员")
    @TableField("ExportID")
    private String ExportID;


    public static final String BILLNO = "BillNo";

    public static final String FLAG = "Flag";

    public static final String AFFIRMSTATE = "AffirmState";

    public static final String BILLTYPE = "BillType";

    public static final String PAYTERM = "PayTerm";

    public static final String DELAYDAYS = "DelayDays";

    public static final String INVOTYPEID = "InvoTypeId";

    public static final String GATHEROTHER = "GatherOther";

    public static final String EXPORTDATE = "ExportDate";

    public static final String EXPORTID = "ExportID";

    @Override
    protected Serializable pkVal() {
        return this.BillNo;
    }

}
