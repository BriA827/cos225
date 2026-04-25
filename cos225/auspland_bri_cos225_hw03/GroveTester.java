public class GroveTester{
    public static void main(String[] args){
        Grove grove1 = new Grove("Grove 1");
        System.out.println(grove1.toString());

        int id_tracker;
        for (id_tracker = 1; id_tracker < 7; id_tracker++) {
            Tree new_tree = new Tree("000"+id_tracker, 17, "Spruce");
            grove1.PlantTree(new_tree);
        }
        System.out.println(grove1.toString());

        grove1.RemoveTree(2);
        grove1.RemoveTree(4);
        System.err.println(grove1.toString());

        id_tracker += 1;
        Tree new_tree = new Tree("000"+ id_tracker, 33, "Maple");
        grove1.PlantTree(new_tree);
        System.err.println(grove1.toString());
    }
}