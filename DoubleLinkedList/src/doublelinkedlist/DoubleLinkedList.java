/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlist;

/**
 *
 * @author Mike
 */
public class DoubleLinkedList {
    
    private Link head;
    private Link tail;
    private int size = 0;
    private int index;
    
    
    
    public DoubleLinkedList(){
        head = null;
        size = 0;
                
    }
    
    
    //adds to front of list
    public void addFront(String data){
        Link newLink = new Link(data);
        if(head == null)
            tail = newLink;
        else{
            head.setPrevious(newLink);
        }
        newLink.setNext(head);
        head = newLink;
        }

            
    
    //compares list nodes
     public boolean compareString(String data) {
 
        if (head == null && tail == null) {
            return true ;
            }
        else
            return false;
        
        
        
     }
     //traverse forward method
     public void travFwd () {
         Link current = head;
         while(current != null){
             System.out.println(current.getData());
                   current = current.getNext();
         }
         
     }
     
     
     
     //traverse back method
     public void travBck()  {
        Link current = tail;
        while (current != null){
            System.out.println(current.getData());
            current= current.getPrevious();
        }
     }
      //delete node method       
     public void DelNode(String data) {
         if(head==null) {
             return;
         }
         else
         {
         head=head.getNext();
     }
}
     
     
    public int size() {
          return size;
      }

    public boolean isEmpty(){
        return head == null;
    }
    
    public static void main(String[] args) {
        DoubleLinkedList Car = new DoubleLinkedList();
        Car.addFront("5");
        Car.addFront("10");
        Car.addFront("200");
        Car.addFront("55");
        Car.addFront("67");
        Car.addFront("92");
        System.out.println(Car.size());
      Car.travBck();
        Car.travFwd();
        
     
      
   
     }
    }
    

