import java.util.Locale;

public class Vector2D {

    private static int count = 0;
    public double vX;
    public double vY;

    Vector2D() { //начальные кординаты вектора
        vX = 1;
        vY = 1;
        count++;

    }

    Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
        count++;
    }

    public Vector2D(Vector2D other) {
        vX = other.vX;
        vY = other.vY;
        count++;
    }

    public double length() {
        return Math.sqrt(vX * vX + vY * vY);
    }

    public void add(Vector2D v) {//сложение двух векторов
        this.vY = v.vY + vY;
        this.vX = v.vX + vX;
    }

    public void sub(Vector2D v) {//вычитание двух векторов
        vY -= v.vY;
        vX -= v.vX;
    }

    public void scale(double scaleFactor) {//умножение двух векторов
        vX *= scaleFactor;
        vY *= scaleFactor;

    }


    public void print() {//печать векторов
        System.out.println(String.format(Locale.US, "%.2f", vX));
        System.out.println(String.format(Locale.US, "%.2f", vY));
    }

    public void normalized() {//нормализация двух векторов
        double length = Math.sqrt(vX * vX + vY * vY);
        ;
        double xxx = vY / length;
        double vxx = vX / length;
    }

    public double dotProduct(Vector2D v) {
        double dotProduct = vX * vX + vY * vY;
        return dotProduct;
    }

    public static void main(String[] args) {
        Vector2D vA = new Vector2D();
        Vector2D vB = new Vector2D(5.0, 7.0);
        Vector2D vC = new Vector2D(vB);
        vA.add(vB);
        vA.print();
        vA.sub(vC);
        vA.print();
        System.out.println(vB.length());
        vC.scale(1.5);
        vC.print();
        vC.normalized();
        System.out.println(vC.length());
        vC.scale(2);
        System.out.println(vA.dotProduct(vB));
        System.out.println(vA.count);
    }
}