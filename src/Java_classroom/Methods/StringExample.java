package Java_classroom.Methods;

public class StringExample {
    public static void main(String[] args) {
        String personalised = myGreet("Mahak Panwar");
        System.out.println(personalised);

    }

    static String myGreet(String name) {
        String message = "Hello "+name;
        return message;
    }
}
