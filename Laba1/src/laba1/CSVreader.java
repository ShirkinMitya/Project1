package laba1;

import books.EnglishBookFactory;
import books.RussianBookFactory;
import customers.Director;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVreader {

    String csvFile1 = "/Users/shirkinmity/Desktop/АнглийскаяНаучная.csv";
    String csvFile2 = "/Users/shirkinmity/Desktop/АнглийскаяХудожественная.csv";
    String csvFile3 = "/Users/shirkinmity/Desktop/РусскаяНаучная.csv";
    String csvFile4 = "/Users/shirkinmity/Desktop/РусскаяХодожественная.csv";
    String csvFile5 = "/Users/shirkinmity/Desktop/Фио.csv";
    String line = "";

    public void reader() {

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile1))) {
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 0 && str[0] != null) {
                    EnglishBookFactory.namesForEducational.add(str[0]);
                }
                if (str.length > 1 && str[1] != null) {
                    EnglishBookFactory.levels.add(str[1]);
                }
                if (str.length > 2 && str[2] != null) {
                    EnglishBookFactory.authorForEducational.add(str[2]);
                }
                if (str.length > 3 && str[3] != null) {
                    EnglishBookFactory.univercities.add(str[3]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile2))) {
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 0 && str[0] != null) {
                    EnglishBookFactory.namesForFiction.add(str[0]);
                }
                if (str.length > 1 && str[1] != null) {
                    EnglishBookFactory.levels.add(str[1]);
                }
                if (str.length > 2 && str[2] != null) {
                    EnglishBookFactory.authorToFiction.add(str[2]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile3))) {
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 0 && str[0] != null) {
                    RussianBookFactory.namesForEducational.add(str[0]);
                }
                if (str.length > 1 && str[1] != null) {
                    RussianBookFactory.subType.add(str[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile4))) {
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 0 && str[0] != null) {
                    RussianBookFactory.namesForFiction.add(str[0]);
                }
                if (str.length > 1 && str[1] != null) {
                    RussianBookFactory.author.add(str[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile5))) {
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 0 && str[0] != null) {
                    Director.TeachersManSurnames.add(str[0]);
                }
                if (str.length > 1 && str[1] != null) {
                    Director.TeachersWomanSurnames.add(str[1]);
                }
                if (str.length > 2 && str[2] != null) {
                    Director.ManNames.add(str[2]);
                }
                if (str.length > 3 && str[3] != null) {
                    Director.WomanNames.add(str[3]);
                }
                if (str.length > 4 && str[4] != null) {
                    Director.ManSurnames.add(str[4]);
                }
                if (str.length > 5 && str[5] != null) {
                    Director.WomanSurnames.add(str[5]);
                }
                if (str.length > 6 && str[6] != null) {
                    Director.TeachersManMiddleNames.add(str[6]);
                }
                if (str.length > 7 && str[7] != null) {
                    Director.TeachersWomanMiddleNames.add(str[7]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
