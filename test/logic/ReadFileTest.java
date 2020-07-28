package logic;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stefa
 */
public class ReadFileTest {
    
    public ReadFileTest() {
        
    }

    /**
     * Test of reading file.
     */
    @Test
    public void testReadFiles() {
        System.out.println("Tests for ReadFile");
        testReadFile1();
    }
    
    public void testReadFile1() {
        instance = new ReadFile("test1.txt", "C:/Users/stefa/Documents/Drumhelper/testFiles/");
        String[] expSounds = {"exampleSnare.WAV"};
        boolean[][][] expLines = {{{true}, {true}, {true}, {true}}};
        
        // Test variables
        testNonArrayVariables(120, 4, 4);
        testSounds(expSounds);
        testLines(expLines);
    }
    
    public void testNonArrayVariables (int bpm, int time1, int time2) {
        assertEquals(instance.bpm, bpm);
        assertEquals(instance.time[0], time1);
        assertEquals(instance.time[1], time2);
    }

    private void testSounds(String[] expSounds) {
        String[] sounds = new String[instance.sounds.length];
        for (int i = 0; i < instance.sounds.length; i++) {
            sounds[i] = instance.sounds[i].fileName;
        }
        if (!Arrays.equals(expSounds, sounds)) {
            fail("Sounds are not equal");
        }
    }

    private void testLines(boolean[][][] expLines) {
        if (!Arrays.deepEquals(expLines, instance.generatedLines)) {
            fail("Lines are not equal");
        }
    }
    
    ReadFile instance;
}
