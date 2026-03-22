public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light l){
        this.light = l;
    }

    public void execute(){
        this.light.off();
    }
    public void undo(){
        this.light.on();
    }
}
