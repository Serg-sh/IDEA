package ua.serg.passgen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionChckBoxForm implements ActionListener{
Window parrent;
	

	public ActionChckBoxForm(Window parrent) {
		super();
		this.parrent = parrent;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (parrent.checkBoxAbcd12.isSelected()){
			parrent.chckbxNumber.setSelected(false);
			parrent.checkBoxEnLett.setSelected(false);
			parrent.checkBoxEnCapLett.setSelected(false);
			parrent.checkBoxRuLett.setSelected(false);
			parrent.checkBoxRuCapLett.setSelected(false);
			parrent.checkBoxSymbol.setSelected(false);
			
			}
		
	}
}
