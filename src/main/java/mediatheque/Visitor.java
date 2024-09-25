package mediatheque;

public interface Visitor {
    void visit(Mediatheque mediatheque);
    void visit(Book book);
    void visit(CD cd);
}