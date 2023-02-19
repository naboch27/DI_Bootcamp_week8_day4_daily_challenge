/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.ada.ci.packages;

import appconnexion.AppConnexion;


/**
 *
 * @author M.COULIBALY
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        AppConnexion appConnexion = new AppConnexion();
        
        appConnexion.connect();
        
        
    }
    
}
