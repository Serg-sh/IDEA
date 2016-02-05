package communalka;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

import java.awt.Window.Type;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.UIManager;

public class Window {
	
	String[] month = new String[] {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
	String[] tarifi = new String[] {"Электричество до 100 кВт","Электричество более 100 кВт","Вода","Газ","Квартира 1 кв.м","Мусор","Лифт","Площадь квартиры (м.кв)"};
	private String enter = "Ввести значение и нажать \"Энтер\"";
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
	boolean ck = false;
	private double rezSum =0;
	JFrame frmVbeta = new JFrame();
	
	JPanel wPanel = new JPanel();
	
	JCheckBox chckbx_1 = new JCheckBox("+1");
	JCheckBox chckbx_2 = new JCheckBox("+1");
	JCheckBox chckbx_3 = new JCheckBox("");
	JCheckBox checkBox_4 = new JCheckBox("");
	
	JComboBox<String> comboBox_1 = new JComboBox<String>();
	JComboBox<String> comboBox_2 = new JComboBox<String>();
	JComboBox<String> comboBox_3 = new JComboBox<String>();
	JComboBox<String> comboBox_4 = new JComboBox<String>();
	JComboBox<String> comboBox_5 = new JComboBox<String>();
	
	JTextField textFieldDate_1 = new JTextField();
	JTextField textFieldTarif = new JTextField();
	JTextField textFieldElPredPok = new JTextField();
	JTextField textFieldElNewPok = new JTextField();
	JTextField textFieldElRazn = new JTextField();
	JTextField textFieldElSum = new JTextField();
	JTextField textFieldWaterPredPok = new JTextField();
	JTextField textFieldWaterNewPok = new JTextField();
	JTextField textFieldWaterRaz = new JTextField();
	JTextField textFieldRoomSum = new JTextField();
	JTextField textFieldGazSum = new JTextField();
	JTextField textFieldMusorSum = new JTextField();
	JTextField textFieldLiftSum = new JTextField();
	JTextField textFieldOtoplMonth_1 = new JTextField();
	JTextField textFieldOtoplTarif_1 = new JTextField();
	JTextField textFieldOtoplMonth_2 = new JTextField();
	JTextField textFieldOtoplTarif_2 = new JTextField();
	JTextField textFieldOtoplMonth_3 = new JTextField();
	JTextField textFieldOtoplTarif_3 = new JTextField();
	JTextField textFieldOtoplSum1 = new JTextField();
	JTextField textFieldOtoplSum2 = new JTextField();
	JTextField textFieldOtoplSum3 = new JTextField();
	JTextField textFieldOtoplSum = new JTextField();
	JTextField textFieldWaterSum = new JTextField();
	JTextField textFieldSumRez;
	JTextField textFieldDolg = new JTextField();
	
	JTextArea textAreaNotes = new JTextArea();
	JTextArea textAreaDolg = new JTextArea();
	
	ActionForm actCheckBox = new ActionForm (this);
	ActionLogicEl actLogicEl = new ActionLogicEl(this);
	ActionLogicWater actLogicWater = new ActionLogicWater(this);
	ActionLogicKGML actLogicKGML = new ActionLogicKGML(this);
	ActionLogicOtoplenie actLogicOtoplenie = new ActionLogicOtoplenie(this);
	ActionWriteButton actWritenButton = new ActionWriteButton(this);
	ActoinChangeTarif actChangeTarif = new ActoinChangeTarif(this);
	ActionLogicDolg actLogicDolg = new ActionLogicDolg(this);
	
	final JLabel label_2 = new JLabel("\u042D\u043B\u0435\u043A\u0442\u0440\u0438\u0447\u0435\u0441\u0442\u0432\u043E");
	private final JLabel lblNewLabel = new JLabel("\u041F\u0440\u0435\u0434. \u043F\u043E\u043A\u0430\u0437\u0430\u043D\u0438\u044F");
	private final JLabel lblNewLabel_1 = new JLabel("\u041D\u043E\u0432. \u043F\u043E\u043A\u0430\u0437\u0430\u043D\u0438\u044F");
 	private final JLabel lblNewLabel_2 = new JLabel("\u0420\u0430\u0437\u043D\u0438\u0446\u0430");
	private final JLabel lblNewLabel_3 = new JLabel("\u0421\u0443\u043C\u043C\u0430");
	final JLabel lblNewLabel_4 = new JLabel("\u0412\u043E\u0434\u0430");
	private final JLabel label = new JLabel("\u041F\u0440\u0435\u0434. \u043F\u043E\u043A\u0430\u0437\u0430\u043D\u0438\u044F");
	private final JLabel label_3 = new JLabel("\u041D\u043E\u0432. \u043F\u043E\u043A\u0430\u0437\u0430\u043D\u0438\u044F");
	private final JLabel label_4 = new JLabel("\u0420\u0430\u0437\u043D\u0438\u0446\u0430");
	private final JLabel label_5 = new JLabel("\u0421\u0443\u043C\u043C\u0430");
	final JLabel label_6 = new JLabel("\u041A\u0432\u0430\u0440\u0442\u0438\u0440\u0430");
	final JLabel label_7 = new JLabel("\u0413\u0430\u0437");
	private final JLabel label_8 = new JLabel("\u0421\u0443\u043C\u043C\u0430");
	final JLabel label_9 = new JLabel("\u041C\u0443\u0441\u043E\u0440");
	private final JLabel label_10 = new JLabel("\u0421\u0443\u043C\u043C\u0430");
	final JLabel label_11 = new JLabel("\u041B\u0438\u0444\u0442");
	private final JLabel label_12 = new JLabel("\u0421\u0443\u043C\u043C\u0430");
	final JLabel label_13 = new JLabel("\u041E\u0442\u043E\u043F\u043B\u0435\u043D\u0438\u0435");
	private final JLabel label_15 = new JLabel("\u0422\u0430\u0440\u0438\u0444");
	private final JLabel label_20 = new JLabel("\u0421\u0443\u043C\u043C\u0430");
	private final JLabel label_14 = new JLabel("\u0418\u0442\u043E\u0433\u043E:");
	final JLabel label_16 = new JLabel("\u041F\u0440\u0438\u043C\u0435\u0447\u0430\u043D\u0438\u044F");
	private final JLabel label_17 = new JLabel("\u0421\u0443\u043C\u043C\u0430");
	final JLabel label_18 = new JLabel("\u0414\u043E\u043B\u0433");
	private final JButton button_2 = new JButton("\u0417\u0430\u043F\u0438\u0441\u0430\u0442\u044C");
	final JLabel label_19 = new JLabel("\u041A\u043E\u043C\u043C\u0435\u043D\u0442\u0430\u0440\u0438\u0439:");
	
	
	
	
	
	Window() {
		textFieldElSum.setEditable(false);
		textFieldElSum.setBounds(320, 132, 86, 20);
		textFieldElSum.setColumns(10);
		textFieldElRazn.setEditable(false);
		textFieldElRazn.setBounds(199, 132, 86, 20);
		textFieldElRazn.setColumns(10);
		
		textFieldElNewPok.setBounds(106, 132, 86, 20);
		textFieldElNewPok.setColumns(10);
		textFieldElNewPok.setToolTipText(enter);
		
		textFieldElPredPok.setBounds(10, 132, 90, 20);
		textFieldElPredPok.setColumns(10);
		textFieldTarif.setBounds(694, 50, 90, 20);
		textFieldTarif.setColumns(10);
		
		
		frmVbeta.setType(Type.POPUP);
		frmVbeta.setTitle("\u041A\u043E\u043C\u043C\u0443\u043D\u0430\u043B\u043A\u0430 v1.0_beta");
		frmVbeta.setSize(new Dimension(800, 600));
		frmVbeta.setResizable(false);
		frmVbeta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVbeta.setContentPane(wPanel);
		wPanel.setLayout(null);
		
		
		
		comboBox_1.setBounds(106, 50, 90, 20);
		wPanel.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel<String>(month));
		comboBox_1.setSelectedIndex(0);
		
		
		chckbx_1.setBounds(202, 50, 39, 23);
		chckbx_1.setToolTipText("Добавить 1 месяц");
		wPanel.add(chckbx_1);
		
		
		textFieldDate_1.setEditable(false);
		textFieldDate_1.setBounds(10, 50, 90, 20);
		textFieldDate_1.setColumns(10);
		textFieldDate_1.setText(dateFormat.format(new Date()));
		wPanel.add(textFieldDate_1);
		
		
		comboBox_2.setModel(new DefaultComboBoxModel<String>(month));
		comboBox_2.setSelectedIndex(0);
		comboBox_2.setBounds(247, 50, 90, 20);
		comboBox_2.setVisible(false);
		wPanel.add(comboBox_2);
		
		
		chckbx_2.setBounds(343, 50, 39, 23);
		chckbx_2.setVisible(false);
		chckbx_2.setToolTipText("Добавить 1 месяц");
		wPanel.add(chckbx_2);
		
		
		comboBox_3.setModel(new DefaultComboBoxModel<String>(month));
		comboBox_3.setSelectedIndex(0);
		comboBox_3.setBounds(388, 50, 90, 20);
		comboBox_3.setVisible(false);
		wPanel.add(comboBox_3);
		
		comboBox_4.setModel(new DefaultComboBoxModel<String>(tarifi));
		comboBox_4.setBounds(488, 50, 202, 20);
		comboBox_4.setToolTipText("Для изменения тарифа, необходимо ввести новое значение и нажать \"Изменить\"");
		wPanel.add(comboBox_4);
		
		comboBox_5.setModel(new DefaultComboBoxModel<String>(month));
		comboBox_5.setBounds(429, 340, 99, 20);
		comboBox_5.setSelectedIndex(0);
		comboBox_5.setVisible(false);
		wPanel.add(comboBox_5);
		
		
		JLabel label_1 = new JLabel("\u0422\u0430\u0440\u0438\u0444\u044B");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(579, 11, 99, 28);
		wPanel.add(label_1);
		
		textFieldTarif.setText(tarif((String)(comboBox_4.getSelectedItem())));
		wPanel.add(textFieldTarif);
		
		JButton button_1 = new JButton("\u0418\u0437\u043C\u0435\u043D\u0438\u0442\u044C");
		button_1.setBounds(694, 81, 89, 23);
		wPanel.add(button_1);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_2.setBounds(10, 96, 141, 23);
		wPanel.add(label_2);
		
		lblNewLabel.setBounds(10, 117, 90, 14);
		wPanel.add(lblNewLabel);
		
		wPanel.add(textFieldElPredPok);
		
		lblNewLabel_1.setBounds(106, 117, 86, 14);
		wPanel.add(lblNewLabel_1);
		
		wPanel.add(textFieldElNewPok);
		
		wPanel.add(textFieldElRazn);
		
		lblNewLabel_2.setBounds(199, 117, 83, 14);
		wPanel.add(lblNewLabel_2);
		
		wPanel.add(textFieldElSum);
		
		lblNewLabel_3.setBounds(320, 117, 86, 14);
		wPanel.add(lblNewLabel_3);
		
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(10, 163, 141, 23);
		wPanel.add(lblNewLabel_4);
		
		label.setBounds(10, 188, 90, 14);
		wPanel.add(label);
		
		textFieldWaterPredPok.setColumns(10);
		textFieldWaterPredPok.setBounds(10, 203, 90, 20);
		wPanel.add(textFieldWaterPredPok);
		
		label_3.setBounds(106, 188, 86, 14);
		wPanel.add(label_3);
		
		textFieldWaterNewPok.setColumns(10);
		textFieldWaterNewPok.setBounds(106, 203, 86, 20);
		textFieldWaterNewPok.setToolTipText(enter);
		wPanel.add(textFieldWaterNewPok);
		
		label_4.setBounds(199, 188, 86, 14);
		wPanel.add(label_4);
		
		textFieldWaterRaz.setEditable(false);
		textFieldWaterRaz.setColumns(10);
		textFieldWaterRaz.setBounds(199, 203, 86, 20);
		wPanel.add(textFieldWaterRaz);
		
		label_5.setBounds(10, 258, 86, 14);
		wPanel.add(label_5);
		
		textFieldRoomSum.setEditable(false);
		textFieldRoomSum.setColumns(10);
		textFieldRoomSum.setBounds(10, 273, 86, 20);
		textFieldRoomSum.setText(stringToBigToString("Квартира 1 кв.м"));
		wPanel.add(textFieldRoomSum);
		
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_6.setBounds(10, 234, 141, 23);
		wPanel.add(label_6);
		
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_7.setBounds(161, 234, 141, 23);
		wPanel.add(label_7);
		
		label_8.setBounds(161, 258, 84, 14);
		wPanel.add(label_8);
		
		textFieldGazSum.setEditable(false);
		textFieldGazSum.setColumns(10);
		textFieldGazSum.setBounds(161, 273, 86, 20);
		textFieldGazSum.setText(stringToBigToString("Газ"));
		wPanel.add(textFieldGazSum);
		
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_9.setBounds(320, 234, 141, 23);
		wPanel.add(label_9);
		
		label_10.setBounds(320, 258, 86, 14);
		wPanel.add(label_10);
		
		textFieldMusorSum.setEditable(false);
		textFieldMusorSum.setColumns(10);
		textFieldMusorSum.setBounds(320, 273, 86, 20);
		textFieldMusorSum.setText(stringToBigToString("Мусор"));
		wPanel.add(textFieldMusorSum);
		
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_11.setBounds(488, 234, 141, 23);
		wPanel.add(label_11);
		
		label_12.setBounds(488, 258, 86, 14);
		wPanel.add(label_12);
		
		textFieldLiftSum.setEditable(false);
		textFieldLiftSum.setColumns(10);
		textFieldLiftSum.setBounds(488, 273, 86, 20);
		textFieldLiftSum.setText(stringToBigToString("Лифт"));
		wPanel.add(textFieldLiftSum);
		
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_13.setHorizontalTextPosition(SwingConstants.CENTER);
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setBounds(74, 304, 141, 23);
		wPanel.add(label_13);
		
		textFieldOtoplMonth_1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOtoplMonth_1.setEditable(false);
		textFieldOtoplMonth_1.setColumns(10);
		textFieldOtoplMonth_1.setBounds(10, 340, 90, 20);
//		textFieldOtoplMonth_1.setText((String) comboBox_1.getSelectedItem());
		wPanel.add(textFieldOtoplMonth_1);
		
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setBounds(106, 325, 84, 14);
		wPanel.add(label_15);
		textFieldOtoplTarif_1.setEditable(false);
		
		textFieldOtoplTarif_1.setColumns(10);
		textFieldOtoplTarif_1.setBounds(106, 340, 86, 20);
		textFieldOtoplTarif_1.setToolTipText(enter);
		wPanel.add(textFieldOtoplTarif_1);
		
		textFieldOtoplMonth_2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOtoplMonth_2.setEditable(false);
		textFieldOtoplMonth_2.setColumns(10);
		textFieldOtoplMonth_2.setBounds(10, 371, 90, 20);
		wPanel.add(textFieldOtoplMonth_2);
		
		textFieldOtoplTarif_2.setEditable(false);
		textFieldOtoplTarif_2.setColumns(10);
		textFieldOtoplTarif_2.setBounds(106, 371, 86, 20);
		textFieldOtoplTarif_2.setToolTipText(enter);
		wPanel.add(textFieldOtoplTarif_2);
		
		textFieldOtoplMonth_3.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOtoplMonth_3.setEditable(false);
		textFieldOtoplMonth_3.setColumns(10);
		textFieldOtoplMonth_3.setBounds(10, 402, 90, 20);
		wPanel.add(textFieldOtoplMonth_3);
		
		textFieldOtoplTarif_3.setEditable(false);
		textFieldOtoplTarif_3.setColumns(10);
		textFieldOtoplTarif_3.setBounds(106, 402, 86, 20);
		textFieldOtoplTarif_3.setToolTipText(enter);
		wPanel.add(textFieldOtoplTarif_3);
		
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setBounds(202, 325, 83, 14);
		wPanel.add(label_20);
		
		textFieldOtoplSum1.setEditable(false);
		textFieldOtoplSum1.setColumns(10);
		textFieldOtoplSum1.setBounds(199, 340, 86, 20);
		wPanel.add(textFieldOtoplSum1);
		
		textFieldOtoplSum2.setEditable(false);
		textFieldOtoplSum2.setColumns(10);
		textFieldOtoplSum2.setBounds(199, 371, 86, 20);
		wPanel.add(textFieldOtoplSum2);
		
		textFieldOtoplSum3.setEditable(false);
		textFieldOtoplSum3.setColumns(10);
		textFieldOtoplSum3.setBounds(199, 402, 86, 20);
		wPanel.add(textFieldOtoplSum3);
		
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_14.setHorizontalAlignment(SwingConstants.RIGHT);
		label_14.setBounds(74, 436, 116, 20);
		wPanel.add(label_14);
		
		textFieldOtoplSum.setEditable(false);
		textFieldOtoplSum.setColumns(10);
		textFieldOtoplSum.setBounds(199, 433, 86, 27);
		wPanel.add(textFieldOtoplSum);
		
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_16.setBounds(592, 304, 141, 23);
		wPanel.add(label_16);
		
		JLabel lblNewLabel_5 = new JLabel("\u0412\u0441\u0435\u0433\u043E \u043A \u043E\u043F\u043B\u0430\u0442\u0435:");
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setBounds(388, 494, 164, 34);
		wPanel.add(lblNewLabel_5);
		
		textFieldSumRez = new JTextField();
		textFieldSumRez.setEditable(false);
		textFieldSumRez.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldSumRez.setBounds(565, 495, 99, 33);
		textFieldSumRez.setColumns(10);
		textAreaNotes.setBorder(UIManager.getBorder("TextField.border"));
		
		
		textAreaNotes.setMargin(new Insets(5, 5, 5, 5));
		textAreaNotes.setLineWrap(true);
		textAreaNotes.setWrapStyleWord(true);
		wPanel.add(textFieldSumRez);
		
		textAreaNotes.setBounds(550, 343, 233, 113);
		wPanel.add(textAreaNotes);
		
		label_17.setBounds(320, 188, 86, 14);
		wPanel.add(label_17);
		
		textFieldWaterSum.setEditable(false);
		textFieldWaterSum.setColumns(10);
		textFieldWaterSum.setBounds(320, 203, 86, 20);
		wPanel.add(textFieldWaterSum);
		
		button_2.setActionCommand("\u0417\u0430\u043F\u0438\u0441\u0430\u0442\u044C");
		button_2.setBounds(695, 504, 89, 23);
		button_2.addActionListener(actWritenButton);
		wPanel.add(button_2);
		
		
		chckbx_3.setBounds(54, 304, 23, 23);
		wPanel.add(chckbx_3);
		
		
		label_18.setHorizontalTextPosition(SwingConstants.CENTER);
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_18.setBounds(343, 304, 86, 23);
		wPanel.add(label_18);
		
		
		checkBox_4.setBounds(320, 304, 23, 23);
		wPanel.add(checkBox_4);
		textAreaDolg.setBorder(UIManager.getBorder("TextField.border"));
		
		textAreaDolg.setLineWrap(true);
		textAreaDolg.setWrapStyleWord(true);
		textAreaDolg.setEditable(false);
		textAreaDolg.setBounds(320, 402, 208, 57);
		wPanel.add(textAreaDolg);
		
		
		textFieldDolg.setEditable(false);
		textFieldDolg.setColumns(10);
		textFieldDolg.setBounds(320, 340, 99, 20);
		textFieldDolg.setToolTipText(enter);
		wPanel.add(textFieldDolg);
		label_19.setHorizontalTextPosition(SwingConstants.CENTER);
		label_19.setHorizontalAlignment(SwingConstants.LEFT);
		label_19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_19.setBounds(320, 374, 141, 23);
		
		wPanel.add(label_19);
		
		
		
		
		
		
		frmVbeta.setVisible(true);
		
		chckbx_1.addActionListener(actCheckBox);
		chckbx_1.addActionListener(actLogicKGML);
		chckbx_2.addActionListener(actCheckBox);
		chckbx_2.addActionListener(actLogicKGML);
		chckbx_3.addActionListener(actCheckBox);
		checkBox_4.addActionListener(actCheckBox);
		comboBox_4.addActionListener(actCheckBox);
		comboBox_1.addActionListener(actCheckBox);
		comboBox_2.addActionListener(actCheckBox);
		comboBox_3.addActionListener(actCheckBox);
		textFieldElNewPok.addActionListener(actLogicEl);
		textFieldWaterNewPok.addActionListener(actLogicWater);
		textFieldOtoplTarif_1.addActionListener(actLogicOtoplenie);
		textFieldOtoplTarif_2.addActionListener(actLogicOtoplenie);
		textFieldOtoplTarif_3.addActionListener(actLogicOtoplenie);
		textFieldDolg.addActionListener(actLogicDolg);
		button_1.addActionListener(actChangeTarif);
		
		sumRezCalc();
		
		
	}
//	public double getTextFieldSumRez() {
//		return Double.parseDouble(textFieldSumRez.getText());
//	}
//	String summa(){
//		try {
//		sumDoubl = Double.parseDouble(tarif("�������� 1 ��.�"));
//		sumDoubl += Double.parseDouble(tarif("���"));
//		sumDoubl += Double.parseDouble(tarif("�����"));
//		sumDoubl += Double.parseDouble(tarif("����"));
//		BigDecimal sum = BigDecimal.valueOf(sumDoubl).setScale(2, BigDecimal.ROUND_HALF_UP);
//		return String.valueOf(sum);
//		}catch (NumberFormatException e){
//			return null;
//			}
//		}
	void sumRezCalc (){
		double tmpSumRez = Double.parseDouble(textFieldGazSum.getText());
		tmpSumRez += Double.parseDouble(textFieldLiftSum.getText());
		tmpSumRez += Double.parseDouble(textFieldMusorSum.getText());
		tmpSumRez += Double.parseDouble(textFieldRoomSum.getText());
		
		if (!textFieldElSum.getText().equals("")){
		tmpSumRez += Double.parseDouble(textFieldElSum.getText());
		}
		if (!textFieldWaterSum.getText().equals("")){
		tmpSumRez += Double.parseDouble(textFieldWaterSum.getText());
		}
		if (!textFieldOtoplSum.getText().equals("")){
			tmpSumRez += Double.parseDouble(textFieldOtoplSum.getText());
			}
		if (textFieldDolg.isEditable() && !textFieldDate_1.getText().equals("")) {
			try {
				tmpSumRez += Double.parseDouble(textFieldDolg.getText());
			} catch (NumberFormatException e) {
				
			}
		}
		textFieldSumRez.setText(String.valueOf(BigDecimal.valueOf(tmpSumRez).setScale(2, BigDecimal.ROUND_HALF_UP)));
	}
	
	String tarif(String val){
		String s = null;
		Scanner sc = null;
		try{
			File f = new File("src\\communalka\\tarif.trf");
			sc = new Scanner(f);
			do {
			s = sc.nextLine();
			if (s.equals(val)){
				s= sc.nextLine();
				
				return s;
				
			}
		}while(!s.equals(""));
			
		return "no val";
		}catch (FileNotFoundException e) {
			return "Файла не найден";
			}
		finally {
			sc.close();
		}
		}

	String stringToBigToString(String str) {
		try {
			if (str.equals("Квартира 1 кв.м")){
				double tmp = Double.parseDouble(tarif(str)) * Double.parseDouble(tarif("Площадь квартиры (м.кв)"));
				return String.valueOf(new BigDecimal(tmp).setScale(2, BigDecimal.ROUND_HALF_UP));
			} else {
				return String.valueOf(new BigDecimal(tarif(str)).setScale(2, BigDecimal.ROUND_HALF_UP));
			}
			

		} catch (NumberFormatException e) {
			return null;
		}
	}
	void otoplSumCalc() {
		if (!textFieldOtoplSum1.getText().equals(""))
			rezSum += Double.parseDouble(textFieldOtoplSum1.getText());
		if (!textFieldOtoplSum2.getText().equals("")) 
			rezSum += Double.parseDouble(textFieldOtoplSum2.getText());
		if (!textFieldOtoplSum3.getText().equals(""))
			rezSum += Double.parseDouble(textFieldOtoplSum3.getText());
		textFieldOtoplSum.setText(String.valueOf(BigDecimal.valueOf(rezSum).setScale(2, BigDecimal.ROUND_HALF_UP)));
		rezSum = 0;
	}
}
