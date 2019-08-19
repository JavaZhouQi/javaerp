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
 * @since 2019-08-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Humschooling对象", description="")
public class Humschooling extends Model<Humschooling> {

    private static final long serialVersionUID = 1L;

    @TableId("schoolingID")
    private String schoolingID;

    @TableField("schoolingName")
    private String schoolingName;

    @TableField("engName")
    private String engName;

    private String memo;

    @TableField("mergeOutState")
    private Integer mergeOutState;


    public static final String SCHOOLINGID = "schoolingID";

    public static final String SCHOOLINGNAME = "schoolingName";

    public static final String ENGNAME = "engName";

    public static final String MEMO = "memo";

    public static final String MERGEOUTSTATE = "mergeOutState";

    @Override
    protected Serializable pkVal() {
        return this.schoolingID;
    }

}
