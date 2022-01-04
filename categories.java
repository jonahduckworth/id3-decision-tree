public class categories {

    public static void getEntropy() {
        calculate.getCategory("Yes", 4);
        calculate.getCategory("No", 4);
        dataset.completeEntropy = calculate.entropy();
    }

    public static void getMath() {
        // calculate entropy for every grade
        calculate.getCategory("A+", 0);
        dataset.ap = calculate.entropy();
        dataset.apCount = dataset.count;
        calculate.getCategory("A", 0);
        dataset.a = calculate.entropy();
        dataset.aCount = dataset.count;
        calculate.getCategory("A-", 0);
        dataset.am = calculate.entropy();
        dataset.amCount = dataset.count;
        calculate.getCategory("B+", 0);
        dataset.bp = calculate.entropy();
        dataset.bpCount = dataset.count;
        calculate.getCategory("B", 0);
        dataset.b = calculate.entropy();
        dataset.bCount = dataset.count;

        // calculate average entropy
        dataset.mathEntropy = calculate.averageEntropy();
        // calculate information gain
        dataset.mathEntropy = calculate.informationGain(dataset.mathEntropy);
    }

}
