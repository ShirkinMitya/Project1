package laba1;

import books.EnglishEducationalBookFactory;
import books.EnglishFictionBookFactory;
import books.RussianEducationalBookFactory;
import books.RussianFictionBookFactory;
import customers.Builder;
import customers.LibraryClientType;
import customers.StudentBuilder;
import customers.TeacherBuilder;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVreader {

    String line = "";

    public void readCsvEnglishEducational(String FileName, EnglishEducationalBookFactory englishEducationalBookFactory) {

        try (BufferedReader br = new BufferedReader(new FileReader(FileName))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 0 && !str[0].isBlank()) {
                    englishEducationalBookFactory.getNamesForEducational().add(str[0]);
                }
                if (str.length > 1 && !str[1].isBlank()) {
                    englishEducationalBookFactory.getUnivercities().add(str[1]);
                }
                if (str.length > 2 && !str[2].isBlank()) {
                    englishEducationalBookFactory.getAuthorForEducational().add(str[2]);
                }
                if (str.length > 3 && !str[3].isBlank()) {
                    englishEducationalBookFactory.getLevels().add(str[3]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readCsvEnglishFuntion(String FileName, EnglishFictionBookFactory englishFictionBookFactory) {
        try (BufferedReader br = new BufferedReader(new FileReader(FileName))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 0 && !str[0].isBlank()) {
                    englishFictionBookFactory.getNamesForFiction().add(str[0]);
                }
                if (str.length > 1 && !str[1].isBlank()) {
                    englishFictionBookFactory.getAuthorToFiction().add(str[1]);
                }
                if (str.length > 2 && !str[2].isBlank()) {
                    englishFictionBookFactory.getYear().add(str[2]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readCsvRussianEducational(String FileName, RussianEducationalBookFactory russianEducationalBookFactory) {
        try (BufferedReader br = new BufferedReader(new FileReader(FileName))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 0 && !str[0].isBlank()) {
                    russianEducationalBookFactory.getNamesForEducational().add(str[0]);
                }
                if (str.length > 1 && !str[1].isBlank()) {
                    russianEducationalBookFactory.getSubType().add(str[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readCsvRussianFiction(String FileName, RussianFictionBookFactory russianFictionBookFactory) {
        try (BufferedReader br = new BufferedReader(new FileReader(FileName))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 0 && !str[0].isBlank()) {
                    russianFictionBookFactory.getNamesForFiction().add(str[0]);
                }
                if (str.length > 1 && !str[1].isBlank()) {
                    russianFictionBookFactory.getAuthor().add(str[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readCsvGeneralPeople(String FileName, Builder builder) {
        try (BufferedReader br = new BufferedReader(new FileReader(FileName))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 2 && !str[2].isBlank()) {
                    builder.getNames(LibraryClientType.MAN).add(str[2]);
                }
                if (str.length > 3 && !str[3].isBlank()) {
                    builder.getNames(LibraryClientType.WOMAN).add(str[3]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readCsvTeachers(String FileName, TeacherBuilder builder) {
        try (BufferedReader br = new BufferedReader(new FileReader(FileName))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 0 && !str[0].isBlank()) {
                    builder.getTeachersManSurnames().add(str[0]);
                }
                if (str.length > 1 && !str[1].isBlank()) {
                    builder.getTeachersWomanSurnames().add(str[1]);
                }
                if (str.length > 6 && !str[6].isBlank()) {
                    builder.getTeachersManMiddleNames().add(str[6]);
                }
                if (str.length > 7 && !str[7].isBlank()) {
                    builder.getTeachersWomanMiddleNames().add(str[7]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readCsvStudents(String FileName, StudentBuilder builder) {
        try (BufferedReader br = new BufferedReader(new FileReader(FileName))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 4 && !str[4].isBlank()) {
                    builder.getManSurnames().add(str[4]);
                }
                if (str.length > 5 && !str[5].isBlank()) {
                    builder.getWomanSurnames().add(str[5]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
