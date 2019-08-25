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
@ApiModel(value="Lyaccountlist对象", description="")
public class Lyaccountlist extends Model<Lyaccountlist> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "栏号")
    @TableId("SerNo")
    private Integer SerNo;

    @ApiModelProperty(value = "物料编号")
    @TableField("ProdID")
    private Integer ProdID;

    @ApiModelProperty(value = "物料名称")
    @TableField("ProdName")
    private String ProdName;

    @ApiModelProperty(value = "原单金额")
    @TableField("SourceAmount")
    private Double SourceAmount;

    @ApiModelProperty(value = "发票金额")
    @TableField("Amount")
    private Double Amount;

    @ApiModelProperty(value = "价差")
    @TableField("BalanceAmt")
    private Double BalanceAmt;

    @ApiModelProperty(value = "汇差")
    @TableField("RateBalanceAmt")
    private Float RateBalanceAmt;

    @ApiModelProperty(value = "差额合计")
    @TableField("TotalBalanceAmt")
    private Float TotalBalanceAmt;

    @ApiModelProperty(value = "规格型号")
    @TableField("ProdSize")
    private String ProdSize;


    public static final String SERNO = "SerNo";

    public static final String PRODID = "ProdID";

    public static final String PRODNAME = "ProdName";

    public static final String SOURCEAMOUNT = "SourceAmount";

    public static final String AMOUNT = "Amount";

    public static final String BALANCEAMT = "BalanceAmt";

    public static final String RATEBALANCEAMT = "RateBalanceAmt";

    public static final String TOTALBALANCEAMT = "TotalBalanceAmt";

    public static final String PRODSIZE = "ProdSize";

    @Override
    protected Serializable pkVal() {
        return this.SerNo;
    }

}
