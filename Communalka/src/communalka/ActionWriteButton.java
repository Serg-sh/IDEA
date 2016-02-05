package communalka;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ActionWriteButton implements ActionListener{
	Window parent;
	FileWriter fw;
	private final String space6 = "      ";
	private final String bigRazdel = "==========================================================\n";
	private final String smlRazrel = "----------------------------------------------------------\n";
			
	
	
	public ActionWriteButton(Window parent) {
		super();
		this.parent = parent;
	}
	
	private File createFileLog(){
		String fName = "src\\communalka\\" + parent.textFieldDate_1.getText()+".txt";
		if (new File(fName).exists()){
			return new File(fName);
		}else{
			File file = new File(fName);
			try {
				file.createNewFile();
			} catch (IOException e) {
				JOptionPane.showConfirmDialog(null, "Файл не создан","Error", JOptionPane.PLAIN_MESSAGE);
			}
			return file;
		}
		
	}

	private void writeToFile (File file){
		try {
			fw = new FileWriter(file, true);
			fw.write(bigRazdel);
			String date = parent.textFieldDate_1.getText();
			String m1 = (String) parent.comboBox_1.getSelectedItem();
			String m2 = "";
			String m3 = "";
			if (parent.comboBox_2.isVisible()) m2 = (String) parent.comboBox_2.getSelectedItem();
			if (parent.comboBox_3.isVisible()) m3 = (String) parent.comboBox_3.getSelectedItem();
			fw.write(date + "   " + m1 + "   " + m2 + "   " + m3 +'\n');
//			Электричество
			fw.write(smlRazrel);
			fw.write(parent.label_2.getText()+'\n');
			fw.write(space6 + "Тариф до 100 кВт" + " - " + parent.tarif("Электричество до 100 кВт") +" грн."+'\n');
			fw.write(space6 + "Тариф более 100 кВт" + " - " + parent.tarif("Электричество более 100 кВт") +" грн."+'\n');
			fw.write(space6 +"Потребленно: " + parent.textFieldElRazn.getText() + " кВт" + "  На сумму " + parent.textFieldElSum.getText() + " грн."+'\n');

//			Вода
			fw.write(smlRazrel);
			fw.write(parent.lblNewLabel_4.getText()+'\n');
			fw.write(space6 + "Тариф: " + " - " + parent.tarif("Вода") +" грн/куб.м"+'\n');
			fw.write(space6 + "Потребленно: " + parent.textFieldWaterRaz.getText() + " куб.м" + "  На сумму " + parent.textFieldWaterSum.getText() + " грн."+'\n');
//			Квартира
			fw.write(smlRazrel);
			fw.write(parent.label_6.getText()+'\n');
			fw.write(space6 + "Тариф: " + " - " + parent.tarif("Квартира 1 кв.м") +" грн."+'\n');
			fw.write(space6 + "Сумма: " + " - " + parent.textFieldRoomSum.getText() +" грн"+'\n');
//			Газ
			fw.write(smlRazrel);
			fw.write(parent.label_7.getText()+'\n');
			fw.write(space6 + "Тариф: " + " - " + parent.tarif("Газ") +" грн/куб.м"+'\n');
			fw.write(space6 + "Сумма: " + " - " + parent.textFieldGazSum.getText() +" грн"+'\n');
//			Мусор
			fw.write(smlRazrel);
			fw.write(parent.label_9.getText()+'\n');
			fw.write(space6 + "Тариф: " + " - " + parent.tarif("Мусор") +" грн/ч"+'\n');
			fw.write(space6 + "Сумма: " + " - " + parent.textFieldMusorSum.getText() +" грн"+'\n');
//			Лифт
			fw.write(smlRazrel);
			fw.write(parent.label_11.getText()+'\n');
			fw.write(space6 + "Тариф: " + " - " + parent.tarif("Лифт") +" грн/ч"+'\n');
			fw.write(space6 + "Сумма: " + " - " + parent.textFieldLiftSum.getText() +" грн"+'\n');
//			Отопление
			if (parent.chckbx_3.isSelected()) fw.write(smlRazrel);
			if (parent.chckbx_3.isSelected()) fw.write(parent.label_13.getText()+'\n');
			if (parent.textFieldOtoplTarif_1.isEditable()){
				String month1 = parent.textFieldOtoplMonth_1.getText();
				String tarif1 = parent.textFieldOtoplTarif_1.getText();
				String sum1 = parent.textFieldOtoplSum1.getText();
				fw.write(space6 + month1 + "  " + tarif1 + " грн/кв.м  " + sum1 + " грн за месяц" + '\n');
			}
			if (parent.textFieldOtoplTarif_2.isEditable()){
				String month1 = parent.textFieldOtoplMonth_2.getText();
				String tarif1 = parent.textFieldOtoplTarif_2.getText();
				String sum1 = parent.textFieldOtoplSum2.getText();
				fw.write(space6 + month1 + "  " + tarif1 + " грн/кв.м  " + sum1 + " грн за месяц" + '\n');
			}
			if (parent.textFieldOtoplTarif_3.isEditable()){
				String month1 = parent.textFieldOtoplMonth_3.getText();
				String tarif1 = parent.textFieldOtoplTarif_3.getText();
				String sum1 = parent.textFieldOtoplSum3.getText();
				fw.write(space6 + month1 + "  " + tarif1 + " грн/кв.м  " + sum1 + " грн за месяц" + '\n');
			}
			if (parent.chckbx_3.isSelected()){
				fw.write(space6 + space6 + space6 + " Всего: " + parent.textFieldOtoplSum.getText() + " грн"+ '\n');
			}
//			Долг
			if (parent.checkBox_4.isSelected()) {
				fw.write(smlRazrel);
				fw.write(parent.label_18.getText() + ":" + '\n');
				fw.write(space6 + parent.comboBox_5.getSelectedItem() + " - " + parent.textFieldDolg.getText() + " грн."
						+ '\n');
				fw.write('\n');
				if (!parent.textAreaDolg.getText().equals("")) {
					fw.write(parent.label_19.getText() + '\n');
					fw.write('\n');
					fw.write(parent.textAreaDolg.getText() + '\n');
				}
			}
//			Заметки
			if (!parent.textAreaNotes.getText().equals("")){
				fw.write(smlRazrel);
				fw.write(parent.label_16.getText() + ":" + '\n');
				fw.write('\n');
				fw.write(parent.textAreaNotes.getText()+ '\n');
			}
//			Итого
			fw.write(smlRazrel);
			fw.write(space6 + space6 + space6 + space6 + space6 + "Итого к оплате: " + parent.textFieldSumRez.getText() + " грн"+ '\n');
			fw.write(bigRazdel);

		} catch (FileNotFoundException e1) {
			JOptionPane.showConfirmDialog(null, "Файл истории не найден","File not found", JOptionPane.PLAIN_MESSAGE);
		}catch (IOException e2) {
			JOptionPane.showConfirmDialog(null, "Файл истории не найден","File not found", JOptionPane.PLAIN_MESSAGE);
		}finally{
			try {
				fw.close();
			} catch (IOException e1) {
				JOptionPane.showConfirmDialog(null, "Файл не сохранен","Error", JOptionPane.PLAIN_MESSAGE);
			}
		}

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		writeToFile(createFileLog());
		JOptionPane.showConfirmDialog(null, "Данные успешно записаны","Файл создан", JOptionPane.PLAIN_MESSAGE);
	}

}
