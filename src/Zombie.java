
import java.awt.Image;
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
public class Zombie {
    
    private boolean moveState = true;
    public int x=100, y=250, dy=10;
    public Image spriteZombie = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("lib/zombie.gif")).getScaledInstance(120, 120, Image.SCALE_DEFAULT);
    
    public Image getImage()
    {
        return spriteZombie;
    }
}
