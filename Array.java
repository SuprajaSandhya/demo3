import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] list = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        boolean isAscending = true;
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                isAscending = false;
                break;
            }
        }

        if (isAscending) {
            System.out.println("The array is in ascending order.");
        } else {
            System.out.println("The array is not in ascending order.");
        }
    }
}

    

