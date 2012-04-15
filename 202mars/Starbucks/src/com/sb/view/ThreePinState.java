package com.sb.view;

public class ThreePinState implements PassCodeState{
	
	KeyPad keypad;
	
	public ThreePinState(KeyPad keypad){
		this.keypad = keypad;
	}



	@Override
	public void backspace() {
		keypad.updatePassword("");
		keypad.setState(keypad.getTwoPinState());
		
	}

	@Override
	public void pressedNumber(String input) {
		keypad.updatePassword(input);
		keypad.setState(keypad.getFourPinState());
	}

}
