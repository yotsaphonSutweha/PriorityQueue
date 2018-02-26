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
public interface PQInterface {
    public void enqueue(int priorKey, Object e);
    public Object dequeue();
    public int size();
    public boolean isEmpty();
    public void displayQ();
}
