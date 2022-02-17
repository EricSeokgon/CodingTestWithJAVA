import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FinalMethodJava {
    public static void main(String[] args) {
        //Arrays
        int[] arr = {5, 26, 1, 74, 59, 38};

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Integer[] arr2 = {5, 26, 1, 74, 59, 38};
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr2));

        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        Integer[] arr3 = {5, 26, 1, 74, 59, 38};
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(arr2));

        Collections.sort(list2);

        for (int i : list2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        // List 인터페이스를 구현환 ArrayList 사용
        ArrayList<String> list3 = new ArrayList<String>();

        list3.add("one");
        list3.add("two");
        list3.add("three");

        for (String str : list3) {
            System.out.print(str + " ");

        }

        //현재 list3 : one, two, three
        System.out.println(list3.get(2));

        // 같은 일을 하는 코드 -> 아래의 코드 중 하나만 실행해야 함
        list3.remove("three");
        //list3.remove(2);

        // 현재 list3 : one, two
        System.out.println(list3.contains("one"));
        System.out.println(list3.contains("three"));


    }
}
