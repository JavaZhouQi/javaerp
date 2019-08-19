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
@ApiModel(value="Comstdunit对象", description="")
public class Comstdunit extends Model<Comstdunit> {

    private static final long serialVersionUID = 1L;

    @TableField("UnitID")
    private String UnitID;

    @TableField("UnitName")
    private String UnitName;

    @TableField("EngName")
    private String EngName;

    @TableField("Memo")
    private String Memo;

    @TableField("MergeOutState")
    private Integer MergeOutState;


    public static final String UNITID = "UnitID";

    public static final String UNITNAME = "UnitName";

    public static final String ENGNAME = "EngName";

    public static final String MEMO = "Memo";

    public static final String MERGEOUTSTATE = "MergeOutState";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
