package com.qa.programming;

public class StringDigitTest {
      public  static boolean isEmpty(CharSequence cs)
      {
          return cs == null || cs.length() == 0;

      }

      //password: it should not take null values, alpha numeric values

      public  static boolean isNumeric(CharSequence cs)
      {
          if(isEmpty(cs))
          {
               return false;
          }

         int len  =  cs.length();
          for(int i = 0; i<len;i++)
          {
              if(!Character.isDigit(cs.charAt(i)))
              {
                    return  false;
              }
          }
            return true;

          //Arraylist -> array
          //array to arraylist
          //integer to int
          //int to integer

          //javaScriptXECUTOR -> INETRFACE
          //angular js -> selenium is able to identify
          //js.executeScript("");
          //no such element found

          //how to find broken links in a page
          //links
          // int count = driver.findelemments(by.tag("a")).size();   40
          //href ->>>
          //httpsresponsecode == 200

          //apache POI -> this is an api for handling .xlsx as wells as .xls
          //

          //shadow-DOM objects in HTML
          //parent , preceeding-sibling, following-sibling , ancestor
          //regex, or , AND



      }



    public static void main(String[] args) {

        System.out.println(isNumeric(null));
        System.out.println(isNumeric("rak1234"));

    }

}
