/*
* Reverse the order of letters in a word entered by the user. 
* 
* CLASS:   CPT 163  Java Programming I
* AUTHOR:  Sharon R. Tinkey
* DATE:    09/14/15
* CHAPTER: 4
* PROGRAM: Assignment 3: Loops
*/
import javax.swing.JOptionPane;         // required to use JOptionPane

public class Assignment3Tinkey {

    public static void main(String[] args) {
              
        String wordIs = "";             // word entered by user
        String revWord = "";            // reversed word 
        char wordChar;                  // holds char from word entered
        int revI;                       // letter position in reverse word
        
        // prompt user for a word
        wordIs = JOptionPane.showInputDialog("Enter a word: ");
        
        revI = wordIs.length()-1;       // initialize to last letter of word
        
        // reverse the word
         for (int i = 0; i < wordIs.length(); i++){
            wordChar = wordIs.charAt(revI);
            revWord = revWord + wordChar;
            revI--;
         }
         // display the reversed word
        JOptionPane.showMessageDialog(null, "The reverse of the word " + 
                wordIs + " is " + revWord + ".");
        
        System.exit(0);
    }
}
