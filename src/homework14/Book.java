package homework14;

import java.util.Objects;

public class Book {
        private final String bookname;
        private final Author author;
        private int publicationYear;

        public Book(String bookname, Author author, int publicationYear) {
            this.bookname = bookname;
            this.author = author;
            this.publicationYear = publicationYear;
        }

        public String getBookname() {
            return bookname;
        }

        public Author getAuthor() {
            return author;
        }

        public int getPublicationYear() {
            return publicationYear;
        }

        public void setPublicationYear(int publicationYear) {
            this.publicationYear = publicationYear;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || this.getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return publicationYear == book.publicationYear && Objects.equals(bookname, bookname) && Objects.equals(author, author);
        }

        @Override
        public int hashCode() {
            return Objects.hash(bookname, author, publicationYear);
        }

        @Override
        public String toString() {
            return "Book{" +
                    "bookname='" + bookname + '\'' +
                    ", author=" + author +
                    ", publicationYear=" + publicationYear +
                    '}';

        }
    }



