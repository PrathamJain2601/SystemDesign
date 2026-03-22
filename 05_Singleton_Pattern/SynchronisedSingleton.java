public class SynchronisedSingleton {
    private volatile static SynchronisedSingleton Instance;
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
// A volatile variable is always read from and written to main memory, not from a thread’s local cache.
// volatile keyword ensures that multiple threads handle the unique instance variable correctly when it is being initialized to the Singleton instance.