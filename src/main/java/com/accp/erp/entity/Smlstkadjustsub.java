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
@ApiModel(value="Smlstkadjustsub对象", description="销售报价、订单明细表")
public class Smlstkadjustsub extends Model<Smlstkadjustsub> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "标识字段")
    private Integer flag;

    @ApiModelProperty(value = "单据编号")
    @TableField("adjustNO")
    private String adjustNO;

    @ApiModelProperty(value = "行号")
    @TableField("rowNo")
    private Integer rowNo;

    @ApiModelProperty(value = "栏号")
    @TableField("serNO")
    private Integer serNO;

    @ApiModelProperty(value = "单据日期")
    @TableField("adjustDate")
    private LocalDate adjustDate;

    @ApiModelProperty(value = "单价")
    private Float price;

    @ApiModelProperty(value = "金额")
    private Float amount;

    @ApiModelProperty(value = "批号")
    @TableField("haveBatch")
    private String haveBatch;

    @ApiModelProperty(value = "分录备注")
    @TableField("itemRemark")
    private String itemRemark;


    public static final String FLAG = "flag";

    public static final String ADJUSTNO = "adjustNO";

    public static final String ROWNO = "rowNo";

    public static final String SERNO = "serNO";

    public static final String ADJUSTDATE = "adjustDate";

    public static final String PRICE = "price";

    public static final String AMOUNT = "amount";

    public static final String HAVEBATCH = "haveBatch";

    public static final String ITEMREMARK = "itemRemark";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
