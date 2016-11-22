
/**
 * Simple Random class to provide sudo random number.
 * THIS IS NOT MY CODE !!!
 * Source code thanks to: 
 * @link http://stackoverflow.com/questions/13442611/how-can-i-generate-a-random-number-without-use-of-math-random
 * Tested and works great as we cannot use:
 *  <code>
 *      import java.util.Random;
 *      Random rand = new Random();
 *      int value = rand.nextInt();
 *  </code>
 */
public class SimpleRandom 
{
    private int max;
    private int last;  
    
    public static final int PRIME_NUMBER = 32719;
    public static final int NEXT_PRIME_NUMBER = 32749;

    /**
     * Custom constructor for SimpleRandom class; <br>
     * It takes adventage of currentTimeMillis() that returns long from current time and cast it to integer;
     * @param takes max as integer;
     */ 
    public SimpleRandom(int max)
    {
        this.max = max;
        this.last = (int)(System.currentTimeMillis() % max);
    }

    /**
     * Public 
     * Note that the result can not be bigger then 32749;<br>
     * It uses reasanable prime numbers no greated than 32749
     * @return returns a number as integer;
     */
    public int nextInt()
    {
        //last = (last * 32719 + 3) % 32749;
        last = (last * PRIME_NUMBER) % NEXT_PRIME_NUMBER;
        return last % max;
    }
}
