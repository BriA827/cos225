public class OrderTester{
    public static void main(String[] args){
        OrderQueue line = new OrderQueue(18); //18
        line.AddOrder("Lumiere", "10/16/26 2:14:01", 7); //18 - 7 = 11
        line.AddOrder("Bri", "10/16/26 2:14:13", 7);//11 - 7 = 4
        line.AddOrder("Xavier", "10/16/26 2:14:14", 8);//4 - 4 = 0
        System.out.println(line.toString());

        line.SellStock();
        System.out.println(line.toString());

        line.AddStock(10); // 0 + 10 = 10 , 10 - 4 = 6 (continuation from xavier)
        line.AddOrder("BunBun", "10/16/26 2:14:21", 3); //6 - 3 = 3
        line.AddOrder("Galaxy Kid", "10/16/26 2:14:22", 3); //3 - 3 = 0
        line.AddOrder("King of Darknight", "10/16/26 2:14:27", 5); // 0 stock, end here

        line.SellStock();
        System.out.println(line.toString());
    }
}