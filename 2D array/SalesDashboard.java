import java.util.*;

public class SalesDashboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int products = sc.nextInt();
        int regions = sc.nextInt();

        int[][] sales = new int[products][regions];

        for (int i = 0; i < products; i++)
            for (int j = 0; j < regions; j++)
                sales[i][j] = sc.nextInt();

        System.out.println("Sales Data:");
        for (int[] row : sales) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }

        int maxTotal = 0, bestProduct = 0;

        System.out.println("\nProduct-wise Total Sales:");
        for (int i = 0; i < products; i++) {
            int sum = 0;
            for (int j = 0; j < regions; j++)
                sum += sales[i][j];

            System.out.println("Product " + (i + 1) + ": " + sum);

            if (sum > maxTotal) {
                maxTotal = sum;
                bestProduct = i + 1;
            }
        }

        System.out.println("\nBest-Selling Product: Product " + bestProduct + " with " + maxTotal + " units");
    }
}
