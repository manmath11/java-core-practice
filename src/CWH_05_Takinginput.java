import java.util.Scanner;
public class CWH_05_Takinginput {
    public static void main(String[] args){
       System.out.println("taking input from the user ");
        //Scanner sc = new Scanner(System.in);
        //System.out.println("enter number 1");
        //int a = sc.nextInt();
        //System.out.println("inter number 2");
        //int b = sc.nextInt();
        //int sum = a+b;
        //System.out.println("the sum of these numbers is ");
        //System.out.println(sum);
        //Scanner sc = new Scanner(System.in);
        //float a = sc.nextFloat();
        //System.out.println(a);
        System.out.println("enter a name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        char c0 = name.charAt(0);
        char c1= name.charAt(1);
        char c2 = name.charAt(2);
        char c3 = name.charAt(3);
        char c4 = name.charAt(4);
        System.out.println(c0);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
