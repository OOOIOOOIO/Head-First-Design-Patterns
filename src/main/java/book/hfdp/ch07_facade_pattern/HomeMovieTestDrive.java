package book.hfdp.ch07_facade_pattern;

public class HomeMovieTestDrive {

    public static void main(String[] args) {
        // 구성요소 초기화

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(/* 구성요소들 */);

        homeTheaterFacade.watchMovie("반지의 제왕");
        homeTheaterFacade.endMovie();

    }

}
