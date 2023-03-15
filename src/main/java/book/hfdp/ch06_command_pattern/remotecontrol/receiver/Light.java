package book.hfdp.ch06_command_pattern.remotecontrol.receiver;

public class Light {

    public Light(String place) {

        System.out.println("place = " + place);
    }

    public void off() {
        System.out.println("====== Light Off =======");

    }

    public void on() {
        System.out.println("====== Light On =======");
    }
}
