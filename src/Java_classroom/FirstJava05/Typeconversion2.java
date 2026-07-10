package Java_classroom.FirstJava05;

public class Typeconversion2 {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 59900;
        float f = 5.57f;
        double d = 0.255;
        var finalResult = (f * b) + (i % c) + (d * s);
        System.out.println("Final Result="+finalResult);
    }
}
