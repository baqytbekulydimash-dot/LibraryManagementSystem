public abstract class LibraryItem {
    protected String title;
    protected boolean isAvailable = true;

    public LibraryItem(String title) {
        this.title = title;
    }

    public abstract String getInfo();

    public boolean borrow() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public void returnItem() {
        isAvailable = true;
    }
}