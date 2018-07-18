/**
 * Basic Linked List with discription of each action/method
 * 
 * 
 */


public class linkedList1
{
    public static void main(String [] args){
        LinkList myList = new LinkList();
        
        myList.insertFirst(1, 55);
        myList.insertFirst(2, 12);
        myList.insertFirst(3, 70);
        myList.insertFirst(4, 99);
        
        myList.displayList();
        
        myList.deleteFirst();
        
        System.out.println(myList.isEmpty());
        
        myList.displayList();
        
        Link specificLink = myList.find(3);
        if(specificLink.id == 12){
            System.out.println("Could not find link");
        }else{
            System.out.println("Found: " + specificLink.data);
        }
        
        myList.delete(2);
        System.out.println("After deleting: ");
        myList.displayList();
    }
}

class Link{
    public int id;
    public double data;
    public Link next;
    
    public Link(int id, double data){
        this.id = id;
        this.data = data;
    }
    
    public void displayLink(){
        System.out.println(id + " " + data);
    }
}

class LinkList{
    //Link created
    private Link first;
    //Its set to null
    public LinkList(){
        first = null;
    }
    
    /*
     * Returns true/false if the first link is null
     */
    
    public boolean isEmpty(){
        return (first == null);
    }
    
    /*
     * This populates a linked list with a new value at the start,
     * You create a new link.
     * You make it's next point to the first in the linked list
     * First is then made into this new link
     */
    
    public void insertFirst(int id, double data){
        Link newLink = new Link(id, data);
        newLink.next = first;
        first = newLink;
    }
    
    /*
     * To delete a link, make first equal to the next link in the list and
     * the one out of memory will be lost/garbage collected
     */
    
    public void deleteFirst(){
        //Link temp = first;
        first = first.next;
        //return temp;
    }
    
    /*
     * Loops through each link until the current one points to null.
     * Calls display link on each link printing its contents.
     */
    
    public void displayList(){
        System.out.println("List (First to last): ");
        Link current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
    
    /*
     * How to find a specific link using a key.
     * Create a local link object that points to the first link
     * loop through using its id not equal to the key wanted
     * return nothing if nothing is found
     * else move onto the next link
     * Once found the link, exit the loop and return the link object
     */
    
    public Link find(int key){
        Link current = first;
        while(current.id != key){
            if(current.next == null){
                return null;
            } else{
                current = current.next;
            }
        }
        return current;
    }
    
    /*
     * How to delete a specific link.
     * Loops through until it finds the specific link
     */
    
    public Link delete(int key){
        Link current = first;
        Link previous = first;
        
        while(current.id != key){
            
            //This if else moves through the linked list
            if(current.next == null){
                return null;
            }
            else{
                previous = current;
                current = current.next;
            }
        }
        
        //Its found it
        //If the value is the first one, just make first equal the next link and ignore the 
        //first so it gets garbage collected
        
        /*
         * previous points to the one beyond the link we want deleted, thus removing it and 
         * garbage collecting it.
         */
        if(current == first){
                first = first.next;
            }
            else{
                previous.next = current.next;
            }
        return current;
    }
}