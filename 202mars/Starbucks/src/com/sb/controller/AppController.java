package com.sb.controller;


import com.sb.view.MyCardOptions;
import com.sb.view.MyCardsMain;
import com.sb.view.MyCardsMoreOptions;
import com.sb.view.MyCardsPay;
import com.sb.view.MyRewards;
import com.sb.view.PinScreen;

import processing.core.PApplet;

public class AppController extends PApplet {

	/**
	 * @author RENISH
	 * 
	 */
	private static final long serialVersionUID = 6361405752227066178L;

	ScreenState myCardsMoreOptions;
	ScreenState myCardsPay;
	ScreenState currentScreen;
	ScreenState myCardOptions;
	ScreenState myCardsMain;
	ScreenState pinScreen;
	ScreenState myRewards;

	public AppController() {

		myCardsMoreOptions = new MyCardsMoreOptions(this);
		myCardsPay = new MyCardsPay(this);
		pinScreen = new PinScreen(this);
		myCardsMain = new MyCardsMain(this);
		myRewards = new MyRewards(this);
		myCardOptions = new MyCardOptions(this);

		setCurrentScreen(myRewards);

		// myCardOptions=(ScreenState) new MyCardOptions(this);

	}

	public ScreenState getMyCardOptions() {
		return myCardOptions;
	}

	public void setMyCardOptions(ScreenState myCardOptions) {
		this.myCardOptions = myCardOptions;
	}

	public ScreenState getMyCardsMain() {
		return myCardsMain;
	}

	public void setMyCardsMain(ScreenState myCardsMain) {
		this.myCardsMain = myCardsMain;
	}

	public ScreenState getPinScreen() {
		return pinScreen;
	}

	public void setPinScreen(ScreenState pinScreen) {
		this.pinScreen = pinScreen;
	}

	public ScreenState getMyRewards() {
		return myRewards;
	}

	public void setMyRewards(ScreenState myRewards) {
		this.myRewards = myRewards;
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
