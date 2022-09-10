package com.javaproject.coding.interviewPractice.String;

public class StringExample {
    public static void main(String[] args) {
        String str = "manika";// str.lenth = 6  0-5   // m-0 a -1 n-2 i-3 k-4 a -5
        String str2 ="";
        char maxRepeated = '\0';
        int max=0;
        for(int i =0;i<str.length();i++) // i=1
        {
            char firstChar = str.charAt(i);  // a

            int count=0 ;  // count =0
              for(int j=i+1;j<str.length();j++)  // j=6
              {
                  if(firstChar == str.charAt(j)) // a == a
                  {
                      count++; // count =1
                  }
              }
             if(count>max)  //1>0
             {
                 max=count; //max = 1
                 maxRepeated = firstChar; // a
             }

        }
        System.out.println("Max Repeated : "+maxRepeated);


    }
}
