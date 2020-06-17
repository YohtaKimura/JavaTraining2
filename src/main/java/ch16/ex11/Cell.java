package ch16.ex11;

public enum Cell {
    BLANK('_'), FIRST('F'), SECOND('S');

    private final char character;

    Cell(char character) {
	this.character = character;
    }

    @Override
    public String toString() {
	return Character.toString(character);
    }
}