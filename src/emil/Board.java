package emil;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener 
{
	private final int BlockSize = 40;
	Timer tm = new Timer(75, this);
	int x = 5, y = 0;
	int actionEventsBeforeDrop = 15;
	private KeyManager keyManager;

	protected Board() {
		setFocusable(true);
		setPreferredSize(new Dimension(400, 800));
		keyManager = new KeyManager();
		addKeyListener(keyManager);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		doDrawing(g, x, y);
		tm.start();	
	}

	public void actionPerformed(ActionEvent e) {
		if (keyManager.left) x -= 1;
		if (keyManager.right) x += 1;
		actionEventsBeforeDrop --;
		if(actionEventsBeforeDrop <= 0 || keyManager.space ) {
			y += 1;
			actionEventsBeforeDrop = 15;
		}
		repaint();
	}

	private void doDrawing(Graphics g, int x, int y) {
		drawRect(x - 1, y, g);
		drawRect(x, y, g);
		drawRect(x + 1, y, g);
		drawRect(x, y + 1, g);

//		drawRect(0, 19, g);
//		drawRect(1, 19, g);
//		drawRect(1, 18, g);
//		drawRect(2, 18, g);
//
	}

	private void drawRect(int x, int y, Graphics g) {
		g.fillRect(BlockSize * x, BlockSize * y, BlockSize, BlockSize);
	}
}
