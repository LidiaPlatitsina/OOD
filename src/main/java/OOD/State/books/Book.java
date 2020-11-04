package OOD.State.books;

import OOD.State.state.BookEnd;
import OOD.State.state.BookProcess;
import OOD.State.state.BookStart;
import OOD.State.state.IBookState;

public class Book{
    private String name;
    private int numberOfPages;
    private int numOfReadPages;
    private IBookState bookState;

    public Book(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.bookState = new BookStart();
    }

    public Book(String name, int numberOfPages, int numOfReadPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.numOfReadPages = numOfReadPages;
        if(numOfReadPages==numberOfPages)
        {
            this.bookState = new BookEnd();
        }
        else {this.bookState = new BookProcess();
        }
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getNumOfReadPages() {
        return numOfReadPages;
    }

    public IBookState getBookState() {
        return bookState;
    }
}
