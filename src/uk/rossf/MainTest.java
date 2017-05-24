package uk.rossf;

import java.io.*;

public class MainTest {
    @org.junit.Before
    public void setUp() throws Exception {
        System.setIn(new BufferedInputStream(new FileInputStream("input.txt")));

        FileOutputStream out = new FileOutputStream("output.txt");

        System.setOut(new PrintStream(out));
    }

    @org.junit.Test
    public void main() throws Exception {
        Main.main(new String[] {});
    }

}