package com.company;

import com.company.dataStructure.Document;

public class Main {

    public static void main(String[] args) {
        LRUCache myCache  = new LRUCache(2);
        Document doc = new Document("test");
        myCache.addDocument(1, doc);
        System.out.println(myCache.cacheMap.get(1).getDocument().getContents());

        Document doc2 = new Document("test no. 2");
        myCache.addDocument(2, doc2);
        System.out.println(myCache.cacheMap.get(2).getDocument().getContents());
        System.out.println(myCache.cacheMap.size());

        System.out.println("TRY : Overflowing the cache");

        Document doc3 = new Document("test no. 3");
        myCache.addDocument(3, doc3);
        System.out.println(myCache.cacheMap.size());


    }
}
