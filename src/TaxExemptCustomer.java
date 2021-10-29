import java.util.ArrayList;

public class TaxExemptCustomer extends Customer{
    public TaxExemptCustomer(String Name, int ID) {
        super(Name, ID);
    }

    public double PayForOrder(ArrayList<ItemForSale> itemsInOrder) {

    }

    public void arrangeDelivery()    {
        System.out.println("Please contact " +Name+  " on the day of delivery.");
    }
}
