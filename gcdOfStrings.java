import java.sql.SQLOutput;

public class GCDOfStrings {

    public static void main (String args []){
        String str1 = "ABCABCABCABC";
        String str2 = "ABUCABC";
        System.out.println("The output is "+ findGcDOfStrings(str1, str2));


    }
    static String findGcDOfStrings (String str1, String str2){
        char a = str2.charAt(0);
        String occurencepattern = str2;
        int firstoccurrencemarkerPlus1 = 0;
        if(str2.indexOf(a)<str2.length()){
            System.out.println("first occurence of char"+ a);
            firstoccurrencemarkerPlus1 = str2.indexOf(a) + 1;

        }
        String secondOccurenceString = str2.substring( firstoccurrencemarkerPlus1, str2.length());
        int secondOccurrencemarker = str2.length();
        System.out.println("The second string minus"+ a + "|is|"+ secondOccurenceString);


        if(secondOccurenceString.indexOf(a) != - 1){
            secondOccurrencemarker = secondOccurenceString.indexOf(a)+1;
            System.out.println("second occurence of char"+ a+ "|is|"+secondOccurrencemarker);

            occurencepattern = str2.substring(str2.indexOf(a),secondOccurrencemarker );
            System.out.println("our substring to check for in the str1 "+ str1+ "|is|"+occurencepattern);

        }
        if(str1.contains(occurencepattern))
        {
            return occurencepattern;

        }
        return "";


    }
}
