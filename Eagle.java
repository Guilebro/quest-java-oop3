public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s take off in the sky.%n", this.getName());
        }
    }

    @Override
    public int ascend(int altitude) {
        this.altitude += altitude;
        if (this.flying) {
            System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public int descend(int altitude) {
        this.altitude -= altitude;
        if (this.flying) {
            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void glide() {
        if (this.flying) {
            System.out.println( this.getName() + " " + "glides into the air.");
        }

    }

    @Override
    public void land() {
        if (this.flying && this.altitude < 10) {
            System.out.printf("%s lands on the ground.%n", this.getName());
        } else {
            System.out.printf("%s is too high, it can't land.%n", this.getName());
        }
    }


    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
}
