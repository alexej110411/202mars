package com.sb.view;

import java.util.Random;

import com.sb.controller.AppController;
import com.sb.controller.ScreenState;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class TouchWhenDone implements ScreenState {

	AppController appController;
	PFont f, f3;
	PImage b, MainCard, MyHome, Payments, MyRewards, Stores, Settings;

	public TouchWhenDone(AppController appController) {
		this.appController = appController;
	}

	public void setup(PApplet applet) {
	}// end of function setup

	// ---------------------------------------------------------------------------------------
	// Following code for muse
	// events---------------------------------------------------------
	// ............................................................................................
	public void draw(PApplet applet) {
		//Author Anupama Patil
		f = applet.loadFont("Calibri-30.vlw");
		applet.textFont(f, 11);
		
		applet.fill(162);
		applet.ellipse(224,180,50,50);
		applet.fill(0);
		applet.textFont(f,11);
		applet.text("Touch",210,175);
		applet.text("When",210,185);
		applet.text("Done",210,195);
		//above code for the circle with text "Touch when done"		
	}

	public void mousePressed(PApplet applet) {
		
	}// end of mousepressed

	@Override
	public void drawArrow(int cx, int cy, int len, float angle, PApplet applet) {
		// TODO Auto-generated method stub

	}
}