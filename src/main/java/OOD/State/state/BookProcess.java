package OOD.State.state;

import OOD.State.books.Book;

public class BookProcess implements IBookState {
    @Override
    public String getStateName() {
        return StatusName.PROCESS.getName();
    }

    @Override
    public void read(Book book) {
            int res = book.getNumberOfPages()-book.getNumOfReadPages();
            System.out.println("Осталось прочитать: "+ res);
    }
}
