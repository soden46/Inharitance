/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gun;
import weapon.Weapon;
/**
 *
 * @author SYARIF
 */
public class Gun extends Weapon {
    private Double accuration;
    private String type;
    
    public Gun(Integer power, Double speed, Double accuration, String type){
        super();
        super.power=power;
        super.speed=speed;
        this.accuration=accuration;
        this.type=type;
    }
    public Double getAccuration(){
       return accuration;
    }
    public void setAccuration(Double accuration){
        this.accuration=accuration;
    }
    public String geType(){
        return type;
    }
    public void setType(String Type){
        this.type=type;
    }
    public void info(){
        System.out.println("Weapon -> Arrow Accuration");
        System.out.println("Powe ="+super.getPower());
        System.out.println("Speed ="+super.getSpeed());
        System.out.println("Accuration ="+this.accuration);
        System.out.println("Type ="+this.type);
    }
}
