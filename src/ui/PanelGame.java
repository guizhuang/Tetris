package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelGame extends JPanel {
	public PanelGame(){
		
	}
	@Override
	public void paintComponent(Graphics g){
		Image img = new ImageIcon("graphics/window/Window.png").getImage();
		g.drawImage(img, 0, 0, 64, 64, 0, 0, 7, 7, null);
	}
}