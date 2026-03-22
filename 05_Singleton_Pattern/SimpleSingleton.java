class SimpleSingleton {
    private static SimpleSingleton Instance;
    private SimpleSingleton(){}
    public static SimpleSingleton getInstance(){
        if(Instance == null){
            Instance = new SimpleSingleton();
        }
        return Instance;
    }
}

// you cannot subclass a singleton class because constructor is private
// you can create a class in which all the methods and variables are static but it will be eager instantiation. if you want lazy use singleton pattern.
// OO pattern
//     ensure a class only has one instance and provide a global point of access to it.