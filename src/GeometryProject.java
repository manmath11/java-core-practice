import java.util.Scanner;

class circle {
    float radius;

    public float area() {
        return (float)(Math.PI * radius * radius);
    }

    public float diameter() {
        return 2 * radius;
    }

    public float circumference() {
        return (float)(2 * Math.PI * radius);
    }
}

class rectangle {
    float length, width;

    public float area() {
        return length * width;
    }

    public float perimeter() {
        return 2 * (length + width);
    }

    public float diagonal() {
        return (float)Math.sqrt(length * length + width * width);
    }
}

class triangle {
    float base, height;

    public float area() {
        return 0.5f * base * height;
    }
}

public class GeometryProject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== GEOMETRY CALCULATOR =====");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                circle c = new circle();
                System.out.print("Enter radius: ");
                c.radius = sc.nextFloat();

                System.out.println("1. Area");
                System.out.println("2. Diameter");
                System.out.println("3. Circumference");
                System.out.print("Enter option: ");
                int op = sc.nextInt();

                if (op == 1)
                    System.out.println("Area = " + c.area());
                else if (op == 2)
                    System.out.println("Diameter = " + c.diameter());
                else if (op == 3)
                    System.out.println("Circumference = " + c.circumference());

            } else if (choice == 2) {
                rectangle r = new rectangle();
                System.out.print("Enter length: ");
                r.length = sc.nextFloat();
                System.out.print("Enter width: ");
                r.width = sc.nextFloat();

                System.out.println("1. Area");
                System.out.println("2. Perimeter");
                System.out.println("3. Diagonal");
                System.out.print("Enter option: ");
                int op = sc.nextInt();

                if (op == 1)
                    System.out.println("Area = " + r.area());
                else if (op == 2)
                    System.out.println("Perimeter = " + r.perimeter());
                else if (op == 3)
                    System.out.println("Diagonal = " + r.diagonal());

            } else if (choice == 3) {
                triangle t = new triangle();
                System.out.print("Enter base: ");
                t.base = sc.nextFloat();
                System.out.print("Enter height: ");
                t.height = sc.nextFloat();

                System.out.println("Area = " + t.area());

            } else if (choice == 4) {
                System.out.println("Exiting... 👋");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}