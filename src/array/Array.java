
package array;

import java.util.Scanner;


public class Array {

   
    public static void main(String[] args) {
        // added comment
     /*  char[] myLetters = new char[5];
       myLetters[0]='Y';
       myLetters[1]='A';
       myLetters[2]='K';
       myLetters[3]='S';
       myLetters[4]='H';
       
       for(int i=0; i<myLetters.length; i++)
          System.out.print(myLetters[i]); */
        System.out.println("Enter Word:");
        Scanner sc=new Scanner(System.in);
        String myWord=sc.nextLine();
         char[] myLetters = new char[myWord.length()];
         for(int i=0;i<myLetters.length;i++){
             myLetters[i]=myWord.charAt(i);
             System.out.print(myLetters[i]);
    }
         System.out.println("entering in reverse");
         for(int i=myLetters.length-1;i>=0;i--)
             System.out.print(myLetters[i]);
    
}
}