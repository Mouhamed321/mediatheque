package mediatheque;

public class CatalogPrinter implements Visitor {
    @Override
    public void visit(Mediatheque mediatheque) {
        System.out.println("Catalogue complet :");
    }

    @Override
    public void visit(Book book) {
        System.out.println(book);
    }

    @Override
    public void visit(CD cd) {
        System.out.println(cd);
    }
}

public class BookPrinter implements Visitor {
    @Override
    public void visit(Mediatheque mediatheque) {
        System.out.println("Catalogue des livres :");
    }

    @Override
    public void visit(Book book) {
        System.out.println(book);
    }

    @Override
    public void visit(CD cd) {
        // Ne rien faire pour les CDs
    }
}

public class CDPrinter implements Visitor {
    @Override
    public void visit(Mediatheque mediatheque) {
        System.out.println("Catalogue des CDs :");
    }

    @Override
    public void visit(Book book) {
        // Ne rien faire pour les livres
    }

    @Override
    public void visit(CD cd) {
        System.out.println(cd);
    }
}