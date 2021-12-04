package Book;
import java.lang.*;

public class Book {
        private String genre;
        private String author;

        public Book (String g, String a)
        {
            genre = g;
            author = a;
        }
        public Book (String g)
        {
            genre = g;
            author = "Dostoevsky";
        }
        public Book ()
        {
        genre = "Drama";
        author = "Dostoevsky";
        }

        public void setAuthor(String author) {
            this.author = author;
        }
        public void setColor(String color) {
            this.genre = genre;
        }

        public String getGenre(String genre) {
            return genre;
        }
        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return "Genre " + this.genre + ", Author " + this.author + "\n";
        }
    }
