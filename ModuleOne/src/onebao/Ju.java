package onebao;

import java.util.Arrays;

public class Ju {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Shu.main");
        int one = 0;
        int two = 1;
        System.out.println("one = " + one);
        System.out.println("two = " + two);
        String[] three = {"java", "python", "c++"};
        for (int i = 0; i < three.length; i++) {
            System.out.println(three[i]);
        }
    }
}
