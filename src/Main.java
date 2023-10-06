import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String name;

        System.out.println("Enter name: ");
        name = scnr.next();
        System.out.println("Hello " + name);
    }
}