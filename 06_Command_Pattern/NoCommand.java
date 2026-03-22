public class NoCommand implements Command {
    public void execute(){
        System.out.println("No command set");
    }
    public void undo(){
        System.out.println("No command set");
    }
}
