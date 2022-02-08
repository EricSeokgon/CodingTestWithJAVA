public class Ex01 {
    public static void main(String[] args) {
        String[] text = {
                "  +--+-+-  ",
                "  +---+-+  ",
                "  +--+-+-  ",
                "  +-+-+-+  "
        };

        solution(text);
    }

    private static void solution(String[] text) {
        for (int i = 0; i < text.length; i++) {
            int n = Integer.parseInt(text[i].trim().replace(" ", "").replace("+", "1").replace("-", "0"), 2);
            text[i] = String.valueOf((char) n);
            System.out.print(text[i]);

        }
    }
}
