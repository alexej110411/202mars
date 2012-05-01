package com.sb.view;

public class OnePinState implements PassCodeState{
	
	KeyPad keypad;
	
	public OnePinState(KeyPad keypad){
		this.keypad = keypad;
	}

	@Override
	public void pressedNumber(String input) {
		keypad.updatePassword(input);
		keypad.setState(keypad.getTwoPinState());
		
	}

	@Override
	public void backspace() {
		keypad.updatePassword("");
		keypad.setState(keypad.getNoPinState());
		
	}

}
