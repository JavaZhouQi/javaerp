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
@ApiModel(value="Comwarehouse对象", description="")
public class Comwarehouse extends Model<Comwarehouse> {

    private static final long serialVersionUID = 1L;

    @TableField("WareHouseID")
    private String WareHouseID;

    @TableField("WareHouseName")
    private String WareHouseName;

    @TableField("ShortName")
    private String ShortName;

    @TableField("EngName")
    private String EngName;

    @TableField("LinkMan")
    private String LinkMan;

    @TableField("Telephone")
    private String Telephone;

    @TableField("WareHouseAddress")
    private String WareHouseAddress;

    @TableField("Memo")
    private String Memo;

    @TableField("MergeOutState")
    private Integer MergeOutState;

    @TableField("DataVer")
    private Integer DataVer;


    public static final String WAREHOUSEID = "WareHouseID";

    public static final String WAREHOUSENAME = "WareHouseName";

    public static final String SHORTNAME = "ShortName";

    public static final String ENGNAME = "EngName";

    public static final String LINKMAN = "LinkMan";

    public static final String TELEPHONE = "Telephone";

    public static final String WAREHOUSEADDRESS = "WareHouseAddress";

    public static final String MEMO = "Memo";

    public static final String MERGEOUTSTATE = "MergeOutState";

    public static final String DATAVER = "DataVer";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
