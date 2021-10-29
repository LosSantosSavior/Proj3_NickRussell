public class merchandiseItem {
    private ItemType taxableType;
    private String Name;
    private double price;

    public String merchandiseItem(String Name, double price, ItemType type)    {
        Name = "Gaming Mouse";
        price = 50.00;
        type = taxableType;
        System.out.println("Name: " + Name + "\n Price: " + price + "");
        return Name + price + type;
    }

    public String getName() {
        return Name;
    }

    public double getPrice()    {
        return price;
    }

    public ItemType getType()   {
        return taxableType;
    }
}
