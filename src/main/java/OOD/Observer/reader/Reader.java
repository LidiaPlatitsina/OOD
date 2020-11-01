package OOD.Observer.reader;

public class Reader {
    private String series;
    private int numBook =0;
    private String book;

    public Reader(String series, String book) {
        this.series = series;
        this.book = book;
    }

    public Reader(String series) {
        this.series = series;
    }

    public Reader(String series, int numBook) {
        this.series = series;
        this.numBook = numBook;
    }

    public String getSeries() {
        return series;
    }

    public int getNumBook() {
        return numBook;
    }

    public String getBook() {
        return book;
    }
}
