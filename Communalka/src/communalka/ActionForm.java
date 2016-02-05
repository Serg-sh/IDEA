package communalka;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ActionForm implements ActionListener {
	Window parent;

	public ActionForm(Window parent) {
		super();
		this.parent = parent;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			parent.comboBox_2.setVisible(parent.chckbx_1.isSelected());
			parent.chckbx_2.setVisible(parent.chckbx_1.isSelected());
			parent.textFieldOtoplTarif_2.setEditable(parent.chckbx_1.isSelected());
			parent.textFieldOtoplTarif_3.setEditable(parent.chckbx_2.isSelected());
			parent.comboBox_3.setVisible(parent.chckbx_2.isSelected());
			parent.textFieldTarif.setText(parent.tarif((String) (parent.comboBox_4.getSelectedItem())));
			parent.textFieldOtoplMonth_1.setText((String) parent.comboBox_1.getSelectedItem());
			if (!parent.chckbx_1.isSelected() & parent.chckbx_2.isSelected()) {
				throw new ExceptionMinus();
			}
			
			if (parent.chckbx_1.isSelected()) {
				parent.textFieldOtoplMonth_2.setText((String) parent.comboBox_2.getSelectedItem());
			}else {
				unChecked();
				parent.textFieldOtoplMonth_2.setText(null);
				parent.textFieldOtoplTarif_2.setText(null);
				parent.textFieldOtoplSum2.setText(null);
			}
			
			if (parent.chckbx_2.isSelected()) {
				parent.textFieldOtoplMonth_3.setText((String) parent.comboBox_3.getSelectedItem());
			}else {
				unChecked();
				parent.textFieldOtoplMonth_3.setText(null);
				parent.textFieldOtoplTarif_3.setText(null);
				parent.textFieldOtoplSum3.setText(null);
				parent.otoplSumCalc();
				parent.sumRezCalc();
				
			}
			
			
			if (parent.chckbx_3.isSelected()) {
				parent.textFieldOtoplMonth_1.setText((String) parent.comboBox_1.getSelectedItem());
				parent.textFieldOtoplTarif_1.setEditable(true);
			} else {
				parent.textFieldOtoplMonth_1.setText(null);
				parent.textFieldOtoplMonth_2.setText(null);
				parent.textFieldOtoplMonth_3.setText(null);
				parent.textFieldOtoplTarif_1.setEditable(false);
				parent.textFieldOtoplTarif_2.setEditable(false);
				parent.textFieldOtoplTarif_3.setEditable(false);
				parent.textFieldOtoplTarif_1.setText(null);
				parent.textFieldOtoplSum1.setText(null);
				parent.textFieldOtoplTarif_2.setText(null);
				parent.textFieldOtoplSum2.setText(null);
				parent.textFieldOtoplTarif_3.setText(null);
				parent.textFieldOtoplSum3.setText(null);
				parent.textFieldOtoplSum.setText(null);
				parent.sumRezCalc();
			}

			if (parent.checkBox_4.isSelected()) {
				parent.textFieldDolg.setEditable(true);
				parent.comboBox_5.setVisible(true);
				parent.textAreaDolg.setEditable(true);
			} else {
				parent.textFieldDolg.setEditable(false);
				parent.textFieldDolg.setText(null);
				parent.comboBox_5.setVisible(false);
				parent.textAreaDolg.setEditable(false);
				parent.textAreaDolg.setText(null);
				parent.sumRezCalc();

			}

		} catch (ExceptionMinus err) {
			parent.chckbx_1.setSelected(true);
			parent.chckbx_2.setVisible(true);
			parent.comboBox_2.setVisible(true);
			parent.textFieldOtoplTarif_2.setEditable(true);
			JOptionPane.showConfirmDialog(null, err.error2, "Неверное действие", JOptionPane.PLAIN_MESSAGE);
		}

	}
	
	void unChecked(){
		parent.textFieldElPredPok.setText(null);
		parent.textFieldElNewPok.setText(null);
		parent.textFieldElRazn.setText(null);
		parent.textFieldElSum.setText(null);
		parent.textFieldWaterPredPok.setText(null);
		parent.textFieldWaterNewPok.setText(null);
		parent.textFieldWaterRaz.setText(null);
		parent.textFieldWaterSum.setText(null);
		
	}
	
	

}
