/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weapon;

/**
 *
 * @author SYARIF
 */
public class Weapon {
    protected Integer power;
    protected Double speed;
    
    public Weapon(){
        
    }
    public void Attack(){
        System.out.println("Weapon Attack With Power ="
                +this.power + "and speed"+this.speed );
    }
    protected Integer getPower(){
        return power;
    }
    protected void setPower(Integer power){
        this.power=power;
    }
    protected Double getSpeed(){
        return speed;
    }
    protected void setSpeed(Double speed){
        this.speed=speed;
    }
}
