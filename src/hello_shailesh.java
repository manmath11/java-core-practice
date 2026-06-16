import java.util.Scanner;
public class hello_shailesh {
    public static void main (String [] args){
        System.out.println("hello shailu");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks ");

        int b = sc.nextInt();
        System.out.println("your marks are ;" + b);
        System.out.println("enter your age");


        int a = sc.nextInt();
        if (a>18)
        {
            System.out.println("eligible for the voting ");

        }
        else{
            System.out.println("not eligible gor the voting ");

        }

        System.out.println("your age is ;" + a );

if (b>35)
{
    System.out.println("passed");

}
else{
    System.out.println("chok");
}
    }
}
