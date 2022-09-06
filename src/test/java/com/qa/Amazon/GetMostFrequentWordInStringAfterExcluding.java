package com.qa.Amazon;

import java.util.*;

/*
This Test case is to write an algo having most frequent word in String after excluding given words
 */
public class GetMostFrequentWordInStringAfterExcluding {

public static List<String> getMostFrequentWordsAfterExcluding(String s , String[] ex) {

    s = s.replaceAll("[^a-zA-Z0-9]" , " ");
    String[] arrWords = s.split(" +");
    Map<String , Integer> wordFreqMap = new HashMap<String , Integer>();
    List<String> itemsList = new ArrayList<String>();
    int max = 1;
    for(String words : arrWords)
    {
        words = words.toLowerCase();
        wordFreqMap.put(words , wordFreqMap.getOrDefault(words , 0)+1);
    }

    for(String exclude : ex)
    {
          if(wordFreqMap.containsKey(exclude))
          {
              wordFreqMap.remove(exclude);
          }
    }

    TreeMap<String , Integer> sortedValueMap = new TreeMap<String,Integer>((e1, e2) ->
            {
                  int fre1 = wordFreqMap.get(e1);
                  int fre2 = wordFreqMap.get(e2);

                  if(fre1 != fre2)
                  {
                      return fre2 - fre1;
                  }

              return e1.compareTo(e2);
            });

    sortedValueMap.putAll(wordFreqMap);
    Set set = sortedValueMap.entrySet();
    Iterator itr = set.iterator();
    while(itr.hasNext())
    {
        Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>)itr.next();
        System.out.println(entry.getKey() + " : "  + entry.getValue());
       if(max <= entry.getValue())
       {
           max = entry.getValue();
           itemsList.add(entry.getKey());
       }


    }

return itemsList;
}

    public static void main(String[] args) {

        String str = "Best items in category are Samsung### , Lenovo , Lenovo(((.. Samsung items are nice .. Lenovo are cool##";
        String[] excludingItems = {"in" , "are"};
        List<String> list = getMostFrequentWordsAfterExcluding(str , excludingItems);
        System.out.println(list);


    }
}
