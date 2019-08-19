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
@ApiModel(value="Cominvoicetype对象", description="")
public class Cominvoicetype extends Model<Cominvoicetype> {

    private static final long serialVersionUID = 1L;

    @TableId("Id")
    private String Id;

    @TableField("Name")
    private String Name;

    @TableField("Remark")
    private String Remark;

    @TableField("EngName")
    private String EngName;


    public static final String ID = "Id";

    public static final String NAME = "Name";

    public static final String REMARK = "Remark";

    public static final String ENGNAME = "EngName";

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

}
