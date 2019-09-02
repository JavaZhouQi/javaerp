package com.accp.erp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zq
 * @since 2019-08-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Tjcallotlist对象", description="")
public class Tjcallotlist extends Model<Tjcallotlist> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "调拨明细单的单据号码")
    @TableId("MoveNo")
    private Integer MoveNo;

    @ApiModelProperty(value = "单据号码")
    @TableField("MoveNumber")
    private Integer MoveNumber;

    @ApiModelProperty(value = "栏号")
    @TableField("ColumnNo")
    private Integer ColumnNo;

    @ApiModelProperty(value = "物料编号")
    @TableField("StockNumber")
    private String StockNumber;

    @ApiModelProperty(value = "物料名称")
    @TableField("StockName")
    private String StockName;

    @ApiModelProperty(value = "规格型号")
    @TableField("Specifications")
    private String Specifications;

    @ApiModelProperty(value = "单位")
    @TableField("Unit")
    private String Unit;

    @ApiModelProperty(value = "现行不均成本")
    @TableField("Current")
    private Double Current;

    @ApiModelProperty(value = "数量")
    @TableField("Quantity")
    private Integer Quantity;

    @ApiModelProperty(value = "分录备注")
    @TableField("EntryNote")
    private String EntryNote;

    @ApiModelProperty(value = "使用有效日期")
    @TableField("EffectiveDate")
    private String EffectiveDate;

    @ApiModelProperty(value = "保留字段1")
    private String testone;

    @ApiModelProperty(value = "保留字段2")
    private String testtwo;


    public static final String MOVENO = "MoveNo";

    public static final String MOVENUMBER = "MoveNumber";

    public static final String COLUMNNO = "ColumnNo";

    public static final String STOCKNUMBER = "StockNumber";

    public static final String STOCKNAME = "StockName";

    public static final String SPECIFICATIONS = "Specifications";

    public static final String UNIT = "Unit";

    public static final String CURRENT = "Current";

    public static final String QUANTITY = "Quantity";

    public static final String ENTRYNOTE = "EntryNote";

    public static final String EFFECTIVEDATE = "EffectiveDate";

    public static final String TESTONE = "testone";

    public static final String TESTTWO = "testtwo";

    @Override
    protected Serializable pkVal() {
        return this.MoveNo;
    }

}
