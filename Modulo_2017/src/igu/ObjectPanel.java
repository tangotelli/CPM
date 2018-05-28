package igu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class ObjectPanel extends JFrame {

	private JPanel contentPane;
	private JPanel pnSouth;
	private JPanel pnName;
	private JPanel pnGrid;
	private JLabel lblName;
	private JButton btnDetails;
	private JPanel pnPrice;
	private JLabel lblPrice;
	private JButton btnBuy;
	private JPanel pnImage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObjectPanel frame = new ObjectPanel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ObjectPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPnSouth(), BorderLayout.SOUTH);
		contentPane.add(getPnImage(), BorderLayout.CENTER);
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
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("");
			lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		return lblName;
	}
	private JButton getBtnDetails() {
		if (btnDetails == null) {
			btnDetails = new JButton("Details");
		}
		return btnDetails;
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
	private JButton getBtnBuy() {
		if (btnBuy == null) {
			btnBuy = new JButton("Buy");
		}
		return btnBuy;
	}
	private JPanel getPnImage() {
		if (pnImage == null) {
			pnImage = new JPanel();
		}
		return pnImage;
	}
}
