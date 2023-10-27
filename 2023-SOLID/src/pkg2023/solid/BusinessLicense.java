/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2023.solid;

/**
 *
 * @author miguelcatalan
 */
public class BusinessLicense implements License{
    private int users = 100;
    
    public float calcFee(float unitLicenseCost) {
        return users * unitLicenseCost;
    }
}
