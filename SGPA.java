package SGPA;

import java.util.Scanner;

public class SGPA {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(
        "Enter sub1 gradepoint & credit(in separate lines)"
            + "\n"
            + "Note: If asked for more than the subjects u have, enter 0");
    float gp1 = sc.nextFloat();
    float credit1 = sc.nextFloat();

    System.out.println("Enter sub2  gradepoint & credit");
    float gp2 = sc.nextFloat();
    float credit2 = sc.nextFloat();

    System.out.println("Enter sub3 gradepoint & credit");
    float gp3 = sc.nextFloat();
    float credit3 = sc.nextFloat();

    System.out.println("Enter sub4 gradepoint & credit");
    float gp4 = sc.nextFloat();
    float credit4 = sc.nextFloat();

    System.out.println("Enter sub5 gradepoint & credit");
    float gp5 = sc.nextFloat();
    float credit5 = sc.nextFloat();

    System.out.println("Enter sub6 gradepoint & credit");
    float gp6 = sc.nextFloat();
    float credit6 = sc.nextFloat();

    System.out.println("Enter sub7 gradepoint & credit");
    float gp7 = sc.nextFloat();
    float credit7 = sc.nextFloat();

    System.out.println("Enter sub8 gradepoint & credit");
    float gp8 = sc.nextFloat();
    float credit8 = sc.nextFloat();

    float mul1 = gp1 * credit1;
    float mul2 = gp2 * credit2;
    float mul3 = gp3 * credit3;
    float mul4 = gp4 * credit4;
    float mul5 = gp5 * credit5;
    float mul6 = gp6 * credit6;
    float mul7 = gp7 * credit7;
    float mul8 = gp8 * credit8;

    float num = mul1 + mul2 + mul3 + mul4 + mul5 + mul6 + mul7 + mul8; // Numerator
    float sumc = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8;
    float sgpa = num / sumc;
    float percent=(float)((sgpa-0.75)*10);
    System.out.println("your SGPA = " + sgpa);
    System.out.println("Percentage = " + percent);
    
  }
}
