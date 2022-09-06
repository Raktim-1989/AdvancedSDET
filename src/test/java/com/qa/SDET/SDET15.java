package com.qa.SDET;
import java.util.*;

public class SDET15 {

    public static void main(String[] args) {
        String[] arr = {"Java", "Jenkins", "C#", "Java", "Jenkins", "Webservice"};
        Map<String,Integer> map = new HashMap<String,Integer>();

        for(String a : arr)
        {
            if(map.containsKey(a))
            {
                map.put(a,map.get(a)+1);
            }
            else
            {
                map.put(a,1);
            }
        }


        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext())
        {
            Map.Entry<String,Integer> entry = (Map.Entry<String,Integer>)itr.next();

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }




}
