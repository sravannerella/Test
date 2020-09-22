public class Album{
    private String albumId;
    private String albumName;
    String artist;
    LinkedList<Song> songs = new LinkedList<>();
    
    
    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }
    public String getAlbumId() {
        return albumId;
    }
    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
    public String getAlbumName() {
        return albumName;
    }
    public void addSong(String name, int duration) {
        songs.add(new Song(name, duration));
    }
    public void getSongsCount() {

        return this.songs.size();
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getArtist() {
        return artist;
    }

}