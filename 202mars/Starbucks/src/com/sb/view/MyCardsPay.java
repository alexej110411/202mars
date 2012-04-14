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

		applet.text("Cards", 10, 395);
		applet.text("Payments", 53, 395);
		applet.text("Payments", 53, 395);
		applet.text("MyRewards", 105, 395);
		applet.text("Stores", 167, 395);
		applet.text("Settings", 215, 395);
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
		applet.fill(209);
		applet.rect(20, 55, 220, 100);// upper applet.rectangle with scan code

		applet.fill(87);
		applet.rect(20, 55, 50, 100);// vertical applet.rect with startbucks
										// logo
		applet.fill(162);
		applet.textFont(f, 11);
		applet.text("CARD", 35, 120);// applet.text to display in vertical
										// screen

		// Images must be in the "data" diapplet.rectory to load
		// corapplet.rectly
		b = applet.loadImage("logo.png");
		applet.image(b, 25, 57);

		applet.fill(87);
		applet.rect(20, 150, 220, 20);// middle applet.rectangle
		applet.fill(87);
		applet.rect(20, 170, 50, 15);// bottom vertical applet.rectangle
		applet.fill(209);
		applet.rect(70, 170, 170, 15);// bottom horizontal applet.rectangle
		applet.fill(255);
		applet.rect(80, 90, 150, 55);// barcode
		applet.fill(0);
		applet.rect(80, 90, 10, 55);// barcode
		applet.rect(92, 90, 1, 55);// barcode
		applet.rect(96, 90, 1, 55);// barcode
		applet.rect(97, 90, 1, 55);// barcode
		applet.rect(100, 90, 1, 55);// barcode
		applet.rect(103, 90, 1, 55);// barcode
		applet.rect(106, 90, 2, 55);// barcode
		applet.rect(110, 90, 1, 55);// barcode
		applet.rect(113, 90, 1, 55);// barcode
		applet.rect(117, 90, 1, 55);// barcode
		applet.rect(120, 90, 2, 55);// barcode

		int cols = 230; // code from processing tutorial
		int rows = 145;

		// Declare 2D array
		int[][] myArray = new int[cols][rows];

		// Initialize 2D array values
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				myArray[i][j] = (int) (applet.random(255));
			}
		}

		// Draw points
		for (int i = 125; i < cols; i++) {
			for (int j = 90; j < rows; j++) {
				applet.stroke(myArray[i][j]);
				applet.point(i, j);
			}
		}// end of code from processing tutorial

		// above code is for center applet.rectangle for barcode sacnning
		// :Screen Pay

		applet.fill(162);
		applet.textFont(f, 10);
		applet.text("Your Starbucks card number is", 90, 70);
		applet.fill(50);
		applet.textFont(f, 13);
		applet.text("6055   4399   8528   8445", 85, 85);
		// above code to display applet.text in first applet.rectangle of scan
		// code

		applet.fill(162);
		applet.ellipse(224, 180, 50, 50);
		applet.fill(0);
		applet.textFont(f, 11);
		applet.text("Touch", 210, 175);
		applet.text("When", 210, 185);
		applet.text("Done", 210, 195);
		// above code for the circle with applet.text "Touch when done"

		applet.fill(255);
		// ellipse(135,210,40,7);
		applet.ellipse(137, 214, 50, 10);
		applet.beginShape(applet.QUADS);
		applet.vertex(115, 215);
		applet.vertex(125, 270);
		applet.vertex(150, 270);
		applet.vertex(160, 215);
		applet.endShape();
		applet.fill(50);
		applet.ellipse(137, 240, 15, 15);
		// above code is to display cup image and the circle on it
		// For Menu

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

		if (applet.mouseX > 224 - 50 && applet.mouseX < 224 + 50
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
			applet.rect(80, 90, 150, 55);

		}// end of if for barcode
	}// end of mousepressed

	@Override
	public void drawArrow(int cx, int cy, int len, float angle, PApplet applet) {
		// TODO Auto-generated method stub

	}
}
