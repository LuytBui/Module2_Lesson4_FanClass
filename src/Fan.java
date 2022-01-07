public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean on;
    private int radius;
    private String color;

    public Fan(){
        this(SLOW, false, 10, "blue");
    }
    public Fan(int speed,boolean on,int radius,String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public String toString(){
        String speedString = "";
        switch (this.speed){
            case SLOW: speedString = "slow"; break;
            case MEDIUM: speedString = "medium"; break;
            case FAST: speedString = "fast"; break;
        }
        String msg = String.format("Fan: speed = %s, on = %b, radius = %d, color = %s.",
                speedString, this.on, this.radius, this.color
        );
        return msg;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
