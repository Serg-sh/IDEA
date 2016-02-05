package communalka;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class ActionLogicOtoplenie implements ActionListener{
	Window parent;
	private double rez, areaRoom, tarif;
	double rezSum = 0;

	public ActionLogicOtoplenie(Window parent) {
		super();
		this.parent = parent;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			areaRoom = Double.parseDouble(parent.tarif("Площадь квартиры (м.кв)"));
			if (parent.textFieldOtoplTarif_1.hasFocus()) {
				tarif = Double.parseDouble(parent.textFieldOtoplTarif_1.getText());
				rez = areaRoom * tarif;
				if (tarif < 0) throw new ExceptionMinus();
				parent.textFieldOtoplSum1.setText(String.valueOf(BigDecimal.valueOf(rez).setScale(2, BigDecimal.ROUND_HALF_UP)));
				
				
				
			}
			if (parent.textFieldOtoplTarif_2.hasFocus()) {
				tarif = Double.parseDouble(parent.textFieldOtoplTarif_2.getText());
				if (tarif < 0) throw new ExceptionMinus();
				rez = areaRoom * tarif;
				parent.textFieldOtoplSum2.setText(String.valueOf(BigDecimal.valueOf(rez).setScale(2, BigDecimal.ROUND_HALF_UP)));
				
				}
				
				

			
			if (parent.textFieldOtoplTarif_3.hasFocus()) {
				tarif = Double.parseDouble(parent.textFieldOtoplTarif_3.getText());
				if (tarif < 0) throw new ExceptionMinus();
				rez = areaRoom * tarif;
				parent.textFieldOtoplSum3.setText(String.valueOf(BigDecimal.valueOf(rez).setScale(2, BigDecimal.ROUND_HALF_UP)));
				}
			
			parent.otoplSumCalc();
			parent.sumRezCalc();
		} catch (ExceptionMinus err) {
			JOptionPane.showConfirmDialog(null, err.error3, "Неверный ввод данных", JOptionPane.PLAIN_MESSAGE);
		} catch (NumberFormatException err) {
			JOptionPane.showConfirmDialog(null, "В поле \"тариф\" необходимо вводить число", "Неверный ввод данных", JOptionPane.PLAIN_MESSAGE);
		}
		

	}
	
}
