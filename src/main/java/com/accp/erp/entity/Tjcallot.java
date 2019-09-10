package com.accp.erp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;


import java.time.LocalDate;
import java.util.List;

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
 * @since 2019-08-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Tjcallot对象", description="")
public class Tjcallot extends Model<Tjcallot> {

    private static final long serialVersionUID = 1L;
    
    //exist=true代表是数据库的字段
    @TableField(exist=false)
	private Tjcallotlist tjcallotlist;
    @TableField(exist=false)
	private List<Tjcallotlist> list;
	
    @ApiModelProperty(value = "调拨单ID")
    @TableId("allotId")
    private Integer allotId;

    @ApiModelProperty(value = "单据日期")
    @TableField("moveDate")
    private LocalDate moveDate;

    @ApiModelProperty(value = "制单人员")
    private String maker;

    @ApiModelProperty(value = "复核人员")
    private String permitter;

    @ApiModelProperty(value = "数量合计")
    @TableField("sumQty")
    private Integer sumQty;

    @ApiModelProperty(value = "备注")
    @TableField("Remark")
    private String Remark;

    @ApiModelProperty(value = "自定栏一")
    private String udef1;

    @ApiModelProperty(value = "自定栏二")
    private String udef2;

    @ApiModelProperty(value = "调出仓库")
    @TableField("wareOutID")
    private Integer wareOutID;

    @ApiModelProperty(value = "调出仓库名称")
    @TableField("wareOutName")
    private String wareOutName;

    @ApiModelProperty(value = "调入仓库")
    @TableField("wareID")
    private Integer wareID;

    @ApiModelProperty(value = "调入仓库名称")
    @TableField("wareName")
    private String wareName;

    @ApiModelProperty(value = "制单人")
    @TableField("makerSign")
    private String makerSign;

    @ApiModelProperty(value = "复核人")
    @TableField("permitterSign")
    private String permitterSign;

    @ApiModelProperty(value = "单据号码")
    @TableField("moveNo")
    private Integer moveNo;

    @ApiModelProperty(value = "单据抛转状态标识")
    @TableField("mergeOutState")
    private Integer mergeOutState;

    @ApiModelProperty(value = "制单人员编号")
    @TableField("makerID")
    private Integer makerID;

    @ApiModelProperty(value = "复核人员编号")
    @TableField("permitterID")
    private Integer permitterID;

    @ApiModelProperty(value = "数据版本")
    @TableField("dateVar")
    private String dateVar;

    @ApiModelProperty(value = "是否过账")
    @TableField("hasCheck")
    private Integer hasCheck;

    @ApiModelProperty(value = "是否存在附件")
    @TableField("hasBillAttach")
    private Integer hasBillAttach;

    @ApiModelProperty(value = "无权限查看当前记录")
    @TableField("noPowerToViewAdvPerms")
    private String noPowerToViewAdvPerms;


    public static final String ALLOTID = "allotId";

    public static final String MOVEDATE = "moveDate";

    public static final String MAKER = "maker";

    public static final String PERMITTER = "permitter";

    public static final String SUMQTY = "sumQty";

    public static final String REMARK = "Remark";

    public static final String UDEF1 = "udef1";

    public static final String UDEF2 = "udef2";

    public static final String WAREOUTID = "wareOutID";

    public static final String WAREOUTNAME = "wareOutName";

    public static final String WAREID = "wareID";

    public static final String WARENAME = "wareName";

    public static final String MAKERSIGN = "makerSign";

    public static final String PERMITTERSIGN = "permitterSign";

    public static final String MOVENO = "moveNo";

    public static final String MERGEOUTSTATE = "mergeOutState";

    public static final String MAKERID = "makerID";

    public static final String PERMITTERID = "permitterID";

    public static final String DATEVAR = "dateVar";

    public static final String HASCHECK = "hasCheck";

    public static final String HASBILLATTACH = "hasBillAttach";

    public static final String NOPOWERTOVIEWADVPERMS = "noPowerToViewAdvPerms";

    @Override
    protected Serializable pkVal() {
        return this.allotId;
    }

}
