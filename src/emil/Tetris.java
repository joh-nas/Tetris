package emil;
import javax.swing.JFrame;

public class Tetris extends JFrame {
		final static protected int aik = 2;
	public Tetris () {
		Board board = new Board();
		add(board);
		pack();
		setTitle("Tetris");
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		Tetris game = new Tetris();
		game.setVisible(true);

	}

}
