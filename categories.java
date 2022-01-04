public class categories {

    public static void getEntropy() {
        calculate.getCategory("Yes", 4);
        calculate.getCategory("No", 4);
        dataset.completeEntropy = calculate.entropy();
    }

    public static void getMath() {
        calculate.getCategory("A+", 0);
        dataset.ap = calculate.entropy();
        dataset.apCount = dataset.count;
    }

}
