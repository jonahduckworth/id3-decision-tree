public class driver {

    public static void main(String[] args) {
        double max;

        // get dataset from .csv file
        dataset.getDataset();

        // calculate complete entropy of dataset
        categories.getEntropy();
        System.out.println("\nComplete entropy of dataset: " + dataset.completeEntropy + "\n");

        // math category
        categories.getMath(); // calculate entropy for category
        System.out.println("Math information gain: " + dataset.mathEntropy);

        // statistics category
        categories.getStats(); // calculate entropy for category
        System.out.println("Statistics information gain: " + dataset.statsEntropy);

        // science category
        categories.getScience(); // calculate entropy for category
        System.out.println("Science information gain: " + dataset.scienceEntropy);

        // english category
        categories.getEnglish(); // calculate entropy for category
        System.out.println("English information gain: " + dataset.englishEntropy + "\n");

        calculate.max();

    }

}
