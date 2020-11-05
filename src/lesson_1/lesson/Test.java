package lesson_1.lesson;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        //1. Что произойдет при запуске данного кода
        // true false true
        String strA = "text";
        String strB = "text";
        System.out.println(strA == strB);
        strA += "1";
        strB += "1";
        System.out.println(strA == strB);
        strA = "text1";
        strB = "text1";
        System.out.println(strA == strB);
    }
}

// 2. Что выведется в консоль в результате этого кода
// 17
interface I{
    public final static int EASY = 5;
}

class Main2 implements I {
    public static void main(String[] args) {
        int a = 5;
        test(++a);
    }

    static void test(int a) {
        a += EASY + a++;
        System.out.println(a);
    }
}

class Test6{
    public static void main(String[] args) {
        int[] mass = {1,2};
        List<String> list = new ArrayList<>(10);
        list.add("3");
        list.add("4");
        System.out.println("." + mass.length + list.size());

        // .22
        // все что выводится в консоль после строки автоматически превращается в строку

        System.out.println(mass.length + list.size());

        //4

    }
}
