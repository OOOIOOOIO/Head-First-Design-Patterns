package book.hfdp.ch06_command_pattern.simpleRemote.invoker;

import book.hfdp.ch06_command_pattern.simpleRemote.command.Command;

public class SimpleRemoteControl {
    Command slot;

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.excute();
    }
}
