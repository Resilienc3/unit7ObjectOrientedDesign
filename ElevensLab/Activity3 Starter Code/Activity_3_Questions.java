import java.util.Random;
import java.util.Arrays;

/**
 * Write a description of class Flip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Activity_3_Questions
{
    

    public static String flip()
    {
        Random r = new Random();
        int coin = r.nextInt(3);
        if(coin >= 1)
            return "heads";
        else
            return "tails";
    }
    
    public static boolean arePermutations(int[] a1, int[] a2)
    {
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1,a2);
        
    }
}
