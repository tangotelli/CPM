package igu;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Rectangle;

public class ObjectPane extends JPanel {
	private JPanel pnSouth;
	private JPanel pnName;
	private JLabel lblName;
	private JPanel pnImage;
	private JPanel pnGrid;
	private JPanel pnPrice;
	private JLabel lblPrice;
	private JButton btnDetails;
	private JButton btnBuy;
	private JLabel lblImage;

	/**
	 * Create the panel.
	 */
	public ObjectPane() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setLayout(new BorderLayout(0, 0));
		add(getPnSouth(), BorderLayout.SOUTH);
		add(getPnImage(), BorderLayout.CENTER);

	}

	private JPanel getPnSouth() {
		if (pnSouth == null) {
			pnSouth = new JPanel();
			pnSouth.setLayout(new GridLayout(2, 1, 0, 0));
			pnSouth.add(getPnName());
			pnSouth.add(getPnGrid());
		}
		return pnSouth;
	}
	private JPanel getPnName() {
		if (pnName == null) {
			pnName = new JPanel();
			pnName.add(getLblName());
		}
		return pnName;
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("");
		}
		return lblName;
	}
	private JPanel getPnImage() {
		if (pnImage == null) {
			pnImage = new JPanel();
			pnImage.add(getLblImage());
		}
		return pnImage;
	}
	private JPanel getPnGrid() {
		if (pnGrid == null) {
			pnGrid = new JPanel();
			pnGrid.setLayout(new GridLayout(0, 3, 0, 0));
			pnGrid.add(getBtnDetails());
			pnGrid.add(getPnPrice());
			pnGrid.add(getBtnBuy());
		}
		return pnGrid;
	}
	private JPanel getPnPrice() {
		if (pnPrice == null) {
			pnPrice = new JPanel();
			pnPrice.add(getLblPrice());
		}
		return pnPrice;
	}
	private JLabel getLblPrice() {
		if (lblPrice == null) {
			lblPrice = new JLabel("");
		}
		return lblPrice;
	}
	private JButton getBtnDetails() {
		if (btnDetails == null) {
			btnDetails = new JButton("Details");
		}
		return btnDetails;
	}
	private JButton getBtnBuy() {
		if (btnBuy == null) {
			btnBuy = new JButton("Buy");
		}
		return btnBuy;
	}
	
	public void setLblPrice(int price)
	{
		lblPrice.setText("" + price);
	}
	
	public void setLblName(String name)
	{
		lblPrice.setText(name);
	}
	
	public void setImage(String image)
	{
		lblImage.setIcon(new ResizableImage(image).icon);
	}
	
	private JLabel getLblImage() {
		if (lblImage == null) {
			lblImage = new JLabel("");
			lblImage.setBounds(new Rectangle(452, 135, 50, 50));
		}
		return lblImage;
	}
}
