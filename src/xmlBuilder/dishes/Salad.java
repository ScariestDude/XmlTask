package xmlBuilder.dishes;

import java.util.ArrayList;
import java.util.List;

public class Salad {
    private static int count = 0;
    private String title;
    private String price;

    private static List<String> saladTitleList = new ArrayList<String>();
    private static List<String> saladPriceList = new ArrayList<String>();

    {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public Salad(String title, String price) {
        this.title = title;
        this.price = price;
        saladTitleList.add(title);
        saladPriceList.add(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public static List<String> getSaladTitleList() {
        return saladTitleList;
    }

    public static List<String> getSaladPriceList() {
        return saladPriceList;
    }
}
