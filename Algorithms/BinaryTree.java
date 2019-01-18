public class binaryTree
{
    
    public static void main(String [] args){
        Node myBinaryTree = new Node(5);
        
        myBinaryTree.insert(9);
        myBinaryTree.insert(99);
        myBinaryTree.insert(2);
        myBinaryTree.insert(56);
        myBinaryTree.insert(69);
        
        System.out.println("Does tree contain 99: " + myBinaryTree.contains(99));
        System.out.println("Does tree contain 101: " + myBinaryTree.contains(101));
        
        myBinaryTree.printInOrder();
        System.out.println("Smallest value is "+ myBinaryTree.minValue(myBinaryTree));
        System.out.println("Largest value is "+ myBinaryTree.maxValue(myBinaryTree));
        
        boolean b = myBinaryTree.deleteNode(56, myBinaryTree);
        System.out.println("Post deletion: ");
        myBinaryTree.printInOrder();
    }
}

class Node{
    Node left, right;
    int data;
    public Node(int data){
        this.data = data;
    }
    
    /*
     * This is a basic insert method for a Binary tree.
     * We read in a value and firstly check if it is smaller than root node's data value.
     * If it is smaller, we will insert it to the left.
     * First we check if the left is empty, aka null, if it is we create a new left node
     * that is populated with the data value.
     * Else, we call the left's insert method and pass in our value to recursively call the 
     * same method on this sub-node.
     * The process is then repeated.
     * 
     * If value is larger than data, we go to the right of root and check if root is empty.
     * If it is empty a new node is created and populated with this value.
     * Else, the right's insert method is called passing the value parameter and the process
     * is repeated on this sub-node to the right.
     * 
     */
    
    public void insert(int value){
        if(value <= data){
            if(left == null){
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else{
            if(right == null){
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }
    
    /*
     * This method will return true or false depending on if it finds a particular value.
     * If the root node contains the value, return true.
     * Else if the value we are looking for is smaller than the root node value go to the left.
     * If left is null, return false as we could not find the value.
     * Else, call the contains method again on that particular node and pass the value as a 
     * parameter.
     * If value is larger than the root value, to the right and repeat the process until the
     * correct value is found.
     * When true or false is found, this is returned recursively up through the program.
     * 
     * 
     */
    
    
    public boolean contains(int value){
        if(value == data){
            return true;
        } else if (value < data){
            if(left == null){
                return false;
            } else{
                return left.contains(value);
            }
        } else{
            if(right == null){
                return false;
            } else {
                return right.contains(value);
            }
        }
    }
    
    /*
     * How to print the contents of a binary search tree in order:
     *                10
     *          5           15
     *          
     *              8
     *  10 is going to call left.printInOrder() because its left is not null.
     *  5 is going to skip the left.printInOrder() because its left is null.
     *  5 is going to be printed and it is going to call right.printInOrder() and go to 8.
     *  8 is going to skip left.printInOrder(), it will then print 8 and then skip right.printInOrder().
     *  We then go back to the root, print the root and call right.printInOrder(), going to 15.
     *  15 will skip left.printInOrder(), it will print 15 and then skip right.printInOrder().
     *  Completing the process.
     *              
     */
    
    public void printInOrder(){
        if(left != null){
            left.printInOrder();
        }
    
        System.out.println(data);
        
        if(right != null){
            right.printInOrder();
        }
    }
    
    //This is a change in the order of implementation of values
    public void printPreOrder(){
        System.out.println(data);
        
        if(left != null){
            left.printPreOrder();
        }
        
        if(right != null){
            right.printPreOrder();
        }
    
    }
    
    //This is a different way of implementation of values.
    public void printPostOrder(){
        if(left != null){
            left.printInOrder();
        }
        
        if(right != null){
            right.printInOrder();
        }
        
        System.out.println(data);
    }
    
    /*
     * This method finds the smallest value in a Binary tree. This will always be the leftmost
     * value.
     * So iterate through until the left node you are is the leaf node, then return the data
     * associated with it.
     */
    
    public int minValue(Node node){
        Node current = node;
        while(current.left != null){
            current = current.left;
        }
        return current.data;
    }
    
    /*
     * To find the largest value in a Binary tree, this will always be the rightmost value so
     * replace the previous code with right instead of left.
     * 
     */
    
    public int maxValue(Node node){
        Node current = node;
        while(current.right != null){
            current = current.right;
        }
        return current.data;
    }
    /*
     * Deletion in a Binary tree is tricky. There are several key steps:
     * - Start by finding the node you want to delete
     * - Then check if it is a root
     * - Then consider one of three cases:
     *   - The node to be deleted is a leaf
     *   - The to be deleted has only one child
     *   - The node to be deleted has two children
     */
    
    
    public boolean deleteNode(int key, Node root){
        Node current = root;
        Node parent = root;
        boolean isLeft = true;
        //This is going to loop through until it finds the value we are looking for.
        while(current.data != key){
            parent = current;
            if(key < current.data){
                isLeft = true;
                current = current.left;
            } else {
                isLeft = false;
                current = current.right;
            }
            if(current == null){
                return false;
            }
        }
        
        System.out.println("Found " + current.data);
        
        //Step 2: Find out if this node is a leaf, if so set it to null creating a delete
        
        if(current.left == null && current.right == null){
            if(current == root){
                root = null;
            } else if(isLeft){
                parent.left = null;
            } else {
                parent.right = null;
            }
        }
        
        
        //Delete node with one child
        
        else if (current.right == null) {       //when the right node is null move to the left
            if(current == root){
                root = current.left;
            } else if(isLeft){
                parent.left = current.left;
            } else{
                parent.right = current.left;
            }
        }
        
        else if (current.left == null) {        //when the left node is null move to the right
            if(current == root){
                root = current.right;
            } else if(isLeft){
                parent.left = current.right;
            } else{
                parent.right = current.right;
            }
        }
        
        //Delete when there are two children.
        
        //The successor is the value to the right of the one we want deleted. 
        //The deleted node's parent will point to the successor and the deleted node's
        //left value will now become a left child of the successor.
        
        else {
            Node successor = getSuccessor(current);
            if(current == root){
                root = successor;
            } else if(isLeft){
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            
            successor.left = current.left;
        }
        
        return true;
    }
    
    /*
     * This gets the value of node which is the successor of the one we want to delete.
     * and returns it back to the delete function
     */
    
    public Node getSuccessor(Node node){
         Node successorParent = node;
         Node successor = node;
         Node current = node.right;
         while(current != null){
             successorParent = successor;
             successor = current;
             current = current.left;
         }
         
         if(successor != node.right){
             successorParent.left = successor.right;
             successor.right = node.right;
         }
         
         return successor;
    }
}