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
 * @since 2019-08-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Combankcls对象", description="")
public class Combankcls extends Model<Combankcls> {

    private static final long serialVersionUID = 1L;

    @TableField("bankClsID")
    private String bankClsID;

    @TableField("bankClsName")
    private String bankClsName;

    @TableField("engName")
    private String engName;

    private String memo;

    @TableField("mergeOutState")
    private Integer mergeOutState;


    public static final String BANKCLSID = "bankClsID";

    public static final String BANKCLSNAME = "bankClsName";

    public static final String ENGNAME = "engName";

    public static final String MEMO = "memo";

    public static final String MERGEOUTSTATE = "mergeOutState";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
