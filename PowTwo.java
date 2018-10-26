
/**
 * Write a description of class PowTwo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PowTwo
{
    public static void main() {
        System.out.println("Start test:");
        System.out.println(PowTwo(4));
    }
    
    static Boolean PowTwo(int input) {
        int holder = input;
        while((holder & 1) == 0) {
            holder = holder % 2;
        }
        if(holder != 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
