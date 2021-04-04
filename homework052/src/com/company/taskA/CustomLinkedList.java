package com.company.taskA;

public class CustomLinkedList<T> {
    CustomNode<T> first;
    CustomNode<T> last;
    CustomNode<T> current;
    private int size;

    public void print(){
        current = first;
        while (current.hasNext()){
            System.out.print(current + " ");
            current = current.getNext();
        }
    }

    public int size(){
        size = 0;
        current = first;
        while (current.hasNext()){
            size++;
            current = current.getNext();
        }
        return size;
    }

    public T get(int index){
        current = first;
        while (current.hasNext()){
            if (current.getIndex().equals(index)) return current.getValue();
            current = current.getNext();
        }
        throw new IndexOutOfBoundsException();
    }
}
