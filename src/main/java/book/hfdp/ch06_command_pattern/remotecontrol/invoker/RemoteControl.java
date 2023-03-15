package book.hfdp.ch06_command_pattern.remotecontrol.invoker;

import book.hfdp.ch06_command_pattern.remotecontrol.command.Command;
import book.hfdp.ch06_command_pattern.remotecontrol.command.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    // 초기화
    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();

        for(int i = 0; i < 7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;

    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].excute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].excute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n=======리모컨=========\n");

        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[Slot " + i + "] "+ onCommands[i].getClass().getName() + " " + offCommands[i].getClass().getName() + "\n");

        }
        return stringBuffer.toString();
    }
}
