package book.hfdp.chap07_facade_pattern;

public class HomeTheaterFacade {
    Amplifier amplifier;
    Tuner tuner;
    StreamingPlayer streamingPlayer;
    Projector projector;
    TheaterLights theaterLights;
    Screen screen;
    PopcornPopper popcornPopper;

    public HomeTheaterFacade(){;}

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, StreamingPlayer streamingPlayer,
                             Projector projector, TheaterLights theaterLights, Screen screen,
                             PopcornPopper popcornPopper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.streamingPlayer = streamingPlayer;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
    }


    // 기타 메서드
    public void watchMovie(String movie){

    }

    public void endMovie(){

    }
}
