/*
 Navicat Premium Data Transfer

 Source Server         : 10.1.65.12
 Source Server Type    : MySQL
 Source Server Version : 50632
 Source Host           : 10.1.65.12:3306
 Source Schema         : HUADONG_QUEUE

 Target Server Type    : MySQL
 Target Server Version : 50632
 File Encoding         : 65001

 Date: 02/04/2021 15:10:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for txzdl_btsqxy
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_btsqxy`;
CREATE TABLE `txzdl_btsqxy`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'被调查人项目内编码',
        `xyzl` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'吸食烟草种类',
        `ksxynl` int(3) NULL DEFAULT NULL COMMENT&^&-----------------------------------------------------------'开始吸烟年龄（岁）',
        `jsxynl` int(3) NULL DEFAULT NULL COMMENT&^&-----------------------------------------------------------'结束吸烟年龄（岁）',
        `rxyl` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------'日吸烟量（支）',
        `xylzbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------------'吸烟滤嘴标志',
        `xysdlb` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'吸烟深度类别',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24840 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '吸烟史-不同时期吸烟情况' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_bxcj
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_bxcj`;
CREATE TABLE `txzdl_bxcj`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'被调查人项目内编码',
        `bxcjlb` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'步行场景类别',
        `bxts` int(2) NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'步行天数（d/周）',
        `rjbxsc` int(2) NULL DEFAULT NULL COMMENT&^&-----------------------------------------------------------'日平均步行时长（h/d）',
        `bxzsc` int(3) NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------'步行总计活动时长（h）',
        `bxcjmrsc` int(4) NULL DEFAULT NULL COMMENT&^&---------------------------------------------------------'步行场景每日时长（分钟）',
        `bxcjqt` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------'步行场景其他情况说明',
        `bxjxs` int(3) NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------'步行几小时',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14227 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '体力活动-步行场景情况' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_dcpj
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_dcpj`;
CREATE TABLE `txzdl_dcpj`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------------'被调查人项目内编码',
        `jsdcsj` datetime NULL DEFAULT NULL COMMENT&^&---------------------------------------------------------------'结束调查时间',
        `sfzyylb` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------'受访者语言类别',
        `dcybh` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------'调查员编号',
        `dcyqm` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------'调查员签名',
        `dcyqm_n` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'调查员签名日期何年',
        `dcyqm_y` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'调查员签名日期何月',
        `dcyqm_r` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'调查员签名日期何日',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 33 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '调查评价' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_grjbxx
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_grjbxx`;
CREATE TABLE `txzdl_grjbxx`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------'被调查人项目内编码',
        `xm` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------'姓名',
        `poxm` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'配偶姓名',
        `sfzh` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'身份证件号码',
        `dhhm_zj` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------'本人座机号码',
        `dhhm_sj` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------'本人手机号码',
        `xzdz_sh` varchar(70) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------'现住地址-省（自治区、直辖市）',
        `xzdz_s` varchar(70) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'现住地址-市（地区、州）',
        `xzdz_xa` varchar(70) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------'现住地址-县（区）',
        `xzdz_qt` varchar(70) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------'现住地址-乡（镇、街道办事处）',
        `xzdz_cu` varchar(70) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------'现住地址-村（街、路、弄等）',
        `hjdz_sh` varchar(70) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------'户籍地址-省（自治区、直辖市）',
        `hjdz_s` varchar(70) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'户籍地址-市（地区、州）',
        `hjdz_xa` varchar(70) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------'户籍地址-县（区）',
        `hjdz_x` varchar(70) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'户籍地址-乡（镇、街道办事处）',
        `hjdz_qt` varchar(70) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------'户籍地址-村（街、路、弄等）',
        `xb` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------------'性别',
        `csrq` date NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------'出生日期',
        `tbsnl` int(3) NULL DEFAULT NULL COMMENT&^&---------------------------------------------------------------'年龄（岁）',
        `mz` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------------'民族',
        `brjg_sh` varchar(70) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------'本人籍贯-省（自治区、直辖市）',
        `brjg_s` varchar(70) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'本人籍贯-市（地区、州）',
        `mqjg_sh` varchar(70) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------'母亲籍贯-省（自治区、直辖市）',
        `mqjg_s` varchar(70) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'母亲籍贯-市（地区、州）',,
        `hyzk` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------'婚姻状况',
        `sjycd` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'学历',
        `sssg20` double NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------------'20岁身高（cm）',
        `sstz20` double NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------------'20岁体重（kg）',
        `sstxt20` int(2) NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'20岁体型图',
        `nqsg10` double NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------------'10年前身高（cm）',
        `nqtz10` double NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------------'10年前体重（kg）',
        `nqtxt10` int(2) NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'10年前体型图',
        `delete_flag` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '删除标志',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 492 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '个人基本信息' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_gzqk
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_gzqk`;
CREATE TABLE `txzdl_gzqk`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------'被调查人项目内编码',
        `zylb` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------'职业类别',
        `ksgznl` int(3) NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------------'开始工作年龄（岁）',
        `jsgznl` int(3) NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------------'结束工作年龄（岁）',
        `ldqdlb` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'劳动强度类别',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16914 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '职业史-工作情况' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_jbs
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_jbs`;
CREATE TABLE `txzdl_jbs`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------'被调查人项目内编码',
        `jbmc` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------------'既往疾病诊断名称',
        `ccqznl` int(3) NULL DEFAULT NULL COMMENT&^&---------------------------------------------------------------'初次确诊年龄（岁）',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 126581 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '个人健康状况-疾病史' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_jkzk
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_jkzk`;
CREATE TABLE `txzdl_jkzk`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------------------------'被调查人项目内编码',
        `zwpjlb` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------------------'健康状况自我评价类别',
        `ytlrxblb` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------------'健康状况与同龄人相比情况类别',
        `pbpl` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------------------------'排便频率',
        `jsssbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------------------'接受手术标志',
        `ylbxlx` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------------------'医疗保险类型',
        `sfsyyw` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------------------'您现在是否使用某个药物',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3460 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '个人健康状况' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_jssmqx
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_jssmqx`;
CREATE TABLE `txzdl_jssmqx`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------------------'被调查人项目内编码',
        `shmycd` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------------'生活状况满意程度',
        `fjbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------'分居/离婚标志',
        `zdshbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------------'重大伤害/交通意外标志',
        `sybz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------'失业/退休标志',
        `pcbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------'破产标志',
        `poswbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------------'配偶死亡/重病标志',
        `fmswbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------------'父母死亡/重病标志',
        `znswbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------------'子女死亡/重病标志',
        `xdswbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------------'兄弟姐妹死亡/重病标志',
        `blbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------'暴力标志',
        `zdzrzhbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------------'重大自然灾害标志',
        `jtzdctbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------------'家庭重大冲突标志',
        `shjjbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------------'生活拮据标志',
        `rsknbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------------'入睡困难标志',
        `zxbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------'早醒后难以入睡标志',
        `fyamybz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------------------'服用安眠药标志',
        `btgzqxbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------------'白天难以保持清醒标志',
        `wxxglb` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------------'午休习惯类别',
        `dhlbz` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------------'打呼噜类别',
        `qtsmsc` int(2) NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------'全天睡眠时长（h）',
        `sxbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------'伤心/沮丧标志',
        `xqssbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------------'兴趣丧失标志',
        `syssbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------------'食欲丧失标志',
        `zwjzssbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------------'自我价值感丧失标志',
        `dxbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------'担心/紧张/焦虑标志',
        `stttbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------------'身体疼痛/不适标志',
        `kjbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------'恐惧/焦虑/不适伴躯体症状标志',
        `mbkjbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------------'密闭空间/人群/广场恐惧标志',
        `zdsjpl` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------------'重大事件无法控制频率',
        `zxclwtpl` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------'自信处理个人问题频率',
        `sqfzpl` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------------'事情按预期发展频率',
        `knwfkfpl` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------'困难无法克服频率',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3515 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '精神睡眠及情绪状况' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_jtjjdw
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_jtjjdw`;
CREATE TABLE `txzdl_jtjjdw`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------'被调查人项目内编码',
        `jssyqlb` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------------'居所所有权类别',
        `jssyqqtqk` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------'居所所有权其他情况',
        `jsjzmj` double NULL DEFAULT NULL COMMENT&^&---------------------------------------------------------------'居所居住面积（m2）',
        `gtshjtcyrks` int(3) NULL DEFAULT NULL COMMENT&^&----------------------------------------------------------'共同生活家庭成员人口数',
        `jthzxl` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------------'家庭户主学历',
        `xshyysbbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'小时候拥有手表标志',
        `xshyyfrjbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------------'小时候拥有缝纫机标志',
        `xshyyzxcbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------------'小时候拥有自行车标志',
        `jtnszrsm` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'家庭年收入说明',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2747 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '家庭和社会经济地位' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_jtjz
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_jtjz`;
CREATE TABLE `txzdl_jtjz`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------'被调查人项目内编码',
        `jsksjznl` int(3) NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------'居所开始居住年龄（岁）',
        `jsjsjznl` int(3) NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------'居所结束居住年龄（岁）',
        `jzdlx` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'居住地类型',
        `jzfwlx` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------------'居住房屋类型',
        `jzfwlxqtqk` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------'居住房屋类型其他情况',
        `zfbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------------'做饭标志',
        `zfpl` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------'做饭频率',
        `zfzzlb` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------------'做饭装置类别',
        `zfzzlbqtqk` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------'做饭装置类别其他情况',
        `qnzzlb` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------------'取暖装置类别',
        `qnzzlbqtqk` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------'取暖装置类别其他情况',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11554 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '家庭和社会经济地位-居住情况' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_jtsb
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_jtsb`;
CREATE TABLE `txzdl_jtsb`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------'被调查人项目内编码',
        `jywpzl` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------------'家用物品种类',
        `yyjywpbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'拥有家用物品标志',
        `yyjywpnx` int(3) NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------'拥有家用物品年限（年）',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 35487 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '家庭和社会经济地位-家庭使用设备情况' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_jzcj
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_jzcj`;
CREATE TABLE `txzdl_jzcj`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'被调查人项目内编码',
        `jzcjlb` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'静坐场景类别',
        `jzts` int(2) NULL DEFAULT NULL COMMENT&^&---------------------------------------------------------------'静坐天数（d/周）',
        `rjjzsc` int(2) NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'日平均静坐时长（h/d）',
        `jzzsc` int(3) NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------------'静坐总计时长（h）',
        `jzcjmrsc` int(4) NULL DEFAULT NULL COMMENT&^&-----------------------------------------------------------'静坐场景每日时长（分钟）',
        `jzcjqt` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'静坐场景其他情况说明',
        `jzjxs` int(3) NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------------'静坐几小时',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10750 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '体力活动-静坐场景活动' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_jzs
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_jzs`;
CREATE TABLE `txzdl_jzs`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------'被调查人项目内编码',
        `jtcyfl` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'家庭成员分类',
        `jtcyxb` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'家庭成员性别',
        `yjtcygx` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'与家庭成员的关系',
        `jtcynl` int(3) NULL DEFAULT NULL COMMENT&^&---------------------------------------------------------------'家庭成员年龄(岁）',
        `jtcyswnl` int(3) NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'家庭成员死亡年龄（岁）',
        `jtcyjbzl` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'家庭成员疾病种类',
        `jtcyjbmc` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------'家庭成员其他疾病诊断名称',
        `jtcyjbmc2` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------'家庭成员其他疾病诊断名称2',
        `jtcyqsbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------'家庭成员去世标志',
        `jtcyqssj` datetime NULL DEFAULT NULL COMMENT&^&-----------------------------------------------------------'家庭成员去世时间',
        `jtcyqsyy` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'家庭成员去世原因描述',
        `jzcydjzph` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'家族成员的家族排行',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 40842 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '家族史' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_kglxqsxx
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_kglxqsxx`;
CREATE TABLE `txzdl_kglxqsxx`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `kglxdqsxm` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------------'被调查人项目内编码',
        `kglxqsdgx` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------'可供联系的亲属姓名',
        `kgqsddhhm_zj` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'可供联系亲属的关系',
        `kgqsddhhm_sj` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'可供联系亲属的电话号码-座机',
        `kgqsddz_sh` varchar(70) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'可供联系亲属的电话号码-手机',
        `kgqsddz_s` varchar(70) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------------'可供联系亲属的地址-省',
        `kgqsddz_xa` varchar(70) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'可供联系亲属的地址-市',
        `kgqsddz_xi` varchar(70) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'可供联系亲属的地址-县',
        `kgqsddz_qt` varchar(70) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'可供联系亲属的地址-乡',
        `delete_flag` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '删除标志',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_kqwsqk
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_kqwsqk`;
CREATE TABLE `txzdl_kqwsqk`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'被调查人项目内编码',
        `yctlbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------'20岁后牙齿脱落标志',
        `yctlnl` int(3) NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'第一颗牙齿脱落年龄（岁）',
        `yctlsl` int(3) NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'牙齿脱落数量',
        `azycbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------'安装/佩戴义齿标志',
        `seycsl` int(3) NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'上颌固定义齿数量',
        `seycwz` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'上颌固定义齿位置说明',
        `xeycsl` int(3) NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'下颌固定义齿数量',
        `xeycwz` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'下颌固定义齿位置说明',
        `yywsbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------'牙龈萎缩标志',
        `sezcyc` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'上颌可摘除义齿',
        `xezcyc` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'下颌可摘除义齿',
        `sepdyc` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------'上颌经常佩戴义齿标志',
        `xepdyc` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------'下颌经常佩戴义齿标志',
        `sepdycnl` int(3) NULL DEFAULT NULL COMMENT&^&-----------------------------------------------------------'上颌佩戴义齿年龄（岁）',
        `xepdycnl` int(3) NULL DEFAULT NULL COMMENT&^&-----------------------------------------------------------'下颌佩戴义齿年龄（岁）',
        `seqcsl` int(3) NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'上颌龋齿数量',
        `seqctbsl` int(3) NULL DEFAULT NULL COMMENT&^&-----------------------------------------------------------'上颌龋齿填补数量',
        `seqctbwz` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'上颌龋齿填补位置说明',
        `xeqcsl` int(3) NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'下颌龋齿数量',
        `xeqctbsl` int(3) NULL DEFAULT NULL COMMENT&^&-----------------------------------------------------------'下颌龋齿填补数量',
        `xeqcybwz` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------'下颌龋齿填补位置说明',
        `sypl` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'每日刷牙频率',
        `syplqtsm` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------'每日刷牙频率其他情况说明',
        `yycxpl` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'牙龈出血频率',
        `ytbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------------'牙疼标志',
        `ycbspl` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'牙齿不适频率',
        `bmsysw` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'牙齿避免食用食物种类',
        `sfcjcyb` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'是否采集齿样本',
        `tlycjtsm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------'脱落牙齿具体说明',
        `spzddskyc` int(3) NULL DEFAULT NULL COMMENT&^&----------------------------------------------------------'上排左掉了多少颗牙齿',
        `spyddskyc` int(3) NULL DEFAULT NULL COMMENT&^&----------------------------------------------------------'上排右掉了多少颗牙齿',
        `xpzddskyc` int(3) NULL DEFAULT NULL COMMENT&^&----------------------------------------------------------'下排左掉了多少颗牙齿',
        `xpyddskyc` int(3) NULL DEFAULT NULL COMMENT&^&----------------------------------------------------------'下排右掉了多少颗牙齿',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1158 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '口腔卫生情况' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_ssqk
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_ssqk`;
CREATE TABLE `txzdl_ssqk`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------'被调查人项目内编码',
        `jsssnl` int(3) NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------------'接受手术年龄（岁）',
        `sslx` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'手术/操作名称',
        `jssssj` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'接受手术的时间',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2192 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '个人健康状况-手术情况' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_sys
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_sys`;
CREATE TABLE `txzdl_sys`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'"被调查人项目内编码',
        `yjjs` int(3) NULL DEFAULT NULL COMMENT&^&---------------------------------------------------------------'"',
        `yjsfgl` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------'初潮年龄（岁）',
        `yjjg_zdts` int(3) NULL DEFAULT NULL COMMENT&^&----------------------------------------------------------'月经规律标志',
        `yjjg_zcts` int(3) NULL DEFAULT NULL COMMENT&^&----------------------------------------------------------'最短月经周期（d）',
        `yjcx_zdts` int(3) NULL DEFAULT NULL COMMENT&^&----------------------------------------------------------'最长月经周期（d）',
        `yjcx_zcts` int(3) NULL DEFAULT NULL COMMENT&^&----------------------------------------------------------'最短月经持续时间（d）',
        `sfchy` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------'最长月经持续时间（d）',
        `hyjc` int(2) NULL DEFAULT NULL COMMENT&^&---------------------------------------------------------------'怀孕标志',
        `dychynl` int(2) NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------'孕次（次）',
        `dychyjg` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------'初次怀孕年龄（岁）',
        `dychyjg_qt` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------'初次怀孕结果',
        `fmgjc` int(2) NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------------'初次怀孕结果其他情况说明',
        `sfjj` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------------'分娩次数（次）',
        `jjnl` int(2) NULL DEFAULT NULL COMMENT&^&---------------------------------------------------------------'绝经标志',
        `jjfs` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'绝经年龄（岁）',
        `jjqtfs` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------'绝经方式',
        `sfcby` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------'其他绝经方式说明',
        `byfs` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'避孕措施标志',
        `sfbyy` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------'避孕方式',
        `tybyymn` int(4) NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------'服用避孕药标志',
        `ksbyynl` int(2) NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------'停服避孕药年份',
        `byynx` int(2) NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------------'首次服用避孕药年龄（岁）',
        `byfsqtqks` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------'服用避孕药累积年限',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2792 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '生育史' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_tgjc
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_tgjc`;
CREATE TABLE `txzdl_tgjc`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'被调查人项目内编码',
        `fyjyybz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'服用降压药标志',
        `syjtywbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------'使用降糖药物标志',
        `mcjsjgsc` double NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------'末次进食间隔时长（h）',
        `yw` double NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'腰围(cm）',
        `tw` double NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'臀围（cm）',
        `tzl` double NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------'体脂率（%）',
        `tzllb` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------'体脂率类别',
        `nzzfl` double NULL DEFAULT NULL COMMENT&^&----------------------------------------------------------'内脏脂肪率（%）',
        `nzzfllb` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------'内脏脂肪率类别',
        `cjnybz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------'采集尿液标志',
        `ntjglb` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------'尿糖结果类别',
        `ndblb` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------'尿蛋白类别',
        `xtjcz` double NULL DEFAULT NULL COMMENT&^&----------------------------------------------------------'血糖检测值（mmol/L）',
        `sg` double NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'身高（cm）',
        `tz` double NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'体重（kg）',
        `txt` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------'体型图',
        `dycmy` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------'第一次脉压',
        `dycxl` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------'第一次心率',
        `dyczd` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------'第一次诊断',
        `dycxyclssz` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----'第一次血压测量收缩值',
        `dycxyclszz` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----'第一次血压测量舒张值',
        `dycpjxy` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------'第一次平均血压',
        `decmy` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------'第二次脉压',
        `decxl` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------'第二次心率',
        `deczd` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------'第二次诊断',
        `decxyclssz` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----'第二次血压测量收缩值',
        `decxyclszz` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----'第二次血压测量舒张值',
        `decpjxy` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------'第二次平均血压',
        `ckbztz` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------'参考标准体重',
        `bmi` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'BMI',
        `fpl` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'肥胖率',
        `fpzs` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------'肥胖指数',
        `cscopd` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------'测试COPD',
        `fhl` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'肺活量',
        `fhl2` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------'肺活量2',
        `fhlbfb` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------'肺活量百分比',
        `ylfhl` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------'用力肺活量',
        `mfztql` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------'每分钟通气量',
        `ylfhlbfb` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------'用力肺活量百分比',
        `mfzzdtql` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------'每分钟最大通气量',
        `sfcjtyyb` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------'是否采集唾液样本',
        `lrrq` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------'录入日期',
        `dcdxswybsjrq` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---'调查对象生物样本送检日期',
        `dcdxjcbgcjrq` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---'调查对象检测报告出具日期',
        `gbzam` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------'谷丙转氨酶',
        `zjdhs` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------'直接胆红素',
        `jg` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------'肌酐',
        `nsd` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'尿素氮',
        `ns` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------'尿酸',
        `ptt` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'葡萄糖',
        `zdgc` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------'总胆固醇',
        `gysz` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------'甘油三酯',
        `gmdzdb` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------'高密度脂蛋白',
        `dmdzdb` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------'低密度脂蛋白',
        `zdhs` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------'总胆红素',
        `gysc` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------'胱抑素C',
        `shjcbz` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------'生化检测备注',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '体格检查' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_tlhd
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_tlhd`;
CREATE TABLE `txzdl_tlhd`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------'被调查人项目内编码',
        `sfztlhd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------'重体力活动标志',
        `sfzhtlhd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'中体力活动标志',
        `sfbx` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'步行标志',
        `jtztlhd` int(2) NULL DEFAULT NULL COMMENT&^&---------------------------------------------------------'过去7天中，您有几天进行重体力活动',
        `ztlhd_s` int(3) NULL DEFAULT NULL COMMENT&^&---------------------------------------------------------'在这几天中，您每天进行这些重体力活动的具体时间平均为每天几小时',
        `ztlhd_f` int(4) NULL DEFAULT NULL COMMENT&^&---------------------------------------------------------'在这几天中，您每天进行这些重体力活动的具体时间平均为每天几分钟',
        `jtzhtlhd` int(3) NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------'过去7天中，您有几天进行中等强度活动',
        `zhtlhd_s` int(3) NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------'在这几天中，您每天进行这些中等强度体力活动的具体时间平均为每天几小时',
        `zhtlhd_f` int(4) NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------'在这几天中，您每天进行这些中等强度体力活动的具体时间平均为每天几分钟',
        `jtbx` int(2) NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------'过去7天中，您有几天步行（每次至少10分钟路）',
        `bx_s` int(2) NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------'在这几天中，您每天步行的具体时间为每天几小时',
        `bx_f` int(4) NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------'在这几天中，您每天步行的具体时间为每天几分钟',
        `jz_isnot` int(4) NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------'在过去7天中您是否静坐',
        `jz_s` int(2) NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------'在这几天中，您每天处于静坐的具体时间为每天几小时',
        `jz_f` int(4) NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------'在这几天中，您每天处于静坐的具体时间为每天几分钟',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2549 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '体力活动' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_wjpj
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_wjpj`;
CREATE TABLE `txzdl_wjpj`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------'被调查人项目内编码',
        `wjkkbz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------'问卷可靠标志',
        `wjbkkyy` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'问卷不可靠原因类别',
        `wjbkkyysm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------'问卷不可靠其他原因说明',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 45569 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '调查评价-问卷评价' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_xys
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_xys`;
CREATE TABLE `txzdl_xys`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------------'被调查人项目内编码',
        `njtcgym` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------------'当天吸烟标志',
        `ncjcgym` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'吸烟状况',
        `yjydsn` int(3) NULL DEFAULT NULL COMMENT&^&----------------------------------------------------------------'戒烟年限（年）',
        `jydyy` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------'戒烟原因',
        `jydqtyy` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'其他戒烟原因说明',
        `xshjlsfyrcy` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------------'小时家中接触二手烟标志',
        `xshmtblsc` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'小时家中每天接触二手烟时长',
        `xshbldnx` int(3) NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------------'小时家中接触二手烟年限（年）',
        `cnhjlsfyrcy` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------------'成年家中接触二手烟标志',
        `cnhmtblsj` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'成年家中每天接触二手烟时长',
        `cnhbldnx` int(3) NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------------'成年家中接触二手烟年限（年）',
        `gzcssfyrcy` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'成年工作场所接触二手烟标志',
        `gzcsmtblsj` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------'成年工作场所中每天接触二手烟时长',
        `gzcsbldnx` int(3) NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'成年工作场所接触二手烟年限（年）',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3300 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '吸烟史' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_ycqk
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_ycqk`;
CREATE TABLE `txzdl_ycqk`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'被调查人项目内编码',
        `yczl` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'饮茶种类',
        `ksycnl` int(3) NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'开始饮茶年龄（岁）',
        `jsycnl` int(3) NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'结束饮茶年龄（岁）',
        `zycpl` int(2) NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------------'每周饮茶频率（d/周）',
        `ycwd` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'饮茶温度',
        `ycnd` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'饮茶浓度',
        `yccyl` int(3) NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------------'饮茶茶叶量（g）',
        `ycbz` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'饮茶杯子',
        `mtycl` int(3) NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------------'每天饮茶量_几杯',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 35419 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '饮酒史和饮茶史-不同时期的饮茶情况' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_yjqk
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_yjqk`;
CREATE TABLE `txzdl_yjqk`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'被调查人项目内编号',
        `yjzl` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'饮酒种类',
        `ksyjnl` int(3) NULL DEFAULT NULL COMMENT&^&---------------------------------------------------------'开始饮酒年龄（岁）',
        `yjjsnl` int(3) NULL DEFAULT NULL COMMENT&^&---------------------------------------------------------'饮酒结束年龄（岁）',
        `ryjl` int(4) NULL DEFAULT NULL COMMENT&^&-----------------------------------------------------------'日饮酒量（g或ml）',
        `zyjpl` int(3) NULL DEFAULT NULL COMMENT&^&----------------------------------------------------------'每周饮酒频率（d/周）',
        `yyjpl` int(3) NULL DEFAULT NULL COMMENT&^&----------------------------------------------------------'每月饮酒频率（d/月）',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 38697 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '饮酒史和饮茶史-不同时期饮酒情况' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_yjyc
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_yjyc`;
CREATE TABLE `txzdl_yjyc`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'被调查人项目内编码',
        `sfcyyj` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'饮酒习惯分类',
        `ytsmshhj` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'饮酒场景',
        `sfzshj` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'早晨饮酒情况',
        `sfcqyjyx` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------------'长期饮酒影响正常生活或工作标志',
        `sfyjhsw` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'饮酒后情绪控制标志',
        `sfwfjj` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------'无法戒酒标志',
        `sfbyjzc` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'不饮酒后震颤标志',
        `sfcxlh` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'饮酒反应类别',
        `sfycxg` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'饮茶习惯',
        `ythjccy` int(2) NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------'每日换茶叶频率（次/d）',
        `sfgyc` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------'饮隔夜茶标志',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3548 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '饮酒史和饮茶史' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_yspl
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_yspl`;
CREATE TABLE `txzdl_yspl`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'被调查人项目内编码',
        `yszl` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'饮食种类',
        `swsybz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------'食物食用标志',
        `yspln` int(3) NULL DEFAULT NULL COMMENT&^&----------------------------------------------------------'饮食频率（次/年）',
        `ysply` int(3) NULL DEFAULT NULL COMMENT&^&----------------------------------------------------------'饮食频率（次/月）',
        `ysplz` int(3) NULL DEFAULT NULL COMMENT&^&----------------------------------------------------------'饮食频率（次/周）',
        `ysplt` int(3) NULL DEFAULT NULL COMMENT&^&----------------------------------------------------------'饮食频率（次/d）',
        `mcsylg` int(3) NULL DEFAULT NULL COMMENT&^&---------------------------------------------------------'每次食用量（g）',
        `mcsylge` int(3) NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------'每次食用量（个）',
        `mcsylml` int(3) NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------'每次食用量（ml）',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 50312 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '饮食史-过去一年饮食频率' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_yss
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_yss`;
CREATE TABLE `txzdl_yss`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------'被调查人项目内编码',
        `sfygy` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------------'鱼肝油/鱼油服用标志',
        `sfwss` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------------'维生素服用标志',
        `sfgtx` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------------'钙/铁/锌服用标志',
        `sfrs` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------------'人参服用标志',
        `sfbjp` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------------'其他保健饮品服用标志',
        `bjps` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------------'其他保健饮品说明',
        `sfswdq` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------'食物短缺标志',
        `swdq_qsnf` int(4) NULL DEFAULT NULL COMMENT&^&-----------------------------------------------------------'食物短缺起始年份',
        `swdq_zznf` int(4) NULL DEFAULT NULL COMMENT&^&-----------------------------------------------------------'食物短缺结束年份',
        `sftzxj` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------'体重下降标志',
        `tzxjds` int(2) NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------------'体重下降数量（kg）',
        `sffzpx` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------'浮肿/贫血标志',
        `dcsjcls` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'食用辣食频率分类',
        `jslsxg` int(2) NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------------'辣食习惯开始年龄（岁）',
        `lssws` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'辣度类别',
        `syyzl` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'食用油种类',
        `syyansl` int(3) NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'食用食盐数量（g/月）',
        `ylwyl` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&----------------'在吃辣食时，通常用哪一些辣物原料',
        `lwyls` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'其他辣物原料说明',
        `syyqtlbs` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------'食用油其他类别说明',
        `syysl` int(4) NULL DEFAULT NULL COMMENT&^&---------------------------------------------------------------'食用油数量（g/月）',
        `jzyqjcrs` int(3) NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------'家中一起进餐人数',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1820 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '饮食史' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_yws
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_yws`;
CREATE TABLE `txzdl_yws`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------'被调查人项目内编码',
        `ywsybz` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------'药物使用标志',
        `ywzl` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------'药物种类',
        `ywnc` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------------'药物名称',
        `ywsynx` int(3) NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------------'药物使用年限（年）',
        `ywsypl` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&---------------'药物使用频率',
        `ywzlqt` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------'药物种类其他情况说明',
        `ywsysl` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'药物使用剂量',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 34065 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '个人健康状况-药物史' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_zhtlhd
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_zhtlhd`;
CREATE TABLE `txzdl_zhtlhd`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------'被调查人项目内编码',
        `zhtlhdzl` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-------------'中体力活动种类',
        `zhtlhdts` int(2) NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------'中体力活动天数（d/周）',
        `rjzhtlsc` int(2) NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------'日平均中体力活动时长（h/d）',
        `zhtlzsc` int(3) NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'中体力总计活动时长（h）',
        `zhtlmrsc` int(4) NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------'中体力活动每日时长（分钟）',
        `zhtlhdqt` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------'中体力活动其他情况说明',
        `zhtlhdxs` int(3) NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------'中体力活动几小时',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 52949 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '体力活动-中体力活动情况' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_ztlhd
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_ztlhd`;
CREATE TABLE `txzdl_ztlhd`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&-----------------'被调查人项目内编码',
        `ztlhdzl` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&--------------'重体力活动种类',
        `ztlhdts` int(2) NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'重体力活动天数（d/周）',
        `rjztlsc` int(2) NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'日平均重体力活动时长（h/d）',
        `ztlzsc` int(3) NULL DEFAULT NULL COMMENT&^&--------------------------------------------------------------'重体力活动总计时长（h）',
        `ztlmrsc` int(4) NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'重体力活动每日时长（分钟）',
        `ztlhdqt` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------'重体力活动其他情况说明',
        `ztlhdxs` int(3) NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'重体力活动几小时',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 39051 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '体力活动-重体力活动情况' ROW_FORMAT = COMPACT;

-- ----------------------------
-- Table structure for txzdl_zys
-- ----------------------------
DROP TABLE IF EXISTS `txzdl_zys`;
CREATE TABLE `txzdl_zys`  (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT&^&------------------------------------------------------------------ '自增id',
        `bm` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------'被调查人项目内编码',
        `jsksqzgz` int(3) NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'开始全职工作年龄（岁）',
        `jsjsqzgz` int(3) NULL DEFAULT NULL COMMENT&^&-------------------------------------------------------------'结束全职工作年龄（岁）',
        `zfzy` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------'配偶职业类别',
        `create_date` datetime NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建时间',
        `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT&^&------------------------------------------------------------------ '创建人',
        PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1646 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT&^&------------------------------------------------------------------ = '职业史' ROW_FORMAT = COMPACT;

SET FOREIGN_KEY_CHECKS = 1;
