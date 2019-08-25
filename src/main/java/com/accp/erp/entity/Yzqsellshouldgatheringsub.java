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
@ApiModel(value="Yzqsellshouldgatheringsub对象", description="")
public class Yzqsellshouldgatheringsub extends Model<Yzqsellshouldgatheringsub> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据号码")
    @TableId("costBillNo")
    private String costBillNo;

    @ApiModelProperty(value = "栏号")
    @TableField("serNo")
    private Integer serNo;

    @ApiModelProperty(value = "编号")
    @TableField("itemId")
    private String itemId;

    @ApiModelProperty(value = "名称")
    @TableField("fareClassName")
    private String fareClassName;

    @ApiModelProperty(value = "金额")
    private Double money;

    @ApiModelProperty(value = "税率")
    @TableField("taxRate")
    private Double taxRate;

    @ApiModelProperty(value = "税额")
    @TableField("taxMoney")
    private Double taxMoney;

    @ApiModelProperty(value = "科目编号")
    @TableField("accSubjectId")
    private String accSubjectId;

    @ApiModelProperty(value = "科目名称")
    @TableField("subjectName")
    private String subjectName;

    @ApiModelProperty(value = "分录备注")
    private String demo;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段1")
    private String safetyone;

    @ApiModelProperty(value = "保留字段2")
    private String safetytwo;


    public static final String COSTBILLNO = "costBillNo";

    public static final String SERNO = "serNo";

    public static final String ITEMID = "itemId";

    public static final String FARECLASSNAME = "fareClassName";

    public static final String MONEY = "money";

    public static final String TAXRATE = "taxRate";

    public static final String TAXMONEY = "taxMoney";

    public static final String ACCSUBJECTID = "accSubjectId";

    public static final String SUBJECTNAME = "subjectName";

    public static final String DEMO = "demo";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.costBillNo;
    }

}
