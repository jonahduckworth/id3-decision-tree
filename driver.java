public class driver {

    public static void main(String[] args) {
        // get dataset from .csv file
        dataset.getDataset();

        // calculate complete entropy of dataset
        categories.getEntropy("Yes", 4);
        categories.getEntropy("No", 4);
        dataset.completeEntropy = calculate.entropy();
        System.out.println("\nComplete entropy of dataset: " + dataset.completeEntropy + "\n");

        // math category
        categories.getMath(null, null); // calculate entropy for category
        System.out.println("Math information gain: " + dataset.mathEntropy);

        // statistics category
        categories.getStats(null, null); // calculate entropy for category
        System.out.println("Statistics information gain: " + dataset.statsEntropy);

        // science category
        categories.getScience(null, null); // calculate entropy for category
        System.out.println("Science information gain: " + dataset.scienceEntropy);

        // english category
        categories.getEnglish(null, null); // calculate entropy for category
        System.out.println("English information gain: " + dataset.englishEntropy + "\n");

        dataset.pureYes = "yo";

        calculate.max(null, null);
        System.out.println(dataset.pureYes + " is a pure class of Math (yes)");

        // calculate complete entropy of "A" in math
        categories.getEntropy("A", 0);
        dataset.completeEntropy = calculate.entropy();
        System.out.println("\nComplete entropy of dataset: " + dataset.completeEntropy + "\n");

        // statistics category
        categories.getStats(0, "A"); // calculate entropy for category
        System.out.println("Statistics information gain: " + dataset.statsEntropy);

        // science category
        categories.getScience(0, "A"); // calculate entropy for category
        System.out.println("Science information gain: " + dataset.scienceEntropy);

        // english category
        categories.getEnglish(0, "A"); // calculate entropy for category
        System.out.println("English information gain: " + dataset.englishEntropy + "\n");

        dataset.pureNo = "hi";

        calculate.max(0, "A");
        System.out.println(dataset.pureYes + " is a pure class of Science (yes)");
        System.out.println(dataset.pureNo + " is a pure class of Science (no)");



    }

}
