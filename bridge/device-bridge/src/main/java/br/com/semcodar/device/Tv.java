package br.com.semcodar.device;

import static java.lang.System.out;

public class Tv implements Device {

    private boolean on = false;
    private int volume = 30;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disabled() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {

        if (percent > 100)
            volume = 100;
        else if (percent < 0)
            volume = 0;
        else
            volume = percent;

    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void printStatus() {
        out.println("------------------------------------");
        out.println("| I'm TV set.");
        out.println("| I'm " + (on ? "enabled" : "disabled"));
        out.println("| Current volume is " + volume + "%");
        out.println("| Current channel is " + channel);
        out.println("------------------------------------\n");
    }
}
