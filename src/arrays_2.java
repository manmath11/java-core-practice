public class arrays_2 {
    public static void main (String args[]){
        //int [] marks ={20,30,40,50,60};
       // float [] marks ={11.22f,33.22f,44.5f,88.55f};
        //String [] marks={"lokesh","sokesh",};



        int [] marks ={20,30,40,50,60};
      //  System.out.println(marks[0]);
        // displaying the array (naive way) simple method
        //System.out.println(marks.length);
        //System.out.println(marks[2]);
        //System.out.println(marks[3]);
        //  this is not a efficient way
        // so we are using the  for loop
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        // displaying the array (for loop
        System.out.println("printing using for loop in reverse order");
        for(int i = marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
        // quick quiz: displaying the array (for-each looop)
        System.out.println("printinng usinng for-each loop");
        for(int element: marks){
            System.out.println(element);
        }


    }
}
