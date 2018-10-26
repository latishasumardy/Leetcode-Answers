
/**
 * Calculate the sum of two integers a and b, but you are not allowed to use the 
 * operator + and -.
 */
public class Sum
{
    public static void main() {
        int i = 21;
        int j = 34;
        
        System.out.println(getSum(i,j));

  }
  public static int getSum(int a, int b) {
      while(b != 0){
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
      return a;
  }
}
