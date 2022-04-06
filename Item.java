public class Item {
    
    // MEMBER VARIABLES
    private String name;
    private double price;
    
    public Item(){

    }
    // CONSTRUCTOR
    //   Takes a name and price as arguments 
    //   and sets them accordingly
    public Item(String name, double price) {
        this.name = name;
        this.price= price;
    }

    // GETTERS & SETTERS  - for name and price
        // getters----------------------------
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    // setters-----------------------------
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}