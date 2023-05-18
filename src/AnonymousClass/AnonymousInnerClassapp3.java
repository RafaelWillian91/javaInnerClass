package AnonymousClass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AnonymousInnerClassapp3 {

    public static void main(String[] args) {

        List<Integer> listOf = Arrays.asList(3, 5,4,2,1);

        Comparator c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        listOf.sort(c);
        System.out.println(listOf);

    }


}
