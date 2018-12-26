
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voxlan
 */
public class Obstacle {
    private Image gambar;
    public int x, y, height, width;
   //private ArrayList<String> listGambar;
    
    public Obstacle()
    {
        Random rand = new Random();
        int n = rand.nextInt(2) + 1;
        /*if (n==1)
        {
            gambar= Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("lib/cone.png")).getScaledInstance(80, 80, Image.SCALE_DEFAULT);
            x=1000;
            y=300;
            dx=2;
        }
        else
        {
            gambar= Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("lib/batu.png")).getScaledInstance(120, 120, Image.SCALE_DEFAULT);
            x=1000;
            y=150;
            dx=3;
            width=120;
            height=120;
        }*/
        gambar= Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("lib/crate.png")).getScaledInstance(40, 40, Image.SCALE_DEFAULT);
            x=1000;
            y=330;
            width = 40;
            height = 40;
        System.out.println(n);
    }
    
    public Rectangle getBounds()
    {
        return new Rectangle(x, y, width, height);
    }
    
    public Image getImage()
    {
        return gambar;
    }
    
}
