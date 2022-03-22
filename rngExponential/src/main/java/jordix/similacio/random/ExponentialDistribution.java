package jordix.similacio.random;

/**
 * Càlcul de la distribució exponencial
 */
public class ExponentialDistribution {

    private final double lambda;

    /**
     * Constructor
     * @param mean (mitja)
     */
    public ExponentialDistribution(double mean) {
        this.lambda = 1/mean;
    }

    /**
     * Funció de distribució
     * @param number (x)
     * @return F(number)
     */
    public double getPDF(double number) {
        return Math.log(1-number/-lambda);
    }

    /**
     * Funció de densitat
     * @param number (x)
     * @return f(x)
     */
    public double density(double number) {
        return lambda * Math.pow(Math.E, -lambda*number);
    }
}
