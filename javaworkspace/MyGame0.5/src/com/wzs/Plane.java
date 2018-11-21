package com.wzs;

import java.awt.Graphics;
import java.awt.Image;

public class Plane extends GameObject {
	public void drawSelf(Graphics g) {
		g.drawImage(getImage(), (int)(getX()), (int)(getY()), null);
		setX(getX() + 1);
	}
	
	public Plane(Image image,int x,int y) {
		setX(x);
		setY(y);
		setImage(image);
	}
}
