import java.util.ArrayList;

public class BusinessCustomer extends Customer{
    private double purchaseOrderBalance;

    public BusinessCustomer(String Name, int ID) {
        super(Name, ID);
    }

    public <ItemForSale> double PayForOrder(ArrayList<ItemForSale> itemsInOrder) {
        System.out.println("This order will be for " +Name+ " and it will be payed with a purchase order.");
        itemsInOrder = itemsInOrder * ;
        return 0;
    }

    public double payOutstandingBalance()   {
        if (purchaseOrderBalance > 1000)    {
            purchaseOrderBalance = purchaseOrderBalance * .05;
        }
        double temp = purchaseOrderBalance;
        purchaseOrderBalance = 0;
        return temp; //resets the outstanding balance to 0

    }

    public String arrangeDelivery()   {
        return Name + ", all deliveries must be from 9-5 Mon-Fri."; //Returns java.lang.String
    }
}
