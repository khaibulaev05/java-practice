import java.util.Scanner;

public class practiceGPT {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How old are you:");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("ADULT");
        } else {
            System.out.println("Child");
        }

        input.close();
    }
}
