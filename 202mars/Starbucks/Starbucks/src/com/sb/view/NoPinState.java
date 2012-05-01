package com.sb.view;

public class NoPinState implements PassCodeState{
	
	KeyPad keypad;
	
	public NoPinState(KeyPad keypad){
		this.keypad = keypad;
	}
	
	@Override
	public void pressedNumber(String input){
		keypad.updatePassword(input);
		keypad.setState(keypad.getOnePinState());

	}

	@Override
	public void backspace() {
		keypad.updatePassword("");
		keypad.setState(keypad.getNoPinState());		
	}

}
