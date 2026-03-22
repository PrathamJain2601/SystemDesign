public class FastCeilingfanCommand extends CeilingfanCommand {
    public FastCeilingfanCommand(Ceilingfan f){
        super(f);
    }
    public void execute(){
        prevSpeed = ceilingfan.getSpeed();
        ceilingfan.fast();
    }
}
