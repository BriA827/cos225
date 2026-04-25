public class OrderQueue{
    LinkedQueue<CustomerOrder> queue;
    int stock;
    int size;

    public OrderQueue(){
        queue = new LinkedQueue<CustomerOrder>();
        stock = 0;
        size = 0;
    }

    public OrderQueue(int stock){
        queue = new LinkedQueue<CustomerOrder>();
        this.stock = stock;
        size = 0;
    }

    public void AddOrder(String name, String date, int quantity){
        queue.enqueue(new CustomerOrder(name, date, quantity));
    }

    public void AddStock(int stock){
        this.stock += stock;
    }

    public void FulfillOrder(){
        CustomerOrder customer = queue.getFront();
        if (customer.quantity > 0){
            customer.ShipOrder();
            stock -- ;
        }
        else {
            queue.dequeue();
        }
    }

    public void SellStock(){
        while (stock > 0){
            FulfillOrder();
        }
        if (stock == 0 && queue.getFront().quantity == 0){
            queue.dequeue();}
    }

    public String toString(){
        String amount = "" + queue.getFront().quantity + "";
        return amount;
    }
}