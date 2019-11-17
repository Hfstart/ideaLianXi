package onebao;

import java.util.ArrayList;
import java.util.Arrays;

public class Shu {
    public static final int ab = 1;
    public static final int aa = 2;
    public static final String  oo = "123";
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
        for (String s : three) {
            System.out.println(s);
        }
        for (int i = 0; i < three.length; i++) {
            String s = three[i];
            System.out.println(s);
        }
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {
            System.out.println(o);
        }
        for (int i = 0; i < list.size(); i++) {

        }
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }
    public void show(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        if (list == null) {

        }
        if (list != null) {

        }
        if (list != null) {

        }
        if (list == null) {

        }
    }
}
