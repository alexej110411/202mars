/**
 * 
 */
package com.sb.view;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

import com.sb.controller.AppController;
import com.sb.controller.ScreenState;

/**
 * @author RENISH
 * 
 */
public class MyRewards implements ScreenState {

	/* Modified by RENISH */

	AppController appController;
	PImage MainImage, MyCards, Payments, MyRewards, Stores, Settings;

	public MyRewards(AppController appController) {
		this.appController = appController;
	}

	@Override
	public void setup(PApplet applet) {

		PFont f = applet.loadFont("Calibri-Bold-30.vlw");
		/* Creating the main boundary */
		applet.size(262, 400);
		applet.background(50);
		applet.line(2, 2, 260, 2);
		applet.line(2, 2, 2, 398);
		applet.line(2, 398, 260, 398);
		applet.line(260, 2, 260, 398);

		/* Creating the option heading and subheading */
		applet.fill(27, 131, 87);
		applet.rect(0, 0, 265, 47);
		applet.fill(255);
		applet.textFont(f, 20);
		applet.text("My Rewards", 85, 30);

//		applet.line(2, 350, 260, 350); // horizontal line for common menu
//		applet.line(52, 350, 52, 398); // verticle line for menu
//		applet.line(104, 350, 104, 398);
//		applet.line(159, 350, 159, 398);
//		applet.line(208, 350, 208, 398);
		// above code is for the common menu at the bottom of the screen

		f = applet.loadFont("Calibri-Bold-48.vlw"); // Loading font for the
													// Screen
		applet.textFont(f, 11);
		applet.text("Cards", 12, 395);
		applet.text("Payments", 55, 395);
		applet.text("MyRewards", 105, 395);
		applet.text("Stores", 167, 395);
		applet.text("Settings", 215, 395);

		// Images must be in the "data" directory to load correctly
		MainImage = applet.loadImage("StarbucksSpecialEdition.png"); // Starbucks
		// Special
		// edition image
		applet.image(MainImage, 15, 57);

		MyCards = applet.loadImage("Cards.png"); // Image of Card
		applet.image(MyCards, 8, 355, 40, 25);

		Payments = applet.loadImage("Payments.png"); // Image of Payments
		applet.image(Payments, 60, 355, 40, 25);

		MyRewards = applet.loadImage("MyRewards.png"); // Image of My Rewards
		applet.image(MyRewards, 113, 355, 40, 25);

		Stores = applet.loadImage("Stores.png"); // Image of Stores
		applet.image(Stores, 165, 355, 40, 25);

		Settings = applet.loadImage("Settings.png"); // Image of Settings
		applet.image(Settings, 217, 355, 40, 25);

		applet.fill(27, 125, 80); // the color for rectangle
		applet.rect(2, 2, 259, 45);// The top rectangle for displaying text :
									// card

	}

	@Override
	public void mousePressed(PApplet applet) {
		// TODO Auto-generated method stub

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
