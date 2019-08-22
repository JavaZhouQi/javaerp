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
 * @since 2019-08-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Comcustaddress对象", description="")
public class Comcustaddress extends Model<Comcustaddress> {

    private static final long serialVersionUID = 1L;

    @TableField("Flag")
    private Integer Flag;

    @TableField("ID")
    private String id;

    @TableField("AddrID")
    private String AddrID;

    @TableField("ZipCode")
    private String ZipCode;

    @TableField("Address")
    private String Address;

    @TableField("LinkMan")
    private String LinkMan;

    @TableField("LinkManProf")
    private String LinkManProf;

    @TableField("Telephone")
    private String Telephone;

    @TableField("FaxNo")
    private String FaxNo;

    @TableField("Memo")
    private String Memo;

    @TableField("WalkAddr")
    private String WalkAddr;


    public static final String FLAG = "Flag";

    public static final String ID = "ID";

    public static final String ADDRID = "AddrID";

    public static final String ZIPCODE = "ZipCode";

    public static final String ADDRESS = "Address";

    public static final String LINKMAN = "LinkMan";

    public static final String LINKMANPROF = "LinkManProf";

    public static final String TELEPHONE = "Telephone";

    public static final String FAXNO = "FaxNo";

    public static final String MEMO = "Memo";

    public static final String WALKADDR = "WalkAddr";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
