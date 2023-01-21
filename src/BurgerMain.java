public class BurgerMain {
    public static void main(String[] args){
        Burger regular = new Burger("bun ", "chiken ", "cheddar ", "lettuce ", "mayonnaise");
        Burger diet = new Burger("bun ", "chicken ", "cheddar ", "lettuce");
        Burger doubleMeat = new Burger("bun ", "chiken ", "cheddar ", "lettuce ", "mayonnaise", true);
    }
}
