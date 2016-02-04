package ua.serg.passgen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class Window {

	private JFrame frame;
	JTextField textFieldPass;
	JSpinner spinner = new JSpinner();
	JCheckBox chckbxNumber = new JCheckBox("");
	JCheckBox checkBoxEnLett = new JCheckBox("");
	JCheckBox checkBoxEnCapLett = new JCheckBox("");
	JCheckBox checkBoxRuLett = new JCheckBox("");
	JCheckBox checkBoxRuCapLett = new JCheckBox("");
	JCheckBox checkBoxSymbol = new JCheckBox("");
	JCheckBox checkBoxAbcd12 = new JCheckBox("");
	JComboBox<String> comboBox = new JComboBox<String>();
	
	/**
	 * Action Listener
	 */
	
	ActionButtGen actButtGen = new ActionButtGen(this);
	ActionCopyBtn actCopyBtn = new ActionCopyBtn(this);
	ActionChckBox actChckBox = new ActionChckBox(this);
	ActionChckBoxForm actChckBoxForm = new ActionChckBoxForm(this);
	private final JLabel authorLabel = new JLabel("Developer by Sergey Shpak");
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
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
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JPanel panel = new JPanel();
		textFieldPass = new JTextField();
		
		JButton btnGeneration = new JButton("\u0413\u0435\u043D\u0435\u0440\u0438\u0440\u043E\u0432\u0430\u0442\u044C");
		btnGeneration.addActionListener(actButtGen);
		
		JButton btnCopy = new JButton("");
		btnCopy.setIcon(new ImageIcon(Window.class.getResource("/ua/serg/passgen/page_copy.png")));
		btnCopy.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCopy.setPreferredSize(new Dimension(89, 20));
		btnCopy.setBounds(319, 24, 35, 35);
		btnCopy.addActionListener(actCopyBtn);
		panel.add(btnCopy);
		
		JLabel label = new JLabel("\u041D\u0430\u0441\u0442\u0440\u043E\u0439\u043A\u0438");
		JPanel panel_1 = new JPanel();
		
		JLabel LabelPassLong = new JLabel("\u0414\u043B\u0438\u043D\u0430 \u043F\u0430\u0440\u043E\u043B\u044F");
		
		panel.setLayout(null);
		
		frame = new JFrame();
		frame.setTitle("\u0413\u0435\u043D\u0435\u0440\u0430\u0442\u043E\u0440 \u043F\u0430\u0440\u043E\u043B\u0435\u0439 \u0432\u0435\u0440. 1.2");
		frame.setResizable(false);
		frame.setContentPane(panel);
		
		textFieldPass.setFocusable(false);
		textFieldPass.setFont(new Font("Century Gothic", Font.BOLD, 18));
		textFieldPass.setBounds(10, 24, 299, 35);
		panel.add(textFieldPass);
		textFieldPass.setColumns(10);
		
		btnGeneration.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btnGeneration.setActionCommand("");
		btnGeneration.setBounds(10, 70, 344, 35);
		panel.add(btnGeneration);
		
		label.setOpaque(true);
		label.setBounds(20, 106, 68, 19);
		panel.add(label);
		label.setForeground(Color.GRAY);
		label.setDisplayedMnemonic(KeyEvent.VK_ACCEPT);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setHorizontalTextPosition(SwingConstants.LEADING);
		
		panel_1.setBounds(10, 116, 344, 249);
		panel.add(panel_1);
		panel_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		panel_1.setToolTipText("");
		panel_1.setName("");
		panel_1.setBorder(new LineBorder(new Color(128, 128, 128)));
		panel_1.setForeground(Color.BLACK);
		panel_1.setLayout(null);
		
		spinner.setModel(new SpinnerNumberModel(8, 6, 12, 1));
		spinner.setFont(new Font("Century Gothic", Font.BOLD, 12));
		spinner.setRequestFocusEnabled(false);
		spinner.setFocusable(false);
		spinner.setFocusTraversalKeysEnabled(false);
		spinner.setBounds(124, 12, 43, 20);
		panel_1.add(spinner);
		
		LabelPassLong.setFont(new Font("Century Gothic", Font.BOLD, 12));
		LabelPassLong.setBounds(25, 11, 101, 20);
		panel_1.add(LabelPassLong);
		
		JLabel labelINum09 = new JLabel("\u0418\u0441\u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u044C \u0446\u0438\u0444\u0440\u044B (0 - 9)");
		labelINum09.setFont(new Font("Century Gothic", Font.BOLD, 12));
		labelINum09.setBounds(55, 40, 172, 20);
		panel_1.add(labelINum09);
		
		JLabel labelEnLett = new JLabel("\u0418\u0441\u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u044C \u0441\u0442\u0440\u043E\u0447\u043D\u044B\u0435 \u043B\u0430\u0442\u0438\u043D\u0441\u043A\u0438\u0435 (a - z)");
		labelEnLett.setFont(new Font("Century Gothic", Font.BOLD, 12));
		labelEnLett.setBounds(55, 65, 279, 20);
		panel_1.add(labelEnLett);
		
		JLabel labelEnCapLett = new JLabel("\u0418\u0441\u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u044C \u043F\u0440\u043E\u043F\u0438\u0441\u043D\u044B\u0435 \u043B\u0430\u0442\u0438\u043D\u0441\u043A\u0438\u0435 (A - Z)");
		labelEnCapLett.setFont(new Font("Century Gothic", Font.BOLD, 12));
		labelEnCapLett.setBounds(55, 90, 279, 20);
		panel_1.add(labelEnCapLett);
		
		JLabel labelRuLett = new JLabel("\u0418\u0441\u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u044C \u0441\u0442\u0440\u043E\u0447\u043D\u044B\u0435 \u0440\u0443\u0441\u0441\u043A\u0438\u0435 (\u0430 - \u044F)");
		labelRuLett.setFont(new Font("Century Gothic", Font.BOLD, 12));
		labelRuLett.setBounds(55, 115, 279, 20);
		panel_1.add(labelRuLett);
		
		JLabel labelRuCapLett = new JLabel("\u0418\u0441\u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u044C \u043F\u0440\u043E\u043F\u0438\u0441\u043D\u044B\u0435 \u0440\u0443\u0441\u0441\u043A\u0438\u0435 (\u0410 - \u042F)");
		labelRuCapLett.setFont(new Font("Century Gothic", Font.BOLD, 12));
		labelRuCapLett.setBounds(55, 140, 279, 20);
		panel_1.add(labelRuCapLett);
		
		JLabel labelSymbol = new JLabel("\u0418\u0441\u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u044C \u0441\u0438\u043C\u0432\u043E\u043B\u044B \u0438 \u0437\u043D\u0430\u043A\u0438");
		labelSymbol.setFont(new Font("Century Gothic", Font.BOLD, 12));
		labelSymbol.setBounds(55, 165, 279, 20);
		panel_1.add(labelSymbol);
		
		JLabel labelOnlySymbol = new JLabel("\u0418\u0441\u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u044C \u0448\u0430\u0431\u043B\u043E\u043D:");
		labelOnlySymbol.setFont(new Font("Century Gothic", Font.BOLD, 12));
		labelOnlySymbol.setBounds(55, 190, 279, 20);
		panel_1.add(labelOnlySymbol);
		
		chckbxNumber.setBounds(25, 40, 20, 20);
		chckbxNumber.addActionListener(actChckBox);
		panel_1.add(chckbxNumber);
		
		checkBoxEnLett.setBounds(25, 65, 20, 20);
		checkBoxEnLett.addActionListener(actChckBox);
		panel_1.add(checkBoxEnLett);
		
		checkBoxEnCapLett.setBounds(25, 90, 20, 20);
		checkBoxEnCapLett.addActionListener(actChckBox);
		panel_1.add(checkBoxEnCapLett);
		
		
		checkBoxRuLett.setBounds(25, 115, 20, 20);
		checkBoxRuLett.addActionListener(actChckBox);
		panel_1.add(checkBoxRuLett);
		
		checkBoxRuCapLett.setBounds(25, 140, 20, 20);
		checkBoxRuCapLett.addActionListener(actChckBox);
		panel_1.add(checkBoxRuCapLett);
		
		checkBoxSymbol.setActionCommand("");
		checkBoxSymbol.setBounds(25, 165, 20, 20);
		checkBoxSymbol.addActionListener(actChckBox);
		panel_1.add(checkBoxSymbol);
		
		checkBoxAbcd12.setSelected(true);
		checkBoxAbcd12.setActionCommand("");
		checkBoxAbcd12.setBounds(25, 190, 20, 20);
		checkBoxAbcd12.addActionListener(actChckBoxForm);
		panel_1.add(checkBoxAbcd12);
		
		comboBox.setFocusable(false);
		comboBox.setFont(new Font("Century Gothic", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Abcd12......", "123ABc......"}));
		comboBox.setBounds(25, 215, 290, 20);
		panel_1.add(comboBox);
		authorLabel.setForeground(Color.GRAY);
		authorLabel.setFont(new Font("Century Gothic", Font.PLAIN, 8));
		authorLabel.setBounds(256, 367, 108, 9);
		panel.add(authorLabel);
		
		JPanel panelSetings = new JPanel();
		panelSetings.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelSetings.setBorder(null);
		panelSetings.setAutoscrolls(true);
		panelSetings.setAlignmentY(Component.TOP_ALIGNMENT);
		panelSetings.setAlignmentX(Component.LEFT_ALIGNMENT);
		panelSetings.setLayout(null);
		frame.setBounds(100, 100, 370, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
