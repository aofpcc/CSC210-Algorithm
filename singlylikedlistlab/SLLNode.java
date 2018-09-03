/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylikedlistlab;

/**
 *
 * @author Student
 */
public class SLLNode<E> {
    E value;
    SLLNode<E> next;
    
    public SLLNode() {
        value = null;
        next = null;
    }
    
    public SLLNode(E e, SLLNode<E> n) {
      value = e;
      next = n;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

}
