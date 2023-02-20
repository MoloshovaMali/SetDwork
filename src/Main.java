import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(3);
        set1.add(12);
        set1.add(9);
        System.out.println(set1);
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(7);
        set2.add(12);
        System.out.println(set2);

        System.out.println(symmetricDifference(set1,set2));

    }

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {

        Set<Integer> set = new HashSet<>();
        for (Integer s : set1) {
            if (!set2.remove(s)) {
                set.add(s);
            }
        }

        for (Integer s2 : set2) {
            if (!set1.remove(s2)) {
                set.add(s2);
            }
        }
        return set;
    }

}
