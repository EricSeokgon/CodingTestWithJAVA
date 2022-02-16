public class Ex07 {
    public static void main(String[] args) {
        int[][][] cross = {
                {
                        {2, 0, 1, 1, 8},
                        {5, 0, 4, 5, 4},
                        {1, 5, 0, 5, 1},
                        {1, 2, 1, 0, 1},
                        {0, 2, 5, 1, 1}
                },
                {
                        {1, 2, 0, 3, 3},
                        {1, 2, 0, 2, 4},
                        {1, 2, 0, 2, 4},
                        {4, 2, 0, 0, 1},
                        {8, 4, 1, 1, 0}
                }
        };

        solution(cross);
    }

    private static void solution(int[][][] cross) {
        int[][] cross_ = new int[cross[0].length * 2][cross[0][0].length];

        for (int i = 0; i < cross_.length; i++) {
            for (int j = 0; j < cross_[0].length; j++) {
                if (i < cross[0].length) {
                    cross_[i][j] = cross[0][i][j];
                } else {
                    cross_[i][j] = cross[1][i - cross[0].length][j];
                }
            }
        }
        int[][] 가중치누적값 = new int[cross_.length][cross_[0].length];
        int[][][] 좌표저장 = new int[cross_.length][cross_[0].length][2];

        for (int i = 0; i < cross_.length; i++) {
            for (int j = 0; j < cross_[0].length; j++) {
                if (i == 0 && j == 4) {
                    가중치누적값[i][j] = cross_[i][j];
                    좌표저장[i][j] = new int[]{99, 99};
                } else if (i == 0) {
                    가중치누적값[i][j] = 가중치누적값[i][j + 1] + cross_[i][j];
                    좌표저장[i][j] = new int[]{i, j + 1};

                } else if (i == 4) {
                    가중치누적값[i][j] = 가중치누적값[i - 1][j] + cross_[i][j];
                    좌표저장[i][j] = new int[]{i - 1, j};
                } else {
                    if (가중치누적값[i][j + 1] > 가중치누적값[i - 1][j]) {
                        가중치누적값[i][j] = 가중치누적값[i - 1][j] + cross_[i][j];
                        좌표저장[i][j] = new int[]{i - 1, j};
                    } else {
                        가중치누적값[i][j] = 가중치누적값[i][j + 1] + cross_[i][j];
                        좌표저장[i][j] = new int[]{i, j + 1};
                    }
                }
            }
        }

        int i = 0, j = 0, k = 0;
        while (true) {
            if (i == 99 || j == 99) {
                break;
            }

            if (k == 0) {
                i = 좌표저장[cross_.length - 1][0][0];
                j = 좌표저장[cross_.length - 1][0][1];
            } else {
                i = 좌표저장[i][j][0];
                j = 좌표저장[i][j][1];
            }
            System.out.println(i + " " + j);
            k++;

        }

    }
}
