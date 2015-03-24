/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productTypes;

import static java.lang.Math.sqrt;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Dimitris
 */
public class Monitor extends Product {
    private enum resolution {
        HD, Full_HD, WQHD, QFHD, 
    }
    private enum type {
        IPS, VA, TN
    }
    private enum manufacturer {
        Acer, AOC, Asus, Dell, LG, Samsung
    }
    private int horizontalResolution;   /*1920*/
    private int verticalResolution;     /*1080*/
    private double screenSize;          /*27 inches*/
    private double pixelDensity = sqrt(horizontalResolution^2 + verticalResolution^2)/screenSize;   /*108.8 ppi*/
    private int responseTime;           /*5 ms*/
    private int refreshRate;            /*60 Hz*/
    private int brightness;             /*350 cd/m^2*/
    private boolean speakers;           /*true if it has built-in speakers*/
    private boolean HDMI;               /*true if it supports HDMI*/
    private boolean displayPort;

    public int getHorizontalResolution() {
        return horizontalResolution;
    }

    public void setHorizontalResolution(int horizontalResolution) {
        this.horizontalResolution = horizontalResolution;
    }

    public int getVerticalResolution() {
        return verticalResolution;
    }

    public void setVerticalResolution(int verticalResolution) {
        this.verticalResolution = verticalResolution;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public double getPixelDensity() {
        return pixelDensity;
    }

    public int getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(int responseTime) {
        this.responseTime = responseTime;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public boolean isSpeakers() {
        return speakers;
    }

    public void setSpeakers(boolean speakers) {
        this.speakers = speakers;
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

    public Monitor(int horizontalResolution, int verticalResolution, double screenSize, int responseTime, int refreshRate, int brightness, boolean speakers, boolean HDMI, boolean displayPort, String name, BigDecimal price, Date releaseDate, int availability) {
        super(name, price, releaseDate, availability);
        this.horizontalResolution = horizontalResolution;
        this.verticalResolution = verticalResolution;
        this.screenSize = screenSize;
        this.responseTime = responseTime;
        this.refreshRate = refreshRate;
        this.brightness = brightness;
        this.speakers = speakers;
        this.HDMI = HDMI;
        this.displayPort = displayPort;
    } 

    public Monitor(int horizontalResolution, int verticalResolution, double screenSize, String name, BigDecimal price, Date releaseDate, int availability) { /*Constructor for mobile phone displays*/
        super(name, price, releaseDate, availability);
        this.horizontalResolution = horizontalResolution;
        this.verticalResolution = verticalResolution;
        this.screenSize = screenSize;
    }
    
    
}
