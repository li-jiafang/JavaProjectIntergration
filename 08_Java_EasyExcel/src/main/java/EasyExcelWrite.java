import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author: ljf
 * @create: 2021-03-18 15:25
 * @description:
 **/
public class EasyExcelWrite {

    @Test
    public void noModelWrite() {
        // 写法1
        String fileName = this.getClass().getResource("/").getPath() + "noModelWrite" + System.currentTimeMillis() + ".xlsx";
        System.out.println(fileName);
        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        //EasyExcel.write(fileName).head(head()).sheet("模板").doWrite(dataList());

        ExcelWriter excelWriter = EasyExcel.write(fileName).build();
        // 写入多个sheet
        for (int i = 1; i < 10; i++) {
            WriteSheet writeSheet = EasyExcel.writerSheet(i, "第" + i + "个sheet").head(head()).build();
            excelWriter.write(dataList(),writeSheet);

        }
        excelWriter.finish();

    }

    private List<List<String>> head() {
        List<List<String>> list = new ArrayList<List<String>>();
        List<String> head0 = new ArrayList<String>();
        head0.add("字符串" + System.currentTimeMillis());
        List<String> head1 = new ArrayList<String>();
        head1.add("数字" + System.currentTimeMillis());
        List<String> head2 = new ArrayList<String>();
        head2.add("日期" + System.currentTimeMillis());
        list.add(head0);
        list.add(head1);
        list.add(head2);
        return list;
    }

    private List<List<Object>> dataList() {
        List<List<Object>> list = new ArrayList<List<Object>>();
        for (int i = 0; i < 10; i++) {
            List<Object> data = new ArrayList<Object>();
            data.add("字符串" + i);
            data.add(new Date());
            data.add(0.56);
            list.add(data);
        }
        return list;
    }
}
