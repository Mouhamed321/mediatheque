package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
    private final List<Item> items = new LinkedList<>();

    public void addItem(Item i) {
        items.add(i);
    }
    
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Item i : items) {
            i.accept(visitor);
        }
    }
    
    public void printCatalog() {
        accept(new CatalogPrinter());
    }
    
    public void printOnlyBooks() {
        accept(new BookPrinter());
    }

    public void printOnlyCDs() {
        accept(new CDPrinter());
    }
}
