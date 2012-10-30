package net.hexawe.merger.view;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
import org.dyno.visual.swing.layouts.Trailing;

//VS4E -- DO NOT REMOVE THIS LINE!
public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel filesPanel;
	private JPanel settingsPanel;
	private JLabel jLabel0;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private JTextField jTextField0;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JButton jButton0;
	private JButton jButton1;
	private JButton jButton2;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public MainWindow() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getFilesPanel(), new Constraints(new Bilateral(12, 12, 0), new Bilateral(12, 116, 10, 95)));
		add(getSettingsPanel(), new Constraints(new Bilateral(12, 12, 0), new Bilateral(125, 10, 100)));
		setSize(436, 235);
	}

	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("jButton2");
		}
		return jButton2;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("jButton1");
		}
		return jButton1;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("jButton0");
		}
		return jButton0;
	}

	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
			jTextField2.setText("jTextField2");
		}
		return jTextField2;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setText("jTextField1");
		}
		return jTextField1;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
			jTextField0.setText("jTextField0");
		}
		return jTextField0;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("File 2");
		}
		return jLabel1;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("Output");
		}
		return jLabel2;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("File 1");
		}
		return jLabel0;
	}

	private JPanel getSettingsPanel() {
		if (settingsPanel == null) {
			settingsPanel = new JPanel();
			settingsPanel.setBorder(BorderFactory.createTitledBorder("Settings"));
			settingsPanel.setLayout(new GroupLayout());
		}
		return settingsPanel;
	}

	private JPanel getFilesPanel() {
		if (filesPanel == null) {
			filesPanel = new JPanel();
			filesPanel.setBorder(BorderFactory.createTitledBorder(null, "Files", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION, null, null));
			filesPanel.setLayout(new GroupLayout());
			filesPanel.add(getJLabel0(), new Constraints(new Leading(12, 12, 12), new Leading(7, 10, 10)));
			filesPanel.add(getJLabel2(), new Constraints(new Leading(12, 10, 340), new Trailing(7, 10, 63)));
			filesPanel.add(getJLabel1(), new Constraints(new Leading(12, 12, 12), new Bilateral(36, 34, 10)));
			filesPanel.add(getJButton0(), new Constraints(new Leading(317, 82, 10, 10), new Leading(2, 12, 12)));
			filesPanel.add(getJButton1(), new Constraints(new Leading(317, 82, 12, 12), new Bilateral(31, 29, 25)));
			filesPanel.add(getJButton2(), new Constraints(new Leading(318, 81, 12, 12), new Trailing(2, 60, 60)));
			filesPanel.add(getJTextField1(), new Constraints(new Leading(88, 211, 12, 12), new Bilateral(34, 32, 19)));
			filesPanel.add(getJTextField0(), new Constraints(new Leading(88, 210, 12, 12), new Leading(5, 12, 12)));
			filesPanel.add(getJTextField2(), new Constraints(new Leading(88, 210, 12, 12), new Trailing(5, 57, 57)));
		}
		return filesPanel;
	}

	private static void installLnF() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL
					+ " on this platform:" + e.getMessage());
		}
	}

	/**
	 * Main entry of the class.
	 * Note: This class is only created so that you can easily preview the result at runtime.
	 * It is not expected to be managed by the designer.
	 * You can modify it as you like.
	 */
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainWindow frame = new MainWindow();
				frame.setDefaultCloseOperation(MainWindow.EXIT_ON_CLOSE);
				frame.setTitle("MainWindow");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

}
