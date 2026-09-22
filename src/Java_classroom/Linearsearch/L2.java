package Java_classroom.Linearsearch;

public class L2 {
    public static void main(String[] args) {
        // How to do the linear search for the strings
        String name = "Mahak Panwar";
        char target = 'k';
        System.out.println(search(name, target));
    }

    static boolean search(String str, char target) {
        if (str.length() == target) ;
        return false;
    }

}
