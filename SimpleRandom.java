
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

    // constructor that takes the max int
    public SimpleRandom(int max){
        this.max = max;
        last = (int)(System.currentTimeMillis() % max);
    }

    // Note that the result can not be bigger then 32749
    // Magic number are large prime numbers
    public int nextInt()
    {
        last = (last * 32719 + 3) % 32749;
        return last % max;
    }
}
