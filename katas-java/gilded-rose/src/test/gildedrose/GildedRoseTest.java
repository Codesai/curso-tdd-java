package gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void decreases_quality_when_a_day_passes() {
        var app = new GildedRose(anItem(10, 10));

        app.updateQuality();

        assertEquals(9, app.items[0].quality);
    }

    @Test
    public void decreases_sell_in_when_a_day_passes() {
        var app = new GildedRose(anItem(10, 10));

        app.updateQuality();

        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    public void quality_is_never_lower_than_zero() {
        var app = new GildedRose(anItem(10, 0));

        app.updateQuality();

        assertEquals(0, app.items[0].quality);
    }

    @Test
    public void quality_degrades_twice_as_fast_when_sell_in_expires() {
        var app = new GildedRose(anItem(0, 10));

        app.updateQuality();

        assertEquals(8, app.items[0].quality);
    }

    @Test
    public void sulfuras_item_quality_never_decreases() {
        var app = new GildedRose(aSulfurasItem());

        app.updateQuality();

        assertEquals(80, app.items[0].quality);
    }

    @Test
    public void sulfuras_never_has_to_be_sold() {
        var app = new GildedRose(aSulfurasItem());

        app.updateQuality();

        assertEquals(80, app.items[0].sellIn);
    }

    @Test
    public void aged_brie_increases_its_quality_when_time_passes() {
        var app = new GildedRose(anAgedBrieItem(10, 10));

        app.updateQuality();

        assertEquals(11, app.items[0].quality);
    }

    @Test
    public void aged_brie_increases_its_quality_twice_when_sell_in_expires() {
        var app = new GildedRose(anAgedBrieItem(0, 10));

        app.updateQuality();

        assertEquals(12, app.items[0].quality);
    }

    @Test
    public void aged_brie_quality_is_never_more_than_50() {
        var app = new GildedRose(anAgedBrieItem(10, 50));

        app.updateQuality();

        assertEquals(50, app.items[0].quality);
    }

    @Test
    public void backstage_pass_increase_its_quality_when_sell_in_approaches() {
        var app = new GildedRose(aBackStagePassesItemWith(15, 10));

        app.updateQuality();

        assertEquals(11, app.items[0].quality);
    }

    @Test
    public void backstage_pass_increase_its_quality_twice_when_sell_in_is_less_than_10_days() {
        var app = new GildedRose(aBackStagePassesItemWith(10, 10));

        app.updateQuality();

        assertEquals(12, app.items[0].quality);
    }

    @Test
    public void backstage_pass_increase_its_quality_twice_when_sell_in_is_less_than_5_days() {
        var app = new GildedRose(aBackStagePassesItemWith(5, 10));

        app.updateQuality();

        assertEquals(13, app.items[0].quality);
    }

    @Test
    public void backstage_pass_quality_is_never_more_than_50() {
        var app = new GildedRose(aBackStagePassesItemWith(15, 50));

        app.updateQuality();

        assertEquals(50, app.items[0].quality);
    }

    @Test
    public void backstage_pass_drops_its_quality_to_zero_when_sell_in_expires() {
        var app = new GildedRose(aBackStagePassesItemWith(0, 10));

        app.updateQuality();

        assertEquals(0, app.items[0].quality);
    }

    private Item[] anItem(int sellIn, int quality) {
        return new Item[] { new Item("AnyItem", sellIn, quality) };
    }

    private Item[] anAgedBrieItem(int sellIn, int quality) {
        return new Item[] { new Item("Aged Brie", sellIn, quality) };
    }

    private Item[] aBackStagePassesItemWith(int sellIn, int quality) {
        return new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality) };
    }

    private Item[] aSulfurasItem() {
        return new Item[] { new Item("Sulfuras, Hand of Ragnaros", 80, 80) };
    }

}
