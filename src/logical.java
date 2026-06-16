public class logical {
    public static void main (String args[]){
        boolean a = false;
        boolean b = true;
        System.out.println("for logical and ");
        if (a&&b){
            System.out.println("Y");

        }
        else{
            System.out.println("N");
        }
        System.out.println("for logical or ");
        if (a||b){
            System.out.println("Y");

        }
        else{
            System.out.println("N");
        }
        System.out.println("for logical not");
        System.out.println("Not(a) is ");
        System.out.println(!a);
        System.out.println("Not(b) is ");
        System.out.println(!b);

    }
}
