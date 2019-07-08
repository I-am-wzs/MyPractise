package com.wzs;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.FormatFlagsConversionMismatchException;

import javax.swing.JFrame;

public class MyGameFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  int frameWidth = 500;
	private  int frameHeight = 400;
	private  int frameX = 100;
	private  int frameY = 100;
	
	Image bgImage = GameUtil.getImage("images/bg.jpg");
	Image planeImage = GameUtil.getImage("images/plane.png");

	Plane plane = new Plane(planeImage,(int)(getLocation().getX() + frameWidth / 2),(int)(getLocation().getY() + frameHeight / 2),10);
	
	//绘制飞机的线程
 	class PaintThread extends Thread{
		public void run() {
			while(true) {
				repaint();	
				plane.setBorder(getSize());
				int x = (int) (getLocation().getX() + (plane.getX() - getFrameX()) * getSize().getWidth() / frameWidth);
				int y = (int) (getLocation().getY() + (plane.getY() - getFrameY()) * getSize().getHeight() / frameHeight);
				plane.setX(x);
				plane.setY(y);
				//System.out.println(plane.getX());
				//System.out.println(plane.getY());
				
				setFrameWidth((int)getSize().getWidth());
				setFrameHeight((int)getSize().getHeight());
				setFrameX((int)getLocation().getX());
				setFrameY((int)getLocation().getY());
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
 	
 	class KeyMonitor extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			plane.changeDirection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			plane.cancleDirection(e);
		}
 	}
 	
	public int getFrameWidth() {
		return frameWidth;
	}
	public void setFrameWidth(int frameWidth) {
		this.frameWidth = frameWidth;
	}
	public int getFrameHeight() {
		return frameHeight;
	}
	public void setFrameHeight(int frameHeight) {
		this.frameHeight = frameHeight;
	}
	public int getFrameX() {
		return frameX;
	}
	public void setFrameX(int frameX) {
		this.frameX = frameX;
	}
	public int getFrameY() {
		return frameY;
	}
	public void setFrameY(int frameY) {
		this.frameY = frameY;
	}
	
	@Override
	public void paint(Graphics g) {	
		//g.drawImage(bgImage, 0, 0, null);	
		g.drawImage(bgImage, 0, 0, (int)getSize().getWidth(), (int)getSize().getHeight(), null);
		plane.drawSelf(g);	
	}
	public void launchFrame() {
		this.setTitle("我是Alec,这是我的第一个game");
		this.setSize(frameWidth,frameHeight);
		this.setLocation(frameX,frameY);	
		this.setVisible(true);	
		this.addWindowListener(new WindowAdapter() {		
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				System.exit(0);
			}
		});		
		new PaintThread().start();
		addKeyListener(new KeyMonitor());
	}	
}

