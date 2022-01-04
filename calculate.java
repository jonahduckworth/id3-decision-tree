import java.util.Objects;

public class calculate {

    public static void getCategory(String grade, int subject) {
        // get dataset
        String[][] category = dataset.dataset;
        // reset count to 0
        dataset.count = 0;

        // iterate through length of dataset
        for(int i = 0; i < dataset.dataset.length; i++) {
            // if the given grade is in the category and == "Yes"
            if(Objects.equals(category[i][subject], grade) && Objects.equals(category[i][4], "Yes")) {
                dataset.yes++;
                dataset.count++;
            } else if(Objects.equals(category[i][subject], grade) && Objects.equals(category[i][4], "No")) {
                dataset.no++;
            }
        }

        // if entropy has already been found for the category, search for pure class
        if(dataset.pure) {
            pureClass(grade, subject);
            dataset.pure = false;
        }

    }

    public static void pureClass(String grade, int subject) {
        String[][] category = dataset.dataset;

        if((dataset.yes > 0) && (dataset.no == 0)) {
            for(int i = 0; i < dataset.dataset.length; i++) {
                if(Objects.equals(category[i][subject], grade) && Objects.equals(category[i][4], "Yes")) {
                    // MAYBE HERE ADD NULL CATEGORIES TO LIST OF CHECKED NODES
                    category[i][subject] = null;
                    category[i][4] = null;
                    dataset.pureYes = grade;
                }
            }
        }

        if((dataset.no > 0) && (dataset.yes == 0)) {
            for(int i = 0; i < dataset.dataset.length; i++) {
                if(Objects.equals(category[i][subject], grade) && Objects.equals(category[i][4], "No")) {
                    // MAYBE HERE ADD NULL CATEGORIES TO LIST OF CHECKED NODES
                    category[i][subject] = null;
                    category[i][4] = null;
                    dataset.pureNo = grade;
                }
            }
        }
    }

    public static double entropy() {
        double total;
        double entropy;

        // entropy == 0 if there aren't any attributes in a given category
        if(dataset.yes == 0) {
            return 0;
        }
        if(dataset.no == 0) {
            return 0;
        }

        // calculate total
        total = dataset.yes + dataset.no;

        // entropy calculation
        entropy = - (dataset.yes / total) * log2(dataset.yes / total) - (dataset.no / total) * log2(dataset.no / total);

        // reset yes and no to 0
        dataset.yes = 0;
        dataset.no = 0;

        return entropy;
    }

    // log base 2 function
    public static double log2(double N) {
        return Math.log(N) / Math.log(2);
    }

    public static double averageEntropy() {
        // average entropy calculation
        return ((dataset.ap * (dataset.apCount / dataset.dataset.length))
              + (dataset.a  * (dataset.aCount  / dataset.dataset.length))
              + (dataset.am * (dataset.amCount / dataset.dataset.length))
              + (dataset.bp * (dataset.bpCount / dataset.dataset.length))
              + (dataset.b  * (dataset.bCount  / dataset.dataset.length)));
    }

    public static double informationGain(double ig) {
        // information gain calculation
        return dataset.completeEntropy - ig;
    }

    public static void max() {
        // find maximum information gain
        double max = dataset.mathEntropy;
        if(dataset.statsEntropy   > max) { max = dataset.statsEntropy;   }
        if(dataset.scienceEntropy > max) { max = dataset.scienceEntropy; }
        if(dataset.englishEntropy > max) { max = dataset.englishEntropy; }

        // print maximum information gain
        if(max == dataset.mathEntropy) {
            System.out.println("The class with maximum information gain is: Math");
            dataset.pure = true;
            categories.getMath();
        } else if(max == dataset.statsEntropy) {
            System.out.println("The class with maximum information gain is: Statistics");
            dataset.pure = true;
            categories.getStats();
        } else if(max == dataset.scienceEntropy) {
            System.out.println("The class with maximum information gain is: Science");
            dataset.pure = true;
            categories.getScience();
        } else if(max == dataset.englishEntropy) {
            System.out.println("The class with maximum information gain is: English");
            dataset.pure = true;
            categories.getEnglish();
        }
    }

}
