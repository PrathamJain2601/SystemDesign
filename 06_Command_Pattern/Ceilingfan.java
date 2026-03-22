public class Ceilingfan {
    public static final int FAST = 2;
    public static final int SLOW = 1;
    public static final int OFF = 0;
    private String name;    
    int speed;

    public Ceilingfan(String name){
        this.name = name;
        this.speed = OFF;
    }
    public void fast(){
        speed = FAST;
        System.out.println(name + " fan turned fast");
    }
    public void slow(){
        speed = SLOW;
        System.out.println(name + " fan turned slow");
    }
    public void off(){
        speed = OFF;
        System.out.println(name + " fan turned off");
    }
    public int getSpeed(){
        return speed;
    }
}
