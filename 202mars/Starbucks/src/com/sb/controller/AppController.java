package com.sb.controller;

import com.sb.view.MyCardOptions;
import com.sb.view.MyCardsMoreOptions;
import com.sb.view.MyCardsPay;
import com.sb.view.PinScreen;

import processing.core.PApplet;

public class AppController extends PApplet {

	private static final long serialVersionUID = 6361405752227066178L;

	ScreenState myCardsMoreOptions;
	ScreenState myCardsPay;
	ScreenState currentScreen;
	ScreenState myCardOptions;
	ScreenState myCardsMain;
	ScreenState pinScreen;

	public AppController() {

		myCardsMoreOptions = new MyCardsMoreOptions(this);
		myCardsPay = new MyCardsPay(this);
		pinScreen = new PinScreen(this);
		currentScreen = pinScreen;
		//myCardOptions=(ScreenState) new MyCardOptions(this);

	}

	public ScreenState getCurrentScreen() {
		return currentScreen;
	}

	public void setCurrentScreen(ScreenState currentScreen) {
		this.currentScreen = currentScreen;
	}

	@Override
	public void setup() {
		currentScreen.setup(this);
	}

	@Override
	public void draw() {
		currentScreen.draw(this);
	}

	@Override
	public void mousePressed() {

		System.out.println("hi.........Controller");
		currentScreen.mousePressed(this);
		currentScreen.setup(this);
		currentScreen.draw(this);
	}

	public ScreenState getMyCardsMoreOptions() {
		return myCardsMoreOptions;
	}

	public void setMyCardsMoreOptions(ScreenState myCardsMoreOptions) {
		this.myCardsMoreOptions = myCardsMoreOptions;
	}

	public ScreenState getMyCardsPay() {
		return myCardsPay;
	}

	public void setMyCardsPay(ScreenState myCardsPay) {
		this.myCardsPay = myCardsPay;
	}


}
