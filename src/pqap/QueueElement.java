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
public class QueueElement {
    private int key;
    private Object element;

    public QueueElement(int key, Object element) {
        this.key = key;
        this.element = element;
    }

    
    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }
    
    public String display(){
        return key + " "+element;
    }
    
}
