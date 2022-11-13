public class Example_Overload{
    public static void printNum(Integer i){ // 1
        System.out.println("Integer = " + i);
    }

    public static void printNum(int i){ // 2
        System.out.println("int = " + i);
    }

    public static void printNum(Float f){ // 3
        System.out.println("Float = " + f);
    }

    public static void printNum (Number n){ // 4
        System.out.println("Number = " + n);
    }

    public static void main(String[] args){
        Number[] num = {5, 30, 3.14f, 7.5 };
        for (Number n : num)
            printNum (n);
        printNum (8);
        printNum(81);
        printNum(4.14f);
        printNum(8.2);
    }
}