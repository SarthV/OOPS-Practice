package com.company.dataStructure;

public class DoubleLinkedList {
    Document document;
    DoubleLinkedList prev;
    DoubleLinkedList next;

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public DoubleLinkedList getPrev() {
        return prev;
    }

    public void setPrev(DoubleLinkedList prev) {
        this.prev = prev;
    }

    public DoubleLinkedList getNext() {
        return next;
    }

    public void setNext(DoubleLinkedList next) {
        this.next = next;
    }


    public DoubleLinkedList(){
        this.document = new Document();
        prev  = null;
        next = null;
    }

    public DoubleLinkedList(Document document){
        this.document = document;
        prev = null;
        next = null;
    }
}
