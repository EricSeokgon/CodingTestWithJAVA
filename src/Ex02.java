import java.util.ArrayList;

class 독 {
    String 이름;
    String 나이;
    int 점프력;
    int 몸무게;

    public 독(String 이름, String 나이, int 점프력, int 몸무게) {
        this.이름 = 이름;
        this.나이 = 나이;
        this.점프력 = 점프력;
        this.몸무게 = 몸무게;
    }
}

public class Ex02 {
    public static void main(String[] args) {
        int 돌의내구도[] = {5, 3, 4, 1, 3, 8, 3};
        독[] 독배열 = {
                new 독("루비독", "95년생", 3, 4),
                new 독("피치독", "95년생", 3, 3),
                new 독("씨-독", "72년생", 2, 1),
                new 독("코볼독", "59년생", 1, 1)
        };

        solution(돌의내구도, 독배열);
    }

    private static void solution(int[] 돌의내구도, 독[] 독배열) {
        ArrayList<String> answer = new ArrayList<String>();

        for (독 i : 독배열) {
            int 독의위치 = 0;
            boolean flag = true;

            while (독의위치 < 돌의내구도.length) {
                독의위치 += i.점프력;

                if (독의위치 > 돌의내구도.length) {
                    break;
                }

                돌의내구도[독의위치 - 1] -= i.몸무게;

                if (돌의내구도[독의위치 - 1] < 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                answer.add(i.이름);
            }
        }
        System.out.println(answer);
    }

}
