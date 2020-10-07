
import java.util.Scanner;

public class daysInMonths {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number between a YEAR.");

    int year = input.nextInt();

    System.out.println("PICK A MONTH FROM 1 to 12 ");

    int month = input.nextInt();

    switch (month) {
      case 1:
        System.out.println("January has 31 days " + "on" + year);
        break;

      case 2:
        if (year % 4 == 0 && year % 400 == 0 && year % 100 != 100) {
          System.out.println("February has 29 days " + "on " + year + " becuase it is a LEAP YEAR");
        } else {
          System.out.println("February has 28 day " + "on " + year);
        }
        ;
        break;
      case 3:
        System.out.println("March has 31 days " + " on " + year);
        break;
      case 4:
        System.out.println("April has 30 days " + " on " + year);
        break;
      case 5:
        System.out.println("May has 31 days " + " on " + year);
        break;
      case 6:
        System.out.println("June has 31 days " + " on " + year);
        break;
      case 7:
        System.out.println("July has 31 days " + " on " + year);
        break;
      case 8:
        System.out.println("August has 31 days " + " on " + year);
        break;
      case 9:
        System.out.println("September has 30 days " + " on " + year);
        break;
      case 10:
        System.out.println("October has 31 days " + " on " + year);
        break;
      case 11:
        System.out.println("November has 30 days " + "on " + year);
        break;
      case 12:
        System.out.println("December has 31 days " + " on " + year);
        break;
      default:
        System.out.println("Invalid");
        break;
    }

  }

}