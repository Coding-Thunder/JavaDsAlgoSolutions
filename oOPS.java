class Bicycle {
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    };

    public void applyBrake(int decrement) {
        speed -= decrement;
    };

    public void speedUp(int increment) {
        speed += increment;
    };

    public String printInfo() {
        return ("No of gears are " + gear + "\n" + "speed of bicycle is " + speed);
    }
}

class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike(int gear, int speed, int startHeight) {
        super(gear, speed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    @Override
    public String printInfo() {
        return (super.printInfo() + "\n seatHeight is " + seatHeight);
    }
}

public class oOPS {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.printInfo());
        mb.speedUp(20);
        System.out.println(mb.printInfo());
        mb.setHeight(12);
        System.out.println(mb.printInfo());
        mb.applyBrake(2);
        System.out.println(mb.printInfo());
    }
}