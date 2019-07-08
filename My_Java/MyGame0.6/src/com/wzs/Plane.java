package com.wzs;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

public class Plane extends GameObject {
	boolean left,right,up,down;
	Dimension border = new Dimension();
	boolean live = true;
	public Dimension getBorder() {
		return border;
	}
	public void setBorder(Dimension border) {
		this.border = border;
	}
	public void drawSelf(Graphics g) {
		g.drawImage(getImage(), (int)(getX()), (int)(getY()), null);
		//System.out.println(getX()+ "  " + getY());
		if(true == left) {
			if(getX() > 0) {
				setX(getX() - getSpeed());
			}
		}
		if(true == right) {
			if(getX() <= border.getWidth() - 30) {
				setX(getX() + getSpeed());
			}
		}
		if(true == up) {
			if(getY() > 40) {
				setY(getY() - getSpeed());
			}
		}
		if(true == down) {
			if(getY() <= border.getHeight() - 40) {
				setY(getY() + getSpeed());
			}
		}
	}
	public Plane(Image image,int x,int y) {
		setX(x);
		setY(y);
		setImage(image);
	}
	public Plane(Image image,int x,int y,int speed) {
		setX(x);
		setY(y);
		setImage(image);
		setSpeed(speed);
	}
	//按上下左右键，改变方向
	public void changeDirection(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left = true;
			break;
		case KeyEvent.VK_RIGHT:
			right = true;
			break;
		case KeyEvent.VK_UP:
			up = true;
			break;
		case KeyEvent.VK_DOWN:
			down = true;
			break;
		default:
			break;
		}
	}
	public void cancleDirection(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left = false;
			break;
		case KeyEvent.VK_RIGHT:
			right = false;
			break;
		case KeyEvent.VK_UP:
			up = false;
			break;
		case KeyEvent.VK_DOWN:
			down = false;
			break;
		default:
			break;
		}
	}
}
