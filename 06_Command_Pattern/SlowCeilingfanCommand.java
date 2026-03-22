public class SlowCeilingfanCommand extends CeilingfanCommand {
    public SlowCeilingfanCommand(Ceilingfan f){
        super(f);
    }
    public void execute(){
        prevSpeed = ceilingfan.getSpeed();
        ceilingfan.slow();
    }
}
