import java.util.Scanner;

public class recursion {
    // factorial (0)=1
    // factorial (n)= n * n-1 *....1
    // factorial (5)= 5 * 4 * 3 * 2 * 1 = 120
    // factorial (n) = n * faactorial(n-1)
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
        static int factorial_iterative(int n){
            if(n==0 || n==1){
                return 1;

            }
            else{
                int product = 1 ;
                for (int i=1;i<=n;i++){// 1 to n
                     product *=i;
                }
                return product;
            }
        }


    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int x = sc.nextInt();
        System.out.println("the value of fact x is :" + factorial(x));
        System.out.println("the value of fact x is:" + factorial_iterative(x));


    }
}
