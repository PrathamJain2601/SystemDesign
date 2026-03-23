public class Main {
    public static void main(String[] args){
        Light l = new Light("Living Room");
        Command lo = new LightOnCommand(l);
        RemoteControl r = new RemoteControl();
        r.setControl(lo);
        r.undoPressed();
        r.buttonPressed();
        r.undoPressed();
        Ceilingfan f = new Ceilingfan("Living Room");
        Command fh = new FastCeilingfanCommand(f);
        r.setControl(fh);
        r.buttonPressed();
        r.undoPressed();
        Command[] commands = {lo, fh};
        Command SwitchOnLivingRoom = new MacroCommand(commands);
        r.setControl(SwitchOnLivingRoom);
        System.out.println("");
        r.buttonPressed();
    }
}

// Encapsulates a request as an object thereby letting you parameterize clients with different requests, queue or log requests and support undoable operations