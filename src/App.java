import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import edu.princeton.cs.algs4.StdDraw;

public class App {

    static ArrayList<Planet> planets = new ArrayList<>();
    static double Gravity = 6.67E-11;
    static double Time = 100;
    static double TotalTime= 10E100;
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

    draw();
    }

    
        public  void loopAddForce(){
        for(int i = 0; i < planets.size(); i++ ){
            Planet p1 = planets.get(i);
            double netFx = 0;
            double netFy = 0;
            for (int j = 0; j < planets.size(); j++){
                if (i!=j) {
                Planet p2 = planets.get(j);
                   netFx +=  calcXForce(p1, p2);
                   netFy += calcYForce(p1, p2);
                }
            }
            p1.fx = netFx;
            p1.fy = netFy;
        }
    }


        public void simulateTime(double totalTime, double Time){
            for (int i = 0; i < totalTime; i+= Time){
                loopAddForce();
                for (int j = 0; j < planets.size(); j++){
                    Planet p = planets.get(j);
                    double ax = p.fx/ p.mass;
                    double ay = p.fy/p.mass;

                    p.xvel += ax * Time;
                    p.yvel += ay * Time;

                    p.xpos += p.xvel * Time;
                    p.ypos += p.yvel * Time;

                    StdDraw.point(p.xpos, p.ypos);
                }
                StdDraw.clear();
                for (int k = 0; k < planets.size(); k++){
                    Planet j = planets.get(k);
                    StdDraw.picture(j.getXPos(), j.getYPos(), "earth.png");

                }
      
            }
            draw();

            
        }

        public static void draw(){
            StdDraw.setCanvasSize(600, 600);
            StdDraw.setPenColor(Color.BLACK);
            StdDraw.setXscale(-12,12);
            StdDraw.setYscale(-12,12);
            StdDraw.setPenRadius(0.001);
            StdDraw.line(0, -50, 0, 50);
            StdDraw.line(-50, 0, 50, 0);
           StdDraw.circle(0, 0, 2);
          
            StdDraw.show();  

        }

        double calcDist(Planet p1, Planet p2){

            double dx = p1.getXPos()-p2.getXPos();
            double dy = p1.getYPos()-p2.getYPos();
            return Math.sqrt(dx*dx + dy*dy);

            }

        double calcForceBetween2(Planet p1, Planet p2){
            double dist = calcDist(p1, p2);
            double force = (Gravity*p1.getMass()*p2.getMass())/(dist*dist);
            return force;
        }
    
        
        double calcXForce(Planet p1, Planet p2){
            double dist = calcDist(p1, p2);
            double force = calcForceBetween2(p1, p2);
            double xForce = (force*(p1.getXPos()-p2.getXPos()))/dist;

            return xForce;
        }

        double calcYForce(Planet p1, Planet p2){
            double dist = calcDist(p1, p2);
            double force = calcForceBetween2(p1, p2);
            double yForce = (force*(p1.getYPos()-p2.getYPos()))/dist;

            return yForce;
        }

        double calcXAc(Planet p){
            return p.getFx() / p.getMass();
        }
        
        double calcYAc(Planet p){
            return p.getFy() / p.getMass();
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



