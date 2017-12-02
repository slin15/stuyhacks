import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Quiz {
        static InputStreamReader isr = new InputStreamReader( System.in );
    static BufferedReader in = new BufferedReader( isr );
    
    public static void main(String [] args) {

        // The name of the file to open.
        String fileName = "quiz.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
		String [] answers = new String[10];
		    int counter = 0;
		    answers[counter] = in.readLine();
		    counter += 1;
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
}
