package com.sb.view;

public class TwoPinState implements PassCodeState{
	
	KeyPad keypad;
	
	public TwoPinState(KeyPad keypad){
		this.keypad = keypad;
	}

	@Override
	public void pressedNumber(String input) {
		keypad.updatePassword(input);
		keypad.setState(keypad.getThreePinState());
	}

	@Override
	public void backspace() {
		keypad.updatePassword("");
		keypad.setState(keypad.getOnePinState());
		
	}

}
