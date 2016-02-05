package communalka;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class ActionLogicEl implements ActionListener{
	Window parent;
	private final double STO = 100;
	private final double STOx2 = 200;
	private final double STOx3 = 300;
	private double razPok, newPok, predPok, tarifEl_100, tarifEl_101;
	BigDecimal sumEl;

	public ActionLogicEl(Window parr) {
		super();
		this.parent = parr;
	}


	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (parent.textFieldElNewPok.hasFocus()) {
				tarifEl_100 = Double.parseDouble(parent.tarif("Электричество до 100 кВт"));
				tarifEl_101 = Double.parseDouble(parent.tarif("Электричество более 100 кВт"));
				newPok = Double.parseDouble(parent.textFieldElNewPok.getText());
				predPok = Double.parseDouble(parent.textFieldElPredPok.getText());
				razPok = newPok - predPok;
				if (razPok < 0) throw new ExceptionMinus();
				else if (razPok <= 100) {
					sumEl = BigDecimal.valueOf(razPok * tarifEl_100).setScale(2, BigDecimal.ROUND_HALF_UP);
					writeResult();
					return;
				} 
				else if(parent.chckbx_1.isSelected() & !parent.chckbx_2.isSelected()){
					sumEl = BigDecimal.valueOf((STOx2 * tarifEl_100) + ((razPok - STOx2) * tarifEl_101)).setScale(2, BigDecimal.ROUND_HALF_UP);
					writeResult();
					return;
				}
				else if(parent.chckbx_2.isSelected()){
					sumEl = BigDecimal.valueOf((STOx3 * tarifEl_100) + ((razPok - STOx3) * tarifEl_101)).setScale(2, BigDecimal.ROUND_HALF_UP);
					writeResult();
					return;
				}
				else {
					sumEl = BigDecimal.valueOf((STO * tarifEl_100) + ((razPok - STO) * tarifEl_101)).setScale(2, BigDecimal.ROUND_HALF_UP);
					writeResult();
				}
			}
		} catch (ExceptionMinus err) {
			JOptionPane.showConfirmDialog(null, err.error,"Неверный ввод данных", JOptionPane.PLAIN_MESSAGE);
		} catch (NumberFormatException err) {
			JOptionPane.showConfirmDialog(null,"В поля показания необходимо вводить число",	"Неверный ввод данных", JOptionPane.PLAIN_MESSAGE);
		}

	}

	private void writeResult() {
		parent.textFieldElRazn.setText(String.valueOf(razPok));
		parent.textFieldElSum.setText(String.valueOf(sumEl));
		parent.sumRezCalc();
	}

}
