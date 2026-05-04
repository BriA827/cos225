public class MorseTree{
    TreeNode<String> tree;

    public MorseTree(){
        tree = new TreeNode<String>("");
    }

    public String preorder(){
        return tree.preorder();
    }

    public String postorder(){
        return tree.postorder();
    }

    public String encode(String message){
        message = message.toLowerCase();
        String encoded = "";
        String space = " ";
        for (int i = 0; i < message.length(); i++){
            if (message.charAt(i) != space.charAt(0)){
                encoded += tree.searchTreeTarget((""+message.charAt(i)+""), "o", "-") + " | ";
            }
        }

        return encoded;
    }

    public String decode(String message){
        message = message.toLowerCase();
        String decoded = "";
        boolean decoding = true;

        while (decoding){
            int index = message.indexOf(" | ");
            if (index == 0){
                decoding = false;
            }
            String letter = message.substring(0,index);
            decoded += tree.searchTreeInstructions(letter, "o", "-");
            if ((message.substring(index)).length() > 3){
                message = message.substring(index+3);
            }
            else{
                decoding = false;
            }
        }

        return decoded;
    }
}