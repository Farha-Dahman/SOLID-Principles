package edu.najah.D;


import edu.najah.D.devices.*;
import edu.najah.D.intrf.*;

public class WindowsMachine {

    public IKeyboard getKeyboard() {
        return keyboard;
    }

    public final IKeyboard keyboard;

    public IMonitor getMonitor() {
        return monitor;
    }

    public final IMonitor monitor;

    public WindowsMachine(){
        monitor = new Monitor();  //instance of monitor class
        keyboard = new Keyboard(); //instance of keyboard class
    }

    public IChangeStatusK changeStatusK;
    public IChangeStatusM changeStatusM;


    public void changeKeyboardStatus(boolean status){

        changeStatusK.changeKeyboardStatus((Keyboard) keyboard,status);
    }

    public void changeMonitorStatus(boolean status){

        changeStatusM.changeMonitorStatus((Monitor) monitor,status);
    }

}