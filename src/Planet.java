public class Planet {
    double xpos;
    double ypos;
    double xvel;
    double yvel;
    double mass;
    String name;
    double fx;
    double fy;

    public Planet(double xpos, double ypos, double xvel, double yvel, double mass, String name){
        this.xpos=xpos;
        this.ypos = ypos;
        this.xvel = xvel;
        this.yvel = yvel;
        this.mass = mass;
        this.name = name;
        this.fx = 0;
        this.fy = 0;

       
    }

    public double getXPos(){
        return xpos;
    }

    public double getYPos(){
        return ypos;
    }

    public double getXVel(){
        return xvel;
    }

    public double getYVel(){
        return yvel;
    }

    public double getMass(){
        return mass;
    }

    public String getName(){
        return name;
    }

    public double getFx() {
        return fx;
    }
    
    public double getFy() {
        return fy;
    }

}

