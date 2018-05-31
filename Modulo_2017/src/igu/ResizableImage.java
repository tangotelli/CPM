package igu;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class ResizableImage extends Container {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ImageIcon icon;

	public ResizableImage(String image) {
		try {
			String aux = "/img/" + image + ".jpg";
			icon = new ImageIcon(getClass().getResource(aux));
		} catch (Exception e) {
			icon = new ImageIcon(
					getClass().getResource("/img/NoDisponible.jpg"));
		}
	}

	public void paint(Graphics g) {
		Rectangle r = g.getClipBounds();
		g.setColor(this.getBackground());
		g.fillRect(r.x, r.y, r.width, r.height);
		g.drawImage(icon.getImage(), 0, 0, this.getWidth(), this.getHeight(),
				this.getBackground(), this);
		super.paint(g);
	}
}
