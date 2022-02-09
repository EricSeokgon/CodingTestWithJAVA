import java.util.Calendar;

public class Ex03 {
    public static void main(String[] args) {
        int 대기인원 = 14000605;
        solution(대기인원);
    }

    private static void solution(int 대기인원) {
        int 일년일수 = 0;

        for (int i = 10; i > 0; i--) {
            일년일수 += (int)Math.pow(2, i);
        }

        int 대기일 = 대기인원 / 1200;
        int 연도 = 대기일 / 일년일수;
        int 남은일수 = 대기일 % 일년일수;
        int 월 = 0;

        for (int i = 10; i > 0; i--) {
            월++;
            if (남은일수 < (int)Math.pow(2, i)) {
                break;
            }
            남은일수 -= (int)Math.pow(2, i);
        }

        int 일 = 남은일수;
        int 최종남은인원 = 대기인원 % 1200;
        int 시 = 최종남은인원 / 100 + 9;
        int[] 출발분 = {25, 40, 55, 70, 85, 100};
        int 몇분에탈지계산 = 최종남은인원 % 100 + 1;
        int 당일출발_분 = 0;

        for (int i = 0; i < 출발분.length; i++) {
            if (출발분[i] > 몇분에탈지계산) {
                당일출발_분 = i * 10;
                break;
            }
        }

        Calendar 오늘시간 = Calendar.getInstance();
        int 분 = 오늘시간.get(Calendar.MINUTE) + 당일출발_분;

        if (분 > 60) {
            분 = 분 - 60;
            시++;
        }
        System.out.println((연도 + 2020) + "년 " + 월 + "월 " + 일 + "일 " + 시 + "시 " + 분 + "분");
    }

}
