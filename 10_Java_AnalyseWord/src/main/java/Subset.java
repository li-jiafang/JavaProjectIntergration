import lombok.Data;

/**
 * @author: ljf
 * @create: 2021-03-24 16:36
 * @description:
 **/
@Data
public class Subset {
    private String dateStr;   // 检查时间
    private String faculty;   // 院系
    private String project;   // 检查项目
    private String result;    // 检查结果
}
