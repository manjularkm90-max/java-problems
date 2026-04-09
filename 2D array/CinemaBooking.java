import java.util.*;

public class CinemaBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        char[][] seats = new char[rows][cols];

        for (int i = 0; i < rows; i++)
            Arrays.fill(seats[i], 'A');

        int bookings = sc.nextInt();

        for (int i = 0; i < bookings; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            seats[r][c] = 'B';
        }

        int booked = 0;

        System.out.println("Seating Chart:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(seats[i][j] + " ");
                if (seats[i][j] == 'B') booked++;
            }
            System.out.println();
        }

        int total = rows * cols;
        int available = total - booked;
        double occupancy = (double) booked / total * 100;

        System.out.println("\nTotal Seats: " + total);
        System.out.println("Booked Seats: " + booked);
        System.out.println("Available Seats: " + available);
        System.out.printf("Occupancy Rate: %.2f%%\n", occupancy * 100);
    }
}
