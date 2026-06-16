public class varargs {
static void sum(int x , int y){
    if(x>=y){
        System.out.println(+(x+y ));
    }
    else{
        System.out.println("errero");
    }
}
public static void main (String args[]){

    int a = 12;
    int b= 1;
    sum(a,b);
}
}
