package edu.pingpong.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;


public class ItemTest {

    @Test
    public void constructor_item(){
        Item item = new Item("+5 Dexterity Vest", 10, 10);
        assertNotNull(item);
    }
    @Test
    public void toString_test(){
        Item item = new Item( "+5 Dexterity Vest", 10, 10);
        assertEquals("+5 Dexterity Vest 10 10", item.toString());

    }
}
