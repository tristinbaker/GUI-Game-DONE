package Main;

import javax.swing.JFrame;

public class Game {

	public static void main(String[] args) {
		
		JFrame window = new JFrame("My Game");
		window.add(new GamePanel());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setVisible(true);

	}

}