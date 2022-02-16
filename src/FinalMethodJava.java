import java.util.Arrays;

public class FinalMethodJava {
    public static void main(String[] args) {
        //Arrays
        int[] arr = {5, 26, 1, 74, 59, 38};

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
