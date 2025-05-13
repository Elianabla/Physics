import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import edu.princeton.cs.algs4.StdDraw;

public class App {

    static ArrayList<Planet> planets = new ArrayList<>();
    static double Gravity = 6.67E-11;
    public static void main(String[] args) throws Exception {

        // Step 1. Parse command-line arguments.

        
        double distance;

        try (BufferedReader reader = new BufferedReader(
            new FileReader("/Users/elianablankstein/Physics/src/hi.text"))) {
            String line = reader.readLine();
            String radius = reader.readLine();
            

            int count = Integer.parseInt(line);

            for (int i = 0; i < count; i++) {
                String hi = reader.readLine();
                String[] parts = hi.split(" ");
                double xpos = Double.parseDouble(parts[0]);
                double ypos = Double.parseDouble(parts[1]);
                double xvel = Double.parseDouble(parts[2]);
                double yvel = Double.parseDouble(parts[3]);
                double mass = Double.parseDouble(parts[4]);
                String name = parts[5];
                
                
                
                planets.add(new Planet(xpos, ypos, xvel, yvel, mass, name));

            }
            System.out.println(line);
            System.out.println(radius);

          
    


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
        
        public static void draw(){
            StdDraw.setCanvasSize(600, 600);
            StdDraw.setPenColor();
            StdDraw.setXscale(-12,12);
            StdDraw.setYscale(-12,12);
            StdDraw.setPenRadius(0.001);
            StdDraw.line(0, -50, 0, 50);
            StdDraw.line(-50, 0, 50, 0);
            StdDraw.show();  
        }

        double calcDist(Planet p){

            double xPosSub = 0;
            double yPosSub = 0;
            double dist = 0;
            
            for (int i = 0; i < planets.size(); i++){
                for (int j = 0; j < planets.size(); j++){
                    if (i!= j){
                         xPosSub = planets.get(i).getXPos() - planets.get(j).getXPos();
                         yPosSub = planets.get(i).getYPos() - planets.get(j).getYPos();
                         dist = Math.sqrt(xPosSub*xPosSub + yPosSub*yPosSub);
                        
                    }



            }

    
        }
        return dist;


        }

        double calcForce(Planet p){
            

            double Force = Gravity* p.getMass()* x.getMass();

            
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


