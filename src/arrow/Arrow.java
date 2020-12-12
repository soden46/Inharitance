/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrow;
import weapon.Weapon;
/**
 *
 * @author SYARIF
 */

public class Arrow extends Weapon {
    private Double accuration;
public Arrow(Integer power,Double speed,Double accuration){
    super();
    super.setPower(power);
    super.setSpeed(speed);
    this.accuration=accuration;
    
}   
public Double getaccuration(){
    return accuration;
}
public void setaccuration(Double accuration){
    this.accuration=accuration;
}
public void info(){
    System.out.println("Weapon -> Arrow information");
    System.out.println("Power ="+super.getPower());
    System.out.println("speed ="+super.getSpeed());
    System.out.println("accuration="+this.accuration);
}
}
