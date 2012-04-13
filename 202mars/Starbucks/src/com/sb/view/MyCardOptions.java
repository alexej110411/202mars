package com.sb.view;

import com.sb.controller.AppController;
import com.sb.controller.ScreenState;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class MyCardOptions extends PApplet implements ScreenState{

	private static final long serialVersionUID = 1L;
	/***************************************
	 * SCREEN:MY CARD OPTIONS AUTHOR:Madhumita V
	 ***************************************/

	/* Loading image and Fonts */
	PImage CardImage, MyHome, Payments, MyRewards, Stores, Settings;
	PFont f, f1;

	/* Modified by RENISH*/
	
	AppController appController;

	public MyCardOptions(AppController appController) {
		this.appController = appController;
	}

	
	public void setupMyCardsMoreOptions() {
		PImage MainImage, MyCards, Payments, MyRewards, Stores, Settings;
		PFont f;

		size(262, 400); // size of the frame
		background(50); // screen bg color
		line(2, 2, 260, 2);// boundary line horizontal
		line(2, 2, 2, 398);// boundary line vertical
		line(2, 398, 260, 398);// boundary line horizontal
		line(260, 2, 260, 398);// boundary line vertical
		// above code is for setting the output screen size
		// and creating a boundary rectangle

		line(2, 350, 260, 350); // horizontal line for common menu
		line(52, 350, 52, 398); // verticle line for menu
		line(104, 350, 104, 398);
		line(159, 350, 159, 398);
		line(208, 350, 208, 398);
		// above code is for the common menu at the bottom of the screen

		f = loadFont("Calibri-Bold-48.vlw"); // Loading font for the Screen
		textFont(f, 11);
		text("Cards", 12, 395);
		text("Payments", 55, 395);
		text("MyRewards", 105, 395);
		text("Stores", 167, 395);
		text("Settings", 215, 395);

		// Images must be in the "data" directory to load correctly
		MainImage = loadImage("StarbucksSpecialEdition.png"); // Starbucks
																// Special
																// edition image
		image(MainImage, 15, 57);

		MyCards = loadImage("Cards.png"); // Image of Card
		image(MyCards, 8, 355, 40, 25);

		Payments = loadImage("Payments.png"); // Image of Payments
		image(Payments, 60, 355, 40, 25);

		MyRewards = loadImage("MyRewards.png"); // Image of My Rewards
		image(MyRewards, 113, 355, 40, 25);

		Stores = loadImage("Stores.png"); // Image of Stores
		image(Stores, 165, 355, 40, 25);

		Settings = loadImage("Settings.png"); // Image of Settings
		image(Settings, 217, 355, 40, 25);

		fill(27, 125, 80); // the color for rectangle
		rect(2, 2, 259, 45);// The top rectangle for displaying text : card
							// options
		fill(255); // the font color-white
		textFont(f, 20); // the font size
		text("Card Options", 75, 30); // text("",x,y)

		fill(7, 85, 57); // the color for rectangle
		rect(7, 7, 45, 35, 8, 8, 8, 8);// The top rectangle for displayong text
										// : card options
		fill(255); // the font color-white
		textFont(f, 14); // the font size
		text("Cancel", 11, 29);

		fill(255); // the font color-white
		textFont(f, 20); // the font size
		text("$16.50", 168, 100);
		textFont(f, 10);
		text("as of TODAY at 8.30pm", 150, 120);

		fill(232, 225, 240);
		rect(15, 160, 230, 35, 8, 8, 0, 0); // Draw rectangle for Refresh
											// balance
		fill(50);
		textFont(f, 15); // the font size
		text("Refresh Balance", 20, 184);

		fill(232, 225, 240);
		rect(15, 195, 230, 35);// Draw rectangle for Reload Card
		fill(50);
		textFont(f, 15); // the font size
		text("Reload Card", 20, 217);

		fill(232, 225, 240);
		rect(15, 230, 230, 35); // Draw rectangle for Auto-Reload
		fill(50);
		textFont(f, 15); // the font size
		text("Auto-Reload", 20, 250);

		fill(232, 225, 240);
		rect(15, 265, 230, 35, 0, 0, 8, 8); // Draw rectangle for Recent
											// transactions
		fill(50);
		textFont(f, 15); // the font size
		text("Recent Transactions", 20, 285);

	}

	/*
	 * public static void main(String[] args) { new MyCardOptions(); }
	 * 
	 * public MyCardOptions() { setup(); draw(); }
	 */
	public void setup() {
		CardImage = loadImage("StarbucksSpecialEditionCard.jpg");
		f = loadFont("Calibri-Bold-30.vlw");
		f1 = loadFont("Calibri-30.vlw");

		/* Creating the main boundary */
		size(262, 400);
		background(50);
		line(2, 2, 260, 2);
		line(2, 2, 2, 398);
		line(2, 398, 260, 398);
		line(260, 2, 260, 398);

		/* Creating the option heading and subheading */
		fill(27, 131, 87);
		rect(0, 0, 265, 47);
		fill(255);
		textFont(f, 20);
		text("My Cards", 85, 30);

		fill(21, 67, 54);
		rect(180, 5, 75, 35, 8, 8, 8, 8);
		fill(255);
		textFont(f, 15);
		text("Add New", 190, 27);

		/* Creating the common menu behind transparent screen */
		line(2, 350, 260, 350);
		line(52, 350, 52, 398);
		line(104, 350, 104, 398);
		line(159, 350, 159, 398);
		line(208, 350, 208, 398);
		textFont(f1, 11);
		// 1. Home
		fill(80);
		rect(3, 352, 50, 45);
		MyHome = loadImage("MyHome.png"); // Image of MyHome
		image(MyHome, 8, 355, 40, 25);

		fill(255);
		text("Cards", 15, 395); // Text for MyHome

		// 2. Payments
		fill(80);
		rect(55, 352, 50, 45);
		Payments = loadImage("Payments.png"); // Image of Payments
		image(Payments, 60, 355, 40, 25);

		fill(255);
		text("Payments", 60, 395); // Text for Payments

		// 3. My Rewards
		fill(80);
		rect(108, 352, 50, 45);
		MyRewards = loadImage("MyRewards.png"); // Image of My Rewards
		image(MyRewards, 113, 355, 40, 25);

		fill(255);
		text("My Rewards", 108, 395); // Text for MyRewards

		// 4. Stores
		fill(80);
		rect(160, 352, 50, 45);
		Stores = loadImage("Stores.png"); // Image of Stores
		image(Stores, 165, 355, 40, 25);

		fill(255);
		text("Stores", 173, 395); // Text for Stores

		// 5. Settings
		fill(80);
		rect(212, 352, 50, 45);
		Settings = loadImage("Settings.png"); // Image of Settings
		image(Settings, 217, 355, 40, 25);

		fill(255);
		text("Settings", 220, 395); // Text for Settings

		/* Drawing starbucks card image to screen co-ordinates */
		image(CardImage, 30, 65, 200, 125);

		/* Creating options tabs */
		fill(150, 152, 155, 220);
		tint(0, 153, 204, 126); // Transparent screen
		rect(0, 180, 265, 398);

		fill(212, 212, 214);
		rect(30, 195, 205, 35, 8, 8, 8, 8);
		fill(0);
		textFont(f, 20);
		text("Reload Card", 80, 218);

		fill(212, 212, 214);
		rect(30, 240, 205, 35, 8, 8, 8, 8);
		fill(0);
		textFont(f, 20);
		text("Refresh Balance", 72, 265);

		fill(212, 212, 214);
		rect(30, 285, 205, 35, 8, 8, 8, 8);
		fill(0);
		textFont(f, 20);
		text("More Options", 76, 310);

		fill(73, 74, 75);
		rect(30, 345, 205, 35, 8, 8, 8, 8);
		fill(255);
		textFont(f, 20);
		text("Cancel", 105, 368);
	}

	// public void draw() {
	// }

	public void mousePressed() {

		
		if (mouseX > 30 - 205 && mouseX < 30 + 205 && mouseY > 195 - 35
				&& mouseY < 195 + 35) {
			// When Button Reload Card is pressed
			fill(250, 255, 155, 220);
			rect(30, 195, 205, 35, 8, 8, 8, 8);
		}

		else if (mouseX > 30 - 205 && mouseX < 30 + 205 && mouseY > 240 - 35
				&& mouseY < 240 + 35) {
			// When Button Refresh Balance is pressed
			fill(250, 255, 155, 220);
			rect(30, 240, 205, 35, 8, 8, 8, 8);

		} else if (mouseX > 30 - 205 && mouseX < 30 + 205 && mouseY > 285 - 35
				&& mouseY < 285 + 35) {
			// When Button More Options is pressed
			fill(250, 255, 155, 220);
			rect(30, 285, 205, 35, 8, 8, 8, 8);

			appController.setCurrentScreen(appController.getMyCardsMoreOptions());

		} else if (mouseX > 30 - 205 && mouseX < 30 + 205 && mouseY > 345 - 35
				&& mouseY < 345 + 35) {
			// When Button Cancel is pressed
			fill(250, 255, 155, 220);
			rect(30, 345, 205, 35, 8, 8, 8, 8);
		} else if (mouseX > 180 - 75 && mouseX < 180 + 75 && mouseY > 5 - 35
				&& mouseY < 5 + 35) {
			// When Button Add New is pressed
			fill(250, 255, 155, 220);
			rect(180, 5, 75, 35, 8, 8, 8, 8);
		}

	}

	@Override
	public void setup(PApplet applet) {
		// TODO Auto-generated method stub
		
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
