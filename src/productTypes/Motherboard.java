/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productTypes;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Dimitris
 */
public class Motherboard extends Product{
    private enum chipset {
        B85, C224, C226, H81, H87, H97, Q87, X79, X99, Z87, Z97
    }
    private enum socket {
        LGA1150, LGA1155, LGA2011
    }
    private enum formFactor {
        ATX, EATX, MicroATX, MiniITX
    }
    private enum manufacturer {
        ASrock, Asus, EVGA, Gigabyte, MSI
    }
    private boolean wifi;   /*true if it supports Wi-Fi*/

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
    
    public Motherboard(boolean wifi, String name, BigDecimal price, Date releaseDate, int availability) {
        super(name, price, releaseDate, availability);
        this.wifi = wifi;
    }
    
}
