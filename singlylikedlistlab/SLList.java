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
public class SLList<E>{
    SLLNode<E> head;
    int size;
    
    public SLList() { // constructor of an empty list
        head = null;
    }
    
    public void remove(int index) throws IndexOutOfBoundsException {
        if( size <= index || index < 0 ) throw new IndexOutOfBoundsException("The index is out of the SSList");
        size--;
        SLLNode<E> temp = head;
        SLLNode<E> prev = null;
        int count = 0;
        while(temp != null && count++ < index) {
            prev = temp;
            temp = temp.next;
        }
        if(prev == null) {
            head = head.next;
            temp = null;
            return;
        }
        prev.next = temp.next;
        temp = null;
    }
    
    public void add(E value) {
        add(size, value);
    }
    
    public void add(int index, E value) throws IndexOutOfBoundsException {        
        if( size < index || index < 0 ) throw new IndexOutOfBoundsException("The index is out of the SSList");
        size++;
        if( head == null ) {
            head = new SLLNode<E>(value, null);
            return;
        }
        SLLNode<E> temp = head;
        SLLNode<E> prev = null;
        int count = 0;
        while(temp != null && count++ < index) {
            prev = temp;
            temp = temp.next;
        }
        if(prev == null) { // means the first one , needs to change the head
            head = new SLLNode<E>(value, head);
            return;
        }
        SLLNode<E> x = new SLLNode<E>(value, temp);
        prev.next = x;
    }
    
    public void printAllNode() {
        SLLNode<E> pointer = head;
        while(pointer != null) {
            System.out.print(pointer.value + " ");
            pointer = pointer.next;
        }
    }
}
