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
 * @since 2019-08-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Comtaxitems对象", description="")
public class Comtaxitems extends Model<Comtaxitems> {

    private static final long serialVersionUID = 1L;

    @TableId("TaxItemsID")
    private String TaxItemsID;

    @TableField("TaxItemsName")
    private String TaxItemsName;

    @TableField("EngName")
    private String EngName;

    private String memo;

    @TableField("MergeOutState")
    private Integer MergeOutState;


    public static final String TAXITEMSID = "TaxItemsID";

    public static final String TAXITEMSNAME = "TaxItemsName";

    public static final String ENGNAME = "EngName";

    public static final String MEMO = "memo";

    public static final String MERGEOUTSTATE = "MergeOutState";

    @Override
    protected Serializable pkVal() {
        return this.TaxItemsID;
    }

}
