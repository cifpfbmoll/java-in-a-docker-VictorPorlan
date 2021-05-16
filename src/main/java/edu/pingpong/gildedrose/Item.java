package edu.pingpong.gildedrose;

public class Item {
    private final String name;
    private int sell_in;
    private int quality;

    Item(String name, int sell_in, int quality){
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    }

    @Override
    public String toString(){
        return this.getName() + " " + this.getSell_in() + " " + this.getQuality();
    }

    String getName(){
        return this.name;
    }

    int getSell_in(){
        return this.sell_in;
    }

    void setSell_in(){
        this.sell_in = this.getSell_in() -1;
    }

    int getQuality(){
        return this.quality;
    }
    
    void setQuality(int valor){
        this.quality = valor;
    }
}
