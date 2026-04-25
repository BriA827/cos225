public class Grove{
    Tree[] tree_array = new Tree[18];
    String name;

    public Grove(String name){
        this.name = name;
    }

    public int PlantTree(Tree tree){
        int i;
        for (i = 0; i < tree_array.length; i++) {
            if (tree_array[i] == null){
                tree_array[i] = tree;
                break;
            }
        }
        return i;
    }

    public Tree RemoveTree(int spot){
        Tree removed = tree_array[spot];
        tree_array[spot] = null;
        return removed;
    }

    public String toString(){
        int tree_num = 0;
        for (int i = 0; i < tree_array.length; i++) {
            if (tree_array[i] != null){
                tree_num += 1;
            }
        }
        return "" + tree_num + "";
    }
}