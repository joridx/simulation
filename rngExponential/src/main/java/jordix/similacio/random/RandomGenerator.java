package jordix.similacio.random;

/**
 * Ofereix mètodes per a generar nombres aleatoris
 */
public class RandomGenerator {

    private RandomGenerator() {
    }

    /**
     * Retorna un array de nombres pseudoaleatoris, amb valors entre el 0 i el 1
     * @param size mida de la llista que es vol obtenir
     * @param initial
     * @param multiplier
     * @param additive
     * @param divider
     * @return
     */
    public static double[] getRandomNumbers(int size, int initial, int multiplier,
                                            int additive, int divider) {
        double[] result = new double[size];
        double x0 = initial;
        for (int i=0; i<size; i++) {
            result[i] = (multiplier*x0 + additive) % divider;
            x0 = result[i];

            //The result is divided to obtain a number between 0 and 1
            result[i] = result[i]/divider;
        }
        return result;
    }
}
