class base{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x= x;
    }
    public void printme(){
        System.out.println("i am the constructor");
    }
}
class derived extends base
{
    int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
public class inheritance {
    public static void main(String args[]) {

        derived d = new derived();

        d.setX(10);   // inherited method
        d.setY(20);   // own method

        System.out.println("X = " + d.getX());
        System.out.println("Y = " + d.getY());

        d.printme(); // inherited
    }
}
