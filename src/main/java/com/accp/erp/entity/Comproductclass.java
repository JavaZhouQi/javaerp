package com.accp.erp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
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
 * @since 2019-08-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Comproductclass对象", description="")
public class Comproductclass extends Model<Comproductclass> {

    private static final long serialVersionUID = 1L;

    @TableField("ClassID")
    private String ClassID;

    @TableField("ClassName")
    private String ClassName;

    @TableField("EngName")
    private String EngName;

    @TableField("AccInventory")
    private String AccInventory;

    @TableField("AccPurchased")
    private String AccPurchased;

    @TableField("ReturnPurchase")
    private String ReturnPurchase;

    @TableField("AccSale")
    private String AccSale;

    @TableField("AccSaleCost")
    private String AccSaleCost;

    @TableField("ReturnSale")
    private String ReturnSale;

    @TableField("GiftExpense")
    private String GiftExpense;

    @TableField("MaterialWarehouse")
    private String MaterialWarehouse;

    @TableField("MergeOutState")
    private Integer MergeOutState;

    @TableField("DataVer")
    private Integer DataVer;

    @TableField("OtherExpense")
    private String OtherExpense;

    @TableField("OtherIncome")
    private String OtherIncome;

    @TableField("OtherCost")
    private String OtherCost;

    @TableField("Memo")
    private String Memo;


    public static final String CLASSID = "ClassID";

    public static final String CLASSNAME = "ClassName";

    public static final String ENGNAME = "EngName";

    public static final String ACCINVENTORY = "AccInventory";

    public static final String ACCPURCHASED = "AccPurchased";

    public static final String RETURNPURCHASE = "ReturnPurchase";

    public static final String ACCSALE = "AccSale";

    public static final String ACCSALECOST = "AccSaleCost";

    public static final String RETURNSALE = "ReturnSale";

    public static final String GIFTEXPENSE = "GiftExpense";

    public static final String MATERIALWAREHOUSE = "MaterialWarehouse";

    public static final String MERGEOUTSTATE = "MergeOutState";

    public static final String DATAVER = "DataVer";

    public static final String OTHEREXPENSE = "OtherExpense";

    public static final String OTHERINCOME = "OtherIncome";

    public static final String OTHERCOST = "OtherCost";

    public static final String MEMO = "Memo";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
