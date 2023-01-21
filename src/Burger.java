public class Burger {
    String bun;
    String meat;
    String cheese;
    String greenery;
    String mayonnaise;

    public Burger(String bun, String meat, String cheese, String greenery, String mayonnaise){
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayonnaise = mayonnaise;

        System.out.println("Склад звичайного бургера: " + this.bun + "" + this.meat + "" + this.cheese + "" + this.greenery + "" + "" + this.mayonnaise);
    }

    public Burger(String bun, String meat, String cheese, String greenery){
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;

        System.out.println("Склад дієтичного бургера: " + this.bun + "" + this.meat + "" + this.cheese + "" + this.greenery);
    }

    public Burger(String bun, String meat, String cheese, String greenery, String mayonnaise, boolean isDoule){
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayonnaise = mayonnaise;

        String result = this.meat;
        if(isDoule){
            result += this.meat;
        }
        System.out.println("Склад бургера з подвійним м'ясом: " + this.bun + "" + result + "" + this.cheese + "" + this.greenery + "" + this.mayonnaise);
    }
}
