public class statepatternno {

}

class Laptop {
    public static String ON = "on";
    public static String OFF = "off";
    public static String SAVING = "saving";
    private String powerState = "";

    public Laptop(){
        setPowerState(Laptop.OFF);
    }

    public void setPowerState(String powerState){
        this.powerState = powerState;
    }

    public void powerPush(){
        if ("on".equals(this.powerState)) {
            System.out.println("전원 off");
        }
        else if ("saving".equals(this.powerState)){
            System.out.println("전원 on");
        }
        else {
            System.out.println("절전 모드");
        }
    }
}

class Client {
    public static void main(String args[]){
        Laptop laptop = new Laptop();
        laptop.powerPush();
        laptop.setPowerState(Laptop.ON);
        laptop.powerPush();
        laptop.setPowerState(Laptop.SAVING);
        laptop.powerPush();
        laptop.setPowerState(Laptop.OFF);
        laptop.powerPush();
        laptop.setPowerState(Laptop.ON);
        laptop.powerPush();
    }
}
