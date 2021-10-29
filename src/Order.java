import java.util.ArrayList;

/**
 * Class Order
 */
public class Order {

  //
  // Fields
  //

  private ShippingAddress destination;
  private Customer orderedBy;
  private ArrayList<merchandiseItem> cartForOrder;

  public void setCartForOrder(ArrayList<merchandiseItem> cartForOrder) {
    this.cartForOrder = cartForOrder;
  }

  /**
   * @param        dest
   * @param        cust
   */
  public Order(ShippingAddress dest, Customer cust)
  {
    destination = dest;
    orderedBy = cust;
  }

  //
  // Methods
  //

  /**
   * @return       String
   */
  public String getDestination()
  {
    return destination.toString();
  }


  /**
   * @return       String
   */
  public String getOrderer()
  {
    return orderedBy.toString();
  }





}
