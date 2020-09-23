public class User{
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    LinkedList<Playlist> playlist = new LinkedList<>();
    
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }    

    public void addToPlayList(Song song) {
        playlist.add(new playlist(song));
    }
     
  }






    