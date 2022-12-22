import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Control control = new Control();
        System.out.print("Enter your animal's type (ex. 'Dog', 'Cat' ect.): ");
        Scanner sr = new Scanner(System.in);
        control.set_animal_type(sr.nextLine());
    }
}