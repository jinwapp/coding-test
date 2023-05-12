//public class statepatternyes {
//}
//
//interface PowerState {
//    public void powerPush();
//}
//
//class On implements PowerState{
//    public void powerPush(){
//        System.out.println("전원 off");
//    }
//}
//
//class Off implements PowerState {
//    public void powerPush(){
//        System.out.println("절전 모드");
//    }
//}
//
//class Saving implements PowerState {
//    public void powerPush(){
//        System.out.println("전원 on");
//    }
//}
//
//class Laptop2 {
//    private PowerState powerState;
//
//    public Laptop(){
//        this.powerState = new Off();
//    }
//
//    public void setPowerState(PowerState powerState){
//        this.powerState = powerState;
//    }
//
//    public void powerPush(){
//        powerState.powerPush();
//    }
//}
//
//class Client2 {
//    public static void main(String args[]){
//        Laptop laptop = new Laptop();
//        On on = new On();
//        Off off = new Off();
//        Saving saving = new Saving();
//
//        laptop.powerPush();
//        laptop.setPowerState(on);
//        laptop.powerPush();
//        laptop.setPowerState(saving);
//        laptop.powerPush();
//        laptop.setPowerState(off);
//        laptop.powerPush();
//        laptop.setPowerState(on);
//        laptop.powerPush();
//    }
//}