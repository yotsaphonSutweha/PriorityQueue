/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pqap;

/**
 *
 * @author yo
 */
public class PQAp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PriorityQueue pQ = new PriorityQueue();
        
        System.out.println(pQ.isEmpty());
        pQ.enqueue(3, "A");
        pQ.enqueue(1, "B");
       
        pQ.displayQ();
        
       
        
        System.out.println(pQ.size());
        
        pQ.displayQ();
        System.out.println("\n");
        pQ.enqueue(4, "o");
        pQ.enqueue(2, "r");
        
        pQ.displayQ();
        
        pQ.enqueue(6, "T");
        System.out.println("\n");
        pQ.displayQ();
        
        pQ.dequeue();
        
         System.out.println("\n");
        pQ.displayQ();
    }
    
}
