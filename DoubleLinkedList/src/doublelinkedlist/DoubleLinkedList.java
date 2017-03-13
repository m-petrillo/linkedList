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
    private int size;
    
    
    public DoubleLinkedList(){
        head = null;
        size = 0;
                
    }
    
    
    public void addFront(String data){
      if (head == null)
          head = new Link(data);
      else {
          Link newLink = new Link(null, data, head);
          head.previous = newLink;
          head = newLink;
          size++;
      }
    }
    
     public void compareString(String data) {
 
        if (head == null && tail == null) {
            return head;
        }
        while (head != null && tail != null && head.data == tail.data) {
            head = head.next;
            tail = tail.next;
        }
     }
     
     public void travFwd(String data) {
          if (head.previous != null)
              head = head.next;
          else{
              return index;
         }
     }
     
     public void travBck(String.data)  {
         if(head.next != null)
             head = head.back
                     else {
             return index;
         }
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
       // Car.print();
        
   
     }
    }
    

