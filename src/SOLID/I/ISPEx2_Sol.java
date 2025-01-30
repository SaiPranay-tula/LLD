package SOLID.I;

public class ISPEx2_Sol {
}
// General functionality for turning devices on and off
interface PowerControl {
    void turnOn();
    void turnOff();
}

// Devices that have temperature control functionality
interface TemperatureControl {
    void setTemperature(int temperature);
}

// Devices that can play music
interface MusicControl {
    void playMusic(String track);
}

// Thermostat implementing PowerControl and TemperatureControl
class Thermostat implements PowerControl, TemperatureControl {
    @Override
    public void turnOn() {
        System.out.println("Thermostat turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat turned off.");
    }

    @Override
    public void setTemperature(int temperature) {
        System.out.println("Setting temperature to " + temperature + "°C.");
    }
}

// Smart Speaker implementing PowerControl and MusicControl
class SmartSpeaker implements PowerControl, MusicControl {
    @Override
    public void turnOn() {
        System.out.println("Smart Speaker turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Speaker turned off.");
    }

    @Override
    public void playMusic(String track) {
        System.out.println("Playing music: " + track);
    }
}
