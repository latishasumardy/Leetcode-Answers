
/**
 * In a array A of size 2N, there are N+1 unique elements, and exactly one of 
 * these elements is repeated N times.

Return the element repeated N times.


 */
public class RepeatedElements
{
    public static void main() {
        int[] p1 = {1,2,3,3};
        int[] p2 = {2,1,2,5,3,2};
        System.out.println(repeated(p1));
        System.out.println(repeated(p2));
    
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static int repeated(int[] A)
    {
        int n = A.length / 2;
        int repeated = 0;
        int length = n + 1;
        
        for(int i = 0; i < A.length; i++) {
            for(int j = i+1; j < A.length; j++) {
                if(A[i] == A[j]) {
                    repeated = A[i];
                    j = A.length;
                    i = A.length;
                }
            }
        }
        
        return repeated; 
    }
}
