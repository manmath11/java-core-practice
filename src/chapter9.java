class employees{
   private int id ;
    private String name;

    public String getName(){// returns
        return name;
    }
    public void setName(String n){ // returns not
        this.name = n;

    }
    public void setId(int i){// not returns
        this.id =i;
    }
    public int getId(){
        return id;
    }
}
class student{
    private int id;
    private int marks;
    private String name;
    private char division;

    public int getId(){
        return id;
    }
    public void setId(int i  ){
        if(i>0&&i<100){
            id=i;
        }
         else{
            System.out.println("error is here");
        }
    }
    public void setMarks(int j){
        marks= j;
    }
    public int getMarks(){
        return marks;
    }
    public String getName(){
        return name;
    }
    public void setName(String m  ){
         name = m;
    }
    public char getDivision(){
        return division;
    }
    public void setDivision(char x){
        division = x;
    }
}
public class chapter9 {
    public static void main(String args[]){
employees harry = new employees();
//harry.id = 55;-->
//harry.name="haridas";---->both throws errors beccause of private acces modifier
harry.setName("haridas");
harry.setId(21);
        System.out.println(harry.getName());
        System.out.println(harry.getId());
        student s1 = new student();
        s1.setName("munna");
        s1.setId(3);
        s1.setMarks(45);
        s1.setDivision('A');
        System.out.println(s1.getName());
        System.out.println(s1.getId());
        System.out.println(s1.getMarks());
        System.out.println(s1.getDivision());
        System.out.println("this program is ended and you need more practice to d0 it" );
    }
}
