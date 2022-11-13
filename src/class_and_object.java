public class class_and_object {
    static class Rect{
        double width;
        double height;

        double getArea(){
            return width * height;
        }
        // Увеличение в указанное число раз размеров прямоугольника
        void magnify(double koeff) {
            width *= koeff;
            height *= koeff;
        }

    }

    public static void main(String[] args) {
        Rect rect1 = new Rect();
        rect1.height = 10;
        rect1.width = 20;
        rect1.magnify(1.5);

        Rect rect2 = new Rect();
        rect2.height = 10;
        rect2.width = 20;


        System.out.println(rect1 == rect2); // ?
        rect2 = rect1;
        System.out.println(rect1 == rect2); // ?
    }
}
