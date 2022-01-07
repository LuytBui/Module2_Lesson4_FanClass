public class Main {

    public static void main(String[] args) {
	    Fan fan1 = new Fan();
        System.out.println(fan1);

        fan1.setRadius(15);
        fan1.setOn(true);
        fan1.setSpeed(Fan.FAST);
        fan1.setColor("pink");
        System.out.println(fan1);

    }
}
