package ua.serg.passgen;


import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ActionCopyBtn implements ActionListener{
	Window parrent;
	

	public ActionCopyBtn(Window parrent) {
		super();
		this.parrent = parrent;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		copyToClipboard();
	}
	
	private void copyToClipboard() {
		StringSelection password = new StringSelection(parrent.textFieldPass.getText());
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(password, null);
	}

}
