package books;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVreader {

    String csvFile = "/Users/shirkinmity/Desktop/ДляЛабыИмена.csv";
    String line = "";

    public void reader() {
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 0 && str[0] != null) {
                    EnglishBookFactory.names.add(str[0]);
                }
                if (str.length > 1 && str[1] != null) {
                    EnglishBookFactory.author.add(str[1]);
                }
                if (str.length > 2 && str[2] != null) {
                    EnglishBookFactory.levels.add(str[2]);
                }
                if (str.length > 3 && str[3] != null) {
                    EnglishBookFactory.univercity.add(str[3]);
                }
                if (str.length > 4 && str[4] != null) {
                    RussianBookFactory.names.add(str[4]);
                }
                if (str.length > 5 && str[5] != null) {
                    RussianBookFactory.subType.add(str[5]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
