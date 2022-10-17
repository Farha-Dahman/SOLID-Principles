package edu.najah.D.ChangeStatus;

import edu.najah.D.devices.Monitor;
import edu.najah.D.intrf.IChangeStatusM;

public class ChangeStatusM implements IChangeStatusM {

    public void changeMonitorStatus(Monitor monitor, boolean status){
        if (status){
            monitor.turnOn();
        } else {
            monitor.turnOff();
        }
    }
}
