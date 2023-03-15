package book.hfdp.ch06_command_pattern.remotecontrol;

import book.hfdp.ch06_command_pattern.remotecontrol.command.*;
import book.hfdp.ch06_command_pattern.remotecontrol.invoker.RemoteControl;
import book.hfdp.ch06_command_pattern.remotecontrol.receiver.Light;
import book.hfdp.ch06_command_pattern.remotecontrol.receiver.Stereo;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(); // Invoker

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");

        Stereo stereo = new Stereo("Living Room");

        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight); // Command
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);


        // kitchen용 커맨드 ~

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);


        Command[] onCommands = new Command[]{lightOnCommand, lightOffCommand, stereoOnWithCDCommand, stereoOff}; // Macro Command
        Command[] offCommands = new Command[]{stereoOff,stereoOnWithCDCommand, lightOffCommand, lightOnCommand}; // Macro Command
        MacroCommand OnMacroCommand = new MacroCommand(onCommands);
        MacroCommand OffMacroCommand = new MacroCommand(offCommands);


        remoteControl.setCommand(0, lightOnCommand, lightOffCommand); // Invoker에 Command 객체 전달
        remoteControl.setCommand(1, stereoOnWithCDCommand, stereoOff);

        remoteControl.setCommand(2, OnMacroCommand, OffMacroCommand);

        System.out.println(stereoOff.toString());


        remoteControl.onButtonWasPushed(0); // 키기
        remoteControl.offButtonWasPushed(0); // 끄기
        remoteControl.undoButtonWasPushed(); // 이전

        System.out.println();

        remoteControl.onButtonWasPushed(1);

        System.out.println();

        remoteControl.onButtonWasPushed(2);
        System.out.println();
        remoteControl.offButtonWasPushed(2);
    }
}
