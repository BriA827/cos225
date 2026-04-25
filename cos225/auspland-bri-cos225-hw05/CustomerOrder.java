public class CustomerOrder{
    String name;
    String date;
    int quantity;

    public CustomerOrder(){
        name = null;
        date = null;
        quantity = 0;
    }


    public CustomerOrder(String name, String date, int quantity){
        this.name = name;
        this.date = date;
        this.quantity = quantity;
    }

    public void ShipOrder(){
        if (quantity > 0){
            quantity -- ;
        }
    }
}