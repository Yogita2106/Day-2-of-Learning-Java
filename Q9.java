import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String n1 = sc.nextLine();
        System.out.println("Enter second string:");
        String n2 = sc.nextLine();
         if (n1.contains(n2)){
            System.out.println("Match Found !");
        }
        else{
            System.out.println("No Match !");
        }
    }
    
}
