import org.apache.poi.hwpf.HWPFDocument;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: ljf
 * @create: 2021-03-24 09:51
 * @description:
 * 多个患者一个list
 * 患者项目每个指标是一个list
 * List
 * List<>
 * 一个页面是
 **/
public class ReadWordTest {

    private static boolean flag = true;

    private static int flagNum = 0; // 0表示可以一直执行  2 表示将元素添加到list集合返回

    public static void main(String[] args) {
        String documentText = "";
        String path = "C:\\Users\\86137\\Desktop\\前列腺癌根治资料2021-02-20.doc";
        try(InputStream inputStream = new FileInputStream(path)){
            HWPFDocument doc = new HWPFDocument(inputStream);
            documentText = doc.getDocumentText();
            // 对文本做处理
            //handleWordText(documentText);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ReadWordTest readWordTest = new ReadWordTest();
        // 存储每页患者list集合
        List<List<String>> lists = readWordTest.getEveryPageText(documentText);

        for (List<String> list : lists) {

        }



    }

    /**
     * 获取每页word文本
     * @param documentText
     * @return
     */
    private List<List<String>> getEveryPageText(String documentText) {
        List<List<String>> listAll = new ArrayList<>();
        List<String> list = new ArrayList<>();

        String[] strArr = documentText.split("\r");
        for (int i = 0; i < strArr.length; i++) {
            String s = strArr[i];
            if (!"".equals(s)){
                list.add(s);
            }
            if (s.contains("术者") && s.contains("I助")){
                listAll.add(list);
                list = new ArrayList<>();
            }
        }
        return listAll;
    }


    /**
     * 先以行数据截取
     * @param documentText
     */
    private static void handleWordText(String documentText) {
        interceptStrByRegular("手术日期","手术日期",documentText);
        
//        boolean flag = true;
//        for (int i = 0; i < strArr.length; i++) {
//            //if (strArr)
//
//            if (flag){
//                interceptStr(strArr[i]);
//            }
//            System.out.println(strArr[i]);
//            // 截取字符通过正则
//
//        }
        
        


    }

    private static void interceptStr(String s) {
        Map<String,String> map = new HashMap<>();
        if (s.contains("手术日期") && s.contains("患者姓名") && s.contains("年龄") && s.contains("岁")){
            map.put("手术日期",interceptStrByRegular("手术日期","患者姓名",s));
            map.put("患者姓名",interceptStrByRegular("患者姓名","年龄",s));
            map.put("年龄",interceptStrByRegular("年龄","岁",s));
        }else if (s.contains("主诉")){
            String replace = s.replace("主诉", "").replace("1.", "");
            map.put("主诉",strReplace(replace));
        }else if (s.contains("诊断")){
            String replace = s.replace("诊断", "").replace("2.", "");
            map.put("诊断",strReplace(replace));
        }else if (s.contains("手术")){
            String replace = s.replace("手术", "").replace("3.", "");
            map.put("手术",strReplace(replace));
        }else if (s.contains("既往史")){
            String replace = s.replace("既往史", "").replace("5.", "");
            map.put("既往史",strReplace(replace));
        }

        System.out.println(map);

    }


    /**
     * 正则匹配两个字符串中间的内容
     *
     * 匹配两个字符串A与B中间的字符串包含A与B:  表达式: A.*?B
     *
     * 匹配两个字符串A与B中间的字符串包含A但是不包含B： 表达式: A.*?(?=B)
     *
     * 匹配两个字符串A与B中间的字符串且不包含A与B：表达式: (?<=A).*?(?=B)
     * @param begin
     * @param end
     * @return
     */
    private static String interceptStrByRegular(String begin,String end,String str){
        Pattern pattern = Pattern.compile("(?<="+begin+").*?(?="+end+")");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()){
            return matcher.group();
        }else{
            return "";
        }
    }


    /**
     * 将字符串中多余的字符替换为空
     * @param str
     * @return
     */
    private static String strReplace(String str){
        if (str != null){
            str =  str.replace("，","").replace("：","").replace(":","")
                    .replace(",","").replace(" ","");
        }
        return str;
    }




}
