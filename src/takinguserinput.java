
import java.util.Scanner;
public class takinguserinput {
    public static void main (String[] args){
        System.out.println("basic operations of three input users :");
        Scanner sc = new Scanner(System.in);
    System.out.println("enter the number 1");
    int a = sc.nextInt();
    System.out.println("enter the number 2");
    int b = sc.nextInt();
    System.out.println("enter the number 3 ");
    int c = sc.nextInt();
    System.out.println("addition of these three numbers " +(a+b+c));
    System.out.println("substractin of these three numbers is"+(a-b-c));
    System.out.println("multiplication of these three numbers is:"+(a*b*c));
    System.out.println("division of these three numbers is :"+(a/b/c));
    System.out.println("remaider of these three numbers :"+(a%b%c));
    }
}
