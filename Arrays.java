import java.util.Comparator;

public class Arrays {

    // 1. binarySearch для byte[]
    public static int binarySearch(byte[] a, byte key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            byte midVal = a[mid];
            if (midVal == key) return mid;
            if (midVal < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    // 2. binarySearch для char[]
    public static int binarySearch(char[] a, char key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            char midVal = a[mid];
            if (midVal == key) return mid;
            if (midVal < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    // 3. binarySearch для double[]
    public static int binarySearch(double[] a, double key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            double midVal = a[mid];
            if (midVal == key) return mid;
            if (midVal < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    // 4. binarySearch для float[]
    public static int binarySearch(float[] a, float key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            float midVal = a[mid];
            if (midVal == key) return mid;
            if (midVal < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    // 5. binarySearch для int[]
    public static int binarySearch(int[] a, int key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midVal = a[mid];
            if (midVal == key) return mid;
            if (midVal < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    // 6. binarySearch для long[]
    public static int binarySearch(long[] a, long key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long midVal = a[mid];
            if (midVal == key) return mid;
            if (midVal < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    // 7. binarySearch для short[]
    public static int binarySearch(short[] a, short key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            short midVal = a[mid];
            if (midVal == key) return mid;
            if (midVal < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    // 8. binarySearch для объектов с Comparator
    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return binarySearch(a, 0, a.length, key, c);
    }

    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            T midVal = a[mid];
            int cmp = c.compare(midVal, key);

            if (cmp == 0) return mid;
            if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
