import com.alibaba.excel.EasyExcel;

/**
 * @author: ljf
 * @create: 2021-03-27 19:14
 * @description:
 **/
public class ExcelReadAndWrite {


    public static void main(String[] args) {


        String fileName = "C:\\Users\\86137\\Desktop\\泰兴子队列\\第二版\\0076_泰兴子队列上传数据模板确认.xlsx";
        // 这里 只要，然后读取第一个sheet 同步读取会自动finish
        EasyExcel.read(fileName, new NoModelDataListener()).sheet().doRead();


    }
}
