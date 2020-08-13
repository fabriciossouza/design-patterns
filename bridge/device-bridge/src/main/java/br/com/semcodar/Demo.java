package br.com.semcodar;

import br.com.semcodar.device.Device;
import br.com.semcodar.device.Radio;
import br.com.semcodar.device.Tv;
import br.com.semcodar.remote.AdvancedRemote;
import br.com.semcodar.remote.BasicRemote;

public class Demo {

    public static void main(String[] args) {
        testDevice(new Radio());
        testDevice(new Tv());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
