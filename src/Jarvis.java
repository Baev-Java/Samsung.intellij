public class Jarvis {

    public void sayHi(String name) {
        System.out.println("Добрый вечер, " + name + ", как ваши дела?");
    }

    public void sayHi(String firstGuest, String secondGuest) {
        System.out.println("Добрый вечер, " + firstGuest + ", " + secondGuest + ", как ваши дела?");
    }

    public void sayHi(String...names) {

        for (String name: names) {
            System.out.println("Добрый вечер, " + name + ", как ваши дела?");
        }
    }


    public static void main(String[] args) {
        Jarvis jarvis = new Jarvis();
        jarvis.sayHi("Тони Старк");
        jarvis.sayHi("Тони Старк", "Капитан Америка");
    }
}