
import java.util.Scanner;

public class perimiterOfaTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // User Enters 3 Edges.
        System.out.println("ENTER THREE EDGES OF A TRIANGLE. "); // A

        System.out.println("  Enter the 1st EDGE!  ");
        double e1 = s.nextDouble();
        System.out.println(e1);

        System.out.println("  Enter the 2nd EDGE!  ");// 3
        double e2 = s.nextDouble();
        System.out.println(e2);

        System.out.println("  Enter the 3rd EDGE!  ");// 3
        double e3 = s.nextDouble();
        System.out.println(e3);

        // Conditidion

        if (e1 + e2 < e3 || e2 + e3 < e1 || e1 + e3 < e2) {
            System.out.println("Invalid");
        } else {
            System.out.println(e1 + e2 + e3);
        }

    }

}
