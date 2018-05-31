package igu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Catalogue;
import model.Pack;
import model.Skin;
import model.Weapon;

import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.Set;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel pnShop;
	private JPanel pnWest;
	private JPanel pnNorth;
	private JPanel pnEast;
	private JPanel pnSouth;
	private JButton btnSiguiente;
	private JPanel pnHelp;
	private JButton btnHelp;
	private JPanel pnCart;
	private JButton btnShoppingCart;
	private JPanel pnButtons;
	private JButton btnSkins;
	private JButton btnWeapons;
	private JButton btnPacks;
	private JPanel pnRadioButtons;
	private JRadioButton rdbtnCommon;
	private JRadioButton rdbtnUncommon;
	private JPanel pnDownPart;
	private JRadioButton rdbtnNewRare;
	private JRadioButton rdbtnEpic;
	private JRadioButton rdbtnLegendary;
	private JPanel pnPrice;
	private JTextField txtPrice;
	private JButton btnFilter;
	private JScrollPane scrollPaneCenter;
	
	private static Catalogue catalogue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					catalogue = new Catalogue();
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		contentPane.add(getPnShop(), "name_137731120343941");
	}

	private JPanel getPnShop() {
		if (pnShop == null) {
			pnShop = new JPanel();
			pnShop.setLayout(new BorderLayout(0, 0));
			pnShop.add(getPnWest(), BorderLayout.WEST);
			pnShop.add(getPnNorth(), BorderLayout.NORTH);
			pnShop.add(getPnEast(), BorderLayout.EAST);
			pnShop.add(getPnSouth(), BorderLayout.SOUTH);
			pnShop.add(getScrollPaneCenter(), BorderLayout.CENTER);
		}
		return pnShop;
	}
	private JPanel getPnWest() {
		if (pnWest == null) {
			pnWest = new JPanel();
			pnWest.setLayout(new GridLayout(0, 1, 0, 0));
			pnWest.add(getPnButtons());
			pnWest.add(getPnDownPart());
		}
		return pnWest;
	}
	private JPanel getPnNorth() {
		if (pnNorth == null) {
			pnNorth = new JPanel();
			pnNorth.setLayout(new GridLayout(1, 1, 0, 0));
			pnNorth.add(getPnHelp());
			pnNorth.add(getPnCart());
		}
		return pnNorth;
	}
	private JPanel getPnEast() {
		if (pnEast == null) {
			pnEast = new JPanel();
		}
		return pnEast;
	}
	private JPanel getPnSouth() {
		if (pnSouth == null) {
			pnSouth = new JPanel();
			pnSouth.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
			pnSouth.add(getBtnSiguiente());
		}
		return pnSouth;
	}
	private JButton getBtnSiguiente() {
		if (btnSiguiente == null) {
			btnSiguiente = new JButton("Siguiente");
		}
		return btnSiguiente;
	}
	private JPanel getPnHelp() {
		if (pnHelp == null) {
			pnHelp = new JPanel();
			pnHelp.setBorder(null);
			pnHelp.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
			pnHelp.add(getBtnHelp());
		}
		return pnHelp;
	}
	private JButton getBtnHelp() {
		if (btnHelp == null) {
			btnHelp = new JButton("Help");
		}
		return btnHelp;
	}
	private JPanel getPnCart() {
		if (pnCart == null) {
			pnCart = new JPanel();
			pnCart.setBorder(null);
			FlowLayout flowLayout = (FlowLayout) pnCart.getLayout();
			flowLayout.setAlignment(FlowLayout.RIGHT);
			pnCart.add(getBtnShoppingCart());
		}
		return pnCart;
	}
	private JButton getBtnShoppingCart() {
		if (btnShoppingCart == null) {
			btnShoppingCart = new JButton("Shopping Cart");
		}
		return btnShoppingCart;
	}
	private JPanel getPnButtons() {
		if (pnButtons == null) {
			pnButtons = new JPanel();
			pnButtons.setLayout(new GridLayout(0, 1, 0, 0));
			pnButtons.add(getBtnSkins());
			pnButtons.add(getBtnWeapons());
			pnButtons.add(getBtnPacks());
		}
		return pnButtons;
	}
	private JButton getBtnSkins() {
		if (btnSkins == null) {
			btnSkins = new JButton("Skins");
			btnSkins.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Map<String, Skin> skins = catalogue.getSkins();
					Set<String> keys = skins.keySet();
					for (String key : keys)
						System.out.println(skins.get(key).toString());
				}
			});
		}
		return btnSkins;
	}
	private JButton getBtnWeapons() {
		if (btnWeapons == null) {
			btnWeapons = new JButton("Weapons");
			btnWeapons.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Map<String, Weapon> weapons = catalogue.getWeapons();
					Set<String> keys = weapons.keySet();
					for (String key : keys)
						System.out.println(weapons.get(key).toString());
				}
			});
		}
		return btnWeapons;
	}
	private JButton getBtnPacks() {
		if (btnPacks == null) {
			btnPacks = new JButton("Packs");
			btnPacks.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Map<String, Pack> packs = catalogue.getPacks();
					Set<String> keys = packs.keySet();
					for (String key : keys)
						System.out.println(packs.get(key).toString());
				}
			});
		}
		return btnPacks;
	}
	private JPanel getPnRadioButtons() {
		if (pnRadioButtons == null) {
			pnRadioButtons = new JPanel();
			pnRadioButtons.setLayout(new GridLayout(0, 1, 0, 0));
			pnRadioButtons.add(getRdbtnCommon());
			pnRadioButtons.add(getRdbtnUncommon());
			pnRadioButtons.add(getRdbtnNewRare());
			pnRadioButtons.add(getRdbtnEpic());
			pnRadioButtons.add(getRdbtnLegendary());
		}
		return pnRadioButtons;
	}
	private JRadioButton getRdbtnCommon() {
		if (rdbtnCommon == null) {
			rdbtnCommon = new JRadioButton("Common");
		}
		return rdbtnCommon;
	}
	private JRadioButton getRdbtnUncommon() {
		if (rdbtnUncommon == null) {
			rdbtnUncommon = new JRadioButton("Uncommon");
		}
		return rdbtnUncommon;
	}
	private JPanel getPnDownPart() {
		if (pnDownPart == null) {
			pnDownPart = new JPanel();
			pnDownPart.setLayout(new GridLayout(0, 1, 0, 0));
			pnDownPart.add(getPnRadioButtons());
			pnDownPart.add(getPnPrice());
		}
		return pnDownPart;
	}
	private JRadioButton getRdbtnNewRare() {
		if (rdbtnNewRare == null) {
			rdbtnNewRare = new JRadioButton("Rare");
		}
		return rdbtnNewRare;
	}
	private JRadioButton getRdbtnEpic() {
		if (rdbtnEpic == null) {
			rdbtnEpic = new JRadioButton("Epic");
		}
		return rdbtnEpic;
	}
	private JRadioButton getRdbtnLegendary() {
		if (rdbtnLegendary == null) {
			rdbtnLegendary = new JRadioButton("Legendary");
		}
		return rdbtnLegendary;
	}
	private JPanel getPnPrice() {
		if (pnPrice == null) {
			pnPrice = new JPanel();
			FlowLayout flowLayout = (FlowLayout) pnPrice.getLayout();
			pnPrice.add(getTxtPrice());
			pnPrice.add(getBtnFilter());
		}
		return pnPrice;
	}
	private JTextField getTxtPrice() {
		if (txtPrice == null) {
			txtPrice = new JTextField();
			txtPrice.setColumns(10);
		}
		return txtPrice;
	}
	private JButton getBtnFilter() {
		if (btnFilter == null) {
			btnFilter = new JButton("F");
		}
		return btnFilter;
	}
	private JScrollPane getScrollPaneCenter() {
		if (scrollPaneCenter == null) {
			scrollPaneCenter = new JScrollPane();
			ObjectPane figurin = new ObjectPane();
			// COMPLETAR PA CHECKING MANUAL figurin.
		}
		
		return scrollPaneCenter;
	}
}
