import java.util.Objects;

public class calculate {

    public static void getCategory(String grade, int subject, Integer follow, String gradeFollow) {
        // get dataset
        String[][] category = dataset.dataset;
        // reset count to 0
        dataset.count = 0;

        // iterate through length of dataset
        if(follow == null) {
            for(int i = 0; i < dataset.dataset.length; i++) {
                // if the given grade is in the category and == "Yes"
                if(Objects.equals(category[i][subject], grade) && Objects.equals(category[i][4], "Yes")) {
                    dataset.yes++;
                    dataset.count++;
                } else if(Objects.equals(category[i][subject], grade) && Objects.equals(category[i][4], "No")) {
                    dataset.no++;
                }
            }
        } else { // if searching for pure class
            for(int i = 0; i < dataset.dataset.length; i++) {
                // if the given grade is in the category and == "Yes"
                if(Objects.equals(category[i][subject], grade) && Objects.equals(category[i][4], "Yes") && Objects.equals(dataset.dataset[i][follow], gradeFollow)) {
                    dataset.yes++;
                    dataset.count++;
                } else if(Objects.equals(category[i][subject], grade) && Objects.equals(category[i][4], "No") && Objects.equals(dataset.dataset[i][follow], gradeFollow)) {
                    dataset.no++;
                }
            }
        }

        // if entropy has already been found for the category, search for pure class
        if(dataset.pure) {
            pureClass(grade, subject);
        }

    }

    public static void pureClass(String grade, int subject) {
        if((dataset.yes > 0) && (dataset.no == 0)) {
            for(int i = 0; i < dataset.dataset.length; i++) {
                 if(Objects.equals(dataset.dataset[i][subject], grade) && Objects.equals(dataset.dataset[i][4], "Yes")) {
                    // MAYBE HERE ADD NULL CATEGORIES TO LIST OF CHECKED NODES
                    dataset.dataset[i][subject] = null;
                    dataset.dataset[i][4] = null;
                    dataset.pureYes = grade;
                }

            }
        } else if((dataset.no > 0) && (dataset.yes == 0)) {
            for(int i = 0; i < dataset.dataset.length; i++) {
                if(Objects.equals(dataset.dataset[i][subject], grade) && Objects.equals(dataset.dataset[i][4], "No")) {
                    // MAYBE HERE ADD NULL CATEGORIES TO LIST OF CHECKED NODES
                    dataset.dataset[i][subject] = null;
                    dataset.dataset[i][4] = null;
                    dataset.pureNo = grade;
                }
            }
        }
    }

    public static double entropy() {
        double entropy;

        // calculate total
        double total = dataset.yes + dataset.no;
        System.out.println(dataset.yes + " " + dataset.no);

        // entropy == 0 if there aren't any attributes in a given category
        if((dataset.yes == 0) || (dataset.no == 0)) {
            entropy = 0;
        } else {
            // entropy calculation
            entropy = - (dataset.yes / total) * log2(dataset.yes / total) - (dataset.no / total) * log2(dataset.no / total);
        }

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

    public static void max(Integer follow, String gradeFollow) {
        // find maximum information gain
        double max = 0;
        if(dataset.mathEntropy    > max) { max = dataset.mathEntropy;    }
        if(dataset.statsEntropy   > max) { max = dataset.statsEntropy;   }
        if(dataset.scienceEntropy > max) { max = dataset.scienceEntropy; }
        if(dataset.englishEntropy > max) { max = dataset.englishEntropy; }

        // print maximum information gain
        if(max == dataset.mathEntropy) {
            System.out.println("The class with maximum information gain is: Math");
            dataset.pure = true;
            categories.getMath(follow, gradeFollow);
        } else if(max == dataset.statsEntropy) {
            System.out.println("The class with maximum information gain is: Statistics");
            dataset.pure = true;
            categories.getStats(follow, gradeFollow);
        } else if(max == dataset.scienceEntropy) {
            System.out.println("The class with maximum information gain is: Science");
            dataset.pure = true;
            categories.getScience(follow, gradeFollow);
        } else if(max == dataset.englishEntropy) {
            System.out.println("The class with maximum information gain is: English");
            dataset.pure = true;
            categories.getEnglish(follow, gradeFollow);
        }

        dataset.pure = false;
    }

}
