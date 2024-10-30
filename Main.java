import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // TODO: Problem 1
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two integers: ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    if (num2 == 0) {
      System.out.println("Error cannot divide by 0");
    } else {
      double num3 = ((double) num1) / num2;
      if ((num3 >= 1) && (num3 <= 8)) {
        System.out.println("Ratio Ok");
      }
    }

    // TODO: Problem 2
    System.out.println("Enter two integers: ");
    int num3 = sc.nextInt();
    int num4 = sc.nextInt();
    if (num4 == 0) {
      System.out.println("Error, cannot divide by 0");
    } else {
      if (num3 % num4 == 0) {
        System.out.println("Is a factor");
      }
    }
    // TODO: Problem 3
    System.out.println("Type in an integer: ");
    int num5 = sc.nextInt();
    if ((num5 >= 50) && (num5 <= 59)) {
      System.out.println("Your number is " + num5);
    } else {
      System.out.println("That's not in the fifties!");
      num5 = 55;
      System.out.println("Your number is " + num5);
    }
    // TODO: Problem 4
    System.out.println("Enter two numbers: ");
    double numx = sc.nextDouble();
    double numy = sc.nextDouble();
    if ((numy <= 9) || ((numx > 2) && ((numx * numy) > 10))) {
      System.out.println("Pass");
    }
  }

  // TODO: In-class assignment
  // Create a method that takes in two Rectangles and returns
  // true if they are equal, and false otherwise. Two
  // Rectangles are considered equal if their widths are equal,
  // and if their lengths are equal.
  public static boolean rectEqual(Rectangle r1, Rectangle r2) {
    if (r1.equals(r2)) {
      return true;
    }
    return false;
  }
}
