package com.company.taskA;

public class CustomNode<T> {
    private T value;
    private CustomNode<T> next;
    private CustomNode<T> prev;
    private Integer index;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public CustomNode<T> getNext() {
        return next;
    }

    public void setNext(CustomNode<T> next) {
        this.next = next;
    }

    public CustomNode<T> getPrev() {
        return prev;
    }

    public void setPrev(CustomNode<T> prev) {
        this.prev = prev;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public boolean hasNext(){
        return next != null;
    }
}
