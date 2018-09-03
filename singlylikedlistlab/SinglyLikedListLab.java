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
public class SinglyLikedListLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // testing
        SLLNode<Integer> n = new SLLNode<Integer>(20, null);
        // System.out.println(n.value);
        
        SLLNode<Integer> v = new SLLNode<Integer>(26, n);
        // System.out.println(v.value);
        // System.out.println(v.next.value);
        
        SLLNode<Integer> k = new SLLNode<Integer>(27, v);
//        System.out.println(k.value);
//        System.out.println(k.next.value);
//        System.out.println(k.next.next.value);
        SLList<Integer> list = new SLList<Integer>();
        
        int size = 10;
        
        for(int i = 0; i < size; ++i) {
            list.add( (int)Math.floor( Math.random() * 20));
        }
        printSLList(list);
        
        removeAt(list, 0);
        printSLList(list);
        
        removeAt(list, 5);
        printSLList(list);
    }
    
    public static <T> void printSLList(SLList<T> list) {
        list.printAllNode();
        System.out.println("\n------\t  End\t--------\n");
    }
    
    public static <T> void removeAt(SLList<T> list, int i) {
        System.out.println("Remove the at index " + i);
        list.remove(i);
    }
    
}
