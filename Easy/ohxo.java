/*
Have the function ExOh(str) take the str parameter being passed and return the string true if there is an equal number of x's and o's, otherwise return the string false. Only these two letters will be entered in the string, no punctuation or numbers. For example: if str is "xooxxxxooxo" then the output should return false because there are 6 x's and 5 o's.
*/

import java.util.*; 
import java.io.*;

class Function {  
  String ExOh(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'x'){
                ++sum1;
            }else{
                ++sum2;
            }
        }
        if(sum1 == sum2){
            return "true";
        }else{return "false";}
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.ExOh(s.nextLine())); 
  }   
  
}           

