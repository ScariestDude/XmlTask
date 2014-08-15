package xmlBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import xmlBuilder.dishes.Salad;
import xmlBuilder.dishes.Soup;

public class XMLBuilder {
    protected boolean setSoups() {
        Soup soup1 = new Soup("french onion soup", "12.30");
        Soup soup2 = new Soup("borscht", "8.75");
        Soup soup3 = new Soup("fish sup", "9.99");
        Soup soup4 = new Soup("cheese soup", "10.20");
        Soup soup5 = new Soup("pea soup", "8.90");
        return true;
    }

    protected boolean setSalads() {
        Salad salad1 = new Salad("Caesar", "13.86");
        Salad salad2 = new Salad("Greek salad", "12.43");
        Salad salad3 = new Salad("Potato salad", "8.23");
        Salad salad4 = new Salad("Vinegret", "9.35");
        Salad salad5 = new Salad("Chicken salad", "13.10");
        return true;
    }

    protected boolean putSoupsIntoMenu(Document menu, Element element) {
        Element soupsElement = menu.createElement("soups");
        element.appendChild(soupsElement);

        for (int i = 0; i < Soup.getCount(); i++) {
            Element soupElement = menu.createElement("soup");
            soupsElement.appendChild(soupElement);
            Element title = menu.createElement("title");
            title.appendChild(menu.createTextNode(Soup.getSoupTitleList().get(i)));
            soupElement.appendChild(title);
            Element price = menu.createElement("price");
            price.appendChild(menu.createTextNode(Soup.getSoupPriceList().get(i)));
            soupElement.appendChild(price);
        }
        return true;
    }

    protected boolean putSaladsIntoMenu(Document menu, Element element) {
        Element saladsElement = menu.createElement("salads");
        element.appendChild(saladsElement);

        for (int i = 0; i < Salad.getCount(); i++) {
            Element saladElement = menu.createElement("salad");
            saladsElement.appendChild(saladElement);
            Element title = menu.createElement("title");
            title.appendChild(menu.createTextNode(Salad.getSaladTitleList().get(i)));
            saladElement.appendChild(title);
            Element price = menu.createElement("price");
            price.appendChild(menu.createTextNode(Salad.getSaladPriceList().get(i)));
            saladElement.appendChild(price);
        }
        return true;
    }
}
