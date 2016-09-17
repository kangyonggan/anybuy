package com.anybuy.util.generator;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * @author kangyonggan
 * @since 16/5/9
 */
public class GeneratorServiceUtil {

    private Configuration cfg;
    private static final String PACKAGE_NAME = "com.anybuy";
    private static final String PATH_SETVICE = "src/main/java/com/anybuy/";


    /**
     * 模板文件默认在 resources/generator
     *
     * @throws Exception
     */
    public void init() throws Exception {
        cfg = new Configuration();
        cfg.setClassForTemplateLoading(this.getClass(), "/generator");
    }

    /**
     * 模块名称，首字母小写
     *
     * @param domain 对象名称
     * @throws Exception
     */
    public void process(String domain) throws Exception {

        Map<String, Object> root = new HashMap();

        root.put("package", PACKAGE_NAME);
        root.put("lower_domain", domain);
//        domain = StringUtil.capitalize(domain);
        domain = StringUtils.capitalize(domain);
        root.put("domain", domain);


        StringBuffer fileName = new StringBuffer();
        fileName.append(PATH_SETVICE).append("service").append("/").append(domain).append("Service.java");
        Template template = cfg.getTemplate("Service.java.ftl");
        buildTemplate(root, fileName.toString(), template);
        log("service fileName is %s", fileName.toString());

        fileName = new StringBuffer();
        fileName.append(PATH_SETVICE).append("service").append("/").append("impl").append("/").append(domain).append("ServiceImpl.java");
        template = cfg.getTemplate("ServiceImpl.java.ftl");
        buildTemplate(root, fileName.toString(), template);

        log("service impl fileName is %s", fileName.toString());

        log("generator code success!!!");

    }

    private void buildTemplate(Map root, String fileName, Template template) throws Exception {
        Writer out = new OutputStreamWriter(new FileOutputStream(new File(fileName).getAbsolutePath()), "UTF-8");
        template.process(root, out);
    }

    private static void log(String msg, String... val) {
        System.out.println("================= " + String.format(msg, val));
    }

//    public static void main(String[] args) throws Exception {
//        List<String> domainNames = Arrays.asList("user", "userInfo", "bank", "cardHistory", "address");
//
//        GeneratorServiceUtil generator = new GeneratorServiceUtil();
//        generator.init();
//
//        for(String domain : domainNames) {
//            generator.process(domain);
//        }
//
//        log("build template success.");
//    }

}
