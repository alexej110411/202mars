package com.sb.view;

import com.sb.controller.AppController;
import com.sb.controller.ScreenState;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class MyCardsMain implements ScreenState {

	public static int status = 0;
	/************************************************************************************
	 * Author: Sindhuja Sundarraman Course#: CMPE 202 Topic: Code for Starbucks
	 * App - Main Screen Modified by: RENIS SHAH
	 ************************************************************************************/

	AppController appController;

	public MyCardsMain(AppController p) {
		appController = p;
	}

	// Declarations
	PImage MainCard, MyHome, Payments, MyRewards, Stores, Settings;
	PFont f1, f2, f3, f4, f5, f6, f7;

	@Override
	public void setup(PApplet applet) {
		// Setting the size of the screen
		applet.size(262, 400);

		// Setting the background color - middle screen
		applet.background(70, 10);

		// Drawing Green rectangular Header
		applet.fill(27, 131, 87); // Color Spec from Madhumita's code
		applet.rect(0, 0, 265, 47);

		// Text for header - My Cards
		applet.fill(255);
		f4 = applet.loadFont("Calibri-Bold-8.vlw");
		applet.textFont(f4, 20);
		applet.text("My Cards", 80, 30);

		// Drawing the rectangle for smaller rectangle within Header - 'View
		// All'
		applet.fill(21, 67, 54); // Color Spec from Madhumita's code
		applet.rect(190, 10, 65, 25, 8, 8, 8, 8);

		// Text for button - View All
		applet.fill(255);
		f5 = applet.loadFont("Calibri-Bold-8.vlw");
		applet.textFont(f5, 12);
		applet.text("View All", 200, 28);

		// Loading the Starbucks Green card
		MainCard = applet.loadImage("StarbucksSpecialEditionCard.jpg");
		applet.image(MainCard, 25, 60, 210, 130);

		// Drawing the applet.rectangle to show the Balance
		applet.noStroke();
		applet.fill(90);
		applet.rect(40, 220, 170, 60, 8, 8, 8, 8);

		/*******************************************************************************/
		// Displaying Balance - Need to come in from Calculation!!!

		applet.fill(255);
		f6 = applet.loadFont("Calibri-8.vlw");
		applet.textFont(f6, 36);
		applet.text("$16.50", 70, 250);

		f7 = applet.loadFont("Calibri-8.vlw");
		applet.textFont(f7, 16);
		applet.text("as of TODAY at 9:00pm", 45, 270);

		/*******************************************************************************/

		// Drawing the footer
		applet.noStroke();
		applet.line(0, 350, 300, 350);
		applet.fill(50);
		applet.rect(0, 350, 262, 50);

		// Dividing Footer into 5 parts and loading associated images
		f3 = applet.loadFont("Calibri-Bold-8.vlw"); // for applet.text below
													// images in footer
		applet.textFont(f3, 10);

		// 1. Home
		applet.fill(80);
		applet.rect(3, 352, 50, 45);
		MyHome = applet.loadImage("MyHome.png"); // Image of MyHome
		applet.image(MyHome, 8, 355, 40, 25);

		applet.fill(255);
		applet.text("Cards", 15, 395); // applet.text for MyHome

		// 2. Payments
		applet.fill(80);
		applet.rect(55, 352, 50, 45);
		Payments = applet.loadImage("Payments.png"); // Image of Payments
		applet.image(Payments, 60, 355, 40, 25);

		applet.fill(255);
		applet.text("Payments", 60, 395); // applet.text for Payments

		// 3. My Rewards
		applet.fill(80);
		applet.rect(108, 352, 50, 45);
		MyRewards = applet.loadImage("MyRewards.png"); // Image of My Rewards
		applet.image(MyRewards, 113, 355, 40, 25);

		applet.fill(255);
		applet.text("My Rewards", 108, 395); // applet.text for MyRewards

		// 4. Stores
		applet.fill(80);
		applet.rect(160, 352, 50, 45);
		Stores = applet.loadImage("Stores.png"); // Image of Stores
		applet.image(Stores, 165, 355, 40, 25);

		applet.fill(255);
		applet.text("Stores", 173, 395); // applet.text for Stores

		// 5. Settings
		applet.fill(80);
		applet.rect(212, 352, 50, 45);
		Settings = applet.loadImage("Settings.png"); // Image of Settings
		applet.image(Settings, 217, 355, 40, 25);

		applet.fill(255);
		applet.text("Settings", 220, 395); // applet.text for Settings
	}

	/*******************************/
	// Initializing
	int value = 200;

	@Override
	public void mousePressed(PApplet applet) {
		if (value == 0) {
			value = 200;
			System.out.println("Value:200");
		} else {
			value = 0;
			System.out.println("Value:0");
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
