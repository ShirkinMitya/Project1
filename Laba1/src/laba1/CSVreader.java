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
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 0 && !str[0].isBlank()) {
                    EnglishBookFactory.namesForEducational.add(str[0]);
                }
                if (str.length > 1 && !str[1].isBlank()) {
                    EnglishBookFactory.univercities.add(str[1]);
                }
                if (str.length > 2 && !str[2].isBlank()) {
                    EnglishBookFactory.authorForEducational.add(str[2]);
                }
                if (str.length > 3 && !str[3].isBlank()) {
                    EnglishBookFactory.levels.add(str[3]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile2))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 0 && !str[0].isBlank()) {
                    EnglishBookFactory.namesForFiction.add(str[0]);
                }
                if (str.length > 1 && !str[1].isBlank()) {
                    EnglishBookFactory.authorToFiction.add(str[1]);
                }
                if (str.length > 2 && !str[2].isBlank()) {
                    EnglishBookFactory.year.add(str[2]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile3))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 0 && !str[0].isBlank()) {
                    RussianBookFactory.namesForEducational.add(str[0]);
                }
                if (str.length > 1 && !str[1].isBlank()) {
                    RussianBookFactory.subType.add(str[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile4))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 0 && !str[0].isBlank()) {
                    RussianBookFactory.namesForFiction.add(str[0]);
                }
                if (str.length > 1 && !str[1].isBlank()) {
                    RussianBookFactory.author.add(str[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile5))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 0 && !str[0].isBlank()) {
                    Director.TeachersManSurnames.add(str[0]);
                }
                if (str.length > 1 && !str[1].isBlank()) {
                    Director.TeachersWomanSurnames.add(str[1]);
                }
                if (str.length > 2 && !str[2].isBlank()) {
                    Director.ManNames.add(str[2]);
                }
                if (str.length > 3 && !str[3].isBlank()) {
                    Director.WomanNames.add(str[3]);
                }
                if (str.length > 4 && !str[4].isBlank()) {
                    Director.ManSurnames.add(str[4]);
                }
                if (str.length > 5 && !str[5].isBlank()) {
                    Director.WomanSurnames.add(str[5]);
                }
                if (str.length > 6 && !str[6].isBlank()) {
                    Director.TeachersManMiddleNames.add(str[6]);
                }
                if (str.length > 7 && !str[7].isBlank()) {
                    Director.TeachersWomanMiddleNames.add(str[7]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
