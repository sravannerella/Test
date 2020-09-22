import java.util.UUID;
impoert java.util.ArrayList;
public class Album{
    private String albumId;
    private String albumName;
    private String artist;
    
    ArrayList<Song> songs = new ArrayList<>();
    
    public Album(String albumName,String artist){
         albumId = UUID.nameUUIDFromBytes((albumName+artist).getBytes()).toString();
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
    public void addSong(String songTitle, String duration) {
        songs.add(new Song(songTitle, duration));
    }
    public int getSongsCount() {

        return this.songs.size();
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getArtist() {
        return artist;
    }

}