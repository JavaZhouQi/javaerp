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
@ApiModel(value="Lyadvancedetails对象", description="")
public class Lyadvancedetails extends Model<Lyadvancedetails> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主表单号,也是外键")
    private String advid;

    @ApiModelProperty(value = "行号")
    private Integer advdetid;

    @ApiModelProperty(value = "预付金额")
    private Double advdetmoney;

    @ApiModelProperty(value = "来源单别")
    private String advdetoddtype;

    @ApiModelProperty(value = "来源单号")
    private String advdetoddid;

    @ApiModelProperty(value = "摘要")
    private String advdetdegest;

    @ApiModelProperty(value = "预付余额")
    private Double advdetbalance;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;


    public static final String ADVID = "advid";

    public static final String ADVDETID = "advdetid";

    public static final String ADVDETMONEY = "advdetmoney";

    public static final String ADVDETODDTYPE = "advdetoddtype";

    public static final String ADVDETODDID = "advdetoddid";

    public static final String ADVDETDEGEST = "advdetdegest";

    public static final String ADVDETBALANCE = "advdetbalance";

    public static final String ENABLES = "enables";

    @Override
    protected Serializable pkVal() {
        return this.advid;
    }

}
