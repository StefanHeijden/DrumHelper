package logic;

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
     * Test of readLines method, of class ReadFile.
     * @param testFile
     */
    @Test
    public void testReadLines(String testFile) throws Exception {
        System.out.println("readLines");
        ReadFile instance = null;
        String[] expResult = null;
        String[] result = instance.readLines();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    public void testNonArrayVariables (ReadFile file, int bpm, int time1, int time2) {
        assertEquals(file.bpm, bpm);
        assertEquals(file.time[0], time1);
        assertEquals(file.time[1], time2);
    }
}
