public class interhiritancce {
    public static void main (String args[]){
        for (int i = 1; i <= 100; i++) {
            if (i==3) continue;

            for (int j = 1; j <= 20; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();   // new line after each row

        }

    }
}