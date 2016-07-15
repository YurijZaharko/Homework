package Mapa;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by SCIP on 15.07.2016.
 */
public class Saver implements Serializable{

    public void addToFile(String fileName, String textToWrite){
        File file = new File(fileName);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.newLine();
                    bufferedWriter.write(textToWrite);
                    bufferedWriter.flush();
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } finally {
            if (fileWriter != null){

                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void writeInFile(String fileName, String textToWrite){
        File file = new File(fileName);
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (bufferedWriter != null) {
                bufferedWriter.write(textToWrite);
                bufferedWriter.flush();
                bufferedWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void readFromFile(String filename){
        try {
            Files.lines(Paths.get(filename)).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
