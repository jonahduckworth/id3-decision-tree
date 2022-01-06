public class categories {

    // calculate total entropy of dataset
    public static void getEntropy(String grade, int subject) {
        calculate.getCategory(grade, subject, null, null);
    }

    public static void getMath(Integer follow, String gradeFollow) {
        // calculate entropy for every grade
        calculate.getCategory("A+", 0, follow, gradeFollow);
        dataset.ap = calculate.entropy();
        dataset.apCount = dataset.count;
        calculate.getCategory("A", 0,  follow, gradeFollow);
        dataset.a = calculate.entropy();
        dataset.aCount = dataset.count;
        calculate.getCategory("A-", 0,  follow, gradeFollow);
        dataset.am = calculate.entropy();
        dataset.amCount = dataset.count;
        calculate.getCategory("B+", 0,  follow, gradeFollow);
        dataset.bp = calculate.entropy();
        dataset.bpCount = dataset.count;
        calculate.getCategory("B", 0,  follow, gradeFollow);
        dataset.b = calculate.entropy();
        dataset.bCount = dataset.count;

        // calculate average entropy
        dataset.mathEntropy = calculate.averageEntropy();
        // calculate information gain
        dataset.mathEntropy = calculate.informationGain(dataset.mathEntropy);
    }

    public static void getStats(Integer follow, String gradeFollow) {
        // calculate entropy for every grade
        calculate.getCategory("A+", 1,  follow, gradeFollow);
        dataset.ap = calculate.entropy();
        dataset.apCount = dataset.count;
        calculate.getCategory("A", 1,  follow, gradeFollow);
        dataset.a = calculate.entropy();
        dataset.aCount = dataset.count;
        calculate.getCategory("A-", 1,  follow, gradeFollow);
        dataset.am = calculate.entropy();
        dataset.amCount = dataset.count;
        calculate.getCategory("B+", 1,  follow, gradeFollow);
        dataset.bp = calculate.entropy();
        dataset.bpCount = dataset.count;
        calculate.getCategory("B", 1,  follow, gradeFollow);
        dataset.b = calculate.entropy();
        dataset.bCount = dataset.count;

        // calculate average entropy
        dataset.statsEntropy = calculate.averageEntropy();
        // calculate information gain
        dataset.statsEntropy = calculate.informationGain(dataset.statsEntropy);
    }

    public static void getScience(Integer follow, String gradeFollow) {
        // calculate entropy for every grade
        calculate.getCategory("A+", 2,  follow, gradeFollow);
        dataset.ap = calculate.entropy();
        dataset.apCount = dataset.count;
        calculate.getCategory("A", 2,  follow, gradeFollow);
        dataset.a = calculate.entropy();
        dataset.aCount = dataset.count;
        calculate.getCategory("A-", 2,  follow, gradeFollow);
        dataset.am = calculate.entropy();
        dataset.amCount = dataset.count;
        calculate.getCategory("B+", 2,  follow, gradeFollow);
        dataset.bp = calculate.entropy();
        dataset.bpCount = dataset.count;
        calculate.getCategory("B", 2,  follow, gradeFollow);
        dataset.b = calculate.entropy();
        dataset.bCount = dataset.count;

        // calculate average entropy
        dataset.scienceEntropy = calculate.averageEntropy();
        // calculate information gain
        dataset.scienceEntropy = calculate.informationGain(dataset.scienceEntropy);
    }

    public static void getEnglish(Integer follow, String gradeFollow) {
        // calculate entropy for every grade
        calculate.getCategory("A+", 3,  follow, gradeFollow);
        dataset.ap = calculate.entropy();
        dataset.apCount = dataset.count;
        calculate.getCategory("A", 3,  follow, gradeFollow);
        dataset.a = calculate.entropy();
        dataset.aCount = dataset.count;
        calculate.getCategory("A-", 3,  follow, gradeFollow);
        dataset.am = calculate.entropy();
        dataset.amCount = dataset.count;
        calculate.getCategory("B+", 3,  follow, gradeFollow);
        dataset.bp = calculate.entropy();
        dataset.bpCount = dataset.count;
        calculate.getCategory("B", 3,  follow, gradeFollow);
        dataset.b = calculate.entropy();
        dataset.bCount = dataset.count;

        // calculate average entropy
        dataset.englishEntropy = calculate.averageEntropy();
        // calculate information gain
        dataset.englishEntropy = calculate.informationGain(dataset.englishEntropy);
    }

}
