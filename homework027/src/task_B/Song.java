package task_B;

public class Song {
    private String nameSong;
    private String name;
    private String genre;
    private String textSong;

    public Song(){}
    public Song(String nameSong, String name, String genre, String textSong) {
        this.nameSong = nameSong;
        this.name = name;
        this.genre = genre;
        this.textSong = textSong;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTextSong() {
        return textSong;
    }

    public void setTextSong(String textSong) {
        this.textSong = textSong;
    }
}
