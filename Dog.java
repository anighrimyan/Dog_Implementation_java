/* In this file is implemented the Dog class */
public class Dog extends Animal {
    private String _dog_color;
    private String _dog_sort;
    public void set_dog_color(String dog_color) {
        _dog_color = dog_color;
    }
    public String get_dog_color() {
        return _dog_color;
    }
    public void set_dog_sort(String dog_sort) {
        _dog_sort = dog_sort;
    }
    public String get_dog_sort() {
        return _dog_sort;
    }
    private void _bark() {
        System.out.println("Waf-waf");
    }
    @Override
    public void _eat() {
      if (!get_vegetarian()) {
          System.out.println("I want to eat meat.");
      } else if (get_vegetarian()){
          System.out.println("I don't like vegetables and fruits.");
      } else {
          System.out.println("Wrong answer.");
          System.exit(-1);
      }
    }
    @Override
    public void _voice() {
        _bark();
    }
}
