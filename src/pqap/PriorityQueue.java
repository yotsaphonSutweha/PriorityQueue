/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pqap;

import java.util.ArrayList;

/**
 *
 * @author yo
 */
public class PriorityQueue implements PQInterface {
    
   
    private ArrayList<QueueElement> elem;
    
    public PriorityQueue(){
        elem = new ArrayList<>();
    }
     @Override
    public int size() {
        return elem.size();
    }
    @Override
    public void enqueue(int priorKey, Object e) {
        int index;
        
        QueueElement qe = new QueueElement(priorKey,e);
        
        index = findInsertPosition(priorKey);
        
        if(index > size()){
            elem.add(qe);
        }
        else{
            elem.add(index, qe);
        }
    }

    @Override
    public Object dequeue() {
        return elem.remove(0);
    }

   

    @Override
    public boolean isEmpty() {
       return elem.isEmpty();
    }
    
    private int findInsertPosition(int key){
        int position;
            for(position =0;position<elem.size();position++){
                if(elem.get(position).getKey() > key){
                    position = position + 1;
                }
                else{
                    break;
                }
            }
        return position;
    }

    @Override
    public void displayQ() {
       QueueElement qe;
        for(int i = 0; i<elem.size();i++){
            qe =  elem.get(i);
            System.out.println("Key = "+qe.getKey()+" Element="+qe.getElement());
        }
    }
    
}
