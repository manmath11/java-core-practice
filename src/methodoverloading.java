import java.util.Scanner;
public class methodoverloading {
static void telljoke(int x , int y){
    if(x==y){
        System.out.println("chalaja bhosdike");
    }
    else{

        System.out.println("the sum" +( x+y ) );
    }

}
static int telljoke(int x , int y , int z){
    return x - y - z ;


    }
public static void main (String args[]){
    System.out.println("enter the numbers");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int c= sc.nextInt();
   telljoke(a,c);
    System.out.println("enter the third number");
   int d = sc.nextInt();
    int result = telljoke(a,c,d );
    System.out.println("the substraction is" + result );


}
}
