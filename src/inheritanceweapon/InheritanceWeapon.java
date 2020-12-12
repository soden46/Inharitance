/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceweapon;
import arrow.Arrow;
import gun.Gun;
/**
 *
 * @author SYARIF
 */
public class InheritanceWeapon {
static Arrow arrow1, arrow2;
static Gun gun1, gun2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        arrow1 =new Arrow(10, 8.5, 7.9);
        arrow2 = new Arrow(9, 9.2, 9.0);
        
        gun1 = new Gun(10, 8.8, 7.5, "Auto");
        gun2 = new Gun(8, 8.2,9.0, "Manual");
        
        arrow1.info();

        
        gun1.info();
        
        
    }
    
}
