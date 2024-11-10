public class Eagle extends Bird implements Fly{

    private final boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (this.altitude == 0) {
            System.out.println(this.getName() + " takes off in the sky.");
        }
    }

    @Override
    public void ascend(int meters) {
        this.altitude += meters;
        System.out.println(this.getName() + " flies upward, altitude: " + this.altitude);
    }

    @Override
    public void descend(int meters) {
        if (this.altitude - meters < 0) {
            this.altitude = 0;
        } else {
            this.altitude -= meters;
        }
        System.out.println(this.getName() + " flies downward, altitude: " + this.altitude);
    }

    @Override
    public void land() {
        if (this.altitude > 1) {
            System.out.println(this.getName() + " is too high, it can't land.");
        } else {
            System.out.println(this.getName() + " lands on the ground.");
        }
    }

    @Override
    public void glide() {
        System.out.println(this.getName() + " glides into the air.");
    }
}
