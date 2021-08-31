package test;

import com.enverus.Fruit;
import com.enverus.FruitStoreItem;
import com.enverus.MyClass;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class UnitTests {

    @Test
    public void testAddItems() {
        try {
            FruitStoreItem item = new FruitStoreItem();
            item.setCost(1.0);
            item.setExpiry(new Date());
            item.setType(Fruit.APPLE);
            item.setOrigin("China");

            ArrayList<FruitStoreItem> items = new ArrayList<>();
            items.add(item);

            MyClass myClass = new MyClass();
            myClass.setItems(items);
        } catch (Throwable th) {
            Assert.fail(th.getMessage());
        }
    }

    @Test
    public void testNumApples() {
        try {
            FruitStoreItem item = new FruitStoreItem();
            item.setCost(1.0);
            item.setExpiry(new Date());
            item.setType(Fruit.APPLE);
            item.setOrigin("China");

            ArrayList<FruitStoreItem> items = new ArrayList<>();
            items.add(item);

            MyClass myClass = new MyClass();
            myClass.setItems(items);
            System.out.println(myClass.numItems(Fruit.APPLE));
        } catch (Throwable th) {
            Assert.fail(th.getMessage());
        }
    }

    @Test
    public void testNumItemsByType() {
        try {
            FruitStoreItem item = new FruitStoreItem();
            item.setCost(1.0);
            item.setExpiry(new Date());
            item.setType(Fruit.APPLE);
            item.setOrigin("China");

            ArrayList<FruitStoreItem> items = new ArrayList<>();
            items.add(item);

            MyClass myClass = new MyClass();
            myClass.setItems(items);
            Map<Fruit, Integer> map = myClass.numItemsByType();
            System.out.println(map.get(Fruit.APPLE));
        } catch (Throwable th) {
            Assert.fail(th.getMessage());
        }
    }

    @Test
    public void testFormatDate() {
        try {
            String s = "20210831";
            MyClass.getDate(s);
        } catch (Throwable th) {
            Assert.fail(th.getMessage());
        }
    }

    @Test
    public void testParseDate() {
        try {
            MyClass.getDateString(new Date());
        } catch (Throwable th) {
            Assert.fail(th.getMessage());
        }
    }

}
