package ch16.ex11;

public class Game {

    private Cell[][] map;

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
		PlayerLoader loader = new PlayerLoader();
		Class<? extends Player> classOf = loader.loadClass("NullPlayer.class").asSubclass(Player.class);
		Player player = classOf.newInstance();
		Game game = new Game();
		game.printMap();
		player.play(game);
    }

    private Game() {
	map = new Cell[][] { { Cell.BLANK, Cell.BLANK, Cell.BLANK },
		{ Cell.BLANK, Cell.BLANK, Cell.BLANK }, { Cell.BLANK, Cell.BLANK, Cell.BLANK } };
    }


    public void printMap() {
	System.out.println("-------");
	System.out.println("  1 2 3");
	System.out.println("1 " + map[0][0] + " " + map[0][1] + " " + map[0][2]);
	System.out.println("2 " + map[1][0] + " " + map[1][1] + " " + map[1][2]);
	System.out.println("3 " + map[2][0] + " " + map[2][1] + " " + map[2][2]);
	System.out.println("-------");
    }
}
