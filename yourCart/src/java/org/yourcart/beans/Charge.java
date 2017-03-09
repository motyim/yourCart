package org.yourcart.beans;

/**
 *
 * @author Nesmaa
 */
public class Charge {
    private String  card_number;
    private int value;
    private  int used ;
    private int taken;

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getUsed() {
        return used;
    }

    public void setUsed(int used) {
        this.used = used;
    }

    public int getTaken() {
        return taken;
    }

    public void setTaken(int taken) {
        this.taken = taken;
    }

    public Charge(String card_number, int value, int used, int taken) {
        this.card_number = card_number;
        this.value = value;
        this.used = used;
        this.taken = taken;
    }

    public Charge() {
    }
    
    
    
    
}
