package com.sb.view;

import com.sb.controller.AppController;
import com.sb.controller.ScreenState;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class PinScreen implements ScreenState {

	AppController appController;
	// KeyPad keypad = new KeyPad();
	// PassCode passcode = new PassCode();

	PImage img;
	PFont f;
	PFont f1;

	public PinScreen(AppController p) {
		appController = p;
	}

	public void setup(PApplet applet) {
		// keypad.draw(applet);
		// passcode.draw(applet);

	}

	public void mousePressed(PApplet applet) {
		if (applet.mouseX > 0 && applet.mouseX < 88 && applet.mouseY > 240
				&& applet.mouseY < 280) {

		}

	}

	@Override
	public void draw(PApplet applet) {
		// TODO Auto-generated method stub

	}

	@Override
	public void drawArrow(int cx, int cy, int len, float angle, PApplet applet) {
		// TODO Auto-generated method stub

	}

}
