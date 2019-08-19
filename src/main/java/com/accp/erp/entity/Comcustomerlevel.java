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
@ApiModel(value="Comcustomerlevel对象", description="")
public class Comcustomerlevel extends Model<Comcustomerlevel> {

    private static final long serialVersionUID = 1L;

    @TableField("LevelID")
    private String LevelID;

    @TableField("LevelName")
    private String LevelName;

    @TableField("Memo")
    private String Memo;

    @TableField("MergeOutState")
    private Integer MergeOutState;


    public static final String LEVELID = "LevelID";

    public static final String LEVELNAME = "LevelName";

    public static final String MEMO = "Memo";

    public static final String MERGEOUTSTATE = "MergeOutState";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
