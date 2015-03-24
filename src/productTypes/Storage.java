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
public class Storage extends Product{ /*tha xwristei argotera se subclasses HDD kai SSD*/
    private enum Interface {
        SATA, PCIe, M2
    }
    private enum manufacturer {
        Crucial, Kingston, Plextor, Samsung, Sandisk, Seagate, Toshiba, Western_Digital    
    }
    private int capacity;    /*120 GB*/
    private int cache;       /*256 MB*/
    private int readSpeed;   /*540 MB/s*/
    private int writeSpeed;  /*520 MB/s*/

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCache() {
        return cache;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }

    public int getReadSpeed() {
        return readSpeed;
    }

    public void setReadSpeed(int readSpeed) {
        this.readSpeed = readSpeed;
    }

    public int getWriteSpeed() {
        return writeSpeed;
    }

    public void setWriteSpeed(int writeSpeed) {
        this.writeSpeed = writeSpeed;
    }

    public Storage(int capacity, int cache, int readSpeed, int writeSpeed, String name, BigDecimal price, Date releaseDate, int availability) {
        super(name, price, releaseDate, availability);
        this.capacity = capacity;
        this.cache = cache;
        this.readSpeed = readSpeed;
        this.writeSpeed = writeSpeed;
    }

    public Storage(int capacity, String name, BigDecimal price, Date releaseDate, int availability) {   /*Constructor for mobile phone memories*/
        super(name, price, releaseDate, availability);
        this.capacity = capacity;
    }
}
