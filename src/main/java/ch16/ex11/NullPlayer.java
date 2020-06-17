package ch16.ex11;

public class NullPlayer implements Player {
    @Override
    public void play(Game game) {
        System.out.println("hey");
    }
}
