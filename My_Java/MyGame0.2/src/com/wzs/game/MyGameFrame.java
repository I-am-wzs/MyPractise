package com.wzs.game;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class MyGameFrame extends JFrame{
	
	@Override
	public void paint(Graphics g) {	
		//g.setColor(Color.yellow);
		g.setFont(new Font("宋体", Font.BOLD, 40));
		g.drawLine(100, 100, 300, 300);
		g.drawRect(100, 100, 300, 200);
		//g.fillRect(100, 100, 300, 200);
		g.drawString("我爱你", 200, 100);
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
	}
	public static void main(String[] args) {
		MyGameFrame fMyGameFrame = new MyGameFrame();
		fMyGameFrame.launchFrame();
	}
}
