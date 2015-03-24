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
public class MobilePhone extends Product{
    private Processor CPU;
    private GraphicsCard GPU;
    private Monitor display;
    private Storage memory;

    public Processor getCPU() {
        return CPU;
    }

    public void setCPU(Processor CPU) {
        this.CPU = CPU;
    }

    public GraphicsCard getGPU() {
        return GPU;
    }

    public void setGPU(GraphicsCard GPU) {
        this.GPU = GPU;
    }

    public Monitor getDisplay() {
        return display;
    }

    public void setDisplay(Monitor display) {
        this.display = display;
    }

    public Storage getMemory() {
        return memory;
    }

    public void setMemory(Storage memory) {
        this.memory = memory;
    }

    public MobilePhone(Processor CPU, GraphicsCard GPU, Monitor display, Storage memory, String name, BigDecimal price, Date releaseDate, int availability) {
        super(name, price, releaseDate, availability);
        this.CPU = CPU;
        this.GPU = GPU;
        this.display = display;
        this.memory = memory;
    }

}
