public class TurkeyAdapterToDuck implements Duck {
    Turkey turkey;
    TurkeyAdapterToDuck(Turkey t){
        turkey = t;
    }
    public void quack(){
        turkey.gobble();
    }
    public void fly(){
        for(int i = 0; i < 5; i++){
            turkey.fly();
        }
    }
}
