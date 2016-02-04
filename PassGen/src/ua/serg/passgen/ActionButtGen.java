package ua.serg.passgen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class ActionButtGen implements ActionListener {
	Window parrent;
	int min, max;
	char ch;

	public ActionButtGen(Window parrent) {
		super();
		this.parrent = parrent;
		}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (parrent.checkBoxAbcd12.isSelected()){
			char[] exitArr = new char[(int)parrent.spinner.getValue()];
			changetForm(exitArr);
			parrent.textFieldPass.setText(String.valueOf(exitArr));
			}
		else {
		char[] arrPassword = chArrPassLength();
		fillingArr(arrPassword, condition());
		parrent.textFieldPass.setText(String.valueOf(arrPassword));
			}
		}
	
	private char genRandom (char[] arr){
		int i = (int)((Math.random()) * arr.length);
		return arr[i];
		}
	
//	Определяет длину массива символов пароля
	private char[] chArrPassLength() {
		char[] arrPass = new char[(int) parrent.spinner.getValue()];
		return arrPass;
		}
	
//	условие по умолчанию шаблон
	private char[] condition() {
		
		List<Character> tmpList = new ArrayList<Character>(); 
		if (parrent.chckbxNumber.isSelected()){
			for (char ch : SymbolForPass.NUM){
				tmpList.add(ch);
				}
			}
		if (parrent.checkBoxEnLett.isSelected()){
			for (char ch : SymbolForPass.ENLETT){
				tmpList.add(ch);
				}
			}
		if (parrent.checkBoxEnCapLett.isSelected()){
			for (char ch : SymbolForPass.ENCAPLETT){
				tmpList.add(ch);
				}
			}
		if (parrent.checkBoxRuLett.isSelected()){
			for (char ch : SymbolForPass.RULETT){
				tmpList.add(ch);
				}
			}
		if (parrent.checkBoxRuCapLett.isSelected()){
			for (char ch : SymbolForPass.RUCAPLETT){
				tmpList.add(ch);
				}
			}
		if (parrent.checkBoxSymbol.isSelected()){
			for (char ch : SymbolForPass.SYMB){
				tmpList.add(ch);
				}
			}
		
		char[] exitArr = new char[tmpList.size()];
		for (int i =0; i<exitArr.length;i++){
			exitArr[i] = tmpList.get(i);
			}
		return exitArr;
		}
//	Заполнение массива fillingArr

	private void fillingArr(char[] chPass, char[] arrStat) {
		
		for (int i = 0; i < chPass.length; i++){
			chPass[i] = genRandom(arrStat);
			}
		}
	
	private void changetForm (char[] exitArr){
		if ((parrent.comboBox.getSelectedItem()).equals("Abcd12......")){
			for (int i =0; i<1;i++){
				exitArr[i] = genRandom(SymbolForPass.ENCAPLETT);
			}
			for (int i =1; i<4;i++){
				exitArr[i] = genRandom(SymbolForPass.ENLETT);
			}
			for (int i = 4; i<exitArr.length;i++){
				exitArr[i] = genRandom(SymbolForPass.NUM);
			}
		}else if((parrent.comboBox.getSelectedItem()).equals("123ABc......")) {
			for (int i =0; i<3;i++){
				exitArr[i] = genRandom(SymbolForPass.NUM);
			}
			for (int i =3; i<5;i++){
				exitArr[i] = genRandom(SymbolForPass.ENCAPLETT);
			}
			for (int i = 5; i<exitArr.length;i++){
				exitArr[i] = genRandom(SymbolForPass.ENLETT);
				}
			}
		}
	}
