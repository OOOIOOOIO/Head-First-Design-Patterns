package book.hfdp.ch06_command_pattern.remotecontrol.command;

import book.hfdp.ch06_command_pattern.remotecontrol.receiver.Stereo;

public class StereoOffCommand implements Command{
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void excute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);

    }
}
