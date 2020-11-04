package OOD.State.state;

import OOD.State.books.Book;

public interface IBookState {
    String getStateName();
    void read(Book book);
}
