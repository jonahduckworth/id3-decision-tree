import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class dataset {
    public static String[][] dataset = new String[14][5];

    public static int yes = 0;
    public static int no = 0;

    public static double ap, apCount;
    public static double  a, aCount;
    public static double am, amCount;
    public static double bp, bpCount;
    public static double  b, bCount;

    public static double completeEntropy;
    public static double count;

    public static void getDataset() {
        String line;
        String splitBy = ",";
        int i = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/dataset.csv"));

            while ((line = br.readLine()) != null) {
                String[] getData = line.split(splitBy);

                for(int j = 0; j < 5; j++) {

                    switch (getData[j]) {
                        case "A+", "A", "A-", "B+", "B", "Yes", "No" -> {
                            if(j == 0) {
                                dataset[i][j] = getData[j];
                            } else if(j == 1) {
                                dataset[i][j] = getData[j];
                            } else if(j == 2) {
                                dataset[i][j] = getData[j];
                            }  else if(j == 3) {
                                dataset[i][j] = getData[j];
                            } else {
                                dataset[i][j] = getData[j];
                            }
                        }
                    }

                }

                i++;
            }

        } catch (IOException e) { e.printStackTrace(); }

    }

}
