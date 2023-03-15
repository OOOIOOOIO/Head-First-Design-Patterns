package book.hfdp.ch06_command_pattern.remotecontrol.command;

import book.hfdp.ch06_command_pattern.remotecontrol.receiver.Light;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        light.on();

    }
    @Override
    public void undo() {
        light.off();;
    }

}
