import java.sql.SQLOutput;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final List<Integer> nums;

    static {
        nums = new ArrayList<>(List.of(1, 1, 2, 2, 3, 4, 4, 5, 6));
    }

    private static final List<String> words;

    static {
        words = new ArrayList<>(List.of("qwe", "ewq", "ewq", "weq", "ert"));
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        for (int num : nums) {
            if (num % 2 == 1) {
                System.out.println(num + "");
            }
        }
    }


    public static void task2() {
        Collections.sort(nums);
        int num1 = Integer.MIN_VALUE;

        for (Integer num : nums) {
            if (num % 2 == 0 & num != num1) {
                num1 = num;
                System.out.println(num);
            }
        }
    }

    public static void task3() {
        Set<String> words1 = new HashSet<>(words);
        System.out.println(words1);
    }

    public static void task4() {
        Set<String> words1 = new HashSet<>(words);
        System.out.println(words.size() - words1.size());
    }




    }

