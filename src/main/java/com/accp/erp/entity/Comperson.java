package com.accp.erp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author zq
 * @since 2019-08-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Comperson对象", description="")
public class Comperson extends Model<Comperson> {

    private static final long serialVersionUID = 1L;

    @TableId("PersonID")
    private String PersonID;

    @TableField("DepartID")
    private String DepartID;

    @TableField("PersonName")
    private String PersonName;

    @TableField("EngName")
    private String EngName;

    @TableField("GroupID")
    private String GroupID;

    @TableField("IdentityNumber")
    private String IdentityNumber;

    @TableField("SexDistinction")
    private Integer SexDistinction;

    @TableField("ProfTitle")
    private String ProfTitle;

    @TableField("EngProfTitle")
    private String EngProfTitle;

    @TableField("Birthday")
    private Date Birthday;

    @TableField("OnJobDate")
    private Date OnJobDate;

    @TableField("Nationality")
    private String Nationality;

    @TableField("technicalTitle")
    private String technicalTitle;

    @TableField("FamilyReg")
    private String FamilyReg;

    @TableField("LeaveJobDate")
    private Date LeaveJobDate;

    @TableField("MaritalStatus")
    private Integer MaritalStatus;

    @TableField("Address1")
    private String Address1;

    @TableField("Address2")
    private String Address2;

    @TableField("Phone1")
    private String Phone1;

    @TableField("MobilePhone")
    private String MobilePhone;

    @TableField("Email")
    private String Email;

    @TableField("Memo")
    private String Memo;

    @TableField("UsrDef1")
    private String UsrDef1;

    @TableField("UsrDef2")
    private String UsrDef2;

    @TableField("BloodType")
    private String BloodType;

    @TableField("BPMachine")
    private String BPMachine;

    @TableField("Country")
    private String Country;

    @TableField("PosiID")
    private String PosiID;

    @TableField("MergeOutState")
    private Integer MergeOutState;

    @TableField("DataVer")
    private Integer DataVer;

    @TableField("PoliticCountenance")
    private String PoliticCountenance;

    @TableField("humschoolId")
    private String humschoolId;

    @TableField("maturityDate")
    private Date maturityDate;

    @TableField("academicDegree")
    private String academicDegree;

    private Date dateofentry;

    @TableField("graduationSchool")
    private String graduationSchool;

    private String passport;

    private String major;

    @TableField("Startingdateofcontract")
    private Date Startingdateofcontract;

    private String englishlevel;

    @TableField("TerminationDateofContract")
    private Date TerminationDateofContract;

    @TableField("Dateofphysicalexamination")
    private Date Dateofphysicalexamination;

    private String emergencycontact;

    private String phone2;

    @TableField("Address3")
    private String Address3;


    public static final String PERSONID = "PersonID";

    public static final String DEPARTID = "DepartID";

    public static final String PERSONNAME = "PersonName";

    public static final String ENGNAME = "EngName";

    public static final String GROUPID = "GroupID";

    public static final String IDENTITYNUMBER = "IdentityNumber";

    public static final String SEXDISTINCTION = "SexDistinction";

    public static final String PROFTITLE = "ProfTitle";

    public static final String ENGPROFTITLE = "EngProfTitle";

    public static final String BIRTHDAY = "Birthday";

    public static final String ONJOBDATE = "OnJobDate";

    public static final String NATIONALITY = "Nationality";

    public static final String TECHNICALTITLE = "technicalTitle";

    public static final String FAMILYREG = "FamilyReg";

    public static final String LEAVEJOBDATE = "LeaveJobDate";

    public static final String MARITALSTATUS = "MaritalStatus";

    public static final String ADDRESS1 = "Address1";

    public static final String ADDRESS2 = "Address2";

    public static final String PHONE1 = "Phone1";

    public static final String MOBILEPHONE = "MobilePhone";

    public static final String EMAIL = "Email";

    public static final String MEMO = "Memo";

    public static final String USRDEF1 = "UsrDef1";

    public static final String USRDEF2 = "UsrDef2";

    public static final String BLOODTYPE = "BloodType";

    public static final String BPMACHINE = "BPMachine";

    public static final String COUNTRY = "Country";

    public static final String POSIID = "PosiID";

    public static final String MERGEOUTSTATE = "MergeOutState";

    public static final String DATAVER = "DataVer";

    public static final String POLITICCOUNTENANCE = "PoliticCountenance";

    public static final String HUMSCHOOLID = "humschoolId";

    public static final String MATURITYDATE = "maturityDate";

    public static final String ACADEMICDEGREE = "academicDegree";

    public static final String DATEOFENTRY = "dateofentry";

    public static final String GRADUATIONSCHOOL = "graduationSchool";

    public static final String PASSPORT = "passport";

    public static final String MAJOR = "major";

    public static final String STARTINGDATEOFCONTRACT = "Startingdateofcontract";

    public static final String ENGLISHLEVEL = "englishlevel";

    public static final String TERMINATIONDATEOFCONTRACT = "TerminationDateofContract";

    public static final String DATEOFPHYSICALEXAMINATION = "Dateofphysicalexamination";

    public static final String EMERGENCYCONTACT = "emergencycontact";

    public static final String PHONE2 = "phone2";

    public static final String ADDRESS3 = "Address3";

    @Override
    protected Serializable pkVal() {
        return this.PersonID;
    }

}
