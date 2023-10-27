/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2023.solid;

/**
 *
 * @author miguelcatalan
 */
public class Billing {
    
    public void calcBilling() {
        //License b1 = new PersonalLicense();
        License b1 = new BusinessLicense();
    
        System.out.println("El precio de licencias es: " + b1.calcFee(100));
    }
}
