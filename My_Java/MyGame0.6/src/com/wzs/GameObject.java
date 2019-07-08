package com.wzs;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class GameObject {
	private Image image;
	private double x,y;
	private int speed;
	private int width,height;
	
	public void drawSelf(Graphics g) {
		g.drawImage(image, (int)x, (int)y, null);
	}

	public GameObject(Image image, double x, double y, int speed, int width, int height) {
		super();
		this.image = image;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.width = width;
		this.height = height;
	}

	public GameObject(Image image, double x, double y) {
		super();
		this.image = image;
		this.x = x;
		this.y = y;
	}

	public GameObject() {
		super();
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public Rectangle getRect() {
		return new Rectangle((int)x, (int)y, width, height);
		
	}
	
}
