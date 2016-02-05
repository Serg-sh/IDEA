package communalka;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ActoinChangeTarif implements ActionListener {
	Window parent;
	List<String> listStr = new ArrayList<String>();
		
		public ActoinChangeTarif(Window parent) {
		this.parent = parent;
	}
	private void readTarif(){
		String s = null;
		try {
			File f = new File("src\\communalka\\tarif.trf");
			Scanner sc = new Scanner(f);
			while(sc.hasNext()){
				s = sc.nextLine();
				listStr.add(s);

			}

		} catch (FileNotFoundException e1) {
			JOptionPane.showConfirmDialog(null, "Файл с тарифами не найден","File not found", JOptionPane.PLAIN_MESSAGE);
		}
	}
	private void changeTarif (){
		int num = listStr.indexOf(parent.comboBox_4.getSelectedItem());
		try {
			if (Double.parseDouble(parent.textFieldTarif.getText()) < 0) throw new ExceptionMinus();
		} catch (NumberFormatException e) {
			JOptionPane.showConfirmDialog(null,"В поля показания необходимо вводить число",	"Неверный ввод данных", JOptionPane.PLAIN_MESSAGE);
			return;
		}catch (ExceptionMinus e) {
			JOptionPane.showConfirmDialog(null, e.error3, "Неверный ввод данных", JOptionPane.PLAIN_MESSAGE);
			return;
		}
		listStr.set(num+1, (String) parent.textFieldTarif.getText());

	}
	private void readNewTarifToFile(){
		try {
			File f = new File("src\\communalka\\tarif.trf");
			PrintWriter pw = new PrintWriter(f);
			for (String str : listStr){
				pw.print(str+ '\n');
			}
			pw.close();
		} catch (IOException e) {
			JOptionPane.showConfirmDialog(null, "Файл с тарифами не найден","File not found", JOptionPane.PLAIN_MESSAGE);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		readTarif();
		changeTarif();
		readNewTarifToFile();
		listStr.clear();

	}


}
