import java.util.*;

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

        // 현재 list3 : one, two
        System.out.println(list3.size());

        //Map 인터페이스를 구현한 HashMap 사용
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        System.out.println(map.get(1));
        System.out.println(map.get(5));

        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue("one"));
        System.out.println(map.containsValue("five"));

        map.remove(1);

        //map의 값 출력
        for (int key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " : " + value);
        }

        // Set 인터페이스를 구현한 HashSet 사용
        HashSet<String> set = new HashSet<>();

        set.add("one");
        set.add("two");
        set.add("three");
        set.add("two");

        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        HashSet<String> setA = new HashSet<>();
        HashSet<String> setB = new HashSet<>();

        setA.add("2");
        setA.add("5");
        setA.add("9");
        setA.add("12");

        setB.add("3");
        setB.add("6");
        setB.add("9");
        setB.add("12");

        System.out.println(setA.containsAll(setB));

        setA.addAll(setB);
        System.out.println(setA.toString());


    }
}
