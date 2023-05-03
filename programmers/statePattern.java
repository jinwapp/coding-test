public class statePattern {
    public static void main(String[] args) {
        TrafficLight test = new TrafficLight();
        test.speak();
        test.wait1();
        test.speak();
    }
}
class TrafficLight {
    private State state;

    public TrafficLight() {
        this.state = new GreenLight();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void speak() {
        this.state.speak();
    }

    public void wait1() {
        this.state.wait(this);
    }
}

abstract class State {
    public abstract void speak();
    public abstract void wait(TrafficLight trafficLight);
}

class GreenLight extends State {
    @Override
    public void speak() {
        System.out.println("green light");
    }

    @Override
    public void wait(TrafficLight trafficLight) {
        System.out.println("wait.. the light changed");
        trafficLight.setState(new RedLight());
    }
}

class RedLight extends State {
    @Override
    public void speak() {
        System.out.println("red light");
    }

    @Override
    public void wait(TrafficLight trafficLight) {
        System.out.println("wait.. the light changed");
        trafficLight.setState(new GreenLight());
    }
}