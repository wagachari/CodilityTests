import java.util.*;
public class MergeStringsAlternately {

    public static void main (String args[]){

        MergeStringsAlternately myClass = new MergeStringsAlternately();
        System.out.println(myClass.gcDFinder("ABCDkl", "mnotfiDTVBLZ"));

    }
    public String gcDFinder(String str1, String str2){
        String newString = "";
        int lengthofStr2 = str2.length();
        int lengthofStr1 = str1.length();

        if(lengthofStr2 < lengthofStr1){
            System.out.println("str1 is bigger");

        for(int i= 0; i < lengthofStr1; i++)
        {

            newString += String.valueOf(str1.charAt(i));


            if(i<lengthofStr2){
                newString += String.valueOf(str2.charAt(i));
                
            }



        }
    }else{
        System.out.println("str2 is bigger");

        for(int j= 0; j < lengthofStr2; j++)
        {


            if(j<lengthofStr1){
                newString += String.valueOf(str1.charAt(j));                
            }
            newString += String.valueOf(str2.charAt(j));


        }
    }
        // CharSequence firstOccurenceOfStr2Char = String.valueOf(str2.charAt(0));
        // if(patternOfStr2.contains(firstOccurenceOfStr2Char)){
        //     System.out.println("Contains substring of str2");

        // }

        return newString;
    }
}
