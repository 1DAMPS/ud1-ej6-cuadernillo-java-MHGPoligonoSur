import java.util.Scanner;

public class EJ03 {

    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int edad = 0;

    System.out.println("Introduce tu edad: ");
    edad = sc.nextInt();

    System.out.print("Tienes " + edad + " años.");

    sc.close();

    }
}

