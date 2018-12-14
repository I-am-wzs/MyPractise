import java.awt.EventQueue;

import javax.swing.JFrame;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class window {

	private JFrame frmMywindow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window window = new window();
					window.frmMywindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMywindow = new JFrame();
	}

}
