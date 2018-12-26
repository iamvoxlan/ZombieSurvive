
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voxlan
 */
public class OffensiveItem  extends  Item{
    
    public int damage;
    
    private Image gambar= Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("lib/bomb.png")).getScaledInstance(20, 20, Image.SCALE_DEFAULT);;
    public int x=1000, y=340, dx=2, width=20, height=20;

    @Override
    public Image getImage() {
        return gambar;
    }
    
    public Rectangle getBounds()
    {
        return new Rectangle(x, y, width, height);
    }
    
}
