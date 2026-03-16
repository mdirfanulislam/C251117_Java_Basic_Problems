package c251117.c251117_java_basic;

public class Java_Break_Continue {

    public static void main(String[] args) {
        for (int i = 100; i < 110; i++) {
            if (i < 101) {
                continue;
            }
            if (i > 106) {
                break;
            } else {
                System.out.println(i);
            }

        }
    }
}
