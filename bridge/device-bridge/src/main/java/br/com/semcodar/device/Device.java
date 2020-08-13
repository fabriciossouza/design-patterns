package br.com.semcodar.device;

public interface Device {

     boolean isEnabled();

     void enable();

     void disabled();

     int getVolume();

     void setVolume(int percent);

     int getChannel();

     void setChannel(int channel);

     void printStatus();

}
