public class Main {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();

        HomeTheaterFacade homeTheater =
            new HomeTheaterFacade(amp, dvd, projector, lights, screen);

        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
// only talk to your friends
// Provides a unified interface to a set of interfaces in a subsystem Facade defines a higher level interface that makes the subsystem easier to m=use.