/* In this file is implemented the Animal class */

public class Animal {
    private String _name;
    private String _food_name;
    private String _vegetarian;
    private int _age;

    public void set_name(String name) {
        _name = name;
    }
    public String get_name() {
        return _name;
    }
    public void set_food_name(String food_name) {
        _food_name = food_name;
    }
    public String get_food_name() {
        return _food_name;
    }
    public void set_vegetarian(String vegetarian) {
        _vegetarian = vegetarian;
    }
    public boolean get_vegetarian() {
        if (_vegetarian == "Yes")
          return true;
        return false;
    }
    public void set_age(int age) {
        if (age > 0) {
            _age = age;
        } else {
            System.out.println("Age value can not be negative value.");
            System.exit(-1);
        }
    }
    public int get_age() {
        return _age;
    }
    public void _eat() {}
    public void _voice() {}
    public void _sleep() {
        System.out.println("Now you must go to sleep, dear" + _name + ". By BY!!!!");
    }
}
