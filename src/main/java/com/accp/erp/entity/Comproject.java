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
 * @since 2019-08-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Comproject对象", description="")
public class Comproject extends Model<Comproject> {

    private static final long serialVersionUID = 1L;

    @TableField("projectID")
    private String projectID;

    @TableField("projectName")
    private String projectName;

    @TableField("engName")
    private String engName;

    private String memo;

    @TableField("mergeOutState")
    private Integer mergeOutState;

    @TableField("invalidDate")
    private Integer invalidDate;


    public static final String PROJECTID = "projectID";

    public static final String PROJECTNAME = "projectName";

    public static final String ENGNAME = "engName";

    public static final String MEMO = "memo";

    public static final String MERGEOUTSTATE = "mergeOutState";

    public static final String INVALIDDATE = "invalidDate";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
