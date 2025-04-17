import java.util.Scanner;
public class Q7{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = input.nextInt();
        if(num>0){
            System.out.println("number is : " + num + "  that is positive ");
        }
        else if(num<0){
            System.out.println(" number is : " + num + "  that is Negative ");
        }
        else{
            System.out.println("number is : "+ num + "  that is zero");
        }
        
    }
}
