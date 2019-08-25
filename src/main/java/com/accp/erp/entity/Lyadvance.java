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
@ApiModel(value="Lyadvance对象", description="")
public class Lyadvance extends Model<Lyadvance> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "预付单单号")
    private String advid;

    @ApiModelProperty(value = "单据日期")
    private LocalDate advdate;

    @ApiModelProperty(value = "供应商ID")
    private String purveyid;

    @ApiModelProperty(value = "供应商名称")
    private String purveyname;

    @ApiModelProperty(value = "结算方式1")
    private String advstrike1;

    @ApiModelProperty(value = "结算方式2")
    private String advstrike2;

    @ApiModelProperty(value = "结算方式3")
    private String advstrike3;

    @ApiModelProperty(value = "金额1")
    private Double advmoney1;

    @ApiModelProperty(value = "金额2")
    private Double advmoney2;

    @ApiModelProperty(value = "金额3")
    private Double advmoney3;

    @ApiModelProperty(value = "制单人员")
    private String advmakeing;

    @ApiModelProperty(value = "制单人所属部门")
    private String stodept;

    @ApiModelProperty(value = "部门ID")
    private Integer stodeptid;

    @ApiModelProperty(value = "复核人员")
    private String advcheckman;

    @ApiModelProperty(value = "备注")
    private String advremark;

    @ApiModelProperty(value = "是否审核")
    private Integer isaditing;

    @ApiModelProperty(value = "保存（“预付款单”）")
    private String safetyone;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;


    public static final String ADVID = "advid";

    public static final String ADVDATE = "advdate";

    public static final String PURVEYID = "purveyid";

    public static final String PURVEYNAME = "purveyname";

    public static final String ADVSTRIKE1 = "advstrike1";

    public static final String ADVSTRIKE2 = "advstrike2";

    public static final String ADVSTRIKE3 = "advstrike3";

    public static final String ADVMONEY1 = "advmoney1";

    public static final String ADVMONEY2 = "advmoney2";

    public static final String ADVMONEY3 = "advmoney3";

    public static final String ADVMAKEING = "advmakeing";

    public static final String STODEPT = "stodept";

    public static final String STODEPTID = "stodeptid";

    public static final String ADVCHECKMAN = "advcheckman";

    public static final String ADVREMARK = "advremark";

    public static final String ISADITING = "isaditing";

    public static final String SAFETYONE = "safetyone";

    public static final String ENABLES = "enables";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
