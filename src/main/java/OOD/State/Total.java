package OOD.State;

import OOD.State.books.Book;

public class Total {
    public static void main(String[] args) {
        Book book=new Book("Маленький принц",256 );
        Book book1 = new Book("Дети капитана Гранта",512,233);
        Book book3 = new Book("Ромео и Джульетта",336,336);

        book.getBookState().read(book);
        System.out.println();
        book1.getBookState().read(book1);
        System.out.println();
        book3.getBookState().read(book3);
    }
}
