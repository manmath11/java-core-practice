import java.util.Scanner;
public class user_interaction_site {
    public static void main (String args[]){
        System.out.println("welcome to the website ");
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the name ");
        String name = sc.next();
        System.out.println("hello:" +(name)+ " have a good day ");
    }

}
