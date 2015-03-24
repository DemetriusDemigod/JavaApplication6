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
public abstract class Product {  /*abstract wste na min mporei na ftiaksei o xristis antikeimeno typou product*/
    private String name;
    private BigDecimal price;
    private Date releaseDate;
    private int availability;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public Product(String name, BigDecimal price, Date releaseDate, int availability) {
        this.name = name;
        this.price = price;
        this.releaseDate = releaseDate;
        this.availability = availability;
    }

}
