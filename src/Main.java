import com.sun.source.doctree.SeeTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }
    public static void task1(){
        System.out.println(" Задание 1 ");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void task2 (){
        System.out.println(" Задание 2 ");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> nums2 = new LinkedHashSet<>(nums);
        nums.clear();
        nums.addAll(nums2);
        Iterator<Integer> numsIterator = nums.iterator();
        while (numsIterator.hasNext()) {
            Integer num = numsIterator.next();
            if (num % 2 != 0) {
                numsIterator.remove();
            }
        }
        System.out.print(nums);
        System.out.println();
    }

    public static void task3() {
        System.out.println(" Задание 3 ");
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Set<String> wordSet = new HashSet<>(strings);
        for (String s : wordSet) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println(" Задание 4 ");
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            if (map.containsKey(string)) {
                map.put(string, map.get(string) + 1);
            }
            else {
                map.put(string, 0);
            }
        }
        System.out.println(map);
    }
}