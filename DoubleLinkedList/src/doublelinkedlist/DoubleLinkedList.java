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
    private string size;
    
    
    public DoubleLinkedList(){
        head = null;
        size = 0;
                
    }
    
    
    public void addFront(int data){
      if (head == null)
          head = new Link(null, data, null);
      else {
          Link newLink = new Link(null, data, head);
          head.previous = newLink;
          head = newLink;
      }

    public boolean isEmpty(){
        return head == null;
    }
    
    public static void main(String[] args) {
        
        
        
   
     }
    }
    
}
