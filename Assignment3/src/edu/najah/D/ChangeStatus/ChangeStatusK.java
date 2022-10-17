package edu.najah.D.ChangeStatus;

import edu.najah.D.devices.Keyboard;
import edu.najah.D.intrf.IChangeStatusK;

public class ChangeStatusK implements IChangeStatusK {

    public void changeKeyboardStatus(Keyboard keyboard, boolean status){
        if (status){
            keyboard.powerOn();
        } else {
            keyboard.powerOff();
        }
     }


}
