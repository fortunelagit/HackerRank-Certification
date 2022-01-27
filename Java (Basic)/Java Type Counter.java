import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    public static void typeCounter(String sentence) {
        String[] strArr = sentence.split(" ");
        int intCount=0, doubleCount=0, stringCount=0;
        
        for(int i=0; i<strArr.length; i++){
            boolean intFlag=true, doubleFlag=true;
            try{
                Integer a = Integer.parseInt(strArr[i]);
                intCount++;
            }
            catch(NumberFormatException exc){
                intFlag = false;
            }
            
            if(!intFlag){
                try{
                    Double a = Double.parseDouble(strArr[i]);
                    doubleCount++;
                }
                catch(NumberFormatException exc){
                    doubleFlag = false;
                }
            }
            
            if(!intFlag && !doubleFlag) stringCount++;
        }
        System.out.println("string " + stringCount);
        System.out.println("integer " + intCount);
        System.out.println("double " + doubleCount);
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sentence = bufferedReader.readLine();

        Result.typeCounter(sentence);

        bufferedReader.close();
    }
}
