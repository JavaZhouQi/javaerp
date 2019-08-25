package com.accp.erp.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

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
@ApiModel(value="Zwjresultsdetail对象", description="")
public class Zwjresultsdetail extends Model<Zwjresultsdetail> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "	采购入库编号")
    @TableField("FormNo")
    private Integer FormNo;

    @ApiModelProperty(value = "	栏号")
    @TableField("SerNo")
    private Integer SerNo;

    @ApiModelProperty(value = "	物料编号")
    @TableField("ProdID")
    private String ProdID;

    @ApiModelProperty(value = "采购金额")
    @TableField("VAmount")
    private Double VAmount;

    @ApiModelProperty(value = "物料名称")
    @TableField("ProdName")
    private String ProdName;

    @ApiModelProperty(value = "规格型号")
    @TableField("ProdSize")
    private String ProdSize;

    @ApiModelProperty(value = "	分摊金额")
    @TableField("MLAmount")
    private Double MLAmount;

    @ApiModelProperty(value = "	数量")
    @TableField("VQuantity")
    private Integer VQuantity;

    @ApiModelProperty(value = "单位")
    @TableField("Sunit")
    private String Sunit;

    @ApiModelProperty(value = "币别ID")
    @TableField("DetailCurrID")
    private Integer DetailCurrID;

    @ApiModelProperty(value = "测试数据")
    @TableField("CsOne")
    private String CsOne;

    @ApiModelProperty(value = "测试数据")
    @TableField("CsTow")
    private String CsTow;

    @ApiModelProperty(value = "测试数据")
    @TableField("CsThree")
    private String CsThree;


    public static final String FORMNO = "FormNo";

    public static final String SERNO = "SerNo";

    public static final String PRODID = "ProdID";

    public static final String VAMOUNT = "VAmount";

    public static final String PRODNAME = "ProdName";

    public static final String PRODSIZE = "ProdSize";

    public static final String MLAMOUNT = "MLAmount";

    public static final String VQUANTITY = "VQuantity";

    public static final String SUNIT = "Sunit";

    public static final String DETAILCURRID = "DetailCurrID";

    public static final String CSONE = "CsOne";

    public static final String CSTOW = "CsTow";

    public static final String CSTHREE = "CsThree";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
