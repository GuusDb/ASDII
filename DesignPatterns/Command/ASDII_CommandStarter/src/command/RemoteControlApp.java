package command;

import domein.*;

public class RemoteControlApp {

    /* 
 public static void main(String[] args) {
 RemoteControl remoteControl = new RemoteControl();

Light livingRoomLight = new Light("Living Room Lighting");
 Light kitchenLight = new Light("Kitchen Lighting");
 Stereo stereo = new Stereo("Stereo");
 CeilingFan fan = new CeilingFan("Ceiling Fan");
 //...

 LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
 LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
 LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
 LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
 StereoOnWithCDCommand stereoOnWithCD
 = new StereoOnWithCDCommand(stereo);
 CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(fan);
 CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(fan);
 //...

 remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
 remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
 remoteControl.setCommand(2, stereoOnWithCD, new NoCommand());
 remoteControl.setCommand(3, ceilingFanHigh, ceilingFanOff);
 //...

 System.out.println(remoteControl);
 for (int i = 0; i < 4; i++) {
 remoteControl.onButtonWasPushed(i);
 remoteControl.offButtonWasPushed(i);
 //remoteControl.undoButtonWasPushed();
 }
 }
     */
    public static void main(String[] args) {
        // De remote is onze Invoker.
        SimpleRemoteControl remote
                = new SimpleRemoteControl();
        // Creatie van Light-object. Dit wordt de Receiver van de aanvraag
        Light light = new Light();
        // Creatie van command en doorgave aan de Receiver (Light object).
        LightOnCommand lightOn = new LightOnCommand(light);
        //Hier wordt het Command overgedragen aan de Invoker.
        remote.setCommand(lightOn);
        //Simulatie indrukken van de knop.
        remote.buttonWasPressed();

        GarageDoor door = new GarageDoor();
 //TODO UNCOMMENT
//        GarageDoorOpenCommand garageOpen
//                = new GarageDoorOpenCommand(door);
//        remote.setCommand(garageOpen);
        remote.buttonWasPressed();

    }

}
