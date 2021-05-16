package edu.pingpong.gildedrose;

public class NormalItem implements Updateable{

    private Item item = null;

    NormalItem(String name, int sell_in, int quality){
        this.item = new Item(name, sell_in, quality);
    }

    @Override
    public String toString(){
        return item.toString();
    }

    Item getItem(){
        return this.item;
    }

    public String getName(){
        return item.getName();
    }

    public int getSell_in(){
        return item.getSell_in();
    }

    void setSell_in(){
        item.setSell_in();
    }

    public int getQuality(){
        return item.getQuality();
    }

    void computeQuality(int valor){
        if(getQuality() + valor > 50){
            item.setQuality(50);
        }
        else if(getQuality() + valor >= 0){
            item.setQuality(getQuality() + valor);
        }
        else{
            item.setQuality(0);
        }
    }

    @Override
    public void updateQuality(){
        if(getSell_in() > 0){
            computeQuality(-1);
        }
        else{
            computeQuality(-2);
        }
        setSell_in();
    }
}
