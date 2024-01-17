
/**
 * Represents a single baked good in our bakery's inventory
 *
 * @author (Amelia Zhang az111)
 * @version (1.16)
 */
public class BakedGood
{
    // instance variables
    private String name;
    private String recipe;
    private double price;
    private int quantity; 
    private double profit; 

    /**
     * Constructor for objects of class BakedGood
     */
    public BakedGood(String name, String recipe, double price, int quantity)
    {
        // initialise instance variables
        this.name = name;
        this.recipe = recipe;
        this.price = price;
        this.quantity = quantity; 
        this.profit = 0;
    }

    public void increaseQuantity(int count) {
        this.quantity += count;
    }

    //instance method to buy some baked goods
    public double purchase(int count) {
        if (count > this.quantity) {
            throw new IllegalArgumentException("you cannot buy more than our current inventory!");
        }
        this.quantity -= count; 
        this.profit = this.price*count;
        return this.profit; 
    }

    //toString
    public String toString() {
        return "baked good: " + this.name + " (" + this.quantity + " @$" + this.price + ")" + "\n" + "profit made: " + this.profit; 
    }

    public static void main(String[] args) {
        BakedGood croissant = new BakedGood("croissant", "butter, flour, laminate, yum", 20.0, 0);
        //bake a dozen croissants
        croissant.increaseQuantity(12); 
        System.out.println(croissant);
        System.out.println(croissant.purchase(3));
        System.out.println(croissant);
        //bake 3 more croissants with the leftover dough
        // croissant.increaseQuantity(3);
        // System.out.println(croissant); 
        
        
    }
}
