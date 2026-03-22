public abstract class CeilingfanCommand implements Command{
    public Ceilingfan ceilingfan;
    public int prevSpeed;

    public CeilingfanCommand(Ceilingfan f){
        ceilingfan = f;
        prevSpeed = f.getSpeed();
    }
    public void undo(){
        if(prevSpeed == Ceilingfan.FAST){
            ceilingfan.fast();
        }
        else if(prevSpeed == Ceilingfan.SLOW){
            ceilingfan.slow();
        }
        else{
            ceilingfan.off();
        }
    }
}
