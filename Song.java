public class Song
{
    private String name;
    private String artist;
    private int length;
    private int played;
    private int skipped;
    private double score;
    private boolean liked;
    private int skipStreak;
    private String genre;

    public Song()
    {
        name = null;
        artist = null;
        length = 0;
        played = 0;
        skipped = 0;
        score = 0;
        liked = false;
        skipStreak = 0;
        genre = null;
    }

    public Song(String n, String a, int l, int p, int s, double sc, boolean li, int ss, String g)
    {
        name = n;
        artist = a;
        length = l;
        played = p;
        skipped = s;
        score = sc;
        liked = li;
        skipStreak = ss;
        genre = g;
    }

    public Song(String n, String a, int l, boolean li, String g)
    {
        name = n;
        artist = a;
        length = l;
        liked = li;
        genre = g;
    }

    public String getName()
    {
        return name;
    }

    public String getArtist()
    {
        return artist;
    }

    public int getLength()
    {
        return length;
    }

    public int getPlays()
    {
        return played;
    }

    public int skipNum()
    {
        return skipped;
    }

    public double getScore()
    {
        return score;
    }

    public boolean getLiked()
    {
        return liked;
    }

    public int getSkipStreak()
    {
        return skipStreak;
    }

    public String getGenre()
    {
        return genre;
    }

    public void resetStreak()
    {
        skipStreak = 0;
    }

    public void updateScore()
    {
        score = played / (played + skipped);
    }

    public void resetStats()
    {
        score = 0;
        played = 0;
        skipped = 0;
        liked = false;
    }

    public void like()
    {
        liked = true;
    }

    public void unlike()
    {
        liked = false;
    }

    public void play()
    {
        played++;
        resetStreak();
        updateScore();
    }

    public void skip()
    {
        skipped++;
        skipStreak++;
        updateScore();
    }

    public String toString()
    {
        return "{" + name + ", " + artist + ", " + liked + ", " + genre + ", " + length + "}"; 
    }
}