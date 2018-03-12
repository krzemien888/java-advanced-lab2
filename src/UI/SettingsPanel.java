package UI;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class SettingsPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public SettingsPanel() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton loadFromFileButton = new JButton("Load from File");
		add(loadFromFileButton);
		
		JComboBox languageComboBox = new JComboBox();
		languageComboBox.setModel(new DefaultComboBoxModel(LanguageEnum.values()));
		add(languageComboBox);

	}

}
