package com.enverus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MyClass {
    private Logger logger = LoggerFactory.getLogger(MyClass.class);
    private static SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd");
    private ArrayList<FruitStoreItem> items = new ArrayList<FruitStoreItem>();

    public ArrayList<FruitStoreItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<FruitStoreItem> items) {
        this.items = items;
    }

    public int numItems() {
        return items.size();
    }

    public int numItems(Fruit t) {
        int sum = 0;
        String msg = null;
        for (int i = 0; i <= items.size() - 1; i++) {
            FruitStoreItem tmp = items.get(i);
            if (tmp.getType() == t)
                msg = (i == 0) ? tmp.getOrigin() : msg + ", " + tmp.getOrigin();
                sum = sum + 1;
        }
        logger.debug("Found "+msg);
        return sum;
    }

    public Map<Fruit, Integer> numItemsByType() {
        Map<Fruit, Integer> tmp = new HashMap<>();
        for (Fruit fruit : Fruit.values()) {
            tmp.put(fruit, numItems(fruit));
        }
        return tmp;
    }

    public static String getDateString(Date d) { return f.format(d); }

    public static Date getDate(String s) {
        try {
            return f.parse(s);
        } catch (Throwable e) {
        }
        return null;
    }

}
