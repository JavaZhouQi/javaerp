/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.5.60 : Database - erpdata
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`erpdata` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `erpdata`;

/*Table structure for table `chladvancegather` */

DROP TABLE IF EXISTS `chladvancegather`;

CREATE TABLE `chladvancegather` (
  `Billid` varchar(20) NOT NULL COMMENT '单据号码',
  `Billdate` date NOT NULL COMMENT '单据日期',
  `Sinid` int(11) NOT NULL COMMENT '单据类型singleType(sinId)',
  `Cliid` varchar(50) NOT NULL COMMENT '客户编号client(cliid)',
  `Clishortname` varchar(50) NOT NULL COMMENT '客户简称',
  `Currencytype` varchar(50) NOT NULL COMMENT '币别',
  `Reckontypef` varchar(50) NOT NULL COMMENT '结算方式一',
  `Reckontypes` varchar(50) NOT NULL COMMENT '结算方式一',
  `Reckontypet` varchar(50) NOT NULL COMMENT '结算方式一',
  `Reckonmoneyf` decimal(10,2) NOT NULL COMMENT '金额',
  `Reckonmoneys` decimal(10,2) NOT NULL COMMENT '金额',
  `Reckonmoneyt` decimal(10,2) NOT NULL COMMENT '金额',
  `Gatherdiscount` decimal(10,2) NOT NULL COMMENT '折扣率',
  `Gatherendaccountmonth` date NOT NULL COMMENT '终止帐月',
  `Empid` varchar(50) NOT NULL COMMENT '业务人员编号，也就是人员编号employee(empid)',
  `Empname` varchar(50) NOT NULL COMMENT '业务人员',
  `Depid` varchar(50) NOT NULL COMMENT '部门编号depttab(depid)',
  `Depname` varchar(50) NOT NULL COMMENT '所属部门',
  `Makeempname` varchar(50) NOT NULL COMMENT '制单人员',
  `Auditingempname` varchar(50) NOT NULL COMMENT '复核人员',
  `Checkstate` int(11) NOT NULL COMMENT '审核状态',
  `Remark` varchar(2000) NOT NULL COMMENT '备注',
  `Enables` int(11) NOT NULL COMMENT '标识是否删除',
  `Safetyone` varchar(50) NOT NULL COMMENT '保留字段',
  `Safetytwo` varchar(50) NOT NULL COMMENT '保留字段',
  `Extend0` varchar(200) DEFAULT NULL COMMENT '扩展字段0',
  `Extend1` varchar(200) DEFAULT NULL COMMENT '扩展字段1',
  `Extend2` varchar(200) DEFAULT NULL COMMENT '扩展字段2',
  `Extend3` varchar(200) DEFAULT NULL COMMENT '扩展字段3',
  `Extend4` varchar(200) DEFAULT NULL COMMENT '扩展字段4',
  PRIMARY KEY (`Billid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='预收款主表';

/*Data for the table `chladvancegather` */

/*Table structure for table `chladvancegatherdetails` */

DROP TABLE IF EXISTS `chladvancegatherdetails`;

CREATE TABLE `chladvancegatherdetails` (
  `Billid` varchar(20) NOT NULL COMMENT '单据号码Advancegather(billId)',
  `Cotemark` int(11) NOT NULL COMMENT '栏号',
  `Promisedmoney` decimal(10,2) NOT NULL COMMENT '预收金额',
  `Advancemoney` decimal(10,2) NOT NULL COMMENT '预收余额',
  `Sinname` varchar(50) NOT NULL COMMENT '来源单别',
  `Originbillid` varchar(20) NOT NULL COMMENT '来源单号',
  `Summary` varchar(2000) NOT NULL COMMENT '摘要',
  `Enables` int(11) NOT NULL COMMENT '标识是否删除',
  `Safetyone` varchar(50) NOT NULL COMMENT '保留字段',
  `Safetytwo` varchar(50) NOT NULL COMMENT '保留字段',
  `Extend0` varchar(200) DEFAULT NULL COMMENT '扩展字段0',
  `Extend1` varchar(200) DEFAULT NULL COMMENT '扩展字段1',
  `Extend2` varchar(200) DEFAULT NULL COMMENT '扩展字段2',
  `Extend3` varchar(200) DEFAULT NULL COMMENT '扩展字段3',
  `Extend4` varchar(200) DEFAULT NULL COMMENT '扩展字段4',
  PRIMARY KEY (`Billid`,`Cotemark`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='预收款明细表';

/*Data for the table `chladvancegatherdetails` */

/*Table structure for table `chlclashfund` */

DROP TABLE IF EXISTS `chlclashfund`;

CREATE TABLE `chlclashfund` (
  `Billid` varchar(20) NOT NULL COMMENT '单据号码',
  `Billdate` date NOT NULL COMMENT '单据日期',
  `Sinid` int(11) NOT NULL COMMENT '单据类型singleType(sinId)',
  `Cliid` varchar(50) NOT NULL COMMENT '客户编号client(cliid)',
  `Clishortname` varchar(50) NOT NULL COMMENT '客户简称',
  `Currencytype` varchar(50) NOT NULL COMMENT '币别',
  `Reckontypef` varchar(50) NOT NULL COMMENT '结算方式一',
  `Reckontypes` varchar(50) NOT NULL COMMENT '结算方式一',
  `Reckontypet` varchar(50) NOT NULL COMMENT '结算方式一',
  `Reckonmoneyf` decimal(10,2) NOT NULL COMMENT '金额',
  `Reckonmoneys` decimal(10,2) NOT NULL COMMENT '金额',
  `Reckonmoneyt` decimal(10,2) NOT NULL COMMENT '金额',
  `Gatherdiscount` decimal(19,4) NOT NULL COMMENT '折扣率',
  `Gatherendaccountmonth` date NOT NULL COMMENT '终止帐月',
  `Empid` varchar(50) NOT NULL COMMENT '业务人员编号，也就是人员编号employee(empid)',
  `Empname` varchar(50) NOT NULL COMMENT '业务人员',
  `Depid` varchar(50) NOT NULL COMMENT '部门编号depttab(depid)',
  `Depname` varchar(50) NOT NULL COMMENT '所属部门',
  `Makeempname` varchar(50) NOT NULL COMMENT '制单人员',
  `Auditingempname` varchar(50) NOT NULL COMMENT '复核人员',
  `Checkstate` int(11) NOT NULL COMMENT '审核状态',
  `Remark` varchar(2000) NOT NULL COMMENT '备注',
  `Enables` int(11) NOT NULL COMMENT '标识是否删除',
  `Safetyone` varchar(50) NOT NULL COMMENT '保留字段',
  `Safetytwo` varchar(50) NOT NULL COMMENT '保留字段',
  `Extend0` varchar(200) DEFAULT NULL COMMENT '扩展字段0',
  `Extend1` varchar(200) DEFAULT NULL COMMENT '扩展字段1',
  `Extend2` varchar(200) DEFAULT NULL COMMENT '扩展字段2',
  `Extend3` varchar(200) DEFAULT NULL COMMENT '扩展字段3',
  `Extend4` varchar(200) DEFAULT NULL COMMENT '扩展字段4',
  PRIMARY KEY (`Billid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收款冲款主表';

/*Data for the table `chlclashfund` */

/*Table structure for table `chlclashfunddetailsone` */

DROP TABLE IF EXISTS `chlclashfunddetailsone`;

CREATE TABLE `chlclashfunddetailsone` (
  `Billid` varchar(20) NOT NULL COMMENT '单据号码clashfund(billId)',
  `Cotemark` int(11) NOT NULL COMMENT '栏号',
  `Sinname` varchar(50) NOT NULL COMMENT '来源单别(销售订单)',
  `Originbillid` varchar(20) NOT NULL COMMENT '来源单号',
  `Originodddate` date NOT NULL COMMENT '原单日期',
  `Originoddmoney` decimal(10,2) NOT NULL COMMENT '原单金额',
  `Currentlybalance` decimal(10,2) NOT NULL COMMENT '现行余额',
  `Discountmoney` decimal(10,2) NOT NULL COMMENT '折让金额',
  `Clashmoney` decimal(10,2) NOT NULL COMMENT '冲款金额',
  `Enables` int(11) NOT NULL COMMENT '标识是否删除',
  `Safetyone` varchar(50) NOT NULL COMMENT '保留字段',
  `Safetytwo` varchar(50) NOT NULL COMMENT '保留字段',
  `Extend0` varchar(200) DEFAULT NULL COMMENT '扩展字段0',
  `Extend1` varchar(200) DEFAULT NULL COMMENT '扩展字段1',
  `Extend2` varchar(200) DEFAULT NULL COMMENT '扩展字段2',
  `Extend3` varchar(200) DEFAULT NULL COMMENT '扩展字段3',
  `Extend4` varchar(200) DEFAULT NULL COMMENT '扩展字段4',
  PRIMARY KEY (`Billid`,`Cotemark`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='冲款款明细表';

/*Data for the table `chlclashfunddetailsone` */

/*Table structure for table `chlclashfunddetailstwo` */

DROP TABLE IF EXISTS `chlclashfunddetailstwo`;

CREATE TABLE `chlclashfunddetailstwo` (
  `Billid` varchar(20) NOT NULL COMMENT '单据号码clashfund(billId)',
  `Cotemark` int(11) NOT NULL COMMENT '栏号',
  `Gatherid` varchar(20) NOT NULL COMMENT '预收款单单号',
  `Sinname` varchar(50) NOT NULL COMMENT '来源单别(销售订单)',
  `Originbillid` varchar(20) NOT NULL COMMENT '来源单号（销售订单号）',
  `Originoddrowid` int(11) NOT NULL COMMENT '来源单号(行号)',
  `Advancemoney` decimal(10,2) NOT NULL COMMENT '预收金额',
  `Advancebalance` decimal(10,2) NOT NULL COMMENT '预收余额',
  `Adoptadvancemoney` decimal(10,2) NOT NULL COMMENT '取用预收金额',
  `Enables` int(11) NOT NULL COMMENT '标识是否删除',
  `Safetyone` varchar(50) NOT NULL COMMENT '保留字段',
  `Safetytwo` varchar(50) NOT NULL COMMENT '保留字段',
  `Extend0` varchar(200) DEFAULT NULL COMMENT '扩展字段0',
  `Extend1` varchar(200) DEFAULT NULL COMMENT '扩展字段1',
  `Extend2` varchar(200) DEFAULT NULL COMMENT '扩展字段2',
  `Extend3` varchar(200) DEFAULT NULL COMMENT '扩展字段3',
  `Extend4` varchar(200) DEFAULT NULL COMMENT '扩展字段4',
  PRIMARY KEY (`Billid`,`Cotemark`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='冲款款明细表2';

/*Data for the table `chlclashfunddetailstwo` */

/*Table structure for table `chlsmbinvoicemain` */

DROP TABLE IF EXISTS `chlsmbinvoicemain`;

CREATE TABLE `chlsmbinvoicemain` (
  `BillNo` varchar(15) NOT NULL COMMENT '单据号码，主键，PK',
  `Flag` int(11) NOT NULL COMMENT '标记，主键，PK，',
  `AffirmState` smallint(6) DEFAULT NULL COMMENT '销售核对状态',
  `BillType` smallint(6) DEFAULT NULL COMMENT '单据类型',
  `PayTerm` smallint(6) DEFAULT NULL COMMENT '收款条件',
  `DelayDays` int(11) DEFAULT NULL COMMENT '收款天数',
  `InvoTypeId` varchar(6) DEFAULT NULL COMMENT '发票类型',
  `GatherOther` varchar(20) DEFAULT NULL COMMENT '其他收款方式',
  `ExportDate` int(11) DEFAULT NULL COMMENT '导出日期',
  `ExportID` varchar(20) DEFAULT NULL COMMENT '导出人员',
  PRIMARY KEY (`BillNo`,`Flag`),
  UNIQUE KEY `BillNo` (`BillNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='销售发票主表';

/*Data for the table `chlsmbinvoicemain` */

/*Table structure for table `chlsmbinvoicesub` */

DROP TABLE IF EXISTS `chlsmbinvoicesub`;

CREATE TABLE `chlsmbinvoicesub` (
  `BillNo` varchar(15) NOT NULL COMMENT '单据号码，主键，PK',
  `Flag` int(11) NOT NULL COMMENT '标记，主键，PK，',
  `ProdId` varchar(20) DEFAULT NULL COMMENT '物料编号',
  `Quantity` decimal(10,2) DEFAULT NULL COMMENT '数量',
  `Price` float DEFAULT NULL COMMENT '价格',
  `Amount` decimal(10,2) DEFAULT NULL COMMENT '金额',
  `TaxRate` float DEFAULT NULL COMMENT '税率%',
  `TaxAmt` decimal(10,2) DEFAULT NULL COMMENT '税额',
  `AmountWithTax` decimal(10,2) DEFAULT NULL COMMENT '含税金额',
  `LocalAmount` decimal(10,2) DEFAULT NULL COMMENT '金额本位币',
  `LocalTaxAmt` decimal(10,2) DEFAULT NULL COMMENT '税额本位币',
  `LocalAmountWithTax` decimal(10,2) DEFAULT NULL COMMENT '含税金额本位币',
  `SerNo` int(11) DEFAULT NULL COMMENT '栏号',
  `RowNo` int(11) NOT NULL COMMENT '行号，主键，PK',
  `BillDate` int(11) DEFAULT NULL COMMENT '单据日期',
  `LQty` decimal(10,2) DEFAULT NULL COMMENT '未出数量',
  `HasCheck` bit(1) DEFAULT b'0' COMMENT '审核状态',
  `Remark` varchar(400) DEFAULT NULL COMMENT '备注',
  `ProdName` varchar(60) DEFAULT NULL COMMENT '物料名称',
  `ProdSize` varchar(60) DEFAULT NULL COMMENT '规格型号',
  `FromNo` varchar(15) DEFAULT NULL COMMENT '来源单号',
  `FromRow` int(11) DEFAULT NULL COMMENT '来源行号',
  `TranType` int(11) DEFAULT NULL COMMENT '转录',
  `QtyRemain` int(11) DEFAULT NULL COMMENT '未出详情',
  `IsMerge` bit(1) DEFAULT NULL COMMENT '合并',
  `SUnitID` varchar(8) DEFAULT NULL COMMENT '单位编号',
  `SPrice` float DEFAULT NULL COMMENT '实际金额',
  `SQuantity` decimal(10,2) DEFAULT NULL COMMENT '实际数量',
  `UnitRelation` float DEFAULT NULL COMMENT '单位关系',
  PRIMARY KEY (`BillNo`,`Flag`,`RowNo`),
  UNIQUE KEY `BillNo` (`BillNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='销售发票从表';

/*Data for the table `chlsmbinvoicesub` */

/*Table structure for table `comarea` */

DROP TABLE IF EXISTS `comarea`;

CREATE TABLE `comarea` (
  `areaID` varchar(6) NOT NULL,
  `areaName` varchar(20) DEFAULT NULL,
  `engName` varchar(20) DEFAULT NULL,
  `memo` varchar(4000) DEFAULT NULL,
  `mergeOutState` smallint(6) DEFAULT NULL,
  PRIMARY KEY (`areaID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `comarea` */

insert  into `comarea`(`areaID`,`areaName`,`engName`,`memo`,`mergeOutState`) values ('001','厦门','1','1',NULL);

/*Table structure for table `combank` */

DROP TABLE IF EXISTS `combank`;

CREATE TABLE `combank` (
  `bankID` varchar(7) NOT NULL,
  `bankClsID` varchar(6) DEFAULT NULL,
  `bankName` varchar(60) DEFAULT NULL,
  `engName` varchar(60) DEFAULT NULL,
  `telePhone` varchar(25) DEFAULT NULL,
  `dilivZoneNo` varchar(12) DEFAULT NULL,
  `address` varchar(150) DEFAULT NULL,
  `mergeOutState` smallint(6) DEFAULT NULL,
  `memo` varchar(4000) DEFAULT NULL,
  PRIMARY KEY (`bankID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `combank` */

/*Table structure for table `combankcls` */

DROP TABLE IF EXISTS `combankcls`;

CREATE TABLE `combankcls` (
  `bankClsID` varchar(6) NOT NULL,
  `bankClsName` varchar(20) DEFAULT NULL,
  `engName` varchar(20) DEFAULT NULL,
  `memo` varchar(4000) DEFAULT NULL,
  `mergeOutState` smallint(6) DEFAULT NULL,
  PRIMARY KEY (`bankClsID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `combankcls` */

insert  into `combankcls`(`bankClsID`,`bankClsName`,`engName`,`memo`,`mergeOutState`) values ('001','外资银行1','waiziyinhang','无',NULL);

/*Table structure for table `comcustaddress` */

DROP TABLE IF EXISTS `comcustaddress`;

CREATE TABLE `comcustaddress` (
  `Flag` smallint(6) NOT NULL,
  `ID` varchar(12) NOT NULL,
  `AddrID` varchar(12) NOT NULL,
  `ZipCode` varchar(12) DEFAULT NULL,
  `Address` varchar(150) DEFAULT NULL,
  `LinkMan` varchar(50) DEFAULT NULL,
  `LinkManProf` varchar(20) DEFAULT NULL,
  `Telephone` varchar(25) DEFAULT NULL,
  `FaxNo` varchar(25) DEFAULT NULL,
  `Memo` varchar(400) DEFAULT NULL,
  `WalkAddr` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Flag`,`ID`,`AddrID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `comcustaddress` */

insert  into `comcustaddress`(`Flag`,`ID`,`AddrID`,`ZipCode`,`Address`,`LinkMan`,`LinkManProf`,`Telephone`,`FaxNo`,`Memo`,`WalkAddr`) values (1,'001','001','1','1','1','1','1','1','1','1'),(1,'001','002','10001','湖南株洲','联系人','职称','13833838438','0001',NULL,'行走路线'),(1,'001','003','1','1','1','1','1','1',NULL,NULL),(1,'007','003','3','3','3','3','3','3','3','3');

/*Table structure for table `comcustclass` */

DROP TABLE IF EXISTS `comcustclass`;

CREATE TABLE `comcustclass` (
  `Flag` smallint(6) NOT NULL,
  `ClassID` varchar(6) NOT NULL,
  `ClassName` varchar(20) DEFAULT NULL,
  `EngName` varchar(20) DEFAULT NULL,
  `Memo` varchar(4000) DEFAULT NULL,
  `MergeOutState` smallint(6) DEFAULT NULL,
  PRIMARY KEY (`Flag`,`ClassID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `comcustclass` */

insert  into `comcustclass`(`Flag`,`ClassID`,`ClassName`,`EngName`,`Memo`,`MergeOutState`) values (1,'001','工厂',NULL,NULL,NULL),(1,'002','散客',NULL,NULL,NULL),(1,'003','政府',NULL,NULL,NULL),(2,'001','配件',NULL,NULL,NULL),(2,'002','整机',NULL,NULL,NULL),(2,'003','原材料',NULL,NULL,NULL),(2,'004','成品',NULL,NULL,NULL);

/*Table structure for table `comcustomer` */

DROP TABLE IF EXISTS `comcustomer`;

CREATE TABLE `comcustomer` (
  `Flag` smallint(6) NOT NULL,
  `ID` varchar(12) NOT NULL,
  `engFullName` varchar(12) DEFAULT NULL,
  `engShortName` varchar(12) DEFAULT NULL,
  `FundsAttribution` varchar(12) DEFAULT NULL,
  `TransNewID` varchar(12) DEFAULT NULL,
  `ClassID` varchar(6) DEFAULT NULL,
  `AreaID` varchar(6) DEFAULT NULL,
  `CurrencyID` varchar(4) DEFAULT NULL,
  `FullName` varchar(40) DEFAULT NULL,
  `IsTemp` tinyint(1) DEFAULT NULL,
  `IsForeign` tinyint(1) DEFAULT NULL,
  `ShortName` varchar(40) DEFAULT NULL,
  `TaxNo` varchar(20) DEFAULT NULL,
  `ChiefName` varchar(20) DEFAULT NULL,
  `Capitalization` decimal(19,2) DEFAULT NULL,
  `LinkMan` varchar(20) DEFAULT NULL,
  `LinkManProf` varchar(12) DEFAULT NULL,
  `Telephone1` varchar(25) DEFAULT NULL,
  `Telephone2` varchar(25) DEFAULT NULL,
  `Telephone3` varchar(25) DEFAULT NULL,
  `MobileTel` varchar(16) DEFAULT NULL,
  `Moderm` varchar(16) DEFAULT NULL,
  `FaxNo` varchar(25) DEFAULT NULL,
  `PersonID` varchar(8) DEFAULT NULL,
  `ServerID` varchar(8) DEFAULT NULL,
  `DealerID` varchar(10) DEFAULT NULL,
  `IndustrialClass` varchar(18) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `WebAddress` varchar(50) DEFAULT NULL,
  `MergeOutState` smallint(6) DEFAULT NULL,
  `IsFactory` tinyint(1) DEFAULT NULL,
  `StartReceivable` decimal(19,2) DEFAULT NULL,
  `PriceofTax` tinyint(1) DEFAULT NULL,
  `DirectCust` tinyint(1) DEFAULT NULL,
  `VIP` tinyint(1) DEFAULT NULL,
  `VIPLevel` varchar(6) DEFAULT NULL,
  `DataVer` int(11) DEFAULT NULL,
  `MemberCodeNo` varchar(50) DEFAULT NULL,
  `MembercodeDate` date DEFAULT NULL,
  `IdentityNO` varchar(20) DEFAULT NULL,
  `MaritalStatus` smallint(6) DEFAULT NULL,
  `SexDistinction` tinyint(1) DEFAULT NULL,
  `Metier` varchar(16) DEFAULT NULL,
  `NativePlace` varchar(16) DEFAULT NULL,
  `NativeAddress` varchar(50) DEFAULT NULL,
  `FamilyAddress` varchar(50) DEFAULT NULL,
  `ZipCode` varchar(16) DEFAULT NULL,
  `InvoiceHead` varchar(40) DEFAULT NULL,
  `GatherOther` varchar(20) DEFAULT NULL,
  `CheckOther` varchar(20) DEFAULT NULL,
  `InvoTax` int(11) DEFAULT NULL,
  `LastVisitDate` date DEFAULT NULL,
  `BookVisitDate` date DEFAULT NULL,
  `UsePerms` tinyint(1) DEFAULT NULL,
  `BuildUpDate` date DEFAULT NULL,
  `LevelID` varchar(6) DEFAULT NULL,
  `StageID` varchar(6) DEFAULT NULL,
  `LeaderID` varchar(10) DEFAULT NULL,
  `BeginStageDate` date DEFAULT NULL,
  `BargainAmt` decimal(19,2) DEFAULT NULL,
  `CustIntro` varchar(400) DEFAULT NULL,
  `Efficiency` double DEFAULT NULL,
  `InvoTypeID` varchar(6) DEFAULT NULL,
  `firstTradeDate` date DEFAULT NULL,
  `earliestTradeDate` date DEFAULT NULL,
  `BankId` varchar(10) DEFAULT NULL,
  `PriceRank` varchar(10) DEFAULT NULL,
  `latelyTradeDate` date DEFAULT NULL,
  `latelyReturnDate` date DEFAULT NULL,
  `finalTradeDate` date DEFAULT NULL,
  `amountQuota` decimal(19,2) DEFAULT NULL,
  `billQuota` decimal(19,2) DEFAULT NULL,
  `unEnCashQuota` decimal(19,2) DEFAULT NULL,
  `noChkUnEnCashQuota` decimal(19,2) DEFAULT NULL,
  `dayOfClose` int(11) DEFAULT NULL,
  `dayOfRecv` int(11) DEFAULT NULL,
  `endreceivables` decimal(19,2) DEFAULT NULL,
  `distDays` int(11) DEFAULT NULL,
  `initialreceivables` decimal(19,2) DEFAULT NULL,
  `creditLevel` varchar(10) DEFAULT NULL,
  `accBillRecv` int(11) DEFAULT NULL,
  `invoiceType` int(11) DEFAULT NULL,
  `taxKind` int(11) DEFAULT NULL,
  `rateOfDiscount` int(11) DEFAULT NULL,
  PRIMARY KEY (`Flag`,`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `comcustomer` */

insert  into `comcustomer`(`Flag`,`ID`,`engFullName`,`engShortName`,`FundsAttribution`,`TransNewID`,`ClassID`,`AreaID`,`CurrencyID`,`FullName`,`IsTemp`,`IsForeign`,`ShortName`,`TaxNo`,`ChiefName`,`Capitalization`,`LinkMan`,`LinkManProf`,`Telephone1`,`Telephone2`,`Telephone3`,`MobileTel`,`Moderm`,`FaxNo`,`PersonID`,`ServerID`,`DealerID`,`IndustrialClass`,`Email`,`WebAddress`,`MergeOutState`,`IsFactory`,`StartReceivable`,`PriceofTax`,`DirectCust`,`VIP`,`VIPLevel`,`DataVer`,`MemberCodeNo`,`MembercodeDate`,`IdentityNO`,`MaritalStatus`,`SexDistinction`,`Metier`,`NativePlace`,`NativeAddress`,`FamilyAddress`,`ZipCode`,`InvoiceHead`,`GatherOther`,`CheckOther`,`InvoTax`,`LastVisitDate`,`BookVisitDate`,`UsePerms`,`BuildUpDate`,`LevelID`,`StageID`,`LeaderID`,`BeginStageDate`,`BargainAmt`,`CustIntro`,`Efficiency`,`InvoTypeID`,`firstTradeDate`,`earliestTradeDate`,`BankId`,`PriceRank`,`latelyTradeDate`,`latelyReturnDate`,`finalTradeDate`,`amountQuota`,`billQuota`,`unEnCashQuota`,`noChkUnEnCashQuota`,`dayOfClose`,`dayOfRecv`,`endreceivables`,`distDays`,`initialreceivables`,`creditLevel`,`accBillRecv`,`invoiceType`,`taxKind`,`rateOfDiscount`) values (1,'001','1','1','1',NULL,'001','001','RMB','1',NULL,NULL,'1','1','1','1.00','1',NULL,'1','1','1','1',NULL,'1','1',NULL,NULL,'1','1','1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,'2019-08-02','2019-08-09',NULL,'2019-08-09',NULL,NULL,NULL,NULL,NULL,'1',NULL,NULL,'2019-08-09','2019-07-26','1','1','2019-08-09','2019-08-09','2019-08-08','1.00','1.00','1.00','1.00',1,1,'1.00',1,'1.00','F',1,1,1,1),(1,'002','yingwen','eng','002',NULL,'001','001','RMB','客户全称',NULL,NULL,'客户简称','税务登记号','负责人','100.00','联系人',NULL,'电话1','电话2','电话3','移动电话',NULL,'银行账户','业务人员',NULL,NULL,'行业别','电子邮件','网址',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,3,'2019-08-01','2019-08-03',NULL,'2019-08-02',NULL,NULL,NULL,NULL,NULL,'4',NULL,NULL,'2019-07-29','2019-07-28','100','2','2019-07-30','2019-07-31','2019-08-04','100.00','10000.00','100.00','20000.00',1,1,'30000.00',100,'40000.00','E',50000,111,60000,1),(1,'003','3','3','003',NULL,'001','001','RMB','3',NULL,NULL,'3','3','3','3.00','3',NULL,'3','3','3','3',NULL,'3','3',NULL,NULL,'3','3','3',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,3,'2019-08-15','2019-07-26',NULL,'2019-08-08',NULL,NULL,NULL,NULL,NULL,'3',NULL,NULL,'2019-08-16','2019-08-22','3','3','2019-08-16','2019-08-08','2019-08-01','3.00','3.00','3.00','3.00',1,3,'3.00',3,'3.00','D',3,3,3,3);

/*Table structure for table `comcustomerlevel` */

DROP TABLE IF EXISTS `comcustomerlevel`;

CREATE TABLE `comcustomerlevel` (
  `LevelID` varchar(6) DEFAULT NULL,
  `LevelName` varchar(30) DEFAULT NULL,
  `Memo` varchar(400) DEFAULT NULL,
  `MergeOutState` smallint(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `comcustomerlevel` */

insert  into `comcustomerlevel`(`LevelID`,`LevelName`,`Memo`,`MergeOutState`) values ('A','核心',NULL,NULL),('B','重点',NULL,NULL),('C','普通',NULL,NULL);

/*Table structure for table `comdepartment` */

DROP TABLE IF EXISTS `comdepartment`;

CREATE TABLE `comdepartment` (
  `DepartID` varchar(8) NOT NULL,
  `DepartName` varchar(30) DEFAULT NULL,
  `EngName` varchar(40) DEFAULT NULL,
  `Memo` varchar(4000) DEFAULT NULL,
  `Female` smallint(6) DEFAULT NULL,
  `Male` smallint(6) DEFAULT NULL,
  `JobSch` varchar(10) DEFAULT NULL,
  `MergeOutState` smallint(6) DEFAULT NULL,
  `CalID` varchar(10) DEFAULT NULL,
  `SalaryTypeID` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`DepartID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `comdepartment` */

insert  into `comdepartment`(`DepartID`,`DepartName`,`EngName`,`Memo`,`Female`,`Male`,`JobSch`,`MergeOutState`,`CalID`,`SalaryTypeID`) values ('001','生产部',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('002','采购部',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('003','销售部',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `cominvoicetype` */

DROP TABLE IF EXISTS `cominvoicetype`;

CREATE TABLE `cominvoicetype` (
  `Id` varchar(6) NOT NULL,
  `Name` varchar(30) DEFAULT NULL,
  `Remark` varchar(400) DEFAULT NULL,
  `EngName` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `cominvoicetype` */

insert  into `cominvoicetype`(`Id`,`Name`,`Remark`,`EngName`) values ('001','增值税发票',NULL,NULL),('002','普通发票',NULL,NULL),('003','服务发票',NULL,NULL),('004','出口商业发票',NULL,NULL);

/*Table structure for table `commontype` */

DROP TABLE IF EXISTS `commontype`;

CREATE TABLE `commontype` (
  `flag` int(11) DEFAULT NULL,
  `typeId` varchar(20) DEFAULT NULL,
  `typeName` varchar(20) DEFAULT NULL,
  `engName` varchar(20) DEFAULT NULL,
  `memo` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `commontype` */

/*Table structure for table `comperson` */

DROP TABLE IF EXISTS `comperson`;

CREATE TABLE `comperson` (
  `PersonID` varchar(8) NOT NULL,
  `DepartID` varchar(8) DEFAULT NULL,
  `PersonName` varchar(10) DEFAULT NULL,
  `EngName` varchar(18) DEFAULT NULL,
  `GroupID` varchar(6) DEFAULT NULL,
  `IdentityNumber` varchar(20) DEFAULT NULL,
  `SexDistinction` int(1) DEFAULT NULL,
  `ProfTitle` varchar(16) DEFAULT NULL,
  `EngProfTitle` varchar(30) DEFAULT NULL,
  `Birthday` date DEFAULT NULL,
  `OnJobDate` date DEFAULT NULL,
  `Nationality` varchar(16) DEFAULT NULL,
  `technicalTitle` varchar(10) DEFAULT NULL,
  `FamilyReg` varchar(16) DEFAULT NULL,
  `LeaveJobDate` date DEFAULT NULL,
  `MaritalStatus` int(6) DEFAULT NULL,
  `Address1` varchar(50) DEFAULT NULL,
  `Address2` varchar(60) DEFAULT NULL,
  `Phone1` varchar(16) DEFAULT NULL,
  `MobilePhone` varchar(16) DEFAULT NULL,
  `Email` varchar(30) DEFAULT NULL,
  `Memo` varchar(4000) DEFAULT NULL,
  `UsrDef1` varchar(50) DEFAULT NULL,
  `UsrDef2` varchar(50) DEFAULT NULL,
  `BloodType` varchar(20) DEFAULT NULL,
  `BPMachine` varchar(15) DEFAULT NULL,
  `Country` varchar(10) DEFAULT NULL,
  `PosiID` varchar(10) DEFAULT NULL,
  `MergeOutState` smallint(6) DEFAULT NULL,
  `DataVer` int(11) DEFAULT NULL,
  `PoliticCountenance` varchar(10) DEFAULT NULL,
  `humschoolId` int(11) DEFAULT NULL,
  `maturityDate` date DEFAULT NULL,
  `academicDegree` varchar(10) DEFAULT NULL,
  `dateofentry` date DEFAULT NULL,
  `graduationSchool` varchar(20) DEFAULT NULL,
  `passport` varchar(30) DEFAULT NULL,
  `major` varchar(30) DEFAULT NULL,
  `Startingdateofcontract` date DEFAULT NULL,
  `englishlevel` varchar(10) DEFAULT NULL,
  `TerminationDateofContract` date DEFAULT NULL,
  `Dateofphysicalexamination` date DEFAULT NULL,
  `emergencycontact` varchar(10) DEFAULT NULL,
  `phone2` varchar(20) DEFAULT NULL,
  `Address3` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`PersonID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `comperson` */

insert  into `comperson`(`PersonID`,`DepartID`,`PersonName`,`EngName`,`GroupID`,`IdentityNumber`,`SexDistinction`,`ProfTitle`,`EngProfTitle`,`Birthday`,`OnJobDate`,`Nationality`,`technicalTitle`,`FamilyReg`,`LeaveJobDate`,`MaritalStatus`,`Address1`,`Address2`,`Phone1`,`MobilePhone`,`Email`,`Memo`,`UsrDef1`,`UsrDef2`,`BloodType`,`BPMachine`,`Country`,`PosiID`,`MergeOutState`,`DataVer`,`PoliticCountenance`,`humschoolId`,`maturityDate`,`academicDegree`,`dateofentry`,`graduationSchool`,`passport`,`major`,`Startingdateofcontract`,`englishlevel`,`TerminationDateofContract`,`Dateofphysicalexamination`,`emergencycontact`,`phone2`,`Address3`) values ('001','001','阳鑫','yangxin',NULL,'430223199908082223',2,'总监','zongjian','2019-08-08','2019-07-30','汉','技术总监','湖南','2019-08-07',2,'湖南','湖南株洲','13838384382','080845','20090808','没有备注',NULL,NULL,'AB',NULL,'中国',NULL,NULL,NULL,'团员',1,'2019-07-26','硕士','2019-08-16','清华大学','88888888','软件工程','2019-08-15','极高','2019-08-15','2019-08-15','杨爹','996852','湖南');

/*Table structure for table `comproduct` */

DROP TABLE IF EXISTS `comproduct`;

CREATE TABLE `comproduct` (
  `ProdID` varchar(20) DEFAULT NULL,
  `FOBCurrID` varchar(4) DEFAULT NULL,
  `CAvgCost` double DEFAULT NULL,
  `SubID` varchar(4) DEFAULT NULL,
  `ClassID` varchar(6) DEFAULT NULL,
  `BarCodeID` varchar(20) DEFAULT NULL,
  `UnitID` varchar(8) DEFAULT NULL,
  `Unit` varchar(20) DEFAULT NULL,
  `ProdName` varchar(60) DEFAULT NULL,
  `ProdSize` varchar(60) DEFAULT NULL,
  `EngName` varchar(200) DEFAULT NULL,
  `CurrID` varchar(4) DEFAULT NULL,
  `SuggestPrice` double DEFAULT NULL,
  `SalesPriceA` double DEFAULT NULL,
  `SalesPriceB` double DEFAULT NULL,
  `SalesPriceC` double DEFAULT NULL,
  `SalesPriceD` double DEFAULT NULL,
  `SalesPriceE` double DEFAULT NULL,
  `StdPrice` double DEFAULT NULL,
  `ConverUnit` varchar(8) DEFAULT NULL,
  `ConverRate` float DEFAULT NULL,
  `PackAmt1` decimal(19,2) DEFAULT NULL,
  `PackAmt2` decimal(19,2) DEFAULT NULL,
  `PackUnit1` varchar(8) DEFAULT NULL,
  `PackUnit2` varchar(8) DEFAULT NULL,
  `InventoryID` varchar(4) DEFAULT NULL,
  `BusiTaxRate` float DEFAULT NULL,
  `Excise` float DEFAULT NULL,
  `ImpTaxRate` float DEFAULT NULL,
  `BatchUsed` tinyint(1) DEFAULT NULL,
  `EffectDateUsed` tinyint(1) DEFAULT NULL,
  `ProdDesc` varchar(4000) DEFAULT NULL,
  `ProdPic` varchar(38) DEFAULT NULL,
  `ProdForm` smallint(6) DEFAULT NULL,
  `BaseInc` decimal(19,2) DEFAULT NULL,
  `MinPurch` decimal(19,2) DEFAULT NULL,
  `SafeStock` tinyint(1) DEFAULT NULL,
  `AdvanceDays` int(11) DEFAULT NULL,
  `MaterialWare` varchar(6) DEFAULT NULL,
  `OverReceRate` float DEFAULT NULL,
  `PurchPolicy` smallint(6) DEFAULT NULL,
  `MajorSupplier` varchar(12) DEFAULT NULL,
  `BOutStockDay` int(11) DEFAULT NULL,
  `BInStockDay` int(11) DEFAULT NULL,
  `BPurchDate` int(11) DEFAULT NULL,
  `BSalesDate` int(11) DEFAULT NULL,
  `SluggishDays` int(11) DEFAULT NULL,
  `LatestIndate` int(11) DEFAULT NULL,
  `LatestOutDate` int(11) DEFAULT NULL,
  `LatestPurchDate` int(11) DEFAULT NULL,
  `LatestSalesDate` int(11) DEFAULT NULL,
  `StopDate` int(11) DEFAULT NULL,
  `Main_Des` varchar(60) DEFAULT NULL,
  `CCC_CODE` varchar(20) DEFAULT NULL,
  `EngUnit` varchar(6) DEFAULT NULL,
  `FOBPrice` double DEFAULT NULL,
  `CY20` decimal(19,2) DEFAULT NULL,
  `CY40` decimal(19,2) DEFAULT NULL,
  `InPackAmt` decimal(19,2) DEFAULT NULL,
  `OutPackAmt` decimal(19,2) DEFAULT NULL,
  `VolumeUnit` varchar(6) DEFAULT NULL,
  `Volume` decimal(19,2) DEFAULT NULL,
  `NetWeight` decimal(19,2) DEFAULT NULL,
  `GrossWeigh` decimal(19,2) DEFAULT NULL,
  `BAvgCost` double DEFAULT NULL,
  `BStdCost` double DEFAULT NULL,
  `MergeOutState` smallint(6) DEFAULT NULL,
  `IsCheck` tinyint(1) DEFAULT NULL,
  `CTotalCost` decimal(19,2) DEFAULT NULL,
  `InvoProdName` varchar(60) DEFAULT NULL,
  `DefValidDay` smallint(6) DEFAULT NULL,
  `ValidDateUsed` tinyint(1) DEFAULT NULL,
  `BackTaxRate` float DEFAULT NULL,
  `DataVer` int(11) DEFAULT NULL,
  `MoreRate` float DEFAULT NULL,
  `UDef1` varchar(50) DEFAULT NULL,
  `UDef2` varchar(50) DEFAULT NULL,
  `RepairTerm` int(11) DEFAULT NULL,
  `PriceOfTax` tinyint(1) DEFAULT NULL,
  `InsurRate` float DEFAULT NULL,
  `InsurRateEx` float DEFAULT NULL,
  `BTotalCost` decimal(19,2) DEFAULT NULL,
  `HQ40` decimal(19,2) DEFAULT NULL,
  `CY45` decimal(19,2) DEFAULT NULL,
  `PerDays` int(11) DEFAULT NULL,
  `StdUnitID` varchar(8) DEFAULT NULL,
  `StdUnitName` varchar(20) DEFAULT NULL,
  `SafeQty` decimal(19,2) DEFAULT NULL,
  `BSalesBackDate` int(11) DEFAULT NULL,
  `BInOtherDate` int(11) DEFAULT NULL,
  `BPurBackDate` int(11) DEFAULT NULL,
  `BOutOtherDate` int(11) DEFAULT NULL,
  `StdCost` double DEFAULT NULL,
  `CAllAmt` decimal(19,2) DEFAULT NULL,
  `NWeight` decimal(19,2) DEFAULT NULL,
  `GWeight` decimal(19,2) DEFAULT NULL,
  `Long` decimal(19,2) DEFAULT NULL,
  `LUnit` varchar(6) DEFAULT NULL,
  `Width` decimal(19,2) DEFAULT NULL,
  `Hight` decimal(19,2) DEFAULT NULL,
  `MVolume` decimal(19,2) DEFAULT NULL,
  `ProdBigType` varchar(100) DEFAULT NULL,
  `InPackUnit` varchar(6) DEFAULT NULL,
  `OutPackUnit` varchar(6) DEFAULT NULL,
  `NetWeightUnit` varchar(6) DEFAULT NULL,
  `GrossWeightUnit` varchar(6) DEFAULT NULL,
  `MEAMTUnit` varchar(6) DEFAULT NULL,
  `MEAMT` decimal(19,2) DEFAULT NULL,
  `TaxItemsID` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `comproduct` */

/*Table structure for table `comproductclass` */

DROP TABLE IF EXISTS `comproductclass`;

CREATE TABLE `comproductclass` (
  `ClassID` varchar(6) DEFAULT NULL,
  `ClassName` varchar(20) DEFAULT NULL,
  `EngName` varchar(20) DEFAULT NULL,
  `AccInventory` varchar(16) DEFAULT NULL,
  `AccPurchased` varchar(16) DEFAULT NULL,
  `ReturnPurchase` varchar(16) DEFAULT NULL,
  `AccSale` varchar(16) DEFAULT NULL,
  `AccSaleCost` varchar(16) DEFAULT NULL,
  `ReturnSale` varchar(16) DEFAULT NULL,
  `GiftExpense` varchar(16) DEFAULT NULL,
  `MaterialWarehouse` varchar(8) DEFAULT NULL,
  `MergeOutState` smallint(6) DEFAULT NULL,
  `DataVer` int(11) DEFAULT NULL,
  `OtherExpense` varchar(16) DEFAULT NULL,
  `OtherIncome` varchar(16) DEFAULT NULL,
  `OtherCost` varchar(16) DEFAULT NULL,
  `Memo` varchar(4000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `comproductclass` */

/*Table structure for table `comproject` */

DROP TABLE IF EXISTS `comproject`;

CREATE TABLE `comproject` (
  `projectID` varchar(15) NOT NULL,
  `projectName` varchar(40) DEFAULT NULL,
  `engName` varchar(20) DEFAULT NULL,
  `memo` varchar(4000) DEFAULT NULL,
  `mergeOutState` smallint(6) DEFAULT NULL,
  `invalidDate` int(11) DEFAULT NULL,
  PRIMARY KEY (`projectID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `comproject` */

insert  into `comproject`(`projectID`,`projectName`,`engName`,`memo`,`mergeOutState`,`invalidDate`) values ('001','项目1','12','32',NULL,NULL);

/*Table structure for table `comstdunit` */

DROP TABLE IF EXISTS `comstdunit`;

CREATE TABLE `comstdunit` (
  `UnitID` varchar(6) DEFAULT NULL,
  `UnitName` varchar(20) DEFAULT NULL,
  `EngName` varchar(20) DEFAULT NULL,
  `Memo` varchar(4000) DEFAULT NULL,
  `MergeOutState` smallint(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `comstdunit` */

insert  into `comstdunit`(`UnitID`,`UnitName`,`EngName`,`Memo`,`MergeOutState`) values ('001','克','ke','无',NULL),('002','吨','dun','无',NULL);

/*Table structure for table `comtaxitems` */

DROP TABLE IF EXISTS `comtaxitems`;

CREATE TABLE `comtaxitems` (
  `TaxItemsID` varchar(10) NOT NULL,
  `TaxItemsName` varchar(50) DEFAULT NULL,
  `EngName` varchar(30) DEFAULT NULL,
  `memo` varchar(400) DEFAULT NULL,
  `MergeOutState` smallint(6) DEFAULT NULL,
  PRIMARY KEY (`TaxItemsID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `comtaxitems` */

insert  into `comtaxitems`(`TaxItemsID`,`TaxItemsName`,`EngName`,`memo`,`MergeOutState`) values ('001','小汽车',NULL,NULL,NULL),('002','商业(17%)',NULL,NULL,NULL);

/*Table structure for table `comwarehouse` */

DROP TABLE IF EXISTS `comwarehouse`;

CREATE TABLE `comwarehouse` (
  `WareHouseID` varchar(6) DEFAULT NULL,
  `WareHouseName` varchar(20) DEFAULT NULL,
  `ShortName` varchar(8) DEFAULT NULL,
  `EngName` varchar(20) DEFAULT NULL,
  `LinkMan` varchar(12) DEFAULT NULL,
  `Telephone` varchar(16) DEFAULT NULL,
  `WareHouseAddress` varchar(50) DEFAULT NULL,
  `Memo` varchar(4000) DEFAULT NULL,
  `MergeOutState` smallint(6) DEFAULT NULL,
  `DataVer` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `comwarehouse` */

insert  into `comwarehouse`(`WareHouseID`,`WareHouseName`,`ShortName`,`EngName`,`LinkMan`,`Telephone`,`WareHouseAddress`,`Memo`,`MergeOutState`,`DataVer`) values ('001','厦门仓','厦门','xianmencang','豪哥','16603332222','厦门市厦门区厦门镇厦门','备注12311561323',NULL,NULL),('002','株洲仓','株洲','zhuzhou','好人','13366664444','株洲河西','无',NULL,NULL),('003','长沙仓','长沙','changsha','坏人','13344442222','长沙雨花','无',NULL,NULL),('004','湘潭仓','湘潭','xiangtan','滴滴滴','12233331111','湘潭铺子','无',NULL,NULL),('005','上海仓','上海','shanghai','嘿嘿','16633334444','上海','无',NULL,NULL),('006','广州仓','广州','guangzhou','仅仅','14422223333','广州','无',NULL,NULL),('007','武汉仓','武汉','wuhan','流浪','18899997777','武汉','无',NULL,NULL);

/*Table structure for table `humschooling` */

DROP TABLE IF EXISTS `humschooling`;

CREATE TABLE `humschooling` (
  `schoolingID` varchar(10) NOT NULL,
  `schoolingName` varchar(30) DEFAULT NULL,
  `engName` varchar(40) DEFAULT NULL,
  `memo` varchar(4000) DEFAULT NULL,
  `mergeOutState` smallint(6) DEFAULT NULL,
  PRIMARY KEY (`schoolingID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `humschooling` */

insert  into `humschooling`(`schoolingID`,`schoolingName`,`engName`,`memo`,`mergeOutState`) values ('001','高中','gongzhong','无2',NULL),('002','初中','初中','阿斯蒂芬',NULL),('003','小学',NULL,NULL,NULL),('004','本科',NULL,NULL,NULL),('005','博士',NULL,NULL,NULL),('006','研究生',NULL,NULL,NULL);

/*Table structure for table `lyaccountlist` */

DROP TABLE IF EXISTS `lyaccountlist`;

CREATE TABLE `lyaccountlist` (
  `SerNo` int(11) NOT NULL COMMENT '栏号',
  `ProdID` int(11) NOT NULL COMMENT '物料编号',
  `ProdName` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `SourceAmount` double DEFAULT NULL COMMENT '原单金额',
  `Amount` double DEFAULT NULL COMMENT '发票金额',
  `BalanceAmt` double DEFAULT NULL COMMENT '价差',
  `RateBalanceAmt` float DEFAULT NULL COMMENT '汇差',
  `TotalBalanceAmt` float DEFAULT NULL COMMENT '差额合计',
  `ProdSize` varchar(30) DEFAULT NULL COMMENT '规格型号',
  PRIMARY KEY (`SerNo`,`ProdID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `lyaccountlist` */

/*Table structure for table `lyadvance` */

DROP TABLE IF EXISTS `lyadvance`;

CREATE TABLE `lyadvance` (
  `advid` varchar(20) DEFAULT NULL COMMENT '预付单单号',
  `advdate` date DEFAULT NULL COMMENT '单据日期',
  `purveyid` varchar(20) DEFAULT NULL COMMENT '供应商ID',
  `purveyname` varchar(50) DEFAULT NULL COMMENT '供应商名称',
  `advstrike1` varchar(50) DEFAULT NULL COMMENT '结算方式1',
  `advstrike2` varchar(50) DEFAULT NULL COMMENT '结算方式2',
  `advstrike3` varchar(50) DEFAULT NULL COMMENT '结算方式3',
  `advmoney1` double DEFAULT NULL COMMENT '金额1',
  `advmoney2` double DEFAULT NULL COMMENT '金额2',
  `advmoney3` double DEFAULT NULL COMMENT '金额3',
  `advmakeing` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `stodept` varchar(50) DEFAULT NULL COMMENT '制单人所属部门',
  `stodeptid` int(100) DEFAULT NULL COMMENT '部门ID',
  `advcheckman` varchar(50) NOT NULL COMMENT '复核人员',
  `advremark` varchar(1000) DEFAULT NULL COMMENT '备注',
  `isaditing` int(4) DEFAULT NULL COMMENT '是否审核',
  `safetyone` varchar(50) DEFAULT NULL COMMENT '保存（“预付款单”）',
  `enables` int(4) DEFAULT '1' COMMENT '标识是否删除'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `lyadvance` */

/*Table structure for table `lyadvancedetails` */

DROP TABLE IF EXISTS `lyadvancedetails`;

CREATE TABLE `lyadvancedetails` (
  `advid` varchar(20) NOT NULL COMMENT '主表单号,也是外键',
  `advdetid` int(9) NOT NULL COMMENT '行号',
  `advdetmoney` double NOT NULL COMMENT '预付金额',
  `advdetoddtype` varchar(50) NOT NULL COMMENT '来源单别',
  `advdetoddid` varchar(20) NOT NULL COMMENT '来源单号',
  `advdetdegest` varchar(50) DEFAULT NULL COMMENT '摘要',
  `advdetbalance` double NOT NULL COMMENT '预付余额',
  `enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  PRIMARY KEY (`advid`,`advdetid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `lyadvancedetails` */

/*Table structure for table `lypayment` */

DROP TABLE IF EXISTS `lypayment`;

CREATE TABLE `lypayment` (
  `payid` varchar(20) NOT NULL COMMENT '应付冲款单单号',
  `paydate` date NOT NULL COMMENT '单据日期',
  `purveyid` varchar(20) DEFAULT NULL COMMENT '供应商ID',
  `purveyname` varchar(50) NOT NULL COMMENT '供应商名称',
  `paystrike1` varchar(50) DEFAULT NULL COMMENT '结算方式1',
  `paystrike2` varchar(50) DEFAULT NULL COMMENT '结算方式2',
  `paystrike3` varchar(50) DEFAULT NULL COMMENT '结算方式3',
  `paymoney1` double DEFAULT NULL COMMENT '金额1',
  `paymoney2` double DEFAULT NULL COMMENT '金额2',
  `paymoney3` double DEFAULT NULL COMMENT '金额3',
  `paymakeing` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `paydept` varchar(50) DEFAULT NULL COMMENT '制单人所属部门',
  `stodeptid` varchar(50) DEFAULT NULL COMMENT '部门ID （伪ID）',
  `paycheckman` varchar(50) NOT NULL COMMENT '审核人员',
  `payremark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `isaditing` int(11) DEFAULT NULL COMMENT '是否审核',
  `enables` int(11) DEFAULT '1' COMMENT '标识是否删除',
  PRIMARY KEY (`payid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `lypayment` */

/*Table structure for table `lypaymentdetails` */

DROP TABLE IF EXISTS `lypaymentdetails`;

CREATE TABLE `lypaymentdetails` (
  `payid` varchar(20) NOT NULL COMMENT '应付冲款单单号',
  `paydetid` varchar(20) NOT NULL COMMENT '行号',
  `paydetoddtype` varchar(20) NOT NULL COMMENT '来源单别',
  `paydetoddid` varchar(20) NOT NULL COMMENT '来源单号',
  `formeroddmoney` double NOT NULL COMMENT '原单金额',
  `nocebalance` double NOT NULL COMMENT '现行余额',
  `payzr` double DEFAULT NULL COMMENT '折让金额',
  `paydetmoney` double NOT NULL COMMENT '冲款金额',
  `takadvmoney` double DEFAULT NULL COMMENT '取用预付',
  `rushmoney` double NOT NULL COMMENT '冲抵金额',
  `enables` int(4) DEFAULT '1' COMMENT '标识是否删除',
  PRIMARY KEY (`payid`,`paydetid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `lypaymentdetails` */

/*Table structure for table `lypurchaseinvoice` */

DROP TABLE IF EXISTS `lypurchaseinvoice`;

CREATE TABLE `lypurchaseinvoice` (
  `FundBillNo` int(11) NOT NULL COMMENT '单据号码',
  `BillDate` date DEFAULT NULL COMMENT '单据日期',
  `CustID` int(11) DEFAULT NULL COMMENT '供应商',
  `FullName` tinyint(30) DEFAULT NULL COMMENT '供应商全称',
  `DueTo` varchar(30) DEFAULT NULL COMMENT '账款归属',
  `AccMonth` date DEFAULT NULL COMMENT '账款月份',
  `InvoiceNo` int(11) DEFAULT NULL COMMENT '发票号码',
  `CurrID` int(11) DEFAULT NULL COMMENT '币别',
  `CurrencyName` varchar(30) DEFAULT NULL COMMENT '币别名称',
  `ExchRate` float DEFAULT NULL COMMENT '汇率',
  `Total` double DEFAULT NULL COMMENT '发票金额',
  `CashPay` double DEFAULT NULL COMMENT '结算方式一金额',
  `VisaPay` double DEFAULT NULL COMMENT '结算方式二金额',
  `OffSet` double DEFAULT NULL COMMENT '已冲款金额',
  `Discount` double DEFAULT NULL COMMENT '冲款单折让金额',
  `PrepayDay` date DEFAULT NULL COMMENT '付款日期',
  `DaptID` int(11) DEFAULT NULL COMMENT '所属部门',
  `DaptName` varchar(20) DEFAULT NULL COMMENT '部门名称',
  `ProjectID` int(11) DEFAULT NULL COMMENT '所属项目',
  `ProjectName` varchar(30) DEFAULT NULL COMMENT '项目名称',
  `Salesman` int(11) DEFAULT NULL COMMENT '采购人员',
  `PersonName` varchar(30) DEFAULT NULL COMMENT '人员姓名',
  `CashPayStyle` int(11) DEFAULT NULL COMMENT '结算方式一',
  `CashPayStyleName` varchar(30) DEFAULT NULL COMMENT '结算方式一名称',
  `VisaPayStyle` int(11) DEFAULT NULL COMMENT '结算方式二',
  `VisaPayStyleName` varchar(30) DEFAULT NULL COMMENT '结算方式二名称',
  `OtherPayStyle` int(11) DEFAULT NULL COMMENT '结算方式三',
  `OtherPayStyleName` varchar(30) DEFAULT NULL COMMENT '结算方式三名称',
  `OtherPay` double DEFAULT NULL COMMENT '结算方式三金额',
  `PriceOfTax` int(5) DEFAULT NULL COMMENT '单价是否含税',
  `VoucherNo` int(11) DEFAULT NULL COMMENT '凭证编号',
  `CVoucherNo` int(11) DEFAULT NULL COMMENT '差价凭证编号',
  `MakerID` int(11) DEFAULT NULL COMMENT '制单人员编号',
  `Maker` varchar(30) DEFAULT NULL COMMENT '制单人员',
  `PermitterID` int(11) DEFAULT NULL COMMENT '复核人员编号',
  `Permitter` varchar(30) DEFAULT NULL COMMENT '复核人员',
  `Remark` varchar(225) DEFAULT NULL COMMENT '备注',
  `BillTypeID` int(11) DEFAULT NULL COMMENT '单据类型编号',
  `BillType` varchar(30) DEFAULT NULL COMMENT '单据类型',
  `AffirmStateID` int(11) DEFAULT NULL COMMENT '采购核对状态编号',
  `AffirmState` varchar(30) DEFAULT NULL COMMENT '采购核对状态',
  `PayTermID` int(11) DEFAULT NULL COMMENT '付款条件编号',
  `PayTerm` varchar(30) DEFAULT NULL COMMENT '付款条件',
  `DelayDays` int(11) DEFAULT NULL COMMENT '付款延迟天数',
  `InvoTypeID` int(11) DEFAULT NULL COMMENT '发票类型编号',
  `InvotypeName` varchar(30) DEFAULT NULL COMMENT '发票类型名称',
  `GatherOther` varchar(225) DEFAULT NULL COMMENT '其他收款方式描述',
  `MakerSign` varchar(30) DEFAULT NULL COMMENT '制单人签名',
  `PermitterSign` varchar(30) DEFAULT NULL COMMENT '复核人签名',
  `Tax` double DEFAULT NULL COMMENT '发票税额',
  PRIMARY KEY (`FundBillNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `lypurchaseinvoice` */

/*Table structure for table `lypurchaseinvoicedetails` */

DROP TABLE IF EXISTS `lypurchaseinvoicedetails`;

CREATE TABLE `lypurchaseinvoicedetails` (
  `ProdID` int(11) NOT NULL COMMENT '物料编号',
  `StdUnitName` varchar(20) DEFAULT NULL COMMENT '基本单位',
  `StdUnitID` int(11) DEFAULT NULL COMMENT '单位编号',
  `Amount` double DEFAULT NULL COMMENT '金额',
  `TaxAmt` float DEFAULT NULL COMMENT '税率%',
  `AmountWithTax` float DEFAULT NULL COMMENT '含税金额',
  `SerNo` int(11) DEFAULT NULL COMMENT '栏号',
  `LQty` int(11) DEFAULT NULL COMMENT '未进数量',
  `Remark` int(11) DEFAULT NULL COMMENT '分录备注',
  `ProdName` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `ProdSize` varchar(30) DEFAULT NULL COMMENT '规格型号',
  `FormNo` int(11) DEFAULT NULL COMMENT '采购订单号',
  `SUnitID` int(11) DEFAULT NULL COMMENT '单位编号',
  `SUnit` varchar(30) DEFAULT NULL COMMENT '单位名称',
  `SPriice` double DEFAULT NULL COMMENT '单价',
  `SQuantity` int(5) DEFAULT NULL COMMENT '数量',
  PRIMARY KEY (`ProdID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `lypurchaseinvoicedetails` */

/*Table structure for table `lypurchaselist` */

DROP TABLE IF EXISTS `lypurchaselist`;

CREATE TABLE `lypurchaselist` (
  `SerNo` int(11) NOT NULL COMMENT '栏号',
  `ProdID` int(11) NOT NULL COMMENT '物料编号',
  `ProdName` varchar(30) DEFAULT NULL COMMENT '物料名称',
  `ProdSize` varchar(30) DEFAULT NULL COMMENT '规格型号',
  `SourcePrice` double DEFAULT NULL COMMENT '单价',
  `SourceAmount` double DEFAULT NULL COMMENT '金额',
  `Quantity` int(5) DEFAULT NULL COMMENT '数量',
  `TaxRate` float DEFAULT NULL COMMENT '税率%',
  `TaxAmt` float DEFAULT NULL COMMENT '含税金额',
  `AmountWithTax` double DEFAULT NULL COMMENT '价差',
  `BalanceAmt` int(11) DEFAULT NULL COMMENT '来源单别',
  `SourceType` varchar(50) DEFAULT NULL COMMENT '来源单号',
  `RateBalanceAmt` int(11) DEFAULT NULL COMMENT '汇差',
  `TotalBalanceAmt` int(11) DEFAULT NULL COMMENT '差额合计',
  `Remark` int(11) DEFAULT NULL COMMENT '分录备注',
  `StdUnitID` int(11) DEFAULT NULL COMMENT '单位编号',
  `StdUnitName` varchar(50) DEFAULT NULL COMMENT '单位',
  PRIMARY KEY (`SerNo`,`ProdID`),
  KEY `ProdID` (`ProdID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `lypurchaselist` */

/*Table structure for table `smlordbillmain` */

DROP TABLE IF EXISTS `smlordbillmain`;

CREATE TABLE `smlordbillmain` (
  `flag` int(4) NOT NULL COMMENT '标识字段',
  `billNo` varchar(14) NOT NULL COMMENT '单据号码',
  `billDate` date DEFAULT NULL COMMENT '单据日期',
  `customerID` varchar(20) NOT NULL COMMENT '客户编号',
  `dueTo` varchar(20) NOT NULL COMMENT '账款归属',
  `custAddres` varchar(20) NOT NULL COMMENT '送货地址名称',
  `billStyle` int(4) NOT NULL COMMENT '销售订单类型',
  `salesMan` varchar(10) NOT NULL COMMENT '业务员编号',
  `currID` varchar(4) NOT NULL COMMENT '币别',
  `formalCust` int(4) NOT NULL COMMENT '正式客户',
  `validDate` date NOT NULL COMMENT '有效日期',
  `departID` varchar(4) NOT NULL COMMENT '所属部门',
  `maker` varchar(4) NOT NULL COMMENT '审核人',
  `permitter` varchar(4) NOT NULL COMMENT '复核人员',
  `detail` varchar(4) DEFAULT NULL COMMENT '描述编号',
  `isTrans` varchar(4) DEFAULT NULL COMMENT '已转采购建议',
  `sumBTaxAmt` float DEFAULT NULL COMMENT '金额合计',
  `taxType` varchar(4) DEFAULT NULL COMMENT '课税类别',
  `sumTax` float DEFAULT NULL COMMENT '税额合计',
  `sumQty` int(10) DEFAULT NULL COMMENT '数量合计',
  `billStatus` int(2) DEFAULT NULL COMMENT '单况',
  `mergeOutState` varchar(10) DEFAULT NULL COMMENT '抛出状态',
  `linkMan` varchar(10) DEFAULT NULL COMMENT '联络人员',
  `linkTelephone` varchar(20) DEFAULT NULL COMMENT '联络电话',
  `priceOfTax` int(2) DEFAULT NULL COMMENT '单价是否含税',
  `gatherStyle` varchar(20) DEFAULT NULL COMMENT '收款条件',
  `gatherDelay` int(4) DEFAULT NULL COMMENT '收款天数',
  `checkStyle` int(4) DEFAULT NULL COMMENT '票期方式',
  `checkDelay` int(10) DEFAULT NULL COMMENT '票期天数',
  `prepayDay` date DEFAULT NULL COMMENT '收款日期',
  `encashDay` date DEFAULT NULL COMMENT '预兑日期',
  `accMonth` varchar(10) DEFAULT NULL COMMENT '账款月份',
  `makerID` int(10) DEFAULT NULL COMMENT '制单人员',
  `permitterID` int(10) DEFAULT NULL COMMENT '复核人员',
  `signBack` varchar(10) DEFAULT NULL COMMENT '签回',
  `hasCheck` int(2) DEFAULT NULL COMMENT '是否过账',
  `sumAmtATax` float DEFAULT NULL COMMENT '含税金额合计',
  `localTotal` float DEFAULT NULL COMMENT '本币未税',
  `localTax` float DEFAULT NULL COMMENT '税额本位币合计',
  `totalErrAmount` float DEFAULT NULL COMMENT '总计误差',
  `mlSumBTaxAmt` float DEFAULT NULL COMMENT '金额合计本位币',
  `mlSumAmtATax` float DEFAULT NULL COMMENT '含税金额本位币合计',
  PRIMARY KEY (`flag`,`billNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='销售主表';

/*Data for the table `smlordbillmain` */

/*Table structure for table `smlordbillsub` */

DROP TABLE IF EXISTS `smlordbillsub`;

CREATE TABLE `smlordbillsub` (
  `flag` int(4) NOT NULL COMMENT '标识字段',
  `billNo` varchar(14) NOT NULL COMMENT '单据号码',
  `rowNO` int(4) NOT NULL COMMENT '行号',
  `serNO` int(4) NOT NULL COMMENT '行号',
  `billDate` date DEFAULT NULL COMMENT '单据日期',
  `prodID` varchar(20) NOT NULL COMMENT '物料编号',
  `prodName` varchar(50) NOT NULL COMMENT '物料名称',
  `prodSize` varchar(20) NOT NULL COMMENT '物料规格',
  `quantity` int(10) NOT NULL COMMENT '基本数量',
  `unit` varchar(20) NOT NULL COMMENT '基本单位',
  `oldPrice` float NOT NULL COMMENT '折扣前单价',
  `price` float NOT NULL COMMENT '基本单价',
  `amount` float NOT NULL COMMENT '金额',
  `taxRate` float NOT NULL COMMENT '税率',
  `taxAmt` float DEFAULT NULL COMMENT '税额',
  `mlTaxAmt` float DEFAULT NULL COMMENT '税额本位币',
  `discount` float DEFAULT NULL COMMENT '折数',
  `isGift` int(2) DEFAULT NULL COMMENT '赠品',
  `itemRemark` varchar(50) DEFAULT NULL COMMENT '分录备注',
  `detail` varchar(20) DEFAULT NULL COMMENT '细项描述',
  `preInDate` date DEFAULT NULL COMMENT '预交货日期',
  `needExamine` varchar(10) DEFAULT NULL COMMENT '验货',
  `arrangeNO` varchar(20) DEFAULT NULL COMMENT '排程单号',
  `fromRow` int(4) DEFAULT NULL COMMENT '来源栏号',
  `fromNO` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `tranType` int(4) DEFAULT NULL COMMENT '来源别',
  `qtyRemain` int(10) DEFAULT NULL COMMENT '未转数量',
  `converRate` int(4) DEFAULT NULL COMMENT '换算率',
  `outQty` int(10) DEFAULT NULL COMMENT '数量1',
  `custBillNo` varchar(20) DEFAULT NULL COMMENT '客户订单',
  `mark` varchar(4) DEFAULT NULL COMMENT '标记',
  `mlAmount` float DEFAULT NULL COMMENT '金额本位币',
  `hasCheck` int(2) DEFAULT NULL COMMENT '是否过账',
  `sPrice` float DEFAULT NULL COMMENT '单价',
  `sQuantity` int(10) DEFAULT NULL COMMENT '数量',
  `unitRelation` float DEFAULT NULL COMMENT '换算率',
  `sUnitID` int(4) DEFAULT NULL COMMENT '单位编号',
  `eQuantity` int(10) DEFAULT NULL COMMENT '辅助数量',
  `eUnitID` varchar(20) DEFAULT NULL COMMENT '辅助单位',
  `eUnitRelation` float DEFAULT NULL COMMENT '辅助换算率',
  PRIMARY KEY (`flag`,`billNo`,`rowNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='销售报价、订单明细表';

/*Data for the table `smlordbillsub` */

/*Table structure for table `smlstkadjustmain` */

DROP TABLE IF EXISTS `smlstkadjustmain`;

CREATE TABLE `smlstkadjustmain` (
  `flag` int(4) NOT NULL COMMENT '标识字段',
  `adjustNO` varchar(20) NOT NULL COMMENT '单据编号',
  `adjustDate` date NOT NULL COMMENT '单据日期',
  `maker` varchar(20) DEFAULT NULL COMMENT '制单人员',
  `permitter` varchar(20) DEFAULT NULL COMMENT '复核人员',
  `voucherNO` varchar(20) NOT NULL COMMENT '凭证编号',
  `sumQty` int(10) NOT NULL COMMENT '数量合计',
  `uDef1` varchar(20) NOT NULL COMMENT '自定栏一',
  `uDef2` varchar(20) NOT NULL COMMENT '自定栏二',
  `departID` int(4) NOT NULL COMMENT '所属部门',
  `makerID` int(4) NOT NULL COMMENT '复核人员',
  `wareID` int(4) NOT NULL COMMENT '仓库id',
  `salesID` int(4) NOT NULL COMMENT '出库人员id',
  `billStyle` int(4) NOT NULL COMMENT '出库类型id',
  `billStatus` int(4) DEFAULT NULL COMMENT '出库状态',
  PRIMARY KEY (`flag`,`adjustNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='销售报价、订单明细表';

/*Data for the table `smlstkadjustmain` */

/*Table structure for table `smlstkadjustsub` */

DROP TABLE IF EXISTS `smlstkadjustsub`;

CREATE TABLE `smlstkadjustsub` (
  `flag` int(4) NOT NULL COMMENT '标识字段',
  `adjustNO` varchar(20) NOT NULL COMMENT '单据编号',
  `rowNo` int(4) NOT NULL COMMENT '行号',
  `serNO` int(4) DEFAULT NULL COMMENT '栏号',
  `adjustDate` date DEFAULT NULL COMMENT '单据日期',
  `price` float NOT NULL COMMENT '单价',
  `amount` float NOT NULL COMMENT '金额',
  `haveBatch` varchar(20) NOT NULL COMMENT '批号',
  `itemRemark` varchar(255) NOT NULL COMMENT '分录备注',
  PRIMARY KEY (`flag`,`adjustNO`,`rowNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='销售报价、订单明细表';

/*Data for the table `smlstkadjustsub` */

/*Table structure for table `sys_permissions` */

DROP TABLE IF EXISTS `sys_permissions`;

CREATE TABLE `sys_permissions` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `permission` varchar(100) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `available` tinyint(1) DEFAULT '0',
  `path` varchar(255) DEFAULT NULL,
  `catalog` tinyint(1) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `component` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_sys_permissions_permission` (`permission`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

/*Data for the table `sys_permissions` */

insert  into `sys_permissions`(`id`,`permission`,`description`,`available`,`path`,`catalog`,`icon`,`component`,`name`) values (4,'sys','系统管理',0,'/sys',1,NULL,'layout','/sys'),(5,'sys:user','用户管理',0,'/user/list',1,NULL,'/sys/user/list','/user/list'),(6,'sys:role','角色管理',0,'/role/list',1,NULL,'/sys/role/list','/role/list'),(7,'edu','教务管理',0,'/edu',1,NULL,'layout','/edu'),(8,'edu:clazz','班级管理',0,'/clazz/list',1,NULL,'/edu/clazz/list','/clazz/list'),(9,'edu:clazz:create','添加班级',0,'/clazz/create',0,NULL,'/edu/clazz/create','/clazz/create'),(10,'edu:student','学生管理',0,'/student/list',1,NULL,'/edu/student/list','/student/list'),(12,'edu:student:create','添加学生',0,'/student/create',0,NULL,'/edu/student/create','/student/create'),(13,'check','评测管理',0,'/check',1,NULL,'layout','/check'),(14,'check:exam','考试管理',0,'/check/exam',1,NULL,'/check/exam/list','/check/exam'),(15,'edu:clazz:update','修改',0,'/clazz/update',0,NULL,'/edu/clazz/update','/clazz/update'),(16,'sys:user:create','用户添加',0,'/user/create',0,NULL,'/sys/user/create','/user/create'),(18,'sys:user:query','用户查询',0,'/user/query',0,NULL,'/sys/user/query',''),(19,'sys:user:update','用户修改',0,'/user/update',0,NULL,'/sys/user/update','/user/update');

/*Table structure for table `sys_roles` */

DROP TABLE IF EXISTS `sys_roles`;

CREATE TABLE `sys_roles` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role` varchar(100) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `available` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_sys_roles_role` (`role`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8;

/*Data for the table `sys_roles` */

insert  into `sys_roles`(`id`,`role`,`description`,`available`) values (37,'admin','管理员',0),(38,'user','用户管理员',0),(39,'adminmanger','超级管理员',0);

/*Table structure for table `sys_roles_permissions` */

DROP TABLE IF EXISTS `sys_roles_permissions`;

CREATE TABLE `sys_roles_permissions` (
  `role_id` bigint(20) NOT NULL,
  `permission_id` bigint(20) NOT NULL,
  PRIMARY KEY (`role_id`,`permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_roles_permissions` */

insert  into `sys_roles_permissions`(`role_id`,`permission_id`) values (39,1),(39,2),(39,6),(39,7),(39,8),(39,9),(39,10),(39,16),(39,18),(39,19);

/*Table structure for table `sys_users` */

DROP TABLE IF EXISTS `sys_users`;

CREATE TABLE `sys_users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `salt` varchar(100) DEFAULT NULL,
  `locked` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_sys_users_username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8;

/*Data for the table `sys_users` */

insert  into `sys_users`(`id`,`username`,`password`,`salt`,`locked`) values (73,'2','2','1f111ee547592fa57fcbb18cde43f87c',0),(74,'li','bd99444b1caa770905f8285ae6376809','e28f52bb362f4e0b4a5c0656ad9becbf',0),(75,'wu','748cecd5d0c822ab2d4970ca051c71f0','057ee4ffb93beee52b248267d3f2989f',0),(76,'wang','eded16526bc404e0dbf5e1ca9b1a41aa','af130d97bb44c01bc194366a7e52c0f0',1),(78,'pidan','$2a$10$LWSr2TUgxUPDg3Bh36FZ5uxbCc7kzUU39.FY2ssxV2/fGDwZ8xjSG',NULL,NULL),(79,'admin','$2a$10$LWSr2TUgxUPDg3Bh36FZ5uxbCc7kzUU39.FY2ssxV2/fGDwZ8xjSG',NULL,0),(80,'1','1',NULL,0);

/*Table structure for table `sys_users_roles` */

DROP TABLE IF EXISTS `sys_users_roles`;

CREATE TABLE `sys_users_roles` (
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_users_roles` */

insert  into `sys_users_roles`(`user_id`,`role_id`) values (73,38),(73,39),(78,37),(79,39);

/*Table structure for table `tjcadjustprices` */

DROP TABLE IF EXISTS `tjcadjustprices`;

CREATE TABLE `tjcadjustprices` (
  `adjustpricesID` int(11) NOT NULL COMMENT '调价单ID',
  `billNo` int(50) DEFAULT NULL COMMENT '单据号码',
  `adjustDate` date DEFAULT NULL COMMENT '单据日期',
  `maker` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `permitter` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `udef1` varchar(200) DEFAULT NULL COMMENT '自定栏一',
  `udef2` varchar(200) DEFAULT NULL COMMENT '自定栏二',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `sumQty` int(50) NOT NULL AUTO_INCREMENT COMMENT '库存量合计',
  `sumCost` double DEFAULT NULL COMMENT '调价金额合计',
  `voucherNO` int(50) DEFAULT NULL COMMENT '凭证编号',
  `engName` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `incSubjectID` int(50) DEFAULT NULL COMMENT '增值科目',
  `incSubjectName` varchar(50) DEFAULT NULL COMMENT '增值科目名称',
  `decSujectID` int(50) DEFAULT NULL COMMENT '减值科目',
  `decSujectName` varchar(50) DEFAULT NULL COMMENT '减值科目名称',
  `makerSign` varchar(50) DEFAULT NULL COMMENT '制单人',
  `permitterSign` varchar(50) DEFAULT NULL COMMENT '复核人',
  `adjustType` varchar(50) DEFAULT NULL COMMENT '调整类别',
  `adjustStyle` varchar(50) DEFAULT NULL COMMENT '调整方式',
  `mergeOutState` int(50) DEFAULT NULL COMMENT '单据抛转状态标识',
  `departID` int(50) DEFAULT NULL COMMENT '调价部门',
  `departName` varchar(50) DEFAULT NULL COMMENT '部门名称',
  `makerID` int(50) DEFAULT NULL COMMENT '制单人员编号',
  `permitterID` int(50) DEFAULT NULL COMMENT '复核人员编号',
  `dateVar` varchar(50) DEFAULT NULL COMMENT '数据版本',
  `hasCheck` int(11) DEFAULT NULL COMMENT '是否过账',
  `hasBillAttach` int(11) DEFAULT NULL COMMENT '是否存在附件',
  `noPowerToViewAdvPerms` varchar(50) DEFAULT NULL COMMENT '无权查看当前记录',
  PRIMARY KEY (`adjustpricesID`),
  KEY `sumQty` (`sumQty`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tjcadjustprices` */

/*Table structure for table `tjcallot` */

DROP TABLE IF EXISTS `tjcallot`;

CREATE TABLE `tjcallot` (
  `allotId` int(11) NOT NULL COMMENT '调拨单ID',
  `moveDate` date DEFAULT NULL COMMENT '单据日期',
  `maker` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `permitter` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `sumQty` int(50) DEFAULT NULL COMMENT '数量合计',
  `Remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `udef1` varchar(200) DEFAULT NULL COMMENT '自定栏一',
  `udef2` varchar(200) DEFAULT NULL COMMENT '自定栏二',
  `wareOutID` int(50) DEFAULT NULL COMMENT '调出仓库',
  `wareOutName` varchar(50) DEFAULT NULL COMMENT '调出仓库名称',
  `wareID` int(50) DEFAULT NULL COMMENT '调入仓库',
  `wareName` varchar(50) DEFAULT NULL COMMENT '调入仓库名称',
  `makerSign` varchar(50) DEFAULT NULL COMMENT '制单人',
  `permitterSign` varchar(50) DEFAULT NULL COMMENT '复核人',
  `moveNo` int(50) DEFAULT NULL COMMENT '单据号码',
  `mergeOutState` int(11) DEFAULT NULL COMMENT '单据抛转状态标识',
  `makerID` int(50) DEFAULT NULL COMMENT '制单人员编号',
  `permitterID` int(50) DEFAULT NULL COMMENT '复核人员编号',
  `dateVar` varchar(50) DEFAULT NULL COMMENT '数据版本',
  `hasCheck` int(11) DEFAULT NULL COMMENT '是否过账',
  `hasBillAttach` int(11) DEFAULT NULL COMMENT '是否存在附件',
  `noPowerToViewAdvPerms` varchar(50) DEFAULT NULL COMMENT '无权限查看当前记录',
  PRIMARY KEY (`allotId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tjcallot` */

/*Table structure for table `tjccheck` */

DROP TABLE IF EXISTS `tjccheck`;

CREATE TABLE `tjccheck` (
  `checkID` int(50) NOT NULL COMMENT '盘点单ID',
  `billNo` int(50) DEFAULT NULL COMMENT '单据号码',
  `adjustDate` date DEFAULT NULL COMMENT '单据日期',
  `maker` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `permitter` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `udef1` varchar(200) DEFAULT NULL COMMENT '自定栏一',
  `udef2` varchar(200) DEFAULT NULL COMMENT '自定栏二',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `wareID` int(50) DEFAULT NULL COMMENT '盘点仓库',
  `wareName` varchar(50) DEFAULT NULL COMMENT '盘点仓库名称',
  `sumQty` int(50) DEFAULT NULL COMMENT '盘亏数量合计',
  `sumCost` double DEFAULT NULL COMMENT '盘亏金额合计',
  `voucherNo` int(50) DEFAULT NULL COMMENT '凭证编号',
  `salesID` int(50) DEFAULT NULL COMMENT '盘点人员',
  `salesName` varchar(50) DEFAULT NULL COMMENT '盘点人员名称',
  `departID` int(50) DEFAULT NULL COMMENT '所属部门',
  `departName` varchar(50) DEFAULT NULL COMMENT '所属部门名称',
  `engName` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `zeroFilter` int(11) DEFAULT NULL COMMENT '帐面数量为零载入',
  `sumCurQty` int(50) DEFAULT NULL COMMENT '帐面数量合计',
  `sumCheckQty` int(50) DEFAULT NULL COMMENT '盘点数量合计',
  `incSubjectID` int(50) DEFAULT NULL COMMENT '增值科目',
  `incSubjectName` varchar(50) DEFAULT NULL COMMENT '增值科目名称',
  `decSujectID` int(50) DEFAULT NULL COMMENT '减值科目',
  `decSujectName` varchar(50) DEFAULT NULL COMMENT '减值科目名称',
  `makerSign` varchar(50) DEFAULT NULL COMMENT '制单人',
  `permitterSign` varchar(50) DEFAULT NULL COMMENT '复核人',
  `billStatus` int(11) DEFAULT NULL COMMENT '单据状态',
  `adjustType` varchar(50) DEFAULT NULL COMMENT '调整类别',
  `adjustStyle` varchar(50) DEFAULT NULL COMMENT '调整方式',
  `mergeOutState` int(11) DEFAULT NULL COMMENT '单据抛转状态标识',
  `makerID` int(50) DEFAULT NULL COMMENT '制单人员编号',
  `permitterID` int(50) DEFAULT NULL COMMENT '复核人员编号',
  `dateVer` varchar(50) DEFAULT NULL COMMENT '数据版本',
  `hasCheck` int(11) DEFAULT NULL COMMENT '是否过账',
  `hasBillAttach` int(11) DEFAULT NULL COMMENT '是否存在附件',
  `noPowerToViewAdvPerms` varchar(50) DEFAULT NULL COMMENT '无权限查看当前记录',
  PRIMARY KEY (`checkID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tjccheck` */

/*Table structure for table `tjcinventorybook` */

DROP TABLE IF EXISTS `tjcinventorybook`;

CREATE TABLE `tjcinventorybook` (
  `inventorybookID` int(11) NOT NULL COMMENT '库存台账ID',
  `materialSectionStart` varchar(50) DEFAULT NULL COMMENT '物料区间开始',
  `materialSectionOver` varchar(50) DEFAULT NULL COMMENT '物料区间结束',
  `warehouseSectionStart` varchar(50) DEFAULT NULL COMMENT '仓库区间开始',
  `warehouseSectionOver` varchar(50) DEFAULT NULL COMMENT '仓库区间结束',
  `dateSectionStart` date DEFAULT NULL COMMENT '日期区间开始',
  `dateSectionOver` date DEFAULT NULL COMMENT '日期区间结束',
  `differentiateWarehouse` int(11) DEFAULT NULL COMMENT '是否区分仓库',
  `test1` varchar(50) DEFAULT NULL COMMENT '备用列1',
  `test2` varchar(50) DEFAULT NULL COMMENT '备用列2',
  `test3` int(50) DEFAULT NULL COMMENT '备用列3',
  PRIMARY KEY (`inventorybookID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tjcinventorybook` */

/*Table structure for table `tjcinventorybookdetail` */

DROP TABLE IF EXISTS `tjcinventorybookdetail`;

CREATE TABLE `tjcinventorybookdetail` (
  `inventorybookDetailID` int(11) NOT NULL COMMENT '库存台账明细表ID',
  `materialSectionStart` varchar(50) DEFAULT NULL COMMENT '物料区间开始',
  `materialSectionOver` varchar(50) DEFAULT NULL COMMENT '物料区间结束',
  `warehouseSectionStart` varchar(50) DEFAULT NULL COMMENT '仓库区间开始',
  `warehouseSectionOver` varchar(50) DEFAULT NULL COMMENT '仓库区间结束',
  `dateSectionStart` date DEFAULT NULL COMMENT '日期区间开始',
  `dateSectionOver` date DEFAULT NULL COMMENT '日期区间结束',
  `differentiateWarehouse` int(11) DEFAULT NULL COMMENT '是否区分仓库',
  `test1` varchar(50) DEFAULT NULL COMMENT '备用列1',
  `test2` varchar(50) DEFAULT NULL COMMENT '备用列2',
  `test3` int(50) DEFAULT NULL COMMENT '备用列3',
  PRIMARY KEY (`inventorybookDetailID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tjcinventorybookdetail` */

/*Table structure for table `tjcmaterialdull` */

DROP TABLE IF EXISTS `tjcmaterialdull`;

CREATE TABLE `tjcmaterialdull` (
  `materialDullID` int(11) NOT NULL COMMENT '库存呆滞分析表ID',
  `materialSectionStart` varchar(50) DEFAULT NULL COMMENT '物料区间开始',
  `materialSectionOver` varchar(50) DEFAULT NULL COMMENT '物料区间结束',
  `materialTypeStart` varchar(50) DEFAULT NULL COMMENT '物料类别开始',
  `materialTypeOver` varchar(50) DEFAULT NULL COMMENT '物料类别结束',
  `materialDate` int(11) DEFAULT NULL COMMENT '日期选择',
  `dullCountDate` date DEFAULT NULL COMMENT '呆滞计算日期',
  `test1` varchar(50) DEFAULT NULL COMMENT '备用列1',
  `test2` varchar(50) DEFAULT NULL COMMENT '备用列2',
  `test3` int(50) DEFAULT NULL COMMENT '备用列3',
  PRIMARY KEY (`materialDullID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tjcmaterialdull` */

/*Table structure for table `yxpurchasedetail` */

DROP TABLE IF EXISTS `yxpurchasedetail`;

CREATE TABLE `yxpurchasedetail` (
  `billNO` varchar(20) NOT NULL,
  `billDate` date DEFAULT NULL,
  `serNO` int(11) NOT NULL,
  `prodID` int(11) DEFAULT NULL,
  `prodName` varchar(50) DEFAULT NULL,
  `prodSize` varchar(50) DEFAULT NULL,
  `SUnit` varchar(50) DEFAULT NULL,
  `sQuantity` int(11) DEFAULT NULL,
  `oldPrice` double DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `sPrice` double DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `taxRate` double DEFAULT NULL,
  `taxAmt` double DEFAULT NULL,
  `vFTotal` double DEFAULT NULL,
  `preInDate` date DEFAULT NULL,
  `qtyRemein` int(11) DEFAULT NULL,
  `isGift` int(11) DEFAULT NULL,
  `itemRemark` varchar(50) DEFAULT NULL,
  `tranType` varchar(50) DEFAULT NULL,
  `fromNO` int(11) DEFAULT NULL,
  `bills` int(11) DEFAULT NULL,
  `data1` varchar(50) DEFAULT NULL,
  `data2` varchar(50) DEFAULT NULL,
  `data3` varchar(50) DEFAULT NULL,
  `data4` varchar(50) DEFAULT NULL,
  `data5` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`billNO`,`serNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `yxpurchasedetail` */

/*Table structure for table `yxpurchaseenquiry` */

DROP TABLE IF EXISTS `yxpurchaseenquiry`;

CREATE TABLE `yxpurchaseenquiry` (
  `billNO` varchar(20) NOT NULL,
  `billDate` date DEFAULT NULL,
  `customerID` int(11) DEFAULT NULL,
  `custShortName` varchar(50) DEFAULT NULL,
  `addressID` int(11) DEFAULT NULL,
  `custAddress` varchar(50) DEFAULT NULL,
  `validDate` date DEFAULT NULL,
  `curr` varchar(50) DEFAULT NULL,
  `exchRate` double DEFAULT NULL,
  `priceOfTax` int(11) DEFAULT NULL,
  `salesID` int(11) DEFAULT NULL,
  `salesName` varchar(50) DEFAULT NULL,
  `departID` int(11) DEFAULT NULL,
  `departName` varchar(50) DEFAULT NULL,
  `outAddress` varchar(50) DEFAULT NULL,
  `maker` varchar(50) DEFAULT NULL,
  `permitter` varchar(50) DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  `data1` varchar(50) DEFAULT NULL,
  `data2` varchar(50) DEFAULT NULL,
  `data3` varchar(50) DEFAULT NULL,
  `data4` varchar(50) DEFAULT NULL,
  `data5` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`billNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `yxpurchaseenquiry` */

/*Table structure for table `yxpurchaseorder` */

DROP TABLE IF EXISTS `yxpurchaseorder`;

CREATE TABLE `yxpurchaseorder` (
  `billNO` varchar(20) NOT NULL,
  `billDate` date DEFAULT NULL,
  `billStatus` int(11) DEFAULT NULL,
  `priceOfTax` int(11) DEFAULT NULL,
  `billStyleID` int(11) DEFAULT NULL,
  `billStyleName` varchar(50) DEFAULT NULL,
  `customerID` int(11) DEFAULT NULL,
  `custShortName` varchar(50) DEFAULT NULL,
  `addressID` int(11) DEFAULT NULL,
  `custAddress` varchar(50) DEFAULT NULL,
  `curr` varchar(50) DEFAULT NULL,
  `exchRate` double DEFAULT NULL,
  `outAddress` varchar(50) DEFAULT NULL,
  `factFundsAttribution` varchar(50) DEFAULT NULL,
  `prepayDay` date DEFAULT NULL,
  `accMonth` date DEFAULT NULL,
  `gatherStyle` varchar(50) DEFAULT NULL,
  `gatherDelay` int(11) DEFAULT NULL,
  `salesID` int(11) DEFAULT NULL,
  `salesName` varchar(50) DEFAULT NULL,
  `departID` int(11) DEFAULT NULL,
  `departName` varchar(50) DEFAULT NULL,
  `projectID` int(11) DEFAULT NULL,
  `projectName` varchar(50) DEFAULT NULL,
  `maker` varchar(50) DEFAULT NULL,
  `permitter` varchar(50) DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  `data1` varchar(50) DEFAULT NULL,
  `data2` varchar(50) DEFAULT NULL,
  `data3` varchar(50) DEFAULT NULL,
  `data4` varchar(50) DEFAULT NULL,
  `data5` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`billNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `yxpurchaseorder` */

/*Table structure for table `yxrequisitions` */

DROP TABLE IF EXISTS `yxrequisitions`;

CREATE TABLE `yxrequisitions` (
  `billNO` varchar(20) NOT NULL,
  `billDate` date DEFAULT NULL,
  `billStyleID` int(11) DEFAULT NULL,
  `billStyleName` varchar(50) DEFAULT NULL,
  `billStatus` int(11) DEFAULT NULL,
  `salesID` int(11) DEFAULT NULL,
  `salesName` varchar(50) DEFAULT NULL,
  `departID` int(11) DEFAULT NULL,
  `departName` varchar(50) DEFAULT NULL,
  `maker` varchar(50) DEFAULT NULL,
  `permitter` varchar(50) DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  `data1` varchar(50) DEFAULT NULL,
  `data2` varchar(50) DEFAULT NULL,
  `data3` varchar(50) DEFAULT NULL,
  `data4` varchar(50) DEFAULT NULL,
  `data5` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`billNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `yxrequisitions` */

/*Table structure for table `yxrequisitionsdetail` */

DROP TABLE IF EXISTS `yxrequisitionsdetail`;

CREATE TABLE `yxrequisitionsdetail` (
  `billNO` varchar(20) NOT NULL,
  `billDate` date DEFAULT NULL,
  `serNO` int(11) NOT NULL,
  `prodID` int(11) DEFAULT NULL,
  `prodName` varchar(50) DEFAULT NULL,
  `prodSize` varchar(50) DEFAULT NULL,
  `sUnit` varchar(50) DEFAULT NULL,
  `sQuantity` int(11) DEFAULT NULL,
  `curr` varchar(50) DEFAULT NULL,
  `stdPrice` double DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `lastestCurr` varchar(50) DEFAULT NULL,
  `lastestPrice` double DEFAULT NULL,
  `lastestAmount` double DEFAULT NULL,
  `preInDate` date DEFAULT NULL,
  `suggestPurDate` date DEFAULT NULL,
  `qtyRemain` int(11) DEFAULT NULL,
  `itemRemark` varchar(50) DEFAULT NULL,
  `fromNO` int(11) DEFAULT NULL,
  `tranType` varchar(50) DEFAULT NULL,
  `data1` varchar(50) DEFAULT NULL,
  `data2` varchar(50) DEFAULT NULL,
  `data3` varchar(50) DEFAULT NULL,
  `data4` varchar(50) DEFAULT NULL,
  `data5` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`billNO`,`serNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `yxrequisitionsdetail` */

/*Table structure for table `yzqsellcancel` */

DROP TABLE IF EXISTS `yzqsellcancel`;

CREATE TABLE `yzqsellcancel` (
  `billNo` varchar(20) NOT NULL COMMENT '单据号码',
  `billDate` date NOT NULL COMMENT '单据日期',
  `custId` varchar(50) NOT NULL COMMENT '客户编号',
  `custShortName` varchar(50) NOT NULL COMMENT '客户简称',
  `addrId` varchar(50) DEFAULT NULL COMMENT '地址编号',
  `custAddress` varchar(50) DEFAULT NULL COMMENT '地址',
  `priceOfTax` varchar(50) NOT NULL COMMENT '单价是否含税',
  `wareId` varchar(50) NOT NULL COMMENT '仓库编号',
  `wareName` varchar(50) NOT NULL COMMENT '仓库名称',
  `isDeduct` int(11) NOT NULL COMMENT '是否重新入库',
  `salesId` varchar(50) NOT NULL COMMENT '业务人员编号',
  `salesName` varchar(50) NOT NULL COMMENT '业务人员',
  `departId` varchar(50) NOT NULL COMMENT '部门编号',
  `departName` varchar(50) NOT NULL COMMENT '所属部门',
  `maker` varchar(50) NOT NULL COMMENT '制单人员',
  `permitter` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `remark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `total` double DEFAULT NULL COMMENT '合计金额',
  `tax` double DEFAULT NULL COMMENT '合计税额',
  `sumAmtATax` double DEFAULT NULL COMMENT '合计含税金额',
  `sumNum` int(11) DEFAULT NULL COMMENT '合计数量',
  `hasForeignTrade` varchar(50) DEFAULT NULL COMMENT '国外贸易',
  `voucherNo` varchar(50) DEFAULT NULL COMMENT '凭证编号',
  `projectId` varchar(50) DEFAULT NULL COMMENT '项目编号',
  `projectName` varchar(50) DEFAULT NULL COMMENT '所属项目',
  `dueTo` varchar(50) DEFAULT NULL COMMENT '账款归属',
  `prepayDay` date DEFAULT NULL COMMENT '收款日期',
  `recvWay` varchar(50) DEFAULT NULL COMMENT '收款条件',
  `gatherDelay` int(11) DEFAULT NULL COMMENT '收款天数',
  `accMonth` date DEFAULT NULL COMMENT '账款月份',
  `addfield1` varchar(50) DEFAULT NULL COMMENT '自定义栏1',
  `addfield2` varchar(50) DEFAULT NULL COMMENT '自定义栏2',
  `checkstate` int(11) NOT NULL COMMENT '审核状态',
  `enables` int(11) DEFAULT NULL COMMENT '标识是否删除',
  PRIMARY KEY (`billNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `yzqsellcancel` */

/*Table structure for table `yzqsellcanceldetails` */

DROP TABLE IF EXISTS `yzqsellcanceldetails`;

CREATE TABLE `yzqsellcanceldetails` (
  `billNo` varchar(20) NOT NULL COMMENT '单据号码',
  `serNo` varchar(20) NOT NULL COMMENT '栏号',
  `prodId` varchar(20) NOT NULL COMMENT '物料编号',
  `prodName` varchar(50) NOT NULL COMMENT '物料名称',
  `prodSize` varchar(50) NOT NULL COMMENT '规格型号',
  `sUnit` varchar(50) NOT NULL COMMENT '单位名称',
  `sQuantity` int(11) NOT NULL COMMENT '数量',
  `oldPrice` double NOT NULL COMMENT '折扣前单价',
  `discount` double NOT NULL COMMENT '折数',
  `sPrice` double NOT NULL COMMENT '单价',
  `amount` double NOT NULL COMMENT '金额',
  `taxRate` double NOT NULL COMMENT '税率',
  `taxAmt` double NOT NULL COMMENT '税额',
  `amountATax` double NOT NULL COMMENT '含税金额',
  `isGift` varchar(20) DEFAULT NULL COMMENT '赠品',
  `tranType` varchar(50) DEFAULT NULL COMMENT '来源单别',
  `fromNo` varchar(50) DEFAULT NULL COMMENT '来源单号',
  `haveBatch` int(11) DEFAULT NULL COMMENT '批号',
  `hasCombine` int(11) DEFAULT NULL COMMENT '物料组合',
  `hasInv` int(11) DEFAULT NULL COMMENT '发票明细',
  `noInvCount` int(11) DEFAULT NULL COMMENT '未开票数量',
  `itemRemark` varchar(50) DEFAULT NULL COMMENT '分录备注',
  `enables` int(11) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段2',
  PRIMARY KEY (`billNo`,`serNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `yzqsellcanceldetails` */

/*Table structure for table `yzqsellissueorder` */

DROP TABLE IF EXISTS `yzqsellissueorder`;

CREATE TABLE `yzqsellissueorder` (
  `billNo` varchar(20) NOT NULL COMMENT '单据号码',
  `billDate` date NOT NULL COMMENT '单据日期',
  `hasForeignTrade` varchar(50) NOT NULL COMMENT '国外贸易',
  `custId` varchar(50) NOT NULL COMMENT '客户编号',
  `custShortName` varchar(50) NOT NULL COMMENT '客户简称',
  `addrId` varchar(50) DEFAULT NULL COMMENT '地址编号',
  `custAddress` varchar(50) DEFAULT NULL COMMENT '地址',
  `priceOfTax` varchar(20) NOT NULL COMMENT '单价是否含税',
  `wareId` varchar(50) NOT NULL COMMENT '仓库编号',
  `wareName` varchar(50) NOT NULL COMMENT '仓库名称',
  `voucherNo` varchar(20) DEFAULT NULL COMMENT '凭证编号',
  `hasAutoInv` varchar(50) DEFAULT NULL COMMENT '复核后是否自动生成发票',
  `salesId` varchar(50) NOT NULL COMMENT '业务人员编号',
  `salesName` varchar(50) NOT NULL COMMENT '业务人员',
  `departId` varchar(50) NOT NULL COMMENT '部门编号',
  `departName` varchar(50) NOT NULL COMMENT '所属部门',
  `maker` varchar(50) NOT NULL COMMENT '制单人员',
  `permitter` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `projectId` varchar(20) DEFAULT NULL COMMENT '项目编号',
  `projectName` varchar(50) DEFAULT NULL COMMENT '所属项目',
  `sumNum` double DEFAULT NULL COMMENT '合计数量',
  `total` double DEFAULT NULL COMMENT '合计金额',
  `Tax` double DEFAULT NULL COMMENT '合计税额',
  `totalTaxMoney` double DEFAULT NULL COMMENT '合计含税金额',
  `dueTo` varchar(50) DEFAULT NULL COMMENT '账款归属',
  `prepayDay` date DEFAULT NULL COMMENT '收款日期',
  `recvWay` varchar(20) DEFAULT NULL COMMENT '收款条件',
  `gatherDelay` int(11) DEFAULT NULL COMMENT '收款天数',
  `accMonth` date DEFAULT NULL COMMENT '账款月份',
  `UDef1` varchar(50) DEFAULT NULL COMMENT '自定义栏1',
  `UDef2` varchar(50) DEFAULT NULL COMMENT '自定义栏2',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段1',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段2',
  `checkstate` int(11) NOT NULL COMMENT '审核状态',
  `enables` int(11) DEFAULT NULL COMMENT '标识是否删除',
  PRIMARY KEY (`billNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `yzqsellissueorder` */

/*Table structure for table `yzqsellissueorderdetails` */

DROP TABLE IF EXISTS `yzqsellissueorderdetails`;

CREATE TABLE `yzqsellissueorderdetails` (
  `billNo` varchar(20) NOT NULL COMMENT '单据号码',
  `serNo` int(11) NOT NULL COMMENT '栏号',
  `prodId` varchar(50) NOT NULL COMMENT '物料编号',
  `prodName` varchar(50) NOT NULL COMMENT '物料名称',
  `prodSize` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `sUnit` varchar(50) NOT NULL COMMENT '单位名称',
  `sQuantity` int(11) NOT NULL COMMENT '数量',
  `oldPrice` double NOT NULL COMMENT '折扣前单价',
  `discount` double NOT NULL COMMENT '折数',
  `sPrice` double NOT NULL COMMENT '单价',
  `amount` double NOT NULL COMMENT '金额',
  `taxRate` double NOT NULL COMMENT '税率',
  `taxAmt` double NOT NULL COMMENT '税额',
  `amountATax` double NOT NULL COMMENT '含税金额',
  `isGift` varchar(50) DEFAULT NULL COMMENT '赠品',
  `tranType` varchar(50) DEFAULT NULL COMMENT '来源单别',
  `fromNo` varchar(50) DEFAULT NULL COMMENT '来源单号',
  `haveBatch` int(11) DEFAULT NULL COMMENT '批号',
  `hasCombine` int(11) DEFAULT NULL COMMENT '物料组合',
  `hasInv` int(11) DEFAULT NULL COMMENT '发票明细',
  `noInvCount` int(11) DEFAULT NULL COMMENT '未开票数量',
  `itemRemark` varchar(50) DEFAULT NULL COMMENT '分录备注',
  `enables` int(11) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (`billNo`,`serNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `yzqsellissueorderdetails` */

/*Table structure for table `yzqsellshouldgatheringmain` */

DROP TABLE IF EXISTS `yzqsellshouldgatheringmain`;

CREATE TABLE `yzqsellshouldgatheringmain` (
  `costBillNo` varchar(20) NOT NULL COMMENT '主键ID(单据号码)',
  `originSysId` varchar(50) NOT NULL COMMENT '来源单别',
  `originNo` varchar(50) NOT NULL COMMENT '来源单号',
  `billDate` date NOT NULL COMMENT '来源单据日期',
  `ftyId` varchar(50) NOT NULL COMMENT '客户编号',
  `ftyName` varchar(50) NOT NULL COMMENT '客户全称',
  `custShortName` varchar(50) DEFAULT NULL COMMENT '客户简称',
  `invoiceNo` varchar(50) DEFAULT NULL COMMENT '发票号码',
  `voucherNo` varchar(50) DEFAULT NULL COMMENT '凭证编号',
  `memo` varchar(2000) DEFAULT NULL COMMENT '备注',
  `total` double DEFAULT NULL COMMENT '合计金额',
  `tax` double DEFAULT NULL COMMENT '合计税额',
  `sumAmtATax` double DEFAULT NULL COMMENT '合计含税金额',
  `personId` varchar(50) NOT NULL COMMENT '业务人员编号',
  `personName` varchar(50) NOT NULL COMMENT '业务人员',
  `departId` varchar(50) NOT NULL COMMENT '部门编号',
  `departName` varchar(50) NOT NULL COMMENT '所属部门',
  `maker` varchar(50) NOT NULL COMMENT '制单人员',
  `permitter` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `projectId` varchar(50) DEFAULT NULL COMMENT '项目编号',
  `projectName` varchar(50) DEFAULT NULL COMMENT '所属项目',
  `dueTo` varchar(50) DEFAULT NULL COMMENT '账款归属',
  `prepayDay` date DEFAULT NULL COMMENT '收款日期',
  `gatherStyle` varchar(50) DEFAULT NULL COMMENT '收款条件',
  `gatherDelay` int(11) DEFAULT NULL COMMENT '收款天数',
  `accMonth` date DEFAULT NULL COMMENT '账款月份',
  `UDef1` varchar(50) DEFAULT NULL COMMENT '自定义栏1',
  `UDef2` varchar(50) DEFAULT NULL COMMENT '自定义栏2',
  `cashPayStyleId` varchar(50) DEFAULT NULL COMMENT '结算方式一',
  `visaPayStyleId` varchar(50) DEFAULT NULL COMMENT '结算方式二',
  `otherPayStyleId` varchar(50) DEFAULT NULL COMMENT '结算方式三',
  `cashPayStyleMoney` double DEFAULT NULL COMMENT '金额1',
  `visaPayStyleMoney` double DEFAULT NULL COMMENT '金额2',
  `otherPayStyleMoney` double DEFAULT NULL COMMENT '金额3',
  `enables` int(11) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `checkstate` int(11) DEFAULT NULL COMMENT '审核状态',
  PRIMARY KEY (`costBillNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `yzqsellshouldgatheringmain` */

/*Table structure for table `yzqsellshouldgatheringsub` */

DROP TABLE IF EXISTS `yzqsellshouldgatheringsub`;

CREATE TABLE `yzqsellshouldgatheringsub` (
  `costBillNo` varchar(50) NOT NULL COMMENT '单据号码',
  `serNo` int(11) NOT NULL COMMENT '栏号',
  `itemId` varchar(50) NOT NULL COMMENT '编号',
  `fareClassName` varchar(50) DEFAULT NULL COMMENT '名称',
  `money` double DEFAULT NULL COMMENT '金额',
  `taxRate` double DEFAULT NULL COMMENT '税率',
  `taxMoney` double DEFAULT NULL COMMENT '税额',
  `accSubjectId` varchar(50) DEFAULT NULL COMMENT '科目编号',
  `subjectName` varchar(50) DEFAULT NULL COMMENT '科目名称',
  `demo` varchar(50) DEFAULT NULL COMMENT '分录备注',
  `enables` int(11) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段1',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段2',
  PRIMARY KEY (`costBillNo`,`serNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `yzqsellshouldgatheringsub` */

/*Table structure for table `zwjapportion` */

DROP TABLE IF EXISTS `zwjapportion`;

CREATE TABLE `zwjapportion` (
  `BillNo` int(11) DEFAULT NULL COMMENT '单据号码',
  `AssignStyle` varchar(50) DEFAULT NULL COMMENT '分摊方式',
  `BillDate` date DEFAULT NULL COMMENT '单据日期',
  `Maker` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `Permitter` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `CsOne` varchar(50) DEFAULT NULL COMMENT '测试数据',
  `CsTow` varchar(50) DEFAULT NULL COMMENT '测试数据',
  `CsThree` varchar(50) DEFAULT NULL COMMENT '测试数据'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `zwjapportion` */

/*Table structure for table `zwjexpensedetail` */

DROP TABLE IF EXISTS `zwjexpensedetail`;

CREATE TABLE `zwjexpensedetail` (
  `PeeClassID` int(11) DEFAULT NULL COMMENT '	费用编号',
  `SerNo` int(11) DEFAULT NULL COMMENT '	栏号',
  `PareClassName` varchar(50) DEFAULT NULL COMMENT '费用名称',
  `CurrID` int(11) DEFAULT NULL COMMENT '币别ID',
  `ExchRate` double DEFAULT NULL COMMENT '	汇率',
  `Amount` double DEFAULT NULL COMMENT '金额',
  `CsOne` varchar(50) DEFAULT NULL COMMENT '测试数据',
  `CsTow` varchar(50) DEFAULT NULL COMMENT '测试数据',
  `CsThree` varchar(50) DEFAULT NULL COMMENT '测试数据'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `zwjexpensedetail` */

/*Table structure for table `zwjpurchasereturn` */

DROP TABLE IF EXISTS `zwjpurchasereturn`;

CREATE TABLE `zwjpurchasereturn` (
  `BillNo` int(11) DEFAULT NULL COMMENT '单据号码',
  `CustID` int(11) DEFAULT NULL COMMENT '供应商ID',
  `BillDate` date DEFAULT NULL COMMENT '单据日期',
  `AddrID` int(11) DEFAULT NULL COMMENT '供应商地址ID',
  `IsDeduct` tinyint(1) DEFAULT NULL COMMENT '是否重新入库',
  `SaleID` int(11) DEFAULT NULL COMMENT '采购人员ID',
  `DepartID` int(11) DEFAULT NULL COMMENT '所属部门ID',
  `Maker` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `Permitter` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `CsOne` varchar(50) DEFAULT NULL COMMENT '测试数据',
  `CsTow` varchar(50) DEFAULT NULL COMMENT '测试数据',
  `CsThree` varchar(50) DEFAULT NULL COMMENT '测试数据'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `zwjpurchasereturn` */

/*Table structure for table `zwjresultsdetail` */

DROP TABLE IF EXISTS `zwjresultsdetail`;

CREATE TABLE `zwjresultsdetail` (
  `FormNo` int(11) DEFAULT NULL COMMENT '	采购入库编号',
  `SerNo` int(11) DEFAULT NULL COMMENT '	栏号',
  `ProdID` varchar(50) DEFAULT NULL COMMENT '	物料编号',
  `VAmount` double DEFAULT NULL COMMENT '采购金额',
  `ProdName` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `ProdSize` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `MLAmount` double DEFAULT NULL COMMENT '	分摊金额',
  `VQuantity` int(11) DEFAULT NULL COMMENT '	数量',
  `Sunit` varchar(50) DEFAULT NULL COMMENT '单位',
  `DetailCurrID` int(11) DEFAULT NULL COMMENT '币别ID',
  `CsOne` varchar(50) DEFAULT NULL COMMENT '测试数据',
  `CsTow` varchar(50) DEFAULT NULL COMMENT '测试数据',
  `CsThree` varchar(50) DEFAULT NULL COMMENT '测试数据'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `zwjresultsdetail` */

/*Table structure for table `zwjreturndetails` */

DROP TABLE IF EXISTS `zwjreturndetails`;

CREATE TABLE `zwjreturndetails` (
  `ProdID` int(11) DEFAULT NULL COMMENT '物料编号',
  `SerNo` int(11) DEFAULT NULL COMMENT '	栏号',
  `ProdName` varchar(50) DEFAULT NULL COMMENT '	物料名称',
  `ProdSize` varchar(50) DEFAULT NULL COMMENT '	规格型号',
  `UnitName` varchar(50) DEFAULT NULL COMMENT '	单位',
  `SQuantity` int(11) DEFAULT NULL COMMENT '	数量',
  `Sprice` double DEFAULT NULL COMMENT '单价',
  `Amount` double DEFAULT NULL COMMENT '金额',
  `HaveBatch` varchar(50) DEFAULT NULL COMMENT '	批号',
  `ItwmRemark` varchar(50) DEFAULT NULL COMMENT '	分录备注',
  `CsOne` varchar(50) DEFAULT NULL COMMENT '测试数据',
  `CsTow` varchar(50) DEFAULT NULL COMMENT '测试数据',
  `CsThree` varchar(50) DEFAULT NULL COMMENT '测试数据'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `zwjreturndetails` */

/*Table structure for table `zwjwarehousewarrant` */

DROP TABLE IF EXISTS `zwjwarehousewarrant`;

CREATE TABLE `zwjwarehousewarrant` (
  `BillNo` int(11) DEFAULT NULL COMMENT '	单据号码',
  `CustID` int(50) DEFAULT NULL COMMENT '供应商ID',
  `SaleClassName` varchar(50) DEFAULT NULL COMMENT '入库类型',
  `BillDate` date DEFAULT NULL COMMENT '单据日期',
  `VoucherNo` varchar(50) DEFAULT NULL COMMENT '凭证编号',
  `SaleID` int(11) DEFAULT NULL COMMENT '	入库人员ID',
  `DepartID` int(11) DEFAULT NULL COMMENT '	所属部门ID',
  `Maker` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `Permitter` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `CsOne` varchar(50) DEFAULT NULL COMMENT '	测试数据',
  `CsTow` varchar(50) DEFAULT NULL COMMENT '	测试数据',
  `CsThree` varchar(50) DEFAULT NULL COMMENT '	测试数据'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `zwjwarehousewarrant` */

/*Table structure for table `zwjwarehousingdetail` */

DROP TABLE IF EXISTS `zwjwarehousingdetail`;

CREATE TABLE `zwjwarehousingdetail` (
  `ProdID` int(11) DEFAULT NULL COMMENT '物料编号',
  `SerNo` int(11) DEFAULT NULL COMMENT '栏号',
  `ProdName` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `ProdSize` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `UnitName` varchar(50) DEFAULT NULL COMMENT '单位',
  `SQuantity` int(11) DEFAULT NULL COMMENT '数量',
  `Sprice` double DEFAULT NULL COMMENT '单价',
  `Amount` double DEFAULT NULL COMMENT '金额',
  `HaveBatch` varchar(50) DEFAULT NULL COMMENT '	批号',
  `ItwmRemark` varchar(50) DEFAULT NULL COMMENT '分录备注',
  `CsOne` varchar(50) DEFAULT NULL COMMENT '测试数据',
  `CsTow` varchar(50) DEFAULT NULL COMMENT '测试数据',
  `CsThree` varchar(50) DEFAULT NULL COMMENT '测试数据'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `zwjwarehousingdetail` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
