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
@ApiModel(value="Zwjreturndetails对象", description="")
public class Zwjreturndetails extends Model<Zwjreturndetails> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "物料编号")
    @TableField("ProdID")
    private Integer ProdID;

    @ApiModelProperty(value = "	栏号")
    @TableField("SerNo")
    private Integer SerNo;

    @ApiModelProperty(value = "	物料名称")
    @TableField("ProdName")
    private String ProdName;

    @ApiModelProperty(value = "	规格型号")
    @TableField("ProdSize")
    private String ProdSize;

    @ApiModelProperty(value = "	单位")
    @TableField("UnitName")
    private String UnitName;

    @ApiModelProperty(value = "	数量")
    @TableField("SQuantity")
    private Integer SQuantity;

    @ApiModelProperty(value = "单价")
    @TableField("Sprice")
    private Double Sprice;

    @ApiModelProperty(value = "金额")
    @TableField("Amount")
    private Double Amount;

    @ApiModelProperty(value = "	批号")
    @TableField("HaveBatch")
    private String HaveBatch;

    @ApiModelProperty(value = "	分录备注")
    @TableField("ItwmRemark")
    private String ItwmRemark;

    @ApiModelProperty(value = "测试数据")
    @TableField("CsOne")
    private String CsOne;

    @ApiModelProperty(value = "测试数据")
    @TableField("CsTow")
    private String CsTow;

    @ApiModelProperty(value = "测试数据")
    @TableField("CsThree")
    private String CsThree;


    public static final String PRODID = "ProdID";

    public static final String SERNO = "SerNo";

    public static final String PRODNAME = "ProdName";

    public static final String PRODSIZE = "ProdSize";

    public static final String UNITNAME = "UnitName";

    public static final String SQUANTITY = "SQuantity";

    public static final String SPRICE = "Sprice";

    public static final String AMOUNT = "Amount";

    public static final String HAVEBATCH = "HaveBatch";

    public static final String ITWMREMARK = "ItwmRemark";

    public static final String CSONE = "CsOne";

    public static final String CSTOW = "CsTow";

    public static final String CSTHREE = "CsThree";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
