package ua.serg.passgen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionChckBox implements ActionListener {
	Window parrent;
	

	public ActionChckBox(Window parrent) {
		super();
		this.parrent = parrent;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (
		parrent.chckbxNumber.isSelected() ||
		parrent.checkBoxEnLett.isSelected()||
		parrent.checkBoxEnCapLett.isSelected()||
		parrent.checkBoxRuLett.isSelected()||
		parrent.checkBoxRuCapLett.isSelected()||
		parrent.checkBoxSymbol.isSelected()){ 
			parrent.checkBoxAbcd12.setSelected(false);
			
			}
	}

}
