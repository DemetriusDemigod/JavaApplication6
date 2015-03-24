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
public class GraphicsCard extends Product{
    private enum chipset {
        GTX_960, GTX_970, GTX_980, GTX_Titan, R9_280, R2_280X, R2_290, R2_290X, R2_295X2
    }
    private enum formFactor {
        ATX, EATX, Micro_ATX, Mini_ITX
    }
    private enum manufacturer {
        Asus, EVGA, Gigabyte, MSI, Sapphire
    }
    private int VRAM;          /*4 GB*/
    private int coreClock;     /*1253 MHz*/
    private int memoryClock;   /*7 Gbps*/
    private boolean HDMI;      /*true if it supports HDMI*/
    private boolean displayPort;

    public int getVRAM() {
        return VRAM;
    }

    public void setVRAM(int VRAM) {
        this.VRAM = VRAM;
    }

    public int getCoreClock() {
        return coreClock;
    }

    public void setCoreClock(int coreClock) {
        this.coreClock = coreClock;
    }

    public int getMemoryClock() {
        return memoryClock;
    }

    public void setMemoryClock(int memoryClock) {
        this.memoryClock = memoryClock;
    }

    public boolean isHDMI() {
        return HDMI;
    }

    public void setHDMI(boolean HDMI) {
        this.HDMI = HDMI;
    }

    public boolean isDisplayPort() {
        return displayPort;
    }

    public void setDisplayPort(boolean displayPort) {
        this.displayPort = displayPort;
    }

    public GraphicsCard(int VRAM, int coreClock, int memoryClock, boolean HDMI, boolean displayPort, String name, BigDecimal price, Date releaseDate, int availability) {
        super(name, price, releaseDate, availability);
        this.VRAM = VRAM;
        this.coreClock = coreClock;
        this.memoryClock = memoryClock;
        this.HDMI = HDMI;
        this.displayPort = displayPort;
    }
    
}
