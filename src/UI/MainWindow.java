package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JButton prevButton = new JButton("<");
		frame.getContentPane().add(prevButton, BorderLayout.WEST);
		
		JButton nextButton = new JButton(">");
		frame.getContentPane().add(nextButton, BorderLayout.EAST);
		
		JPanel drawPanel = new JPanel();
		frame.getContentPane().add(drawPanel, BorderLayout.CENTER);
		
		JPanel detailPanel = new DetailPanel();
		frame.getContentPane().add(detailPanel, BorderLayout.NORTH);
		
		JPanel panel = new SettingsPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
	}

}
