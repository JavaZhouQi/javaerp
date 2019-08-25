package com.accp.erp.entity;

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
@ApiModel(value="Lypayment对象", description="")
public class Lypayment extends Model<Lypayment> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "应付冲款单单号")
    private String payid;

    @ApiModelProperty(value = "单据日期")
    private LocalDate paydate;

    @ApiModelProperty(value = "供应商ID")
    private String purveyid;

    @ApiModelProperty(value = "供应商名称")
    private String purveyname;

    @ApiModelProperty(value = "结算方式1")
    private String paystrike1;

    @ApiModelProperty(value = "结算方式2")
    private String paystrike2;

    @ApiModelProperty(value = "结算方式3")
    private String paystrike3;

    @ApiModelProperty(value = "金额1")
    private Double paymoney1;

    @ApiModelProperty(value = "金额2")
    private Double paymoney2;

    @ApiModelProperty(value = "金额3")
    private Double paymoney3;

    @ApiModelProperty(value = "制单人员")
    private String paymakeing;

    @ApiModelProperty(value = "制单人所属部门")
    private String paydept;

    @ApiModelProperty(value = "部门ID （伪ID）")
    private String stodeptid;

    @ApiModelProperty(value = "审核人员")
    private String paycheckman;

    @ApiModelProperty(value = "备注")
    private String payremark;

    @ApiModelProperty(value = "是否审核")
    private Integer isaditing;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;


    public static final String PAYID = "payid";

    public static final String PAYDATE = "paydate";

    public static final String PURVEYID = "purveyid";

    public static final String PURVEYNAME = "purveyname";

    public static final String PAYSTRIKE1 = "paystrike1";

    public static final String PAYSTRIKE2 = "paystrike2";

    public static final String PAYSTRIKE3 = "paystrike3";

    public static final String PAYMONEY1 = "paymoney1";

    public static final String PAYMONEY2 = "paymoney2";

    public static final String PAYMONEY3 = "paymoney3";

    public static final String PAYMAKEING = "paymakeing";

    public static final String PAYDEPT = "paydept";

    public static final String STODEPTID = "stodeptid";

    public static final String PAYCHECKMAN = "paycheckman";

    public static final String PAYREMARK = "payremark";

    public static final String ISADITING = "isaditing";

    public static final String ENABLES = "enables";

    @Override
    protected Serializable pkVal() {
        return this.payid;
    }

}
