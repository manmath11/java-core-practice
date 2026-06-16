class boy{
    int age;
    String name;
    boy(int i, String name){
        this.age=i;
        this.name=name;

    }
    boy(int age){
        this(age,"nana");// this() is used to call one constructor from another to avoid code repetition.” ✅
    }
    boy(){
        this(0,"unknown");
    }


    void display(){
       if(age < 20){
           System.out.println(age+" "+name+" "+"this is boyzzzz");
        }
       else{
           System.out.println(age+" "+name+" "+"this is man ");
       }
    }
}

public class connecting_const {
    public static void main(String []args) {

        boy [] b = new boy[2];
        b[0]= new boy(12,"munna");
        b[1]= new boy(23,"nanna");
        b[0].display();
        b[1].display();
    }
}
