import java.util.Arrays;
import java.util.Scanner;
public class cbse_percentage {
    public static void main (String args[]){
        System.out.println("cbse percentage calculator");
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the subject marks out of 100");
        System.out.println("enter marks in jabha");
                float a = sc.nextFloat();
        System.out.println("enter marks in data structure");

        float b = sc.nextFloat();
        System.out.println("enter marks in mathematics");
        float c = sc.nextFloat();
        System.out.println("enter marks in communication skill's ");
        float d = sc.nextFloat();
        System.out.println("enter the marks in python");
        float e = sc.nextFloat();
        System.out.println("percentage in the cbse board is;" +(a+b+c+d+e)/50);

    }
}
