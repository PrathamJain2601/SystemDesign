public class OffCeilingfanCommand extends CeilingfanCommand {
    public OffCeilingfanCommand(Ceilingfan f){
        super(f);
    }
    public void execute(){
        prevSpeed = ceilingfan.getSpeed();
        ceilingfan.off();
    }
}
