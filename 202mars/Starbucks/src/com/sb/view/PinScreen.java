package com.sb.view;

import com.sb.controller.AppController;
import com.sb.controller.ScreenState;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class PinScreen implements ScreenState {

	AppController appController;
	KeyPad keypad;
	PassCode passcode;
	String validPin = "1234";

	PImage img;
	PFont f;
	PFont f1;

	public PinScreen(AppController p) {
		appController = p;
	}

	public void setup(PApplet applet) {
		keypad = new KeyPad();
		keypad.draw(applet);
		
		passcode = new PassCode();
		passcode.draw(applet);

	}

	public void mousePressed(PApplet applet) {
		if (applet.mouseX > 0 && applet.mouseX < 88 && applet.mouseY > 240
				&& applet.mouseY < 280) {

			keypad.pressedNumber("1");
			setCurrentScreen();
			

		}

		else if (applet.mouseX > 0 && applet.mouseX < 88 && applet.mouseY > 281
				&& applet.mouseY < 320) {
			keypad.pressedNumber("4");
			setCurrentScreen();
		}

		else if (applet.mouseX > 0 && applet.mouseX < 88 && applet.mouseY > 321
				&& applet.mouseY < 360) {
			keypad.pressedNumber("7");
			setCurrentScreen();

		}

		else if (applet.mouseX > 89 && applet.mouseX < 174
				&& applet.mouseY > 240 && applet.mouseY < 280) {
			keypad.pressedNumber("2");
			setCurrentScreen();
		}

		else if (applet.mouseX > 89 && applet.mouseX < 174
				&& applet.mouseY > 281 && applet.mouseY < 320) {
			keypad.pressedNumber("5");
			setCurrentScreen();
		}

		else if (applet.mouseX > 89 && applet.mouseX < 174
				&& applet.mouseY > 321 && applet.mouseY < 360) {
			keypad.pressedNumber("8");
			setCurrentScreen();
		}

		else if (applet.mouseX > 89 && applet.mouseX < 174
				&& applet.mouseY > 361 && applet.mouseY < 400) {
			keypad.pressedNumber("0");
			setCurrentScreen();

		}

		else if (applet.mouseX > 175 && applet.mouseX < 262
				&& applet.mouseY > 240 && applet.mouseY < 280) {
			keypad.pressedNumber("3");
			setCurrentScreen();
		}

		else if (applet.mouseX > 175 && applet.mouseX < 262
				&& applet.mouseY > 281 && applet.mouseY < 320) {
			keypad.pressedNumber("6");
			setCurrentScreen();
		}

		else if (applet.mouseX > 175 && applet.mouseX < 262
				&& applet.mouseY > 321 && applet.mouseY < 360) {
			keypad.pressedNumber("9");
			setCurrentScreen();
		}

		else if (applet.mouseX > 175 && applet.mouseX < 262
				&& applet.mouseY > 361 && applet.mouseY < 400) {
			keypad.backspace();
			setCurrentScreen();
		}

	}

	@Override
	public void draw(PApplet applet) {
		

	}

	@Override
	public void drawArrow(int cx, int cy, int len, float angle, PApplet applet) {
		

	}
	
	
			
	public void setCurrentScreen(){
		System.out.println("pwd is" + keypad.getPassword());
		if (keypad.getPassword().length() < 4) {			
			appController.setCurrentScreen(appController.getPinScreen());
		}
		
		else if((keypad.getPassword()).equals(validPin)){
			appController.setCurrentScreen(appController.getMyCardsMain());
		}
	}
}