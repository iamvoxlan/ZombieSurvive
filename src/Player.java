
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voxlan
 */
public class Player implements Runnable
{
    public String name;
    public int energy = 100;
    public boolean moveState;
    public int x=250, y=270, dy=10, width=100, height=100;
    public Image spriteChar = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("lib/mario.gif")).getScaledInstance(100, 100, Image.SCALE_DEFAULT);
    public Player(String n)
    {
        name=n;
        energy=100;
        moveState=true;
    }
    
    public Image getImage()
    {
        return spriteChar;
    }
    
    @Override
    public void run()
    {
        moveState=false;
        
        while(y!=170)
        {
            try {
                y-=dy;
                Thread.sleep(60);
                System.out.println(y);
            } catch (Exception e) {
            }
        }
        while (y!=270)
        {
            try {
                y+=dy;
                Thread.sleep(40);
                System.out.println(y);
            } catch (Exception e) {
            }
        }
        energy--;
        moveState=true;
    }
    
    public void jump()
    {
        Thread thread = new Thread(this);
        if (moveState)
        {
            thread.start();
        }
    }
    
    public Rectangle getBounds()
    {
        return new Rectangle(x, y, width, height);
    }
    
    public void slide()
    {
        if (moveState)
        {
            spriteChar = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("lib/mario_duck.png")).getScaledInstance(80, 80, Image.SCALE_DEFAULT);
            y=280;
        }
    }
}
