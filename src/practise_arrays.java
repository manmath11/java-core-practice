public class practise_arrays {
    public static void main(String args[]) {
      /*  float [] marks={45.7f,67.8f,63.4f,99.2f,100.0f};
        float sum = 0;
        for (float element:marks){
         sum = sum+ element;
        }
        System.out.println("the value of sum is:" +(sum));
    */
        //problem =2
       /* float [] marks={45.7f,67.8f,63.4f,99.2f,100.0f};
        float num = 45.7f;
        boolean isInArray = false;
        for (float element:marks){
            if(num==element){
                isInArray =true;
                break;
            }
        }
        if(isInArray){
            System.out.println("the value is present in the array");
        }
        else{
            System.out.println("the value is not in array ");

        }*/
        // practice problem three
        /* float [] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};
        float sum = 0;
        for(float element:marks){
            sum = su[m + element;
        }
       System.out.println("the value of average marks is" + sum/marks.length );


   */
        // problem number 4
       /* int[][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int[][] mat2 = {{2, 6, 13},
                {3, 7, 1}};
        int[][] result = {{0, 0, 0},
                {0, 0, 0}};
        for (int i = 0; i < mat1.length; i++) {// row number of times
            for (int j = 0; i < mat1[i].length; j++) { // colum number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }

        }
        // printing the elements of 2-d array
        for (int i = 0; i < mat1.length; i++) {// column number of time
            for (int j = 0; j < mat1[i].length; j++) {// column number of time
                System.out.println();

         }

        }
  */

    // next problem number 5 reverse array
       /* int [] arr = {1,2,3,4,5,6,};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
       int temp;

       for( int i=0;i<n;i++) {
           // swap a[i] and a[l-i-1]
           // a  b  temp
           // |4|  |3|  | |
           temp = arr[i];
           arr[i] = arr[l - i - 1];
           arr[l - i - 1] = temp;
       }
       for (int element:arr){
           System.out.print(element + " ");
       }
       */

    }
}