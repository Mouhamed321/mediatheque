package mediatheque;

public abstract class Item {
    private String title;

    protected Item(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void accept(Visitor visitor);

    @Override
    public String toString() {
        return title;
    }
}