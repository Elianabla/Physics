import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
       
        // Step 1. Parse command-line arguments.
    
        double Gravity = 6.67E-11;
        double distance;


        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/elianablankstein/Physics/src/hi.text"))) {
        String line;
        line = reader.readLine();
        System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }

       
        
 

        // Step 2. Read the universe from standard input.

        // Step 3. Initialize standard drawing.

        // Step 4. Play music on standard audio.

        // Step 5. Simulate the universe.

        // Step 5A. Calculate net forces.
        // Step 5B. Update velocities and positions.
        // Step 5C. Draw universe to standard drawing.

        // Step 6. Print universe to standard output

    }
}
