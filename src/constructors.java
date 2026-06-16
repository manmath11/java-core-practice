class myemployees{
    private int id ;
    private String name;
public myemployees(){
    id = 45;
    name = "your-name-here";
}
public myemployees(String myName, int myId){
    id = myId;
    name = myName;

}
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
    public class constructors {
    public static void main (String args[]){
        myemployees E1 = new myemployees();// here you can pass any argument the programme will decide biy itself
       // E1.setName ("annasaheb");                          //usess the any constructor
        //E1.setId(22);
        System.out.println(E1.getId());
        System.out.println(E1.getName());


    }
}
