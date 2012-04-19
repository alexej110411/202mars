package com.sb.view;

import com.sb.controller.ScreenState;

import processing.core.PApplet;
import processing.core.PFont;

public class PassCode implements ScreenState {
	
	PFont f2;
	KeyPad keypad = new KeyPad();

	public void setup(PApplet applet) {

	}

	@Override
	public void mousePressed(PApplet applet) {
		

	}

	@Override
	public void draw(PApplet applet) {
		f2 = applet.loadFont("Calibri-Bold-30.vlw");
		applet.fill(255);
		applet.textFont(f2, 17);
		applet.rect(35, 45, 40, 35);
		applet.rect(85, 45, 40, 35);
		applet.rect(135, 45, 40, 35);
		applet.rect(185, 45, 40, 35);
		
		
		System.out.println("password is" + keypad.getPassword());		
		checkPin(applet);
		
		applet.textFont(f2, 80);
		int length = keypad.getPassword().length();
		System.out.println("len" +length);

		if (length == 4) {
			System.out.println("Inside pwd len=4");
			applet.fill(0);
			applet.text(".", 43, 70);
			applet.text(".", 95, 70);
			applet.text(".", 153, 70);
			applet.text(".", 193, 70);
		}

		else if (length == 3) {
			applet.fill(0);
			applet.text(".", 43, 70);
			applet.text(".", 95, 70);
			applet.text(".", 143, 70);
		}

		else if (length == 2) {
			applet.fill(0);
			applet.text(".", 43, 70);
			applet.text(".", 95, 70);
		}

		else if (length == 1) {		
			applet.fill(0);
			applet.text(".", 43, 70);
		}

	}

	@Override
	public void drawArrow(int cx, int cy, int len, float angle, PApplet applet) {
		
	}
	
	public void checkPin(PApplet applet){
		if(keypad.getPassword().length() == 4 && !(keypad.getPassword()).equals("1234")){
			System.out.println("in incoreect pwd");
			keypad.setState(keypad.getNoPinState());
			keypad.setPassword("");
			applet.fill(255,0,0);
			applet.textFont(f2, 17);
			applet.text("Incorrect Pin, enter again",45,95);			
		}
	}

}
