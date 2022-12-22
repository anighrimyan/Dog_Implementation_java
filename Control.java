/* In this file is implemented the Control class */
import java.util.Scanner;
public class Control {
    public String _animal_type;
    Scanner sr = new Scanner(System.in);
    public void set_animal_type(String animal_type) {
        if (animal_type.equals("Dog")) {
            _animal_type = animal_type;
            input_anilmal_info(_animal_type);
        }
        else {
            System.out.println("We do not have this type of animal defined");
            System.exit(-1);
        }
    }
    public String get_animal_type() {
        return _animal_type;
    }
    public void input_anilmal_info(String _animal_type) {
        Dog dog = new Dog();
        System.out.print("Name: ");
        dog.set_name(sr.nextLine());
        System.out.println();
        System.out.println("If your animal is Vegetarian enter 'Yes', if isn't enter 'No'. ");
        System.out.print("Vegetarian: ");
        dog.set_vegetarian(sr.nextLine());
        System.out.println();
        System.out.print("Food's name: ");
        dog.set_food_name(sr.nextLine());
        System.out.println();
        System.out.print("Dog's age: ");
        dog.set_age(sr.nextInt());
        System.out.println();
        System.out.print("Dog's color: ");
        dog.set_dog_color(sr.nextLine());
        System.out.println();
        System.out.print("Dog's sort: ");
        dog.set_dog_sort(sr.nextLine());
        System.out.println();
        System.out.print("I have a " + _animal_type + ". His name is " +
                dog.get_name() + ". My dog is " + dog.get_age() + " years old, and he is " +
                dog.get_dog_color() + ". He is not a " + dog.get_vegetarian() + ", he likes " +
                dog.get_food_name() + ". Isn't it " +  dog.get_name() + "? ");
        dog._voice();
        dog._eat();
        dog._sleep();
    }
}