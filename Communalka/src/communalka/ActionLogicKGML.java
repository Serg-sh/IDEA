package communalka;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class ActionLogicKGML implements ActionListener{
	Window parent;

	public ActionLogicKGML(Window parent) {
		super();
		this.parent = parent;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(parent.chckbx_1.isSelected() & !parent.chckbx_2.isSelected()){
			parent.textFieldRoomSum.setText(kvartiraGazMusLift(2, "Квартира 1 кв.м"));
			parent.textFieldGazSum.setText(kvartiraGazMusLift(2, "Газ"));
			parent.textFieldMusorSum.setText(kvartiraGazMusLift(2, "Мусор"));
			parent.textFieldLiftSum.setText(kvartiraGazMusLift(2, "Лифт"));
//			parent.textFieldSumRez.setText(summa(kvartiraGazMusLift(2, "��������"), kvartiraGazMusLift(2, "���"), kvartiraGazMusLift(2, "�����"), kvartiraGazMusLift(2, "����")));
			parent.sumRezCalc();
			return;
		}
		else if(parent.chckbx_2.isSelected()){
			parent.textFieldRoomSum.setText(kvartiraGazMusLift(3, "Квартира 1 кв.м"));
			parent.textFieldGazSum.setText(kvartiraGazMusLift(3, "Газ"));
			parent.textFieldMusorSum.setText(kvartiraGazMusLift(3, "Мусор"));
			parent.textFieldLiftSum.setText(kvartiraGazMusLift(3, "Лифт"));
//			parent.textFieldSumRez.setText(summa(kvartiraGazMusLift(3, "��������"), kvartiraGazMusLift(3, "���"), kvartiraGazMusLift(3, "�����"), kvartiraGazMusLift(3, "����")));
			parent.sumRezCalc();
			return;
		}
		else {
			parent.textFieldRoomSum.setText(kvartiraGazMusLift(1, "Квартира 1 кв.м"));
			parent.textFieldGazSum.setText(kvartiraGazMusLift(1, "Газ"));
			parent.textFieldMusorSum.setText(kvartiraGazMusLift(1, "Мусор"));
			parent.textFieldLiftSum.setText(kvartiraGazMusLift(1, "Лифт"));
//			parent.textFieldSumRez.setText(summa(kvartiraGazMusLift(1, "��������"), kvartiraGazMusLift(1, "���"), kvartiraGazMusLift(1, "�����"), kvartiraGazMusLift(1, "����")));
			parent.sumRezCalc();
		}
		
	}
//	public String summa(String s1, String s2, String s3, String s4){
//		double sumDoubl = Double.parseDouble(s1) + Double.parseDouble(s2) + Double.parseDouble(s3) + Double.parseDouble(s4);
//		BigDecimal sum = BigDecimal.valueOf(sumDoubl).setScale(2, BigDecimal.ROUND_HALF_UP);
//		return String.valueOf(sum) ;
//	}
	public String kvartiraGazMusLift(int month, String values) {
		if (values.equals("Квартира 1 кв.м")) {
			BigDecimal sum = BigDecimal.valueOf(month * Double.parseDouble(parent.tarif(values)) * Double.parseDouble(parent.tarif("Площадь квартиры (м.кв)"))).setScale(2, BigDecimal.ROUND_HALF_UP);
			return String.valueOf(sum);
		} 
		else {
			BigDecimal sum = BigDecimal.valueOf(month * Double.parseDouble(parent.tarif(values))).setScale(2, BigDecimal.ROUND_HALF_UP);
			return String.valueOf(sum);
		}
	}
	
	

}
