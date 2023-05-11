package by.alishev.lessons.Java_Collections_Framework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        //внутри не гарантируется никокого порядка
        Set<String> hashSet = new HashSet<>();
        //в каком порядке пары(ключ,знвчение) были добавлены в таком порядке они и вернуться
        Set<String> linkesHasSet = new LinkedHashSet<>();
        //пары (ключ,значение) сортируются по ключу (естественный порядок)
        Set<String> treeSet = new TreeSet<>();

      hashSet.add("Bod");
      hashSet.add("Mike");
      hashSet.add("Tom");
      hashSet.add("Tim");
      hashSet.add("Bob");
      hashSet.add("Bob");
      hashSet.add("Bob");

        for (String s : hashSet) {
            System.out.println(s);
        }
    }
}
