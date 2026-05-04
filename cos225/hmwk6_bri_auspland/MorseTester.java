public class MorseTester{
    public static void main(String[] args){
        MorseTree morse_tree = new MorseTree();

        morse_tree.tree.insertLeft("e"); // o
        morse_tree.tree.insertRight("t"); // -

        morse_tree.tree.getLeft().insertLeft("i"); // o o
        morse_tree.tree.getLeft().insertRight("a"); // o -

        morse_tree.tree.getRight().insertLeft("n"); // - o
        morse_tree.tree.getRight().insertRight("m"); // - -

        morse_tree.tree.getLeft().getLeft().insertLeft("s"); // o o o
        morse_tree.tree.getLeft().getLeft().insertRight("u"); // o o -

        morse_tree.tree.getLeft().getRight().insertLeft("r"); // o - o
        morse_tree.tree.getLeft().getRight().insertRight("w"); // o - -

        morse_tree.tree.getRight().getLeft().insertLeft("d"); // - o o
        morse_tree.tree.getRight().getLeft().insertRight("k"); // - o -

        morse_tree.tree.getRight().getRight().insertLeft("g"); // - - o
        morse_tree.tree.getRight().getRight().insertRight("o"); // - - -

        morse_tree.tree.getLeft().getLeft().getLeft().insertLeft("h"); // o o o o
        morse_tree.tree.getLeft().getLeft().getLeft().insertRight("v"); // o o o -

        morse_tree.tree.getLeft().getLeft().getRight().insertLeft("f"); // o o - o
        morse_tree.tree.getLeft().getRight().getLeft().insertLeft("l"); // o - o o

        morse_tree.tree.getLeft().getRight().getRight().insertLeft("p"); // o - - o
        morse_tree.tree.getLeft().getRight().getRight().insertRight("j"); // o - - -

        morse_tree.tree.getRight().getLeft().getLeft().insertLeft("b"); // - o o o
        morse_tree.tree.getRight().getLeft().getLeft().insertRight("x"); // - o o -

        morse_tree.tree.getRight().getLeft().getRight().insertLeft("c"); // - o - o
        morse_tree.tree.getRight().getLeft().getRight().insertRight("y"); // - o - -

        morse_tree.tree.getRight().getRight().getLeft().insertLeft("z"); // - - o o
        morse_tree.tree.getRight().getRight().getLeft().insertRight("q"); // - - o -

        System.out.println(morse_tree.preorder());
        System.out.println(morse_tree.postorder());

        System.out.println("");

        String e1 = morse_tree.encode("The quick fox");
        System.out.println(e1);

        String d1 = morse_tree.decode(e1);
        System.out.println(d1);
    }
}