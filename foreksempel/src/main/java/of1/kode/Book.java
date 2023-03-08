package of1.kode;

public class Book {

    private String title;
    private int pages;

    public Book(String title, int pages) {
        setTitle(title);
        setPages(pages);

    }

    // title

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // pages

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        if (pages <= 0) {
            this.pages = 0;
        } else {
            this.pages = pages;
        }
    }


    @Override
    public String toString() {
        return "The book" + " \"" + this.getTitle() + "\" " + "has" + " " + this.getPages() + " " + "pages";
    }

    public static void main(String[] args) {
        Book b1 = new Book("Got", 200);
        Book b2 = new Book("Big java", 800);
        Book b3 = new Book("Harry potter and the prisoner from Azkaban", 500);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);


        
        

    }
    

}
