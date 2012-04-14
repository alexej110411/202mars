/********************************************/
/***       Author : Sachin Pisal         ****/
/********************************************/

package com.sb.view;

import com.sb.controller.AppController;
import com.sb.controller.ScreenState;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class FindStarbucks implements ScreenState {

	AppController appController;
	PFont f, f3;
	PImage b, MainCard, MyHome, Payments, MyRewards, Stores, Settings, TiltedArrow, Search;

	public FindStarbucks(AppController appController) {
		this.appController = appController;
	}

	public void setup(PApplet applet) {
		applet.size(262, 400);
		applet.background(50);

		  f = applet.loadFont("Calibri-30.vlw");
		  applet.textFont(f, 11);

		  applet.line(2, 2, 260, 2);// boundary line horizontal
		  applet.line(2, 2, 2, 398);// boundary line vertical
		  applet.line(2, 398, 260, 398);//boundary line horizontal
		  applet.line(260, 2, 260, 398);//boundary line vertical
		  // above code is for setting the output screen size
		  //and creating a boundary rectangle

		  //Following code is specific to my Screen 
		  //-------------------------------------------------------------
		  
		  applet.fill(27, 131, 87);
		  applet.rect(0, 0, 265, 47);
		  applet.fill(255);
		  applet.textFont(f, 20);
		  //text("My Cards", 85, 30);

		  applet.fill(21, 67, 54);
		  applet.rect(8, 10, 30, 30, 8, 8, 8, 8);
		  applet.fill(255);
		  TiltedArrow = applet.loadImage("arrow.png");
		  applet.image(TiltedArrow, 15, 15, 20, 20);
		  
		  applet.fill(21, 67, 54);
		  applet.rect(70, 10, 60, 30, 8, 8, 8, 8);
		  applet.fill(255);
		  applet.textFont(f, 15);
		  applet.text("Map", 90, 30);

		  applet.fill(21, 67, 54);
		  applet.rect(130, 10, 60, 30, 8, 8, 8, 8);
		  applet.fill(255);
		  applet.textFont(f, 15);
		  applet.text("List", 150, 30);

		  applet.fill(21, 67, 54);
		  applet.rect(227, 10, 30, 30, 8, 8, 8, 8);
		  applet.fill(255);
		  //textFont(f, 15);
		  Search = applet.loadImage("Stores.png");
		  applet.image(Search, 230, 13, 25, 25);
		  //-------------------------------------------------------------

		  // Images must be in the "data" directory to load correctly
		  b = applet.loadImage("Map.png");
		  applet.image(b, 0, 45);


		  // For Menu
		  //Dividing Footer into 5 parts and loading associated images
		  //Drawing the footer
		  applet.noStroke();
		  applet.line(0, 350, 300, 350);
		  applet.fill(50);
		  applet.rect(0, 350, 262, 50);

		  f3 = applet.loadFont("Calibri-Bold-8.vlw");   // for Text below images in footer
		  applet.textFont(f3, 10);

		  //1. Home
		  applet.fill(80);
		  applet.rect(3, 352, 50, 45);
		  MyHome = applet.loadImage("MyHome.png");      // Image of MyHome
		  applet.image(MyHome, 8, 355, 40, 25);

		  applet.fill(255);
		  applet.text("Cards", 15, 395);                  //Text for MyHome

		  //2. Payments
		  applet.fill(80);
		  applet.rect(55, 352, 50, 45);
		  Payments = applet.loadImage("Payments.png");  // Image of Payments
		  applet.image(Payments, 60, 355, 40, 25);

		  applet.fill(255);
		  applet.text("Payments", 60, 395);                  //Text for Payments

		  //3. My Rewards
		  applet.fill(80);
		  applet.rect(108, 352, 50, 45);
		  MyRewards = applet.loadImage("MyRewards.png");  //Image of My Rewards
		  applet.image(MyRewards, 113, 355, 40, 25);

		  applet.fill(255);
		  applet.text("My Rewards", 108, 395);                  //Text for MyRewards

		  //4. Stores
		  applet.fill(80);
		  applet.rect(160, 352, 50, 45);
		  Stores = applet.loadImage("Stores.png");  //Image of Stores
		  applet.image(Stores, 165, 355, 40, 25);

		  applet.fill(255);
		  applet.text("Stores", 173, 395);                  //Text for Stores

		  //5. Settings
		  applet.fill(80);
		  applet.rect(212, 352, 50, 45);
		  Settings = applet.loadImage("Settings.png");  //Image of Settings
		  applet.image(Settings, 217, 355, 40, 25);

		  applet.fill(255);
		  applet.text("Settings", 220, 395);                  //Text for Settings
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
