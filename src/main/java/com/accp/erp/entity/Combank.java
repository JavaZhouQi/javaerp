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
@ApiModel(value="Combank对象", description="")
public class Combank extends Model<Combank> {

    private static final long serialVersionUID = 1L;

    @TableField("bankID")
    private String bankID;

    @TableField("bankClsID")
    private String bankClsID;

    @TableField("bankName")
    private String bankName;

    @TableField("engName")
    private String engName;

    @TableField("telePhone")
    private String telePhone;

    @TableField("dilivZoneNo")
    private String dilivZoneNo;

    private String address;

    @TableField("mergeOutState")
    private Integer mergeOutState;

    private String memo;


    public static final String BANKID = "bankID";

    public static final String BANKCLSID = "bankClsID";

    public static final String BANKNAME = "bankName";

    public static final String ENGNAME = "engName";

    public static final String TELEPHONE = "telePhone";

    public static final String DILIVZONENO = "dilivZoneNo";

    public static final String ADDRESS = "address";

    public static final String MERGEOUTSTATE = "mergeOutState";

    public static final String MEMO = "memo";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
