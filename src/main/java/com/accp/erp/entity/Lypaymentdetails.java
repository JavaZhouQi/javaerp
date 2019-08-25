package com.accp.erp.entity;

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
@ApiModel(value="Lypaymentdetails对象", description="")
public class Lypaymentdetails extends Model<Lypaymentdetails> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "应付冲款单单号")
    private String payid;

    @ApiModelProperty(value = "行号")
    private String paydetid;

    @ApiModelProperty(value = "来源单别")
    private String paydetoddtype;

    @ApiModelProperty(value = "来源单号")
    private String paydetoddid;

    @ApiModelProperty(value = "原单金额")
    private Double formeroddmoney;

    @ApiModelProperty(value = "现行余额")
    private Double nocebalance;

    @ApiModelProperty(value = "折让金额")
    private Double payzr;

    @ApiModelProperty(value = "冲款金额")
    private Double paydetmoney;

    @ApiModelProperty(value = "取用预付")
    private Double takadvmoney;

    @ApiModelProperty(value = "冲抵金额")
    private Double rushmoney;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;


    public static final String PAYID = "payid";

    public static final String PAYDETID = "paydetid";

    public static final String PAYDETODDTYPE = "paydetoddtype";

    public static final String PAYDETODDID = "paydetoddid";

    public static final String FORMERODDMONEY = "formeroddmoney";

    public static final String NOCEBALANCE = "nocebalance";

    public static final String PAYZR = "payzr";

    public static final String PAYDETMONEY = "paydetmoney";

    public static final String TAKADVMONEY = "takadvmoney";

    public static final String RUSHMONEY = "rushmoney";

    public static final String ENABLES = "enables";

    @Override
    protected Serializable pkVal() {
        return this.payid;
    }

}
