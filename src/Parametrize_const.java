class myplayer{
    int age;
    String name;
    String game;

    myplayer(int i,String j,String k){
        this.age=i;
        this.name=j;
        this.game=k;

    }void display(){
        System.out.println( age+" "+name +" "+game );
    }
}





/*class myStudent{
    int id;
    String name;
    char grade;
    float marks;
    boolean ispassed;
     myStudent(int i,String j,char k,float l, boolean m){
        id= i;
        name= j;
        grade =k;
        marks= l;
        ispassed= m;

    }void display() {
        System.out.println(id + " " + name + " " + grade + " " + marks + " " + ispassed);
    }

}


*/public class Parametrize_const {
    public static void main(String args[]) {
      /*  myStudent s1 = new myStudent(1, "amba" , 'A' ,35.55f, true );
       myStudent s2= new myStudent(2, "rohan",'B',33.55f,false);
       /* System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.grade);
        System.out.println(s1.marks);
        System.out.println(s1.ispassed);
        System.out.println(s2.id);
        System.out.println(s2.name);
        System.out.println(s2.grade);
        System.out.println(s2.marks);
        System.out.println(s2.name);
        System.out.println(s2.grade);
        System.out.println(s2.marks);
   s1.display();
   s2.display();
  */
        myplayer[] p = new myplayer[3];
        p[0] = new myplayer(12, "bhimrao", "kabbadi");
        p[1] = new myplayer(12, "babasaheb", "kho kho");
        p[2] = new myplayer(12, "ambedkar", "langadi");
        for (int i = 0; i < p.length; i++) {
            p[i].display();
        }
    }
}