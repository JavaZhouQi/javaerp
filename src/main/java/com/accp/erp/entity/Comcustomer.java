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
@ApiModel(value="Comcustomer对象", description="")
public class Comcustomer extends Model<Comcustomer> {

    private static final long serialVersionUID = 1L;

    @TableField("Flag")
    private Integer Flag;

    @TableField("ID")
    private String id;

    @TableField("FundsAttribution")
    private String FundsAttribution;

    @TableField("TransNewID")
    private String TransNewID;

    @TableField("ClassID")
    private String ClassID;

    @TableField("AreaID")
    private String AreaID;

    @TableField("CurrencyID")
    private String CurrencyID;

    @TableField("FullName")
    private String FullName;

    @TableField("IsTemp")
    private Boolean IsTemp;

    @TableField("IsForeign")
    private Boolean IsForeign;

    @TableField("ShortName")
    private String ShortName;

    @TableField("TaxNo")
    private String TaxNo;

    @TableField("ChiefName")
    private String ChiefName;

    @TableField("Capitalization")
    private BigDecimal Capitalization;

    @TableField("LinkMan")
    private String LinkMan;

    @TableField("LinkManProf")
    private String LinkManProf;

    @TableField("Telephone1")
    private String Telephone1;

    @TableField("Telephone2")
    private String Telephone2;

    @TableField("Telephone3")
    private String Telephone3;

    @TableField("MobileTel")
    private String MobileTel;

    @TableField("Moderm")
    private String Moderm;

    @TableField("FaxNo")
    private String FaxNo;

    @TableField("PersonID")
    private String PersonID;

    @TableField("ServerID")
    private String ServerID;

    @TableField("DealerID")
    private String DealerID;

    @TableField("IndustrialClass")
    private String IndustrialClass;

    @TableField("Email")
    private String Email;

    @TableField("WebAddress")
    private String WebAddress;

    @TableField("MergeOutState")
    private Integer MergeOutState;

    @TableField("IsFactory")
    private Boolean IsFactory;

    @TableField("StartReceivable")
    private BigDecimal StartReceivable;

    @TableField("PriceofTax")
    private Boolean PriceofTax;

    @TableField("DirectCust")
    private Boolean DirectCust;

    @TableField("VIP")
    private Boolean vip;

    @TableField("VIPLevel")
    private String VIPLevel;

    @TableField("DataVer")
    private Integer DataVer;

    @TableField("MemberCodeNo")
    private String MemberCodeNo;

    @TableField("MembercodeDate")
    private Integer MembercodeDate;

    @TableField("IdentityNO")
    private String IdentityNO;

    @TableField("MaritalStatus")
    private Integer MaritalStatus;

    @TableField("SexDistinction")
    private Boolean SexDistinction;

    @TableField("Metier")
    private String Metier;

    @TableField("NativePlace")
    private String NativePlace;

    @TableField("NativeAddress")
    private String NativeAddress;

    @TableField("FamilyAddress")
    private String FamilyAddress;

    @TableField("ZipCode")
    private String ZipCode;

    @TableField("InvoiceHead")
    private String InvoiceHead;

    @TableField("GatherOther")
    private String GatherOther;

    @TableField("CheckOther")
    private String CheckOther;

    @TableField("InvoTax")
    private Boolean InvoTax;

    @TableField("LastVisitDate")
    private Integer LastVisitDate;

    @TableField("BookVisitDate")
    private Integer BookVisitDate;

    @TableField("UsePerms")
    private Boolean UsePerms;

    @TableField("BuildUpDate")
    private Integer BuildUpDate;

    @TableField("LevelID")
    private String LevelID;

    @TableField("StageID")
    private String StageID;

    @TableField("LeaderID")
    private String LeaderID;

    @TableField("BeginStageDate")
    private Integer BeginStageDate;

    @TableField("BargainAmt")
    private BigDecimal BargainAmt;

    @TableField("CustIntro")
    private String CustIntro;

    @TableField("Efficiency")
    private Double Efficiency;

    @TableField("InvoTypeID")
    private String InvoTypeID;


    public static final String FLAG = "Flag";

    public static final String ID = "ID";

    public static final String FUNDSATTRIBUTION = "FundsAttribution";

    public static final String TRANSNEWID = "TransNewID";

    public static final String CLASSID = "ClassID";

    public static final String AREAID = "AreaID";

    public static final String CURRENCYID = "CurrencyID";

    public static final String FULLNAME = "FullName";

    public static final String ISTEMP = "IsTemp";

    public static final String ISFOREIGN = "IsForeign";

    public static final String SHORTNAME = "ShortName";

    public static final String TAXNO = "TaxNo";

    public static final String CHIEFNAME = "ChiefName";

    public static final String CAPITALIZATION = "Capitalization";

    public static final String LINKMAN = "LinkMan";

    public static final String LINKMANPROF = "LinkManProf";

    public static final String TELEPHONE1 = "Telephone1";

    public static final String TELEPHONE2 = "Telephone2";

    public static final String TELEPHONE3 = "Telephone3";

    public static final String MOBILETEL = "MobileTel";

    public static final String MODERM = "Moderm";

    public static final String FAXNO = "FaxNo";

    public static final String PERSONID = "PersonID";

    public static final String SERVERID = "ServerID";

    public static final String DEALERID = "DealerID";

    public static final String INDUSTRIALCLASS = "IndustrialClass";

    public static final String EMAIL = "Email";

    public static final String WEBADDRESS = "WebAddress";

    public static final String MERGEOUTSTATE = "MergeOutState";

    public static final String ISFACTORY = "IsFactory";

    public static final String STARTRECEIVABLE = "StartReceivable";

    public static final String PRICEOFTAX = "PriceofTax";

    public static final String DIRECTCUST = "DirectCust";

    public static final String VIP = "VIP";

    public static final String VIPLEVEL = "VIPLevel";

    public static final String DATAVER = "DataVer";

    public static final String MEMBERCODENO = "MemberCodeNo";

    public static final String MEMBERCODEDATE = "MembercodeDate";

    public static final String IDENTITYNO = "IdentityNO";

    public static final String MARITALSTATUS = "MaritalStatus";

    public static final String SEXDISTINCTION = "SexDistinction";

    public static final String METIER = "Metier";

    public static final String NATIVEPLACE = "NativePlace";

    public static final String NATIVEADDRESS = "NativeAddress";

    public static final String FAMILYADDRESS = "FamilyAddress";

    public static final String ZIPCODE = "ZipCode";

    public static final String INVOICEHEAD = "InvoiceHead";

    public static final String GATHEROTHER = "GatherOther";

    public static final String CHECKOTHER = "CheckOther";

    public static final String INVOTAX = "InvoTax";

    public static final String LASTVISITDATE = "LastVisitDate";

    public static final String BOOKVISITDATE = "BookVisitDate";

    public static final String USEPERMS = "UsePerms";

    public static final String BUILDUPDATE = "BuildUpDate";

    public static final String LEVELID = "LevelID";

    public static final String STAGEID = "StageID";

    public static final String LEADERID = "LeaderID";

    public static final String BEGINSTAGEDATE = "BeginStageDate";

    public static final String BARGAINAMT = "BargainAmt";

    public static final String CUSTINTRO = "CustIntro";

    public static final String EFFICIENCY = "Efficiency";

    public static final String INVOTYPEID = "InvoTypeID";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
