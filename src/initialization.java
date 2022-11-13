class InitData{

        boolean b = true;
        byte B = 10;
        short s = 50;
        int i = 1234;
        long l = 43443434;
        char c = 'A';
        float f = 12.f;
        double d = 123.3;
        //


    void print(){
        System.out.println("Default values:");
        System.out.println("boolean: " + b);
        System.out.println("byte: " + B);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("char: " + (int)c);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
    }
}

public class initialization {
    public static void main(String [] args){
        InitData initData = new InitData();
        initData.print();
    }
}