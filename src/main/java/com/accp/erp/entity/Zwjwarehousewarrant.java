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
@ApiModel(value="Zwjwarehousewarrant对象", description="")
public class Zwjwarehousewarrant extends Model<Zwjwarehousewarrant> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "	单据号码")
    @TableField("BillNo")
    private Integer BillNo;

    @ApiModelProperty(value = "供应商ID")
    @TableField("CustID")
    private Integer CustID;

    @ApiModelProperty(value = "入库类型")
    @TableField("SaleClassName")
    private String SaleClassName;

    @ApiModelProperty(value = "单据日期")
    @TableField("BillDate")
    private LocalDate BillDate;

    @ApiModelProperty(value = "凭证编号")
    @TableField("VoucherNo")
    private String VoucherNo;

    @ApiModelProperty(value = "	入库人员ID")
    @TableField("SaleID")
    private Integer SaleID;

    @ApiModelProperty(value = "	所属部门ID")
    @TableField("DepartID")
    private Integer DepartID;

    @ApiModelProperty(value = "制单人员")
    @TableField("Maker")
    private String Maker;

    @ApiModelProperty(value = "复核人员")
    @TableField("Permitter")
    private String Permitter;

    @ApiModelProperty(value = "	测试数据")
    @TableField("CsOne")
    private String CsOne;

    @ApiModelProperty(value = "	测试数据")
    @TableField("CsTow")
    private String CsTow;

    @ApiModelProperty(value = "	测试数据")
    @TableField("CsThree")
    private String CsThree;


    public static final String BILLNO = "BillNo";

    public static final String CUSTID = "CustID";

    public static final String SALECLASSNAME = "SaleClassName";

    public static final String BILLDATE = "BillDate";

    public static final String VOUCHERNO = "VoucherNo";

    public static final String SALEID = "SaleID";

    public static final String DEPARTID = "DepartID";

    public static final String MAKER = "Maker";

    public static final String PERMITTER = "Permitter";

    public static final String CSONE = "CsOne";

    public static final String CSTOW = "CsTow";

    public static final String CSTHREE = "CsThree";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
