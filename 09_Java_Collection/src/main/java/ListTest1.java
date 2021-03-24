import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: ljf
 * @create: 2021-03-24 15:59
 * @description:
 **/
public class ListTest1 {


    public static void main(String[] args) {

        List<List<Integer>> listMap = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {

            list.add(i);
            if (i % 20 == 0){
                listMap.add(list);
                list = new ArrayList<>();
            }
        }

        System.out.println(listMap);

    }
}
