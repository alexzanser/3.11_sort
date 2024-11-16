import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Тесты для Arrays
        System.out.println("===== Arrays Tests =====");

        // Тест для byte[]
        byte[] byteArray = {1, 3, 5, 7, 9};
        System.out.println(Arrays.binarySearch(byteArray, (byte) 5)); // 2
        System.out.println(Arrays.binarySearch(byteArray, 1, 4, (byte) 7)); // 3
        System.out.println(Arrays.binarySearch(byteArray, (byte) 6)); // -1

        // Тест для char[]
        char[] charArray = {'a', 'c', 'e', 'g'};
        System.out.println(Arrays.binarySearch(charArray, 'e')); // 2
        System.out.println(Arrays.binarySearch(charArray, 0, 3, 'g')); // 3
        System.out.println(Arrays.binarySearch(charArray, 'd')); // -1

        // Тест для double[]
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        System.out.println(Arrays.binarySearch(doubleArray, 3.3)); // 2
        System.out.println(Arrays.binarySearch(doubleArray, 0, 2, 2.2)); // 1
        System.out.println(Arrays.binarySearch(doubleArray, 5.5)); // -1

        // Тест для float[]
        float[] floatArray = {1.0f, 2.0f, 3.0f};
        System.out.println(Arrays.binarySearch(floatArray, 3.0f)); // 2
        System.out.println(Arrays.binarySearch(floatArray, 0, 2, 2.0f)); // 1
        System.out.println(Arrays.binarySearch(floatArray, 4.0f)); // -1

        // Тест для int[]
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.binarySearch(intArray, 4)); // 3
        System.out.println(Arrays.binarySearch(intArray, 1, 4, 2)); // 1
        System.out.println(Arrays.binarySearch(intArray, 6)); // -1

        // Тест для long[]
        long[] longArray = {10L, 20L, 30L, 40L};
        System.out.println(Arrays.binarySearch(longArray, 20L)); // 1
        System.out.println(Arrays.binarySearch(longArray, 0, 3, 10L)); // 0
        System.out.println(Arrays.binarySearch(longArray, 50L)); // -1

        // Тест для short[]
        short[] shortArray = {10, 20, 30, 40};
        System.out.println(Arrays.binarySearch(shortArray, (short) 30)); // 2
        System.out.println(Arrays.binarySearch(shortArray, 1, 3, (short) 20)); // 1
        System.out.println(Arrays.binarySearch(shortArray, (short) 50)); // -1

        // Тест для объектов с Comparator
        String[] stringArray = {"apple", "banana", "cherry"};
        Comparator<String> comparator = String::compareTo;
        System.out.println(Arrays.binarySearch(stringArray, "banana", comparator)); // 1
        System.out.println(Arrays.binarySearch(stringArray, 0, 2, "apple", comparator)); // 0
        System.out.println(Arrays.binarySearch(stringArray, "pear", comparator)); // -1

        // Тесты для Collections
        System.out.println("\n===== Collections Tests =====");

        // Тест для List с Comparable
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        System.out.println(Collections.binarySearch(integerList, 30)); // 2
        System.out.println(Collections.binarySearch(integerList, 50)); // -1

        // Тест для List с Comparator
        List<String> stringList = new ArrayList<>();
        stringList.add("dog");
        stringList.add("cat");
        stringList.add("bat");
        stringList.sort(String::compareTo); // Сортируем для бинарного поиска
        Comparator<String> stringComparator = String::compareTo;
        System.out.println(Collections.binarySearch(stringList, "cat", stringComparator)); // 1
        System.out.println(Collections.binarySearch(stringList, "bat", stringComparator)); // 0
        System.out.println(Collections.binarySearch(stringList, "elephant", stringComparator)); // -1
    }
}
