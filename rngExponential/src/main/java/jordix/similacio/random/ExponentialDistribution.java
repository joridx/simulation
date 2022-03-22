package jordix.similacio.random;

public class ExponentialDistribution {

    private double lambda;

    public ExponentialDistribution(double mean) {
        this.lambda = 1/mean;
    }

    public double getPDF(double number) {
        return Math.log(1-number/-lambda);
    }

    public double density(double number) {
        return lambda * Math.pow(Math.E, -lambda*number);
    }
}
