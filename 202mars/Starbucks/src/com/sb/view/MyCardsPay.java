package com.sb.view;

import com.sb.controller.AppController;
import com.sb.controller.ScreenState;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class MyCardsPay implements ScreenState {

	// StarBucks app design - team MARS
	// Author : Anupama Patil
	// Modified by: RENIS SHAH

	AppController appController;

	PFont f;
	PImage b;
	Menu mn;
	BarCode bcd;
	TouchWhenDone tch;

	public MyCardsPay(AppController appController) {
		this.appController = appController;
	}

	public void setup(PApplet applet) {
		applet.size(262, 400);
		applet.background(50);

		f = applet.loadFont("Calibri-30.vlw");
		applet.textFont(f, 11);

		applet.line(2, 2, 260, 2);// boundary line horizontal
		applet.line(2, 2, 2, 398);// boundary line vertical
		applet.line(2, 398, 260, 398);// boundary line horizontal
		applet.line(260, 2, 260, 398);// boundary line vertical
		// above code is for setting the output screen size
		// and creating a boundary rectangle

		applet.line(2, 350, 260, 350); // horizontal applet.line for common menu
		applet.line(52, 350, 52, 398);// verticle applet.line for menu
		applet.line(104, 350, 104, 398);
		applet.line(159, 350, 159, 398);
		applet.line(208, 350, 208, 398);
		// above code if for the common menu at the bottom of the screen

		// Above code is to display the menus at the bottom of the screen
		// Following code is specific to my Screen
		// -------------------------------------------------------------
		applet.textFont(f, 20);
		applet.text("Scan Now", 100, 300);// applet.text for : Screen Pay

		applet.fill(27, 131, 87);
		applet.rect(2, 2, 259, 45);// The top applet.rectangle for :Screen Pay
		applet.fill(255);
		applet.textFont(f, 20);
		applet.text("My Cards", 100, 30);// applet.text in Top applet.rectangle
											// for :
											// Screen pay
		// -------------------------------------------------------------
				
		bcd = new BarCode(appController);
		bcd.draw(applet);
		
		tch = new TouchWhenDone(appController);
		tch.draw(applet);
		
		mn = new Menu(appController);
		mn.draw(applet);
	}// end of function setup

	// ---------------------------------------------------------------------------------------
	// Following code for muse
	// events---------------------------------------------------------
	// ............................................................................................
	public void draw(PApplet applet) {
	}// this function is needed to make the mousepressesd() work.Its just empty
		// but u shld have it .

	public void mousePressed(PApplet applet) {
		// Test if the cursor is over the Circle (Touch When Done)
		if(applet.mouseX > 3 && applet.mouseX < 210
				&& applet.mouseY > 352 && applet.mouseY < 397){
			mn = new Menu(appController);
			mn.mousePressed(applet);
		}
		
		
		/*if (applet.mouseX > 224 - 50 && applet.mouseX < 224 + 50
				&& applet.mouseY > 180 - 50 && applet.mouseY < 180 + 50) {
			try {
				System.out
						.println("Mouse Pressed - MyCardsPay => MyCardsMoreOptions");

				appController.setCurrentScreen(appController
						.getMyCardsMoreOptions());
				// applet.fill(255);// dummycode to test mousepress
				// ellipse(224, 180, 50, 50);
			} catch (Exception e) {
				System.out.println("Exception :" + e);
			}
		}// end of if

		else if (applet.mouseX > 80 - 150 && applet.mouseX < 80 + 150
				&& applet.mouseY > 90 - 55 && applet.mouseY < 90 + 55) {

			System.out.println("HI......Mouse Pressed!!!!!!!!!! - MyCardsPay");

			applet.fill(255);// dummy code to test mousepress
			applet.rect(80, 90, 150, 55);*/

		//}// end of if for barcode
	}// end of mousepressed

	@Override
	public void drawArrow(int cx, int cy, int len, float angle, PApplet applet) {
		// TODO Auto-generated method stub

	}
}
