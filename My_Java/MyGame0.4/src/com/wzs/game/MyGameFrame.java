package com.wzs.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class MyGameFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Image bgImage = GameUtil.getImage("images/bg.jpg");
	Image plane = GameUtil.getImage("images/plane.png");
	static int count = 0;
	int planeX=200;
    int planeY=200;
	@Override
	public void paint(Graphics g) {	
		g.drawImage(bgImage, 0, 0, null);
		g.drawImage(plane, planeX, planeY, null);
		System.out.println("调用paint方法次数" + (count++));
		planeX+=3;
	}
	
	
	public void launchFrame() {
		this.setTitle("我是Alec,这是我的第一个game");
		this.setSize(500, 400);
		this.setLocation(100, 100);	
		this.setVisible(true);	
		this.addWindowListener(new WindowAdapter() {		
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
		
		new PaintThread().start();
	}
	public static void main(String[] args) {
		MyGameFrame fMyGameFrame = new MyGameFrame();
		fMyGameFrame.launchFrame();
	}
	
	class PaintThread extends Thread{
		public void run() {
			while(true) {
				repaint();		
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
