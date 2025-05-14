public class Planet {
    double xpos;
    double ypos;
    double xvel;
    double yvel;
    double mass;
    String name;

    public Planet(double xpos, double ypos, double xvel, double yvel, double mass, String name){
        this.xpos=xpos;
        this.ypos = ypos;
        this.xvel = xvel;
        this.yvel = yvel;
        this.mass = mass;
        this.name = name;
       
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

}

