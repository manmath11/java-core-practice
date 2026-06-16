import java.util.Scanner;
public class conversion_km_to_miles {
    public static void main (String [] args) {
        System.out.println("welcome to the km to miles converter :");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the distance");

                float a =sc.nextFloat();
                System.out.println("the distance in miles is:"+(a*0.621371));




    }
}
