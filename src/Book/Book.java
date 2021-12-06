package Book;
import java.lang.*;

public class Book {
        private String genre;
        private String author;
        private int year;
        private int numberOfPages;

        public Book (String genre, String author, int year, int numberOfPages)
        {
            this.genre = genre;
            this.author = author;
            this.year = year;
            this.numberOfPages = numberOfPages;
        }
        public Book (String genre, String author, int year) {
            this.genre = genre;
            this.author = author;
            this.year = year;
            this.numberOfPages = 500;
        }
    public Book (String genre, String author) {
        this.genre = genre;
        this.author = author;
        this.year = 1989;
        this.numberOfPages = 500;
    }
        public Book (String genre)
        {
            this.genre = genre;
            this.author = "Dostoevsky";
            this.year = 1989;
            this.numberOfPages = 500;
        }
        public Book ()
        {
            this.genre = "Drama";
            this.author = "Dostoevsky";
            this.year = 1989;
            this.numberOfPages = 500;
        }

        public String getGenre() {
            return genre;
        }
        public void setGenre(String genre) {
            this.genre = genre;
        }
        public String getAuthor() {
            return author;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
        public int getYear() {
            return year;
        }
        public void setYear(int year) {
            this.year = year;
        }
        public int getNumberOfPages() {
            return numberOfPages;
        }
        public void setNumberOfPages(int numberOfPages) {
            this.numberOfPages = numberOfPages;
        }

    @Override
        public String toString() {
            return "Автор: " + author  + "\nЖанр: " + genre + "\nГод: "+ year + "\nКоличество страниц: " + numberOfPages;
        }
}
