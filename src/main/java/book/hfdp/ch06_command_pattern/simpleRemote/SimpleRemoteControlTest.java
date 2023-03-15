package book.hfdp.ch06_command_pattern.simpleRemote;

import book.hfdp.ch06_command_pattern.simpleRemote.command.LightOnCommand;
import book.hfdp.ch06_command_pattern.simpleRemote.invoker.SimpleRemoteControl;
import book.hfdp.ch06_command_pattern.simpleRemote.receiver.Light;

public class SimpleRemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl(); // 인보커 역할, 필요한 작업을 요청할 때 사용할 커맨드 객체를 전달 받는다.

        Light light = new Light(); // 리시버 역할, 요청을 받아 처리한다.

        LightOnCommand lightOn = new LightOnCommand(light); // 커맨드 역할, 이때 리시버를 전달해 준다.

        remoteControl.setCommand(lightOn); // 인보커에 커맨드 객체 전달

        remoteControl.buttonWasPressed(); // command.excute() 실행 -> light.on() 실행



    }
}
