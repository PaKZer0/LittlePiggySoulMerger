package net.hexawe.merger.view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;

//VS4E -- DO NOT REMOVE THIS LINE!
public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel filesPanel;
	private JPanel settingsPanel;
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
			filesPanel.setBorder(BorderFactory.createTitledBorder("Files"));
			filesPanel.setLayout(new GroupLayout());
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
