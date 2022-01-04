public class driver {

    public static void main(String[] args) {
        // get dataset from .csv file
        dataset.getDataset();

        // calculate complete entropy of dataset
        categories.getEntropy();
        System.out.println("\nComplete entropy of dataset: " + dataset.completeEntropy + "\n");
    }



}
