class person {
    int age;
    String name;
    public int age(int age){
        return age;

    }
    void name (String name){
        System.out.println(name);
    }
}
class students extends person{
    int rollnumber;
    void rollnumber(int rollnumber){
        System.out.println(rollnumber);
    }

}
class fruit{
    void eat(){
        System.out.println("we can eat ");
    }
    void testin(){
        System.out.println("which test it has");
    }
}
class mango extends fruit{
    void colour(){
        System.out.println("yellow");
    }
void test(){
    System.out.println("sweet in test");
}
}
public class inheritance_practice {
    public static void main(String args[]){
        mango m1 = new mango();
        m1.colour();
        m1.eat();
        m1.testin();
        m1.test();
        students s3 = new students();


        s3.age(2);
        s3.name("ballu");
        s3.rollnumber(321);


    }
}
