import java.util.Scanner;

public class QueueMaker 
{
    public static int songNum = 0;

    public static void main(String[] args)
    {
        Song[] songList = createSongList();
        Scanner scan = new Scanner(System.in);

        String end = "";

        while (end.toUpperCase() != "END") // currently picking random numbers and calculating score. 
        {
            int rand = (int)(Math.random() * songNum);

            System.out.println(songList[rand]);

            System.out.println("Type SKIP to skip this song. Type END to exit. Type anything else to play.");

            end = scan.next();

            if (end.toUpperCase().equals("SKIP")) 
            {
                songList[rand].skip();
                System.out.println("Song has been skipped");
            }
            else
            {
                songList[rand].play();
                System.out.println("Playing this song");
            } 
        }
    }
    
    public static Song[] createSongList()
    {
        StdIn.setFile("data.txt");
        StdOut.setFile("output.txt");

        songNum = StdIn.readInt();

        Song[] songList = new Song[songNum];

        for (int i = 0; i < songNum; i++)
        {
            String name = "";
            String artist = "";
            Boolean liked = false;
            String genre = "";
            int length = 0;

            for (int j = 0; j < 5; j++)
            {
                if (j == 0) name = StdIn.readString();
                else if (j == 1) artist = StdIn.readString();
                else if (j == 2) liked = StdIn.readBoolean();
                else if (j == 3) genre = StdIn.readString();
                else if (j == 4) length = StdIn.readInt(); 
            }

            Song newSong = new Song(name, artist, length, liked, genre);

            songList[i] = newSong;
        }

        return songList;
    }
}
