public class Main2{
    public static void main(String[] args) {
        
        MusicBox mbox = new MusicBox("S34TG65", 'N', "Raindrops", "Misty", 
        "The path less traveled", "Country", "BZEE Music", "Rhythm Divine");

        System.out.println("Now playing the song");
        mbox.playSong(mbox.getSongID(), mbox.getPremiumSong(), 1);
        

    }
}

