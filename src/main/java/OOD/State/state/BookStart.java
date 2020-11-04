package OOD.State.state;

import OOD.State.books.Book;

public class BookStart implements IBookState {
    @Override
    public String getStateName() {
        return StatusName.START.getName();
    }

    @Override
    public void read(Book book) {
        System.out.println("Колличество страниц в книги: "+book.getNumberOfPages());
        System.out.println("Приятного чтения");
    }
}
