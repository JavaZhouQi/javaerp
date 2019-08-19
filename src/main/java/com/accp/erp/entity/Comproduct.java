package com.accp.erp.entity;

import java.math.BigDecimal;
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
 * @since 2019-08-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Comproduct对象", description="")
public class Comproduct extends Model<Comproduct> {

    private static final long serialVersionUID = 1L;

    @TableField("ProdID")
    private String ProdID;

    @TableField("FOBCurrID")
    private String FOBCurrID;

    @TableField("CAvgCost")
    private Double CAvgCost;

    @TableField("SubID")
    private String SubID;

    @TableField("ClassID")
    private String ClassID;

    @TableField("BarCodeID")
    private String BarCodeID;

    @TableField("UnitID")
    private String UnitID;

    @TableField("Unit")
    private String Unit;

    @TableField("ProdName")
    private String ProdName;

    @TableField("ProdSize")
    private String ProdSize;

    @TableField("EngName")
    private String EngName;

    @TableField("CurrID")
    private String CurrID;

    @TableField("SuggestPrice")
    private Double SuggestPrice;

    @TableField("SalesPriceA")
    private Double SalesPriceA;

    @TableField("SalesPriceB")
    private Double SalesPriceB;

    @TableField("SalesPriceC")
    private Double SalesPriceC;

    @TableField("SalesPriceD")
    private Double SalesPriceD;

    @TableField("SalesPriceE")
    private Double SalesPriceE;

    @TableField("StdPrice")
    private Double StdPrice;

    @TableField("ConverUnit")
    private String ConverUnit;

    @TableField("ConverRate")
    private Float ConverRate;

    @TableField("PackAmt1")
    private BigDecimal PackAmt1;

    @TableField("PackAmt2")
    private BigDecimal PackAmt2;

    @TableField("PackUnit1")
    private String PackUnit1;

    @TableField("PackUnit2")
    private String PackUnit2;

    @TableField("InventoryID")
    private String InventoryID;

    @TableField("BusiTaxRate")
    private Float BusiTaxRate;

    @TableField("Excise")
    private Float Excise;

    @TableField("ImpTaxRate")
    private Float ImpTaxRate;

    @TableField("BatchUsed")
    private Boolean BatchUsed;

    @TableField("EffectDateUsed")
    private Boolean EffectDateUsed;

    @TableField("ProdDesc")
    private String ProdDesc;

    @TableField("ProdPic")
    private String ProdPic;

    @TableField("ProdForm")
    private Integer ProdForm;

    @TableField("BaseInc")
    private BigDecimal BaseInc;

    @TableField("MinPurch")
    private BigDecimal MinPurch;

    @TableField("SafeStock")
    private Boolean SafeStock;

    @TableField("AdvanceDays")
    private Integer AdvanceDays;

    @TableField("MaterialWare")
    private String MaterialWare;

    @TableField("OverReceRate")
    private Float OverReceRate;

    @TableField("PurchPolicy")
    private Integer PurchPolicy;

    @TableField("MajorSupplier")
    private String MajorSupplier;

    @TableField("BOutStockDay")
    private Integer BOutStockDay;

    @TableField("BInStockDay")
    private Integer BInStockDay;

    @TableField("BPurchDate")
    private Integer BPurchDate;

    @TableField("BSalesDate")
    private Integer BSalesDate;

    @TableField("SluggishDays")
    private Integer SluggishDays;

    @TableField("LatestIndate")
    private Integer LatestIndate;

    @TableField("LatestOutDate")
    private Integer LatestOutDate;

    @TableField("LatestPurchDate")
    private Integer LatestPurchDate;

    @TableField("LatestSalesDate")
    private Integer LatestSalesDate;

    @TableField("StopDate")
    private Integer StopDate;

    @TableField("Main_Des")
    private String mainDes;

    @TableField("CCC_CODE")
    private String cccCode;

    @TableField("EngUnit")
    private String EngUnit;

    @TableField("FOBPrice")
    private Double FOBPrice;

    @TableField("CY20")
    private BigDecimal cy20;

    @TableField("CY40")
    private BigDecimal cy40;

    @TableField("InPackAmt")
    private BigDecimal InPackAmt;

    @TableField("OutPackAmt")
    private BigDecimal OutPackAmt;

    @TableField("VolumeUnit")
    private String VolumeUnit;

    @TableField("Volume")
    private BigDecimal Volume;

    @TableField("NetWeight")
    private BigDecimal NetWeight;

    @TableField("GrossWeigh")
    private BigDecimal GrossWeigh;

    @TableField("BAvgCost")
    private Double BAvgCost;

    @TableField("BStdCost")
    private Double BStdCost;

    @TableField("MergeOutState")
    private Integer MergeOutState;

    @TableField("IsCheck")
    private Boolean IsCheck;

    @TableField("CTotalCost")
    private BigDecimal CTotalCost;

    @TableField("InvoProdName")
    private String InvoProdName;

    @TableField("DefValidDay")
    private Integer DefValidDay;

    @TableField("ValidDateUsed")
    private Boolean ValidDateUsed;

    @TableField("BackTaxRate")
    private Float BackTaxRate;

    @TableField("DataVer")
    private Integer DataVer;

    @TableField("MoreRate")
    private Float MoreRate;

    @TableField("UDef1")
    private String UDef1;

    @TableField("UDef2")
    private String UDef2;

    @TableField("RepairTerm")
    private Integer RepairTerm;

    @TableField("PriceOfTax")
    private Boolean PriceOfTax;

    @TableField("InsurRate")
    private Float InsurRate;

    @TableField("InsurRateEx")
    private Float InsurRateEx;

    @TableField("BTotalCost")
    private BigDecimal BTotalCost;

    @TableField("HQ40")
    private BigDecimal hq40;

    @TableField("CY45")
    private BigDecimal cy45;

    @TableField("PerDays")
    private Integer PerDays;

    @TableField("StdUnitID")
    private String StdUnitID;

    @TableField("StdUnitName")
    private String StdUnitName;

    @TableField("SafeQty")
    private BigDecimal SafeQty;

    @TableField("BSalesBackDate")
    private Integer BSalesBackDate;

    @TableField("BInOtherDate")
    private Integer BInOtherDate;

    @TableField("BPurBackDate")
    private Integer BPurBackDate;

    @TableField("BOutOtherDate")
    private Integer BOutOtherDate;

    @TableField("StdCost")
    private Double StdCost;

    @TableField("CAllAmt")
    private BigDecimal CAllAmt;

    @TableField("NWeight")
    private BigDecimal NWeight;

    @TableField("GWeight")
    private BigDecimal GWeight;

    @TableField("Long")
    private BigDecimal Long;

    @TableField("LUnit")
    private String LUnit;

    @TableField("Width")
    private BigDecimal Width;

    @TableField("Hight")
    private BigDecimal Hight;

    @TableField("MVolume")
    private BigDecimal MVolume;

    @TableField("ProdBigType")
    private String ProdBigType;

    @TableField("InPackUnit")
    private String InPackUnit;

    @TableField("OutPackUnit")
    private String OutPackUnit;

    @TableField("NetWeightUnit")
    private String NetWeightUnit;

    @TableField("GrossWeightUnit")
    private String GrossWeightUnit;

    @TableField("MEAMTUnit")
    private String MEAMTUnit;

    @TableField("MEAMT")
    private BigDecimal meamt;

    @TableField("TaxItemsID")
    private String TaxItemsID;


    public static final String PRODID = "ProdID";

    public static final String FOBCURRID = "FOBCurrID";

    public static final String CAVGCOST = "CAvgCost";

    public static final String SUBID = "SubID";

    public static final String CLASSID = "ClassID";

    public static final String BARCODEID = "BarCodeID";

    public static final String UNITID = "UnitID";

    public static final String UNIT = "Unit";

    public static final String PRODNAME = "ProdName";

    public static final String PRODSIZE = "ProdSize";

    public static final String ENGNAME = "EngName";

    public static final String CURRID = "CurrID";

    public static final String SUGGESTPRICE = "SuggestPrice";

    public static final String SALESPRICEA = "SalesPriceA";

    public static final String SALESPRICEB = "SalesPriceB";

    public static final String SALESPRICEC = "SalesPriceC";

    public static final String SALESPRICED = "SalesPriceD";

    public static final String SALESPRICEE = "SalesPriceE";

    public static final String STDPRICE = "StdPrice";

    public static final String CONVERUNIT = "ConverUnit";

    public static final String CONVERRATE = "ConverRate";

    public static final String PACKAMT1 = "PackAmt1";

    public static final String PACKAMT2 = "PackAmt2";

    public static final String PACKUNIT1 = "PackUnit1";

    public static final String PACKUNIT2 = "PackUnit2";

    public static final String INVENTORYID = "InventoryID";

    public static final String BUSITAXRATE = "BusiTaxRate";

    public static final String EXCISE = "Excise";

    public static final String IMPTAXRATE = "ImpTaxRate";

    public static final String BATCHUSED = "BatchUsed";

    public static final String EFFECTDATEUSED = "EffectDateUsed";

    public static final String PRODDESC = "ProdDesc";

    public static final String PRODPIC = "ProdPic";

    public static final String PRODFORM = "ProdForm";

    public static final String BASEINC = "BaseInc";

    public static final String MINPURCH = "MinPurch";

    public static final String SAFESTOCK = "SafeStock";

    public static final String ADVANCEDAYS = "AdvanceDays";

    public static final String MATERIALWARE = "MaterialWare";

    public static final String OVERRECERATE = "OverReceRate";

    public static final String PURCHPOLICY = "PurchPolicy";

    public static final String MAJORSUPPLIER = "MajorSupplier";

    public static final String BOUTSTOCKDAY = "BOutStockDay";

    public static final String BINSTOCKDAY = "BInStockDay";

    public static final String BPURCHDATE = "BPurchDate";

    public static final String BSALESDATE = "BSalesDate";

    public static final String SLUGGISHDAYS = "SluggishDays";

    public static final String LATESTINDATE = "LatestIndate";

    public static final String LATESTOUTDATE = "LatestOutDate";

    public static final String LATESTPURCHDATE = "LatestPurchDate";

    public static final String LATESTSALESDATE = "LatestSalesDate";

    public static final String STOPDATE = "StopDate";

    public static final String MAIN_DES = "Main_Des";

    public static final String CCC_CODE = "CCC_CODE";

    public static final String ENGUNIT = "EngUnit";

    public static final String FOBPRICE = "FOBPrice";

    public static final String CY20 = "CY20";

    public static final String CY40 = "CY40";

    public static final String INPACKAMT = "InPackAmt";

    public static final String OUTPACKAMT = "OutPackAmt";

    public static final String VOLUMEUNIT = "VolumeUnit";

    public static final String VOLUME = "Volume";

    public static final String NETWEIGHT = "NetWeight";

    public static final String GROSSWEIGH = "GrossWeigh";

    public static final String BAVGCOST = "BAvgCost";

    public static final String BSTDCOST = "BStdCost";

    public static final String MERGEOUTSTATE = "MergeOutState";

    public static final String ISCHECK = "IsCheck";

    public static final String CTOTALCOST = "CTotalCost";

    public static final String INVOPRODNAME = "InvoProdName";

    public static final String DEFVALIDDAY = "DefValidDay";

    public static final String VALIDDATEUSED = "ValidDateUsed";

    public static final String BACKTAXRATE = "BackTaxRate";

    public static final String DATAVER = "DataVer";

    public static final String MORERATE = "MoreRate";

    public static final String UDEF1 = "UDef1";

    public static final String UDEF2 = "UDef2";

    public static final String REPAIRTERM = "RepairTerm";

    public static final String PRICEOFTAX = "PriceOfTax";

    public static final String INSURRATE = "InsurRate";

    public static final String INSURRATEEX = "InsurRateEx";

    public static final String BTOTALCOST = "BTotalCost";

    public static final String HQ40 = "HQ40";

    public static final String CY45 = "CY45";

    public static final String PERDAYS = "PerDays";

    public static final String STDUNITID = "StdUnitID";

    public static final String STDUNITNAME = "StdUnitName";

    public static final String SAFEQTY = "SafeQty";

    public static final String BSALESBACKDATE = "BSalesBackDate";

    public static final String BINOTHERDATE = "BInOtherDate";

    public static final String BPURBACKDATE = "BPurBackDate";

    public static final String BOUTOTHERDATE = "BOutOtherDate";

    public static final String STDCOST = "StdCost";

    public static final String CALLAMT = "CAllAmt";

    public static final String NWEIGHT = "NWeight";

    public static final String GWEIGHT = "GWeight";

    public static final String LONG = "Long";

    public static final String LUNIT = "LUnit";

    public static final String WIDTH = "Width";

    public static final String HIGHT = "Hight";

    public static final String MVOLUME = "MVolume";

    public static final String PRODBIGTYPE = "ProdBigType";

    public static final String INPACKUNIT = "InPackUnit";

    public static final String OUTPACKUNIT = "OutPackUnit";

    public static final String NETWEIGHTUNIT = "NetWeightUnit";

    public static final String GROSSWEIGHTUNIT = "GrossWeightUnit";

    public static final String MEAMTUNIT = "MEAMTUnit";

    public static final String MEAMT = "MEAMT";

    public static final String TAXITEMSID = "TaxItemsID";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
