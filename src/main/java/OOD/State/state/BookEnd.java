package OOD.State.state;

import OOD.State.books.Book;

public class BookEnd implements IBookState{
    @Override
    public String getStateName() {
        return StatusName.END.getName();
    }

    @Override
    public void read(Book book) {
            System.out.println("Книга прочитана");
    }
}
