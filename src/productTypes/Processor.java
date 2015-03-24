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
public class Processor extends Product{
    private enum socket {
        LGA1150, LGA1155, LGA2011
    }
    private enum manufacturer {
        AMD, Intel
    }
    private int cores;
    private int threads;
    private double clockSpeed;    /*3.90 GHz*/
    private double cache;         /*4.0 MB*/

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(double clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }
    
    public Processor(int cores, int threads, double clockSpeed, double cache, String name, BigDecimal price, Date releaseDate, int availability) {
        super(name, price, releaseDate, availability);
        this.cores = cores;
        this.threads = threads;
        this.clockSpeed = clockSpeed;
        this.cache = cache;
    }

    public Processor(int cores, double clockSpeed, String name, BigDecimal price, Date releaseDate, int availability) { /*Constructor for mobile phone CPUs*/
        super(name, price, releaseDate, availability);
        this.cores = cores;
        this.clockSpeed = clockSpeed;
    }
    
    
}
