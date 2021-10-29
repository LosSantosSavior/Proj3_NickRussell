import java.util.ArrayList;

public class BusinessCustomer extends Customer{
    private double purchaseOrderBalance;

    public BusinessCustomer(String Name, int ID) {
        super(Name, ID);
    }

    public <ItemForSale> double PayForOrder(ArrayList<ItemForSale> itemsInOrder) {

    }

    public double payOutstandingBalance()   {
        if (purchaseOrderBalance > 1000)    {
            purchaseOrderBalance = purchaseOrderBalance * .05;
        }
        return purchaseOrderBalance;

    }

    public String arrangeDelivery()   {
        return Name + ", all deliveries must be from 9-5 Mon-Fri."; //Returns java.lang.String
    }
}
