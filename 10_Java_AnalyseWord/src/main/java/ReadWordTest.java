import org.apache.poi.hwpf.HWPFDocument;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: ljf
 * @create: 2021-03-24 09:51
 * @description:
 **/
public class ReadWordTest {


    public static void main(String[] args) {


        String path = "C:\\Users\\86137\\Desktop\\前列腺癌根治资料2021-02-20.doc";

        try(InputStream inputStream = new FileInputStream(path)){

            HWPFDocument doc = new HWPFDocument(inputStream);
            String documentText = doc.getDocumentText();
            System.out.println(documentText);
            // 对文本做处理
            handleWordText(documentText);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * 先以行数据截取
     * @param documentText
     */
    private static void handleWordText(String documentText) {

        String[] strArr = documentText.split("\r");

        for (int i = 0; i < strArr.length; i++) {

            System.out.println(strArr[i]);
            // 截取字符通过正则
            interceptStr(strArr[i]);
        }
        
        


    }

    private static void interceptStr(String s) {
        Map<String,String> map = new HashMap<>();
        if (s.contains("手术日期") && s.contains("患者姓名") && s.contains("")){

        }

    }


    /**
     * 正则匹配两个字符串中间的内容
     *
     * 匹配两个字符串A与B中间的字符串包含A与B:  表达式: A.*?B
     *
     * 匹配两个字符串A与B中间的字符串包含A但是不包含B： 表达式: A.*?(?=B)
     *
     * 匹配两个字符串A与B中间的字符串且不包含A与B：表达式: (?<=A).*?(?=B)
     * @param regular
     * @return
     */
    private static String interceptStrByRegular(String regular){
        Pattern pattern = Pattern.compile(" (?<=A).*?(?=B)");
        Matcher matcher = pattern.matcher("");
        return null;
    }




}
