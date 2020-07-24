package logic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import sound.Sound;

public final class ReadFile {
    
    public ReadFile (String file) {
        path = source + file;
        try {
            String[] total = readLines();
        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    
    public String[] readLines() throws IOException {
        FileReader fileToRead;
        BufferedReader textToRead;
        try {
            fileToRead = new FileReader(path);
            textToRead = new BufferedReader(fileToRead);
        }  
        catch (FileNotFoundException e) {
            throw e;
        }
        
        try {
            System.out.println("str: " + textToRead.readLine());
            String[] text = textToRead.lines().toArray(String[]::new);
            fileToRead.close();
            for (String x : text) {
                System.out.println(x);
            }
            return text;
        }
        catch (IOException e) {
            throw e;
        }
    }
    
    public int bpm;
    public int[] time;
    
    public Sound[] sounds;
    
    public int[][] generatedLines;
    
    final String source = "C:/Users/stefa/Documents/Drumhelper/generated files/";
    String path;
}
