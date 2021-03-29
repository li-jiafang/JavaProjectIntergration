import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author: ljf
 * @create: 2021-03-27 19:27
 * @description:
 **/
public class NoModelDataListener extends AnalysisEventListener<Map<Integer, String>> {
    //private static final Logger LOGGER = LoggerFactory.getLogger(NoModelDataListener.class);
    /**
     * 每隔5条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 5;
    List<Map<Integer, String>> list = new ArrayList<Map<Integer, String>>();

    @Override
    public void invoke(Map<Integer, String> data, AnalysisContext context) {

        list.add(data);
        if (list.size() >= BATCH_COUNT) {
            saveData();
            list.clear();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        saveData();

    }

    /**
     * 加上存储数据库
     */
    private void saveData() {

    }


}