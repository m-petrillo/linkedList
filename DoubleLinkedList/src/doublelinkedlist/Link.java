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
public class Link {
    
    private String data;
    public Link previous;
    public Link next;
    
    public Link (String data){
        previous = null;
        this.data = data;
        next = null;
    }
   public Link (Link previous, String data, Link next){
       this.previous = previous;
       this.data = data;
       this.next = next;
       

}

public String Data (){
    return data;
}
}



