package xmlBuilder.dishes;

import java.util.ArrayList;
import java.util.List;

public class Soup {
    private static int count = 0;
    private String title;
    private String price;

    private static List<String> soupTitleList = new ArrayList<String>();
    private static List<String> soupPriceList = new ArrayList<String>();

    {
        count++;
    }

    public Soup(String title, String price) {
        this.title = title;
        this.price = price;
        soupTitleList.add(title);
        soupPriceList.add(price);
    }

    public static int getCount() {
        return count;
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

    public static List<String> getSoupTitleList(){
        return soupTitleList;
    }

    public static List<String> getSoupPriceList() {
        return soupPriceList;
    }
}
