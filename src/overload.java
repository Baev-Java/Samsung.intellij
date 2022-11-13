public class overload {
    static void print(double a){
        System.out.println(a);
    }
    // 1-я перегрузка
    static void print(String a){
        System.out.println(a);
    }
    // 2-я перегрузка
    static void print(int[] a){
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int a = 10;
        int [] m = {1, 2, 8, 3};
        String s = "Hello";
        print(a); //cработает исходный метод
        print(a + s); //сработает 1-я перегрузка и будет выведено:10 Hello
        print(m); //сработает 2-я перегрузка и будет выведено:1 2 8 3
        //print(m + a); // произойдет ошибка компиляции
    }
}
