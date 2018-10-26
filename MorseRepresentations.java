import java.util.Arrays;
import java.lang.Object;
import java.util.HashSet;
/**
 * 
 * International Morse Code defines a standard encoding where each letter is 
 * mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b"maps
 * to "-...", "c" maps to "-.-.", and so on.
 * Now, given a list of words, each word can be written as a concatenation of 
 * the Morse code of each letter. For example, "cab" can be written as 
 * "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). We'll 
 * call such a concatenation, the transformation of a word.

 * Return the number of different transformations among all words we have.

 */
public class MorseRepresentations
{
  // instance variables - replace the example below with your own
  public static void main() {
        String test[] = {"gin", "hello", "gig"};
        System.out.println("\nTest! ");
        System.out.println(uniqueMorseRepresentations(test));

  }
  public static int uniqueMorseRepresentations(String[] words)  {
        int length = 0;
        int answer = 0;
        int j = 0;
        String placeholder;
        String holder = "";
        String test[] = {"gin", "zen", "gig"};
        String morseChanged[] = new String[words.length];
        final String morse[] = {".-","-...","-.-.","-..",".","..-.","--.",
            "....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",
            ".-.","...","-","..-","...-",".--",
            "-..-","-.--","--.."};
        
        final String alphabet = "abcdefghijklmnopqrstuvwxyz";
      
        for(String value : words) {
            placeholder = "";
            length = value.length();
            String newList[] = value.split("", length);
            
            for(int i = 0; i < length; i++) {
                char change = newList[i].charAt(0);
                int hold = alphabet.indexOf(change);
                holder = holder + morse[hold];
            }
            placeholder = holder.toString();
            morseChanged[j] = placeholder;
            j++;
            holder = "";
        }
        for(int i = 0; i < morseChanged.length; i++) {
            System.out.println(test[i] + ": " + morseChanged[i]);
        }
        String[] unique = new HashSet<String>(Arrays.asList(morseChanged)).toArray(new String[0]);
        return unique.length;
  }
}
