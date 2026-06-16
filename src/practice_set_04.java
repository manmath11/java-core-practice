import java.util.Scanner;
public class practice_set_04 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       /*float tax = 0;
        System.out.println("enter the income ");
        float income = sc.nextFloat();
        if (income <2.5){
            tax = tax + 0;

        }
        else if (income>2.5f&&income<= 5.0f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if (income >5f && income<= 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if (income>10.0f ){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
            tax = tax + 0.3f * (income - 10.0f);

        }
        System.out.println("the total tax paid by the employee" + (tax));

        */


        // problem next
        System.out.println("enter the website" );
        String website = sc.next();
        if (website.endsWith(".com")){
            System.out.println("this is an commercial website ");

        }
        else if (website.endsWith(".in")){
            System.out.println("it is an indian website");

        }
        else if (website.endsWith(".org")){
            System.out.println("this is an organizational website ");
        }
    }
}
