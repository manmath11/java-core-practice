import java.util.Scanner;


public class Revision {
     public static void main (String args[]){
         System.out.println("calculate any thing that you want");
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the first number");
         Double num1 = sc.nextDouble();
         System.out.println("select the operator (+,-,*,%,/)");
         char op = sc.next().charAt(0);
         System.out.println("enter the second number ");
         Double num2 = sc.nextDouble();
         double result = 0 ;
          switch (op){
              case '+':
                  result = num1+num2;
                  break;
              case '-':
                  result = num1-num2;
                  break;
              case'*':
                  result = num1*num2;
                  break;
              case'%':
                  result = num1%num2;
                  break;
              case'/':
                  if (num2 != 0){
                      result = num1/num2;

                  }
                  else{
                      System.out.println(" the number is not divisible");
return;
                  }
                  break;
              default:
                  System.out.println("invalid operator");


          }
         System.out.println("operation succesful:" + result);
     }
}
