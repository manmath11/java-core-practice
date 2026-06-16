
    class Employee{
        int id;
        String name;
        int salary;
        public void printdetails(){
            System.out.println("my id is "+ id);
            System.out.println("and my name is" + name);
        }
        public int getsalary(){
            return salary;
        }

    }
    public class custom_class {
    public static void main (String args[]){
        System.out.println("this is our coustom class!");
        Employee harry = new Employee();// instantiating a new employee object
        Employee john = new Employee();// instantiating a new employee object

// setting attributes
        harry.id = 12;
        harry.name = "code with haerry";
        harry.salary = 101;

        john.id = 12;
      john.name = "john tripathi";
      john.salary=10;


      harry.printdetails();
      john.printdetails();
int salary = john.getsalary();
        System.out.println(salary);
    }
}
