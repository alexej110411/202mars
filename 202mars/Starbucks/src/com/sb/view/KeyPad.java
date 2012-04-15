package com.sb.view;

import com.sb.controller.ScreenState;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class KeyPad implements ScreenState{
	
	PImage img;
	PFont f;
	PFont f1;
	String input;
	PassCodeState state;
	static String password = ""; 
	
	PassCodeState NoPinState;
	PassCodeState OnePinState;
	PassCodeState TwoPinState;
	PassCodeState ThreePinState;
	PassCodeState FourPinState;		
	

	public KeyPad() {
		NoPinState = new NoPinState(this);
		OnePinState = new OnePinState(this);
		TwoPinState = new TwoPinState(this);
		ThreePinState = new ThreePinState(this);
		FourPinState = new FourPinState(this);
		state = NoPinState;	
	}
	
	public void setup(PApplet applet) {

	}


	@Override
	public void mousePressed(PApplet applet) {		
		
	}


	@Override
	public void draw(PApplet applet) {
		
		/* Creating the main boundary */
		applet.size(262, 400);
		applet.background(50);

		img = applet.loadImage("/Logo.jpg");
		applet.image(img, 40, 78);

		applet.fill(0);
		applet.line(88, 240, 88, 399);
		applet.line(174, 240, 174, 399);
		applet.line(0, 240, 300, 240);
		applet.line(0, 280, 300, 280);
		applet.line(0, 320, 300, 320);
		applet.line(0, 360, 300, 360);

		f = applet.loadFont("Calibri-30.vlw");

		f1 = applet.loadFont("Calibri-Bold-30.vlw");

		applet.textFont(f1, 17);
		applet.fill(255);
		applet.text("Please enter your passcode", 33, 40);

		applet.fill(255);
		applet.textFont(f1, 20);
		applet.text("1", 30, 265);
		applet.text("2", 130, 265);
		applet.text("3", 210, 265);
		applet.text("4", 30, 305);
		applet.text("5", 130, 305);
		applet.text("6", 210, 305);
		applet.text("7", 30, 345);
		applet.text("8", 130, 345);
		applet.text("9", 210, 345);
		applet.text("0", 130, 385);

		applet.textFont(f1, 13);
		applet.text("A B C", 123, 275);
		applet.text("D E F", 205, 275);
		applet.text("G H I", 25, 315);
		applet.text("J K L", 123, 315);
		applet.text("M N O", 200, 315);
		applet.text("P Q R S", 18, 355);
		applet.text("T U V", 123, 355);
		applet.text("W X Y Z", 198, 355);

		applet.rect(210, 370, 20, 14);
		applet.triangle(200, 377, 210, 370, 210, 384);
		applet.stroke(255);
		applet.line(210, 371, 210, 383);

		applet.fill(0);
		applet.text("X", 215, 382);
		
	}
	
	
	
	public void setNumber(String input){
		this.input = input;		
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		KeyPad.password = password;
	}
	
	
	public void pressedNumber(String input){
		state.pressedNumber(input);
	}
	
	public void backspace(){
		state.backspace();
	}


	@Override
	public void drawArrow(int cx, int cy, int len, float angle, PApplet applet) {
		// TODO Auto-generated method stub
		
	}
	
	void setState(PassCodeState state){
		this.state=state;
	}
	
	public PassCodeState getNoPinState(){
		return NoPinState;
	}

	public PassCodeState getOnePinState(){
		return OnePinState;
	}

	public PassCodeState getTwoPinState(){
		return TwoPinState;
	}

	public PassCodeState getThreePinState(){
		return ThreePinState;
	}
	
	public PassCodeState getFourPinState(){
		return FourPinState;
	}
	
/*	public boolean isValid(){
		if(password.length()==4 && password =="1234"){
			password="";		
			state = getNoPinState();			
		}
		return true;			
	}*/

	public void updatePassword(String num){
		
		if(num == "" && password.length()>0)
			password=password.substring(0,password.length()-1);
		else 
			password += num;
			
	}


}
