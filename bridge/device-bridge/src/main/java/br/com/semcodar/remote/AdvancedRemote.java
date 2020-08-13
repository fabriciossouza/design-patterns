package br.com.semcodar.remote;

import br.com.semcodar.device.Device;

import static java.lang.System.out;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute(){
        out.println("Remote: mute");
        device.setVolume(0);
    }
}
