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
@ApiModel(value="Tjcchecklist对象", description="")
public class Tjcchecklist extends Model<Tjcchecklist> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "盘点单的单据号码")
    @TableId("BillNo")
    private Integer BillNo;

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

    @ApiModelProperty(value = "账面数量")
    @TableField("Physical")
    private Integer Physical;

    @ApiModelProperty(value = "盘点数量")
    @TableField("Inventory")
    private Integer Inventory;

    @ApiModelProperty(value = "盘亏数量")
    @TableField("NumberOfProfit")
    private Integer NumberOfProfit;

    @ApiModelProperty(value = "单价")
    @TableField("UnitPrice")
    private Double UnitPrice;

    @ApiModelProperty(value = "盘亏金额")
    @TableField("Quantity")
    private Double Quantity;

    @ApiModelProperty(value = "原因")
    @TableField("EntryNote")
    private String EntryNote;

    @ApiModelProperty(value = "保留字段1")
    private String testone;

    @ApiModelProperty(value = "保留字段2")
    private String testtwo;


    public static final String BILLNO = "BillNo";

    public static final String MOVENUMBER = "MoveNumber";

    public static final String COLUMNNO = "ColumnNo";

    public static final String STOCKNUMBER = "StockNumber";

    public static final String STOCKNAME = "StockName";

    public static final String SPECIFICATIONS = "Specifications";

    public static final String UNIT = "Unit";

    public static final String PHYSICAL = "Physical";

    public static final String INVENTORY = "Inventory";

    public static final String NUMBEROFPROFIT = "NumberOfProfit";

    public static final String UNITPRICE = "UnitPrice";

    public static final String QUANTITY = "Quantity";

    public static final String ENTRYNOTE = "EntryNote";

    public static final String TESTONE = "testone";

    public static final String TESTTWO = "testtwo";

    @Override
    protected Serializable pkVal() {
        return this.BillNo;
    }

}
