public class SynchronisedSingleton {
    private static SynchronisedSingleton Instance;
    private SynchronisedSingleton(){}
    public static SynchronisedSingleton getInstance(){
        if(Instance == null){
            synchronized(SynchronisedSingleton.class){
                if(Instance == null){
                    Instance = new SynchronisedSingleton();
                }
            }
        }
        return Instance;
    }
}


//Double checked locking
