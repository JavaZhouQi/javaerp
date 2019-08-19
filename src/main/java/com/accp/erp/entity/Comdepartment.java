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
 * @since 2019-08-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Comdepartment对象", description="")
public class Comdepartment extends Model<Comdepartment> {

    private static final long serialVersionUID = 1L;

    @TableField("DepartID")
    private String DepartID;

    @TableField("DepartName")
    private String DepartName;

    @TableField("EngName")
    private String EngName;

    @TableField("Memo")
    private String Memo;

    @TableField("Female")
    private Integer Female;

    @TableField("Male")
    private Integer Male;

    @TableField("JobSch")
    private String JobSch;

    @TableField("MergeOutState")
    private Integer MergeOutState;

    @TableField("CalID")
    private String CalID;

    @TableField("SalaryTypeID")
    private String SalaryTypeID;


    public static final String DEPARTID = "DepartID";

    public static final String DEPARTNAME = "DepartName";

    public static final String ENGNAME = "EngName";

    public static final String MEMO = "Memo";

    public static final String FEMALE = "Female";

    public static final String MALE = "Male";

    public static final String JOBSCH = "JobSch";

    public static final String MERGEOUTSTATE = "MergeOutState";

    public static final String CALID = "CalID";

    public static final String SALARYTYPEID = "SalaryTypeID";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
