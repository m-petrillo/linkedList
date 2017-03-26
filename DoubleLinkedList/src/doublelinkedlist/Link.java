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
    private Link previous;
    private Link next;
    private Link tail;
    
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
//Sets up what gets returned when each link is called
public String getData (){
    return data;
}

public void setData (String str){
    data = str;
}

public Link getNext(){
    return next;
}

public void setNext(Link newLink){
    next = newLink;
}

public Link getPrevious(){
    return previous;
}

public void setPrevious(Link newLink){
    previous = newLink;
    
}


   
}



