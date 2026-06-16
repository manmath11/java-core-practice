import java.util.Scanner;
public class switch_statements {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
        int age = sc.nextInt();

        switch (age){

            case 18:
                System.out.println("your becoming adult ");
                break;
            case 43:
                System.out.println("your the man ");
                break;
            case 90:
                System.out.println("you are a older ");
                break;
            default:
                System.out.println("enjoy your life ");
        }
        System.out.println("thanks for using this portal ");
       /*
        if (age>56){
            System.out.println("you are experinced");
        }
        else if (age>46){
            System.out.println("you are semiexperinced");

        }
        else if (age >36){
            System.out.println("you are semi experinced");
        }
        else {
            System.out.println(" you are not experinced ");

        }

        */
    }
}
