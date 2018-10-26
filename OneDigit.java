
/**
 *Given a non-negative integer num, repeatedly add all its digits until the 
 *result has only one digit.
 */
public class OneDigit
{
  public static void main() {
        int i = 12;
        String s = "hello";
        String t = "heillo";
        
        System.out.println(addDigits(i));
        System.out.println(addDigits(798286991));

  }

  public static int addDigits(int num) {
      int holder = 0;
      int holder2 = 0;
      while(num > 0) {

              holder += num % 10;
              num = num / 10;
              
              if(num <= 0 && holder >= 10) {
                num = holder;
                holder = 0;
              }
          }
       return holder;
      }
     
  }

