
 
  import java.util.concurrent.atomic.AtomicInteger;
  import java.util.Scanner;
  import java.util.HashSet;
  
public class BinaryTree{

    //attributes
    int val;
    BinaryTree left, right;

    //constructor
    BinaryTree(int data){
        val = data;
        left = null;
        right = null;
    }
   

    static class BinarySearchTree{

        //attributes
        private BinaryTree root;
        
        //construcotr
        BinarySearchTree(){
            root = null;
        }
    
    

        //constructor of BinaryTree
        public BinaryTree getRoot(){
            return  this.root;
         }

        public void printRoot(){
            System.out.print(root.val);
        }
    

         //method to insert element
        void insertElement(int val){
           root = insertNode(val, root);
        }
        //method to delete element
        void deleteElement(int val){
            root = deleteNode(val, root);
        }
        //method to check if element already exist in tree
        boolean searchElement(int val){
            return searchNode(val, root)==null?false:true;
        }


        //method to traverse pre order
        void printPreOrder(){
            preOrder(root); System.out.println();
        }
        
        //method to traverse in order
        void printInOrder(){
            inOrder(root); System.out.println();
        }
    
        //method to traverse post order
        void printPostOrder(){
            postOrder(root); System.out.println();
        }
    

        //insert node
        private BinaryTree insertNode(int val, BinaryTree root){
            if(root==null)
                return new BinaryTree(val);
            else if(val < root.val)
                root.left = insertNode(val, root.left);
            else
                root.right = insertNode(val, root.right);
            return root;
        }
    
        //delete node
        private BinaryTree deleteNode(int val, BinaryTree root){
            if(root==null)
                return null;
            if(root.val == val){
                if(root.left==null && root.right==null) // no child
                    return null;
                else if(root.left==null)    // only right child
                    return root.right;
                else if(root.right==null)   // only left child
                    return root.left;
    
                // both left and right are present
                BinaryTree temp = root.right;
                while(temp.left!=null)
                    temp = temp.left;
                root.val = temp.val;
                root.right = deleteNode(root.val, root.right);
            }
            else if(val < root.val)
                root.left = deleteNode(val, root.left);
            else
                root.right = deleteNode(val, root.right);
            return root;
        }


       //count number of levels 
        int levels(BinaryTree root)
        {
            if (root == null)
                return -1;
            else
            {
                /* compute the depth of each subtree */
                int lDepth = levels(root.left);
                int rDepth = levels(root.right);
      
                /* use the larger one */
                if (lDepth > rDepth)
                    return (lDepth + 1);
                 else
                    return (rDepth + 1);
            }
        }



        //display leaf nodes
        static void printLeafNodes(BinaryTree root)
        {
            
            // If node is null, return
            if (root == null)
                return;
            
            // If node is leaf node, print its data    
            if (root.left == null &&
                root.right == null)
            {
                System.out.print(root.val + " ");
                return;
            }
            
            // If left child exists, check for leaf
            // recursively
            if (root.left != null)
                printLeafNodes(root.left);
                
            // If right child exists, check for leaf
            // recursively
            if (root.right != null)
                printLeafNodes(root.right);
        }



        //mehtod to check if the tree has duplicates
        //Function that used HashSet to find presence of duplicate nodes
     boolean checkDupUtil(BinaryTree root, HashSet<Integer> s)
    {
        // If tree is empty, there are no
        // duplicates. 
        if (root == null)
            return false;
   
        // If current node's data is already present.
        if (s.contains(root.val))
            return true;
   
        // Insert current node
        s.add(root.val);
       
        // Recursively check in left and right
        // subtrees.
        return checkDupUtil(root.left, s) || checkDupUtil(root.right, s);
    }




   
    // method To check if tree has duplicates
     public boolean checkD(BinaryTree root)
    {
        HashSet<Integer> s=new HashSet<>();
        return checkDupUtil(root, s);
    }





//count the subtrees
    public static int countSubtrees(BinaryTree root, AtomicInteger count)
    {
        // base case: empty tree
        if (root == null) {
            return Integer.MIN_VALUE;
        }
 
        // if the root is a leaf node, increase the count and return root node data
        if (root.left == null && root.right == null)
        {
            count.incrementAndGet();
            return root.val;
        }
 
        // recur for the left and right subtree
        int left = countSubtrees(root.left, count);
        int right = countSubtrees(root.right, count);
 
        // 1. The left subtree is empty, and the right subtree data matches the root
        // 2. The right subtree is empty, and the left subtree data matches the root
        // 3. Both left and right subtrees are non-empty, and their data matches root
 
        if ((left == Integer.MIN_VALUE && right == root.val) ||
                    (right == Integer.MIN_VALUE && left == root.val) ||
                    (left == right && left == root.val))
        {
            // increase the count and return root node data
            count.incrementAndGet();
            return root.val;
        }
 
        // return infinity if root's data doesn't match with left or right subtree
        return Integer.MAX_VALUE;
    }
 
    // The main function to count all subtrees having the same value of nodes
    public static int countSubtrees(BinaryTree root)
    {
        // using `AtomicInteger` to get the result since `Integer` is passed by value
        // in Java
        AtomicInteger count = new AtomicInteger(0);
        countSubtrees(root, count);
 
        return count.get();
    }



     //search node
        private BinaryTree searchNode(int val, BinaryTree root){
            if(root==null || root.val==val)
                return root;
            if(val < root.val)
                return searchNode(val, root.left);
            return searchNode(val, root.right);
        }
    
        //pre order traversal
        private void preOrder(BinaryTree root){
            if(root==null) return;
            System.out.print(" " + root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    
        //in order traversal
        private void inOrder(BinaryTree root){
            if(root==null) return;
            inOrder(root.left);
            System.out.print(" " + root.val);
            inOrder(root.right);
        }
    
        //post order traversal
        private void postOrder(BinaryTree root){
            if(root==null) return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(" " + root.val);
        }
    

    }


    //driver method
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int choice;
        BinarySearchTree b = new BinarySearchTree();
        do{
            System.out.print("\n1.Create Tree\n2.Insert Element\n3.Check Duplicates\n4.Display Leaf Nodes\n5.Delete Element \n6.Search Element\n7.Levels of Tree\n8.Count Subtrees\n9.Display Root Node\n10.Print Preorder\n11.Print Inorder\n12.Print Postorder\n13.Exit\nEnter Choice: ");

            choice = obj.nextInt();
            switch(choice){

                case 1://CREATE TREE
                    b = new BinarySearchTree(); System.out.println("NEW BST CREATED."); 
                    System.out.println();
                    break;


                case 2://INSERT
                    System.out.print("Enter element to insert: ");
                    int element = obj.nextInt();

                  
                    if(element == 1 || 0 >= element ){
                        System.out.println("Cannot insert element equal to 1 or less than 1");
                       
                    }else if(b.searchElement(element) == true){
                        System.out.println("Cannot insert element that already existed");
                        b.deleteElement(element);
                    }
                    
                    else{
                        b.insertElement(element);
                  
                        System.out.println("Element Added"); 
                    }
                    
                    System.err.println();
                    break;

                  
                 case 3://Check DUPLICATES
                    System.out.println("Check for Duplicates" );
                    BinaryTree q = b.getRoot();
                    if (b.checkD(q)){
                        System.out.println("The tree has duplicates");
                
                    }
                    
                    else{
                        System.out.print("The tree has no duplicates");
                    }
                  
                    System.out.println();
                    break;


                case 4://DISPLAY LEAF NODES
                    System.out.print("The leaf nodes are: ");
                   BinaryTree a =  b.getRoot();
                   
                    b.printLeafNodes(a);

                    System.out.println();
                    break;

                case 5://DELETE
                    System.out.print("Enter element to delete: ");
                    int el = obj.nextInt(); 
                    if(b.searchElement(el)){
                        b.deleteElement(el);
                        System.out.println("Element Deleted");
                    }else{
                        System.out.println("Could not found element");
                    }
                    System.out.println();
                    break;


                case 6://SEARCH
                    System.out.print("Enter element to search: ");
                    System.out.println("Element " + (b.searchElement(obj.nextInt())?"Found":"Not Found"));
                    System.out.println();
                    break;


                case 7://LEVELS
               
                   BinaryTree r = b.getRoot();
                    System.out.println("There are " + b.levels(r) + " levels in the tree");
                    System.out.println();
                    break; 


                case 8: //COUNT THE SUBTREESS
                    BinaryTree n = b.getRoot();
                    System.out.println("There are " + b.countSubtrees(n) + " subtrees ");
                    break;

                
                case 9: //DISPLAY THE ROOT NODE
                System.out.println("The root node is: ");
                b.printRoot();
                System.out.println();
                break; 


                case 10://PRE ORDER
                    System.out.print("Pre Order:");
                    b.printPreOrder(); 
                    System.out.println();
                    break;

                case 11://INORDER
                    System.out.print("Inorder:");
                    b.printInOrder();
                    System.out.println();
                    break;

                case 12://POST ORDER
                    System.out.print("Post Order:");
                    b.printPostOrder();
                    System.out.println();
                     break;


                case 13://EXIT
                break;


            }
        }while(choice>0 && choice<13);
        obj.close();
        
    }//end of main method

}