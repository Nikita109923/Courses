package by.alishev.lessons.Java_Collections_Framework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
       /* //внутри не гарантируется никокого порядка
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
      hashSet.add("Bob");*/

/**********************************************************************************************************************/

        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();

        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        // union - объединение множеств

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println(union);

        //intersection - пересечение множеств
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println(intersection);

        // difference - разность множеств

            Set<Integer> difference = new HashSet<>(set1 );
            difference.removeAll(set2);
        System.out.println(difference);


    }
}
