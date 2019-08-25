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
@ApiModel(value="Tjcinventorybookdetail对象", description="")
public class Tjcinventorybookdetail extends Model<Tjcinventorybookdetail> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "库存台账明细表ID")
    @TableId("inventorybookDetailID")
    private Integer inventorybookDetailID;

    @ApiModelProperty(value = "物料区间开始")
    @TableField("materialSectionStart")
    private String materialSectionStart;

    @ApiModelProperty(value = "物料区间结束")
    @TableField("materialSectionOver")
    private String materialSectionOver;

    @ApiModelProperty(value = "仓库区间开始")
    @TableField("warehouseSectionStart")
    private String warehouseSectionStart;

    @ApiModelProperty(value = "仓库区间结束")
    @TableField("warehouseSectionOver")
    private String warehouseSectionOver;

    @ApiModelProperty(value = "日期区间开始")
    @TableField("dateSectionStart")
    private LocalDate dateSectionStart;

    @ApiModelProperty(value = "日期区间结束")
    @TableField("dateSectionOver")
    private LocalDate dateSectionOver;

    @ApiModelProperty(value = "是否区分仓库")
    @TableField("differentiateWarehouse")
    private Integer differentiateWarehouse;

    @ApiModelProperty(value = "备用列1")
    private String test1;

    @ApiModelProperty(value = "备用列2")
    private String test2;

    @ApiModelProperty(value = "备用列3")
    private Integer test3;


    public static final String INVENTORYBOOKDETAILID = "inventorybookDetailID";

    public static final String MATERIALSECTIONSTART = "materialSectionStart";

    public static final String MATERIALSECTIONOVER = "materialSectionOver";

    public static final String WAREHOUSESECTIONSTART = "warehouseSectionStart";

    public static final String WAREHOUSESECTIONOVER = "warehouseSectionOver";

    public static final String DATESECTIONSTART = "dateSectionStart";

    public static final String DATESECTIONOVER = "dateSectionOver";

    public static final String DIFFERENTIATEWAREHOUSE = "differentiateWarehouse";

    public static final String TEST1 = "test1";

    public static final String TEST2 = "test2";

    public static final String TEST3 = "test3";

    @Override
    protected Serializable pkVal() {
        return this.inventorybookDetailID;
    }

}
