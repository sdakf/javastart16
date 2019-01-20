package pl.sda.javastart.day8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileOperations {
    private static final String PATH_TO_FILE = "c:\\projects\\wiersz.txt";

    public static void main(String[] args) {
        notNiceFileReadWithManyTries();
        niceReadFileExampleTryWithResources();
    }

    private static void niceReadFileExampleTryWithResources() {
        try (FileReader fileReader = new FileReader(PATH_TO_FILE)) { //try with resources
            readLinesInner(fileReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void notNiceFileReadWithManyTries() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(PATH_TO_FILE);
            readLinesInner(fileReader);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            //ABSOLUTNIE NIGDY NIE ZOSTAWIAJCIE PUSTEGO KECZA!!!
        } finally {
            if(fileReader!=null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void printCapitalized(List<String> lines) {
        for (String s : lines) {
            String c = String.valueOf(s.charAt(0));
            String upperCased = c.toUpperCase();
            String restOfLine = s.substring(1);
            System.out.println(upperCased + restOfLine);

//                System.out.println(StringUtils.capitalize(s)); alternatywa
        }
    }

    private static void readLinesInner(FileReader fileReader) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<String> lines = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }
        printCapitalized(lines);
    }
}
