package br.com.semcodar.remote;

import br.com.semcodar.device.Device;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import static java.lang.System.out;


@AllArgsConstructor
@NoArgsConstructor
public class BasicRemote implements  Remote {

    protected Device device;


    @Override
    public void power() {

        out.println("Remote: power toggle");
        if(device.isEnabled())
            device.disabled();
        else
            device.enable();
    }

    @Override
    public void volumeDown() {
        out.println("Remote: volume down");
        device.setVolume(device.getVolume() - 1);
    }

    @Override
    public void volumeUp() {
        out.println("Remote: volume up");
        device.setVolume(device.getVolume() + 1);
    }

    @Override
    public void channelDown() {
        out.println("Remote: channel down");
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        out.println("Remote: channel up");
        device.setChannel(device.getChannel() + 1);
    }
}