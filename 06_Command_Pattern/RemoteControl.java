public class RemoteControl {
    private Command slot;
    private Command undo;
    public RemoteControl(){
        Command no = new NoCommand();
        slot = no;
        undo = no;
    }
    public void setControl(Command c){
        slot = c;
    }
    public void buttonPressed(){
        slot.execute();
        undo = slot;
    }
    public void undoPressed(){
        undo.undo();
    }
    
}
