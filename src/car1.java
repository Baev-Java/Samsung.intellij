public class car1 {
    public static void main(String[] args) {

        Car car1 = new Car(200, "BMW");
        System.out.println(car1.model);
        car1.drive(100, 5);
        car1.printX();
        System.out.println(car1);

//        Car car2 = new Car(300, "Mercedes");
//        car2.color = "black";
//        System.out.println(car2.color);
//        car2.drive(100, 5);
//        System.out.println(car2.getX());
////        car2.setX(100);
//        car2.maxVelocity = 300;
    }
}

class Car {
    String color = "white";
    private double maxVelocity;
    String model;
    private double x;

    void printX() {
        System.out.println(this.x);
    }

    public void setMaxVelocity(double maxVelocity) {
        if (maxVelocity > 0) {
            this.maxVelocity = maxVelocity;
        }
    }

    double getX() {
        return x;
    }

//    void setX(double x){

//        this.x = x;
//    }

    void drive(double velocity, double time) {
        if (velocity >= maxVelocity) velocity = maxVelocity;
        x += velocity * time;
    }

    Car(double mv, String m) {
        maxVelocity = mv;
        model = m;
    }

}