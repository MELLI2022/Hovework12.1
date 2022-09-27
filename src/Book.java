public class Book {

    private String name;
    private String Author;
    private int yearPubliching;

    public Book(String name, String author, String yearPubliching) {
        this.name = "Жизнь";
        this.Author = "Ivanov";
        this.yearPubliching = Integer.parseInt("2022");
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.Author;
    }

    public int getyearPubliching() {
        return this.yearPubliching;
    }
    public void setYearPubliching(String YearPubliching ){
        this.yearPubliching = Integer.parseInt(YearPubliching);
    }


}
