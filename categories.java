public class categories {

    public static void getEntropy(String a, int b) {
        calculate.getCategory(a, b);
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

    public static void getStats() {
        // calculate entropy for every grade
        calculate.getCategory("A+", 1);
        dataset.ap = calculate.entropy();
        dataset.apCount = dataset.count;
        calculate.getCategory("A", 1);
        dataset.a = calculate.entropy();
        dataset.aCount = dataset.count;
        calculate.getCategory("A-", 1);
        dataset.am = calculate.entropy();
        dataset.amCount = dataset.count;
        calculate.getCategory("B+", 1);
        dataset.bp = calculate.entropy();
        dataset.bpCount = dataset.count;
        calculate.getCategory("B", 1);
        dataset.b = calculate.entropy();
        dataset.bCount = dataset.count;

        // calculate average entropy
        dataset.statsEntropy = calculate.averageEntropy();
        // calculate information gain
        dataset.statsEntropy = calculate.informationGain(dataset.statsEntropy);
    }

    public static void getScience() {
        // calculate entropy for every grade
        calculate.getCategory("A+", 2);
        dataset.ap = calculate.entropy();
        dataset.apCount = dataset.count;
        calculate.getCategory("A", 2);
        dataset.a = calculate.entropy();
        dataset.aCount = dataset.count;
        calculate.getCategory("A-", 2);
        dataset.am = calculate.entropy();
        dataset.amCount = dataset.count;
        calculate.getCategory("B+", 2);
        dataset.bp = calculate.entropy();
        dataset.bpCount = dataset.count;
        calculate.getCategory("B", 2);
        dataset.b = calculate.entropy();
        dataset.bCount = dataset.count;

        // calculate average entropy
        dataset.scienceEntropy = calculate.averageEntropy();
        // calculate information gain
        dataset.scienceEntropy = calculate.informationGain(dataset.scienceEntropy);
    }

    public static void getEnglish() {
        // calculate entropy for every grade
        calculate.getCategory("A+", 3);
        dataset.ap = calculate.entropy();
        dataset.apCount = dataset.count;
        calculate.getCategory("A", 3);
        dataset.a = calculate.entropy();
        dataset.aCount = dataset.count;
        calculate.getCategory("A-", 3);
        dataset.am = calculate.entropy();
        dataset.amCount = dataset.count;
        calculate.getCategory("B+", 3);
        dataset.bp = calculate.entropy();
        dataset.bpCount = dataset.count;
        calculate.getCategory("B", 3);
        dataset.b = calculate.entropy();
        dataset.bCount = dataset.count;

        // calculate average entropy
        dataset.englishEntropy = calculate.averageEntropy();
        // calculate information gain
        dataset.englishEntropy = calculate.informationGain(dataset.englishEntropy);
    }

}
