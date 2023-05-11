package by.alishev.lessons.Java_Collections_Framework.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test2 {
    public static void main(String[] args) {

        //внутри не гарантируется никокого порядка
        Map<Integer,String> hashMap = new HashMap<>();
        //в каком порядке пары(ключ,знвчение) были добавлены в таком порядке они и вернуться
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        //пары (ключ,значение) сортируются по ключу (естественный порядок)
        Map<Integer,String> treeMap = new TreeMap<>();

        testMap(treeMap);


    }


    public static void testMap(Map<Integer,String> map){
        map.put(39,"Bod");
        map.put(12,"Mike");
        map.put(78,"Tom");
        map.put(1500,"Tim");
        map.put(7,"Bob");

        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue() );
        }

    }
}
