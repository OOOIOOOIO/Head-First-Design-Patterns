package book.hfdp.ch06_command_pattern.remotecontrol.command;

import book.hfdp.ch06_command_pattern.remotecontrol.receiver.Stereo;

public class StereoOnWithCDCommand implements Command{
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void excute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
    @Override
    public void undo() {
        stereo.off();

    }
}
