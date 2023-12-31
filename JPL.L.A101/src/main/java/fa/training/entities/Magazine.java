
package fa.training.entities;

public class Magazine extends Publication {
    private String author;
    private int volume;
    private int edition;

    public Magazine(int publicationYear, String publisher, String publicationDate, String author,
                    int volume, int edition) {
        super(publicationYear, publisher, publicationDate);
        this.author = author;
        this.volume = volume;
        this.edition = edition;
    }

    @Override
    public void display() {
        System.out.println("Magazine Author: " + author);
        System.out.println("Volume: " + volume);
        System.out.println("Edition: " + edition);
        System.out.println("Publication Year: " + getPublicationYear());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Publication Date: " + getPublicationDate());
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
}