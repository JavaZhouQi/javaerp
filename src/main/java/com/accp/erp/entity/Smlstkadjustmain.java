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
 * 销售报价、订单明细表
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Smlstkadjustmain对象", description="销售报价、订单明细表")
public class Smlstkadjustmain extends Model<Smlstkadjustmain> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "标识字段")
    private Integer flag;

    @ApiModelProperty(value = "单据编号")
    @TableField("adjustNO")
    private String adjustNO;

    @ApiModelProperty(value = "单据日期")
    @TableField("adjustDate")
    private LocalDate adjustDate;

    @ApiModelProperty(value = "制单人员")
    private String maker;

    @ApiModelProperty(value = "复核人员")
    private String permitter;

    @ApiModelProperty(value = "凭证编号")
    @TableField("voucherNO")
    private String voucherNO;

    @ApiModelProperty(value = "数量合计")
    @TableField("sumQty")
    private Integer sumQty;

    @ApiModelProperty(value = "自定栏一")
    @TableField("uDef1")
    private String uDef1;

    @ApiModelProperty(value = "自定栏二")
    @TableField("uDef2")
    private String uDef2;

    @ApiModelProperty(value = "所属部门")
    @TableField("departID")
    private Integer departID;

    @ApiModelProperty(value = "复核人员")
    @TableField("makerID")
    private Integer makerID;

    @ApiModelProperty(value = "仓库id")
    @TableField("wareID")
    private Integer wareID;

    @ApiModelProperty(value = "出库人员id")
    @TableField("salesID")
    private Integer salesID;

    @ApiModelProperty(value = "出库类型id")
    @TableField("billStyle")
    private Integer billStyle;

    @ApiModelProperty(value = "出库状态")
    @TableField("billStatus")
    private Integer billStatus;


    public static final String FLAG = "flag";

    public static final String ADJUSTNO = "adjustNO";

    public static final String ADJUSTDATE = "adjustDate";

    public static final String MAKER = "maker";

    public static final String PERMITTER = "permitter";

    public static final String VOUCHERNO = "voucherNO";

    public static final String SUMQTY = "sumQty";

    public static final String UDEF1 = "uDef1";

    public static final String UDEF2 = "uDef2";

    public static final String DEPARTID = "departID";

    public static final String MAKERID = "makerID";

    public static final String WAREID = "wareID";

    public static final String SALESID = "salesID";

    public static final String BILLSTYLE = "billStyle";

    public static final String BILLSTATUS = "billStatus";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
