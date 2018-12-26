
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
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
public class EnergyItem extends Item{
    
    private int energy;
    private Image gambar;
    public int x=1000, y=280, dx=5, width, height;
    
    public EnergyItem()
    {
        Random rand = new Random();
        int n = rand.nextInt(2) + 1;
        if (n==1)
        {
            gambar= Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("lib/thunder.png")).getScaledInstance(80, 80, Image.SCALE_DEFAULT);
            energy= 50;
            width=80;
            height=80;
        }
        else
        {
            gambar= Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("lib/thunder.png")).getScaledInstance(50, 50, Image.SCALE_DEFAULT);
            energy= 30;
            width=50;
            height=50;
        }
        System.out.println(n);
    }
    
    public void getEnergy(Player p)
    {
        p.energy+=energy;
    }
    
    @Override
    public Image getImage()
    {
        return gambar;
    }
    public Rectangle getBounds()
    {
        return new Rectangle(x, y, width, height);
    }
}
