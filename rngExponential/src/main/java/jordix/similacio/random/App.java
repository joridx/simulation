package jordix.similacio.random;

import java.util.Arrays;

/**
 * Classe incial que crida a la generació de nombres aleatoris i a la distribució exponencial
 */
public class App 
{
    //RNG constants
    private static final int SIZE_RANDOMS = 100;
    private static final int INITIAL_SEED = 20873;
    private static final int MULTIPLIER = 17597;
    private static final int ADDITIVE = 7;
    private static final int DIVIDER = 5000;
    //Exponential distribution constant
    private static final double MEAN = 0.5;

    public static void main( String[] args )
    {
        double[] rng = RandomGenerator.getRandomNumbers(SIZE_RANDOMS, INITIAL_SEED, MULTIPLIER, ADDITIVE, DIVIDER);
        System.out.println("Random numbers:" + Arrays.toString(rng) + "\n");

        ExponentialDistribution myExp = new ExponentialDistribution(MEAN);

        System.out.println("Random;Funció de densitat");
        for (double number : rng) {
            System.out.println(number + ";" + myExp.density(number));
        }
    }
}
