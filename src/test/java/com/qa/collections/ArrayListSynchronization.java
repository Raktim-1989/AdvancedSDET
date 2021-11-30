package com.qa.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListSynchronization {

    //How to synchronize ArrayList
        /*
        1. Collections.synchronizedList()
        2.copyOnWriteArrayList()
         */
    public static void main(String[] args) {

        List<String> syncList = Collections.synchronizedList(new ArrayList<String>());
        syncList.add("Java");
        syncList.add("Python");
        syncList.add("DevOps");

        //for addition we don't need any explicit synchronized block
        //for retrieval we need that block

        synchronized (syncList)
        {
            Iterator<String> itr = syncList.iterator();
            while(itr.hasNext())
            {
                String entry = itr.next();
                System.out.println(entry);
            }
        }

        //using copyOnWrite class
        CopyOnWriteArrayList<String> cpyLst = new CopyOnWriteArrayList<String>();
        cpyLst.add("Oracle");
        cpyLst.add("Cognizant");
        cpyLst.add("WalMart");

        //we don't need any explicit synchronized block for any operation
        System.out.println("*************");
       Iterator itr1 =  cpyLst.iterator();
      while(itr1.hasNext())
      {
          String s = (String) itr1.next();
          System.out.println(s);
      }

    }


}
