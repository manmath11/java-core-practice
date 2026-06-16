public class break_and_continue_loops {
    public static void main (String args[]){
      //  for(int i = 0;i<=5;i++) {
       //     System.out.println(i);
        //    System.out.println("jabha is great");

         //   if( i==2){
          //      System.out.println("ending hte loop");
          //      break;
          //  }
        //}
   /*     int i = 0;
        while(i<5){
            System.out.println(i);
            System.out.println("jabha is grate");
            if (i==2){
                System.out.println("ending the loop");
                break;
            }
            i++;
     */   //}
 /*for(int i = 0;i<=9;i++){
     if(i==2){
         System.out.println("skiping the loop ");
         continue;

     }
     System.out.println(i);
     System.out.println("jabha is the great");
 }
*/ int i=0;
 do {
     i++;
     if(i == 2){
         System.out.println("skepp");
         continue;
     }
     System.out.println(i);
     System.out.println("jabha is the greate");

 }while (i < 5) ;
        System.out.println("loop ends here");
     }


}
