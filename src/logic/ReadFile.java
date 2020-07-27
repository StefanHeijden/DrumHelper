package logic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import sound.Sound;

public final class ReadFile {
    
    public ReadFile (String file, String source) {
        path = source + file;
        System.out.println(source + file);
        // Read text from the given file
        String[] total;
        try {
            total = readLines();
        }
        catch (IOException e) {
            throw new NullPointerException("Error: " + e);
        }
        
        // Obtain the data from the array of strings read from the textfile
        bpm = Integer.parseInt(total[0]);
        time = new int[2];
        time[0] = Integer.parseInt(total[1].split(" ")[0]);
        time[1] = Integer.parseInt(total[1].split(" ")[1]);
        
        // Obtain sounds from the files
        int nSounds = Integer.parseInt(total[2]);
        sounds = new Sound[nSounds];
        for (int i  = 0; i < nSounds; i++) {
            sounds[i] = new Sound(total[3 + i]);
        }
        
        // Obtain generated lines
        int currentIndex = 3 + nSounds;
        int nLines = Integer.parseInt(total[currentIndex]);
        generatedLines = new boolean[nLines][time[1]][nSounds];
        for (int r  = 0; r < nLines; r++) {
            String[] line = total[currentIndex + r + 1].split(",");
            for (int c = 0; c < line.length; c++) { 
                String[] notes = line[c].split(" ");
                for (String note : notes) {
                    generatedLines[r][c][Integer.parseInt(note)] = true;
                }
            }
        }
    }
    
    // Read text from the given file
    public String[] readLines() throws IOException {
        FileReader fileToRead;
        BufferedReader textToRead;
        
        // Get the file
        try {
            fileToRead = new FileReader(path);
            textToRead = new BufferedReader(fileToRead);
        }  
        catch (FileNotFoundException e) {
            throw e;
        }
        
        // Put each line as entry in a string
        try {
            String[] text = textToRead.lines().toArray(String[]::new);
            fileToRead.close();
            return text;
        }
        catch (IOException e) {
            throw e;
        }
    }
    
    public int bpm;
    public int[] time;
    
    public Sound[] sounds;
    
    public boolean[][][] generatedLines;
    
    final String source = "C:/Users/stefa/Documents/Drumhelper/generated files/";
    String path;
}
