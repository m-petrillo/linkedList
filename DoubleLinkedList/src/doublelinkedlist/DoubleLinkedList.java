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

            
    
    
     public boolean compareString(String data) {
 
        if (head == null && tail == null) {
            return true ;
            }
        else
            return false;
        
        //while (head != null && tail != null && head.data == tail.data) {
           // head = head.next;
            //tail = tail.next;
        
     }
     
     public void travFwd () {
         Link current = head;
         while(current != null){
             System.out.println(current.getData());
                   current = current.getNext();
         }
         
     }
     
     
     
     
     public void travBck()  {
        Link current = tail;
        while (current != null){
            System.out.println(current.getData());
            current= current.getPrevious();
        }
     }
             
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
    

