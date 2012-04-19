package com.sb.view;

import com.sb.controller.AppController;
import com.sb.controller.ScreenState;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class Menu implements ScreenState {

	AppController appController;
	PFont f, f3;
	PImage b, MainCard, MyHome, Payments, MyRewards, Stores, Settings;

	public Menu(AppController appController) {
		this.appController = appController;
	}

	public void setup(PApplet applet) {
	}// end of function setup

	// ---------------------------------------------------------------------------------------
	// Following code for muse
	// events---------------------------------------------------------
	// ............................................................................................
	public void draw(PApplet applet) {
		applet.noStroke();
		applet.line(0, 350, 300, 350);
		applet.fill(50);
		applet.rect(0, 350, 262, 50);

		f3 = applet.loadFont("Calibri-Bold-8.vlw"); // for Text below images in footer
		applet.textFont(f3, 10);

		// 1. Home
		applet.fill(80);
		applet.rect(3, 352, 50, 45);
		MyHome = applet.loadImage("MyHome.png"); // Image of MyHome
		applet.image(MyHome, 8, 355, 40, 25);

		applet.fill(255);
		applet.text("Cards", 15, 395); // Text for MyHome

		// 2. Payments
		applet.fill(80);
		applet.rect(55, 352, 50, 45);
		Payments = applet.loadImage("Payments.png"); // Image of Payments
		applet.image(Payments, 60, 355, 40, 25);

		applet.fill(255);
		applet.text("Payments", 60, 395); // Text for Payments

		// 3. My Rewards
		applet.fill(80);
		applet.rect(108, 352, 50, 45);
		MyRewards = applet.loadImage("MyRewards.png"); // Image of My Rewards
		applet.image(MyRewards, 113, 355, 40, 25);

		applet.fill(255);
		applet.text("My Rewards", 108, 395); // Text for MyRewards

		// 4. Stores
		applet.fill(80);
		applet.rect(160, 352, 50, 45);
		Stores = applet.loadImage("Stores.png"); // Image of Stores
		applet.image(Stores, 165, 355, 40, 25);

		applet.fill(255);
		applet.text("Stores", 173, 395); // Text for Stores

		// 5. Settings
		applet.fill(80);
		applet.rect(212, 352, 50, 45);
		Settings = applet.loadImage("Settings.png"); // Image of Settings
		applet.image(Settings, 217, 355, 40, 25);

		applet.fill(255);
		applet.text("Settings", 220, 395); // Text for Settings
	}// this function is needed to make the mousepressesd() work.Its just empty
		// but u shld have it .

	public void mousePressed(PApplet applet) {
		if (applet.mouseX > 3 && applet.mouseX < 53
				&& applet.mouseY > 352 && applet.mouseY < 397) {
			try {
				appController.setCurrentScreen(appController.getMyCardsMain());
			} catch (Exception e) {
				System.out.println("Exception :" + e);
			}
		}

		else if (applet.mouseX > 55 && applet.mouseX < 105
				&& applet.mouseY > 352 && applet.mouseY < 397) {
			try {
				appController.setCurrentScreen(appController.getPayment());
			} catch (Exception e) {
				System.out.println("Exception :" + e);
			}
		}
		
		else if (applet.mouseX > 108 && applet.mouseX < 158
				&& applet.mouseY > 352 && applet.mouseY < 397) {
			try {
				appController.setCurrentScreen(appController.getMyRewards());
			} catch (Exception e) {
				System.out.println("Exception :" + e);
			}
		}
		
		else if (applet.mouseX > 160 && applet.mouseX < 210
				&& applet.mouseY > 352 && applet.mouseY < 397) {
			try {
				appController.setCurrentScreen(appController.getFindStarbucks());
			} catch (Exception e) {
				System.out.println("Exception :" + e);
			}
		}
	}// end of mousepressed

	@Override
	public void drawArrow(int cx, int cy, int len, float angle, PApplet applet) {
		// TODO Auto-generated method stub

	}
}