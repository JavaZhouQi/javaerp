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
@ApiModel(value="Zwjexpensedetail对象", description="")
public class Zwjexpensedetail extends Model<Zwjexpensedetail> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "	费用编号")
    @TableField("PeeClassID")
    private Integer PeeClassID;

    @ApiModelProperty(value = "	栏号")
    @TableField("SerNo")
    private Integer SerNo;

    @ApiModelProperty(value = "费用名称")
    @TableField("PareClassName")
    private String PareClassName;

    @ApiModelProperty(value = "币别ID")
    @TableField("CurrID")
    private Integer CurrID;

    @ApiModelProperty(value = "	汇率")
    @TableField("ExchRate")
    private Double ExchRate;

    @ApiModelProperty(value = "金额")
    @TableField("Amount")
    private Double Amount;

    @ApiModelProperty(value = "测试数据")
    @TableField("CsOne")
    private String CsOne;

    @ApiModelProperty(value = "测试数据")
    @TableField("CsTow")
    private String CsTow;

    @ApiModelProperty(value = "测试数据")
    @TableField("CsThree")
    private String CsThree;


    public static final String PEECLASSID = "PeeClassID";

    public static final String SERNO = "SerNo";

    public static final String PARECLASSNAME = "PareClassName";

    public static final String CURRID = "CurrID";

    public static final String EXCHRATE = "ExchRate";

    public static final String AMOUNT = "Amount";

    public static final String CSONE = "CsOne";

    public static final String CSTOW = "CsTow";

    public static final String CSTHREE = "CsThree";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
