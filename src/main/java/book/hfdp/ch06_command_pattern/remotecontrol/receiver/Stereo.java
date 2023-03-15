package book.hfdp.ch06_command_pattern.remotecontrol.receiver;

public class Stereo {

    public Stereo(String place) {
        System.out.println("place = " + place);
    }

    public void setVolume(int i) {
        System.out.println("======= 볼륨 설정 + " + i + " ========");
    }

    public void setCD() {
        System.out.println("======= CD 설정 =======");
    }

    public void on() {
        System.out.println("======= Stereo On ========");
    }

    public void off() {
        System.out.println("======= Stereo Off ========");
    }
}
