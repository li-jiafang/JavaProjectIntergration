package com.ljf.tools;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: ljf
 * @create: 2021-03-25 14:37
 * @description:
 **/

// 演示例子，执行 main 方法控制台输入模块表名回车自动生成对应项目目录中
public class CodeGenerator {


    private static String projectPath = "D:\\Java\\Ljf\\JavaProjectIntergration\\73_Spring_Mybatis_Validator";
    private static String author = "ljf";

    private static String moduleName = "project";
    private static String parentPackage = "com.ljf";

    private static String url = "jdbc:mysql://10.1.65.12:3306/HUADONG_QUEUE?useUnicode=true&useSSL=false&characterEncoding=utf8";
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String userName = "root";
    private static String passWord = "root";


    public static void main(String[] args) {

        // 代码生成工具类
        AutoGenerator generator = new AutoGenerator();


        // 全局配置
        GlobalConfig gc = buildGlobalConfig();
        generator.setGlobalConfig(gc);


        // 数据源配置
        DataSourceConfig dsc = buildDataSourceConfig();
        generator.setDataSource(dsc);


        // 包配置
        PackageConfig pc = buildPackageConfig();
        generator.setPackageInfo(pc);


        // 自对应配置
        InjectionConfig cfg = buildInjectionConfig();
        generator.setCfg(cfg);

        // 配置模板
        TemplateConfig templateConfig = buildTemplateConfig();

        generator.setTemplate(templateConfig);

        // 策略配置
        StrategyConfig strategy = buildStrategyConfig(pc);
        generator.setStrategy(strategy);

        generator.setTemplateEngine(new FreemarkerTemplateEngine());
        generator.execute();

    }

    private static TemplateConfig buildTemplateConfig() {
        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();

        // 配置自定义输出模板
        //指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
        templateConfig.setEntity("templates/entity2.java");
        // templateConfig.setService();
        // templateConfig.setController();

        templateConfig.setXml(null);
        return templateConfig;
    }

    private static StrategyConfig buildStrategyConfig(PackageConfig pc) {
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        //strategy.setSuperEntityClass("你自己的父类实体,没有就不用设置!");
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        // 公共父类
        //strategy.setSuperControllerClass("你自己的父类控制器,没有就不用设置!");
        // 写于父类中的公共字段
        // strategy.setSuperEntityColumns("id"); // 会导致id无法被生成
        strategy.setInclude(scanner("表名，多个英文逗号分割").split(","));
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setTablePrefix(pc.getModuleName() + "_");
        return strategy;
    }

    private static InjectionConfig buildInjectionConfig() {
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        // 如果模板引擎是 freemarker
        String templatePath = "/templates/mapper.xml.ftl";
        // 如果模板引擎是 velocity
        // String templatePath = "/templates/mapper.xml.vm";

        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                System.out.println(tableInfo);
                return projectPath + "/src/main/resources/mapper/"
                        + "/" + tableInfo.getMapperName()  + StringPool.DOT_XML;
            }
        });
        /*
        cfg.setFileCreate(new IFileCreate() {
            @Override
            public boolean isCreate(ConfigBuilder configBuilder, FileType fileType, String filePath) {
                // 判断自定义文件夹是否需要创建
                checkDir("调用默认方法创建的目录，自定义目录用");
                if (fileType == FileType.MAPPER) {
                    // 已经生成 mapper 文件判断存在，不想重新生成返回 false
                    return !new File(filePath).exists();
                }
                // 允许生成模板文件
                return true;
            }
        });
        */
        cfg.setFileOutConfigList(focList);
        return cfg;
    }

    private static PackageConfig buildPackageConfig() {
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(moduleName);
        pc.setParent(parentPackage);
        pc.setController("controller");
        pc.setEntity("domain");
        pc.setService("service");
        pc.setMapper("dao");
        return pc;
    }

    private static DataSourceConfig buildDataSourceConfig() {
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl(url);
        // dsc.setSchemaName("public");
        dsc.setDriverName(driverName);
        dsc.setUsername(userName);
        dsc.setPassword(passWord);
        return dsc;
    }

    private static GlobalConfig buildGlobalConfig() {
        GlobalConfig gc = new GlobalConfig();
        // String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "\\src\\main\\java");
        gc.setAuthor(author);
        gc.setOpen(false);
        // gc.setEnableCache(true); // 二级缓存暂时关闭,项目中没有配置Ehcache,开启需要配置

        // 设置名字
        gc.setControllerName("%sController");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setMapperName("%sDao");
        gc.setEntityName("%sPO");
        gc.setXmlName("%sDao");
        gc.setIdType(IdType.AUTO);

        // 设置 resultMap
        gc.setBaseResultMap(true);
        gc.setBaseColumnList(true);

        // gc.setSwagger2(true); 实体属性 Swagger2 注解

        return gc;
    }


    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotBlank(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

}
