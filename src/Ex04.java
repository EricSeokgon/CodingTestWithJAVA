import java.util.ArrayList;

public class Ex04 {
    public static void main(String[] args) {
        String[] 페이지 = {"척추동물", "어류", "척추동물", "무척추동물", "파충류", "척추동물", "어류", "파충류"};
        System.out.println(solution(페이지));
    }

    private static String solution(String[] 페이지) {
        ArrayList<String> 의자 = new ArrayList<String>();
        int answer = 0;

        for (String i : 페이지) {
            if (의자.contains(i)) {
                의자.remove(i);
                의자.add(i);
                answer += 1;
            } else {
                if (의자.size() >= 3) {
                    의자.remove(0);
                }
                의자.add(i);
                answer += 60;
            }
        }
        return answer / 60 + "분 " + answer % 60 + "초";
    }
}
