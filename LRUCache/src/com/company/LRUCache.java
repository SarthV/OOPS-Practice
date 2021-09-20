package com.company;

import com.company.dataStructure.Document;
import com.company.dataStructure.DoubleLinkedList;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class LRUCache {
    DoubleLinkedList head;
    DoubleLinkedList tail;
    HashMap< Integer, DoubleLinkedList> cacheMap;
    int size = 0;

    public LRUCache(int size){
        this.size = size;
        cacheMap  = new HashMap<>();
        head = new DoubleLinkedList();
        tail = new DoubleLinkedList();
        head.setNext(tail);
        tail.setPrev(head);
    }

    public LRUCache(){
    }

    public void moveToHead(DoubleLinkedList curr){
        curr.setNext(head.getNext());
        curr.setPrev(head);
        head.getNext().setPrev(curr);
        head.setNext(curr);
    }

    public void removeNode(DoubleLinkedList curr){
        curr.getPrev().setNext(curr.getNext());
        curr.getNext().setPrev(curr.getPrev());
        curr.setNext(null);
        curr.setPrev(null);
    }

    public void addDocument(Integer documentID, Document document){
        if(cacheMap.containsKey(documentID)){
            cacheMap.get(documentID).setDocument(document);
            moveToHead(cacheMap.get(documentID));
        }
        else if(cacheMap.size() < this.size){
            DoubleLinkedList temp = new DoubleLinkedList();
            document.setId(documentID);
            temp.setDocument(document);
            cacheMap.put(documentID, temp);
            moveToHead(temp);
        }
        else{
            cacheMap.remove(tail.getPrev().getDocument().getId());
            removeNode(tail.getPrev());
            DoubleLinkedList temp = new DoubleLinkedList();
            document.setId(documentID);
            temp.setDocument(document);
            cacheMap.put(documentID, temp);
            moveToHead(temp);
        }
    }

    public Document getDocument(Integer documentID){
        if(!cacheMap.containsKey(documentID)){
            return null;
        }
        else{
            moveToHead(cacheMap.get(documentID));
            return cacheMap.get(documentID).getDocument();
        }
    }
}
