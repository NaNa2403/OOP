

public class RunlengthEncoding {

    // Hàm mã hóa run-length
    public static String encode(String s) {
        if (s == null || s.length() == 0) return "";

        StringBuilder result = new StringBuilder();
        int count = 1;
        char prev = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == prev) {
                count++;
            } else {
                result.append(count).append(prev);
                count = 1;
                prev = current;
            }
        }
        // Thêm ký tự cuối cùng
        result.append(count).append(prev);

        return result.toString();
    }

    // Hàm giải mã run-length
    public static String decode(String s) {
        if (s == null || s.length() == 0) return "";

        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            int count = 0;
            // Đọc số lần lặp
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                count = count * 10 + (s.charAt(i) - '0');
                i++;
            }
            // Đọc ký tự
            if (i < s.length()) {
                char c = s.charAt(i);
                for (int j = 0; j < count; j++) {
                    result.append(c);
                }
                i++;
            }
        }

        return result.toString();
    }

    // Hàm main để test nhanh
    public static void main(String[] args) {
        String original = "aaaaabcccaa";
        String encoded = encode(original);
        String decoded = decode(encoded);

        System.out.println("Original: " + original);
        System.out.println("Encoded: " + encoded);
        System.out.println("Decoded: " + decoded);

        // Ví dụ thêm
        System.out.println(decode("3e4f2e")); // Kết quả phải là "eeeffffee"
    }
}
