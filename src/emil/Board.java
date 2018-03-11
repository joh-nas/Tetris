package emil;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Board extends JPanel {
	private final int BlockSize = 40;
	protected Board () {
		setFocusable(true);
		setPreferredSize(new Dimension(400, 800));
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		System.out.println(this.getWidth());
		System.out.println(this.getHeight());
		doDrawing(g);
	}
	
	private void doDrawing(Graphics g) {
		drawRect(4, 0, g);
		drawRect(5, 0, g);
		drawRect(6, 0, g);
		drawRect(5, 1, g);

		drawRect(0, 19, g);
		drawRect(1, 19, g);
		drawRect(1, 18, g);
		drawRect(2, 18, g);
	
	}
	
	private void drawRect(int x, int y, Graphics g) {
		g.fillRect(BlockSize * x, BlockSize * y, BlockSize, BlockSize);
	}
}
