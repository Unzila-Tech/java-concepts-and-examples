package mca;

import java.util.Scanner;

class TextReverse {

    String sentence;
    String result;

   
    TextReverse(String sentence) {
        this.sentence = sentence;
        this.result = reverseWords();
    }

    String reverseWords() {
        String revSentence = "";
        String word = "";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ') {
                word = word + ch;   // store string in word var
            } 
            else {
                // reverse the word
                String rev = "";
                for (int j = word.length() - 1; j >= 0; j--) {
                    rev = rev + word.charAt(j);
                }
                revSentence = revSentence + rev + " ";
                word = ""; //after this word empty now
            }
        }

        // reverse last word (no space after it)
        String rev = "";
        for (int j = word.length() - 1; j >= 0; j--) {
            rev = rev + word.charAt(j);
        }
        revSentence = revSentence + rev;

        return revSentence;
    }

    // toString method
    public String toString() {
        return result;
    }
}



public class Rever_Main {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = sc.nextLine();

        TextReverse t = new TextReverse(s); 
        System.out.println(t); // calls toString() automatically
    }
}
