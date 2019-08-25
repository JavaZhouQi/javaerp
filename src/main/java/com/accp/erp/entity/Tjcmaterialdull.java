package com.accp.erp.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 
 * </p>
 *
 * @author zq
 * @since 2019-08-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Tjcmaterialdull对象", description="")
public class Tjcmaterialdull extends Model<Tjcmaterialdull> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "库存呆滞分析表ID")
    @TableId("materialDullID")
    private Integer materialDullID;

    @ApiModelProperty(value = "物料区间开始")
    @TableField("materialSectionStart")
    private String materialSectionStart;

    @ApiModelProperty(value = "物料区间结束")
    @TableField("materialSectionOver")
    private String materialSectionOver;

    @ApiModelProperty(value = "物料类别开始")
    @TableField("materialTypeStart")
    private String materialTypeStart;

    @ApiModelProperty(value = "物料类别结束")
    @TableField("materialTypeOver")
    private String materialTypeOver;

    @ApiModelProperty(value = "日期选择")
    @TableField("materialDate")
    private Integer materialDate;

    @ApiModelProperty(value = "呆滞计算日期")
    @TableField("dullCountDate")
    private LocalDate dullCountDate;

    @ApiModelProperty(value = "备用列1")
    private String test1;

    @ApiModelProperty(value = "备用列2")
    private String test2;

    @ApiModelProperty(value = "备用列3")
    private Integer test3;


    public static final String MATERIALDULLID = "materialDullID";

    public static final String MATERIALSECTIONSTART = "materialSectionStart";

    public static final String MATERIALSECTIONOVER = "materialSectionOver";

    public static final String MATERIALTYPESTART = "materialTypeStart";

    public static final String MATERIALTYPEOVER = "materialTypeOver";

    public static final String MATERIALDATE = "materialDate";

    public static final String DULLCOUNTDATE = "dullCountDate";

    public static final String TEST1 = "test1";

    public static final String TEST2 = "test2";

    public static final String TEST3 = "test3";

    @Override
    protected Serializable pkVal() {
        return this.materialDullID;
    }

}
