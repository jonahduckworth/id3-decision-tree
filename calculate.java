import java.util.Objects;

public class calculate {

    public static void getCategory(String grade, int subject) {
        String[][] category = dataset.dataset;
        dataset.count = 0;

        for(int i = 0; i < dataset.dataset.length; i++) {

            if(Objects.equals(category[i][subject], grade) && Objects.equals(category[i][4], "Yes")) {
                dataset.yes++;
                dataset.count++;
            } else if(Objects.equals(category[i][subject], grade) && Objects.equals(category[i][4], "No")) {
                dataset.no++;
            }

        }

    }

}
