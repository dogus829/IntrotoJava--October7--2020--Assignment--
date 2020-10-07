import java.io.PrintStream;
import java.util.Scanner;

public class rockPaperScicors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("scissor(0), rock(1), paper(2)");
        double userNum = input.nextDouble();

        double computerRandomNum = Math.floor(Math.random() * 3);

        // Condition
        if (computerRandomNum == userNum) {
            System.out.println("Draw");
        } else if (userNum == 0 && computerRandomNum == 1) {
            System.out.println("Computer won, Rock beats Scissors.");
        } else if (userNum == 0 && computerRandomNum == 2) {
            System.out.println("Computer lost, Scissors beats Paper.");
        } else if (computerRandomNum == 2 && userNum == 1) {
            System.out.println("Computer lost, Scissors beats Paper.");
        }

        if (computerRandomNum == 0 && userNum == 1) {
            System.out.println("Computer lost, Rock beats Scissors.");
        } else if (computerRandomNum == 0 && userNum == 2) {
            System.out.println("Computer won, Scissors beat papers.");
        } else if (computerRandomNum == 1 && userNum == 2) {
            System.out.println("Computer lost, Paper beats Rocks");
        }

    }

}
