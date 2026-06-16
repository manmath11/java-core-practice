import java.util.Scanner;

public class BinarySearch {

    static int binarySearch(int[] a, int n, int item) {
        int beg = 0, end = n - 1, mid;

        while (beg <= end) {
            mid = (beg + end) / 2;

            if (a[mid] == item)
                return mid;
            else if (item < a[mid])
                end = mid - 1;
            else
                beg = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[50];
        int n, item;

        System.out.print("Enter size of array: ");
        n = sc.nextInt();

        System.out.println("Enter elements in sorted order:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        item = sc.nextInt();

        int result = binarySearch(a, n, item);

        if (result != -1)
            System.out.println("Item found at position " + (result + 1));
        else
            System.out.println("Item not found");

        sc.close();
    }
}