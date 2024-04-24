/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FF_Servive;

/**
 *
 * @author angon
 */
public class AddAction {
    public double hotdog;
    public double steak;
    public double hamburger;
    public double pizza;
    
    public double mojito;
    public double milkshake;
    public double cappuccino;
    public double icetea;
    
    public double foodprice;
    public double fluidprice;
    public double sum;
    
    public double Sum() {
        foodprice = hotdog + steak + hamburger + pizza;
        fluidprice = mojito + milkshake + cappuccino + icetea;
        return foodprice + fluidprice;
    }
    
    public double chotdog = 5;
    public double csteak = 5.5;
    public double chamburger = 8.5;
    public double cpizza = 7.5;
    
    public double cmojito = 6.5;
    public double cmilkshake = 6;
    public double ccappuccino = 7;
    public double cicetea = 3.5;
}
