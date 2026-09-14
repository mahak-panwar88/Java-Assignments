package Practice;

public class p4 {
    // Reverse a string name
    public static void main(String[] args){
        String name = "Practice";
        String reversed =  " ";
        for (int i = 0; i <name.length() ; i++) {
            reversed = name.charAt(i)+reversed;
            System.out.println(reversed);

        }
    }
}
