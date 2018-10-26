
/**
 * Function that takes a string as input and returns the string reversed.
 */
public class ReverseString
{
  public static void main() {
        int i;
        System.out.println(reverseString("goodbye"));

  }
  public static String reverseString(String s) {
      /*String answer = "";
      for(int i = s.length()-1; i >= 0; i--) {
        answer += s.charAt(i);
      }

      return answer;*/
      
      //faster one
      if(s != null) {
            StringBuilder builder = new StringBuilder();
            for(int i = 0; i < s.length(); i++) {
                builder.insert(0, s.charAt(i));
            }
            return builder.toString();
        }
      return null;
    }
}
