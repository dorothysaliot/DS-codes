public class BinaryTree{

     //attributes for BinaryTree class
     private Node root;

     //constructor for BinaryTree
      BinaryTree(){
         root = null;
     }

    static class Node{

        //attributes for Node class
        int value;
        Node left;
        Node right;

        //constructor for class Node
         Node(int value){
            this.value = value;
            left = null;
            right = null;
        }
        public void displayData(){
            System.out.print(value + " ");
        }
    }

   


    //method to display the data
   

    //method to insert data 
    public void insert(int i){
        root = insert(root,i);
    }

    // method to insert data
    public Node insert(Node node, int value){
        if(node == null){
            return new Node(value);
        }
        if(value < node.value){
            node.left = insert(node.left,value);
        }
        else if(value > node.value){
            node.right = insert(node.right,value);
        }
        return node;
    }

    //method to search node in binary search tree
    public Node find(int searchedValue){
        Node current = root;
        while(current.value != searchedValue){
            if(searchedValue < current.value){
                current = current.left;
            }else{
                current = current.right;
                if(current == null){
                    return null;
                }
            }
        }
        return current; 
    }

    //method for traversing the tree in order
    public void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            node.displayData();
            inOrder(node.right);
        }
    }

    //method for Pre order Traversal
    public void preOrder(Node node){
        if(node != null){
            node.displayData();
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    //method for Pos order Traversal
    public void postOrder(Node node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            node.displayData();
        }
    }

    //driver method
    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();
        bst.insert(23);
        bst.insert(45);
        bst.insert(46);

        System.out.println("in order traversal:");
        bst.inOrder(bst.root);

        System.out.println("\nin post order traversal:");
        bst.postOrder(bst.root);

        System.out.println("\nin pre order traversal:");
        bst.preOrder(bst.root);

        //to find 
    
   
      
    }
   

}