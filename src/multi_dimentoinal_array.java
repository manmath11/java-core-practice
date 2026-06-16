public class multi_dimentoinal_array {
    public static void main (String args[]){
        int [] marks;//A 1-D array
        int [] [] flats;// A 2-d array
        flats = new int [2] [3];
        flats[0][0] = 100;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 200;
        flats[1][1] = 201;
        flats[1][2] = 202;
        // displaying the 2-d array (for-loop)
        System.out.println("printing a 2-d array using forloop");
        for(int i = 0; i<flats.length;i++){
            for(int j = 0; j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
