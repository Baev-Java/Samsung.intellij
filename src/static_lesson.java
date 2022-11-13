public class static_lesson {
    public static final double PI = 3.14159265358979323846;
    static int[] arr = new int[4];

    static {
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++)
            arr[i] = arr[i - 1] * 2;
        }

        public static void main(String[] args) {
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
        }
    }

