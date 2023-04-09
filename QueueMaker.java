import java.util.ArrayList;
import java.util.Scanner;

// need to rewrite this im not sure what exactly a lot of this is doing

public class QueueMaker {
    public static int songNum = 0;

    public static void main(String[] args) {
        Song[] songList = createSongList();
        Scanner scan = new Scanner(System.in);

        String end = "";

        int iterations = 0;
        int songSelect = 0;

        StdOut.setFile("output.txt");

        while (!(end.toUpperCase().equals("END")) && iterations != 30) // collect preliminary data
        {
            if (songSelect > songNum - 1)
                songSelect = 0;

            System.out.println(songList[songSelect]);

            System.out.println("Type SKIP to skip this song. Type END to exit. Type anything else to play.");

            end = scan.next();

            if (end.toUpperCase().equals("SKIP")) {
                songList[songSelect].skip();
                System.out.println("Song has been skipped");
            } else if (!end.toUpperCase().equals("END")) {
                songList[songSelect].play();
                System.out.println("Playing this song");
            }

            iterations++;
            songSelect++;
        }

        for (int i = 0; i < songNum; i++) {
            StdOut.println(songList[i]);
        }

        ArrayList<Integer>[] nums = new ArrayList[10];

        for (int i = 0; i < 10; i++) {
            nums[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < 100; i++) {
            String sector = i + "";
            int num = (int) (sector.charAt(0));

            nums[num].add(i);
        }

        StdOut.setFile("output.txt");

        StdOut.println(songList);

        for (int i = 0; i < 10; i++) {
            StdOut.println(nums[i]);
        }

        scan.close();
    }

    public static Song[] createSongList() {
        StdIn.setFile("data.txt");

        songNum = StdIn.readInt();

        Song[] songList = new Song[songNum];

        for (int i = 0; i < songNum; i++) {
            String name = "";
            String artist = "";
            Boolean liked = false;
            String genre = "";
            int length = 0;

            name = StdIn.readString();
            artist = StdIn.readString();
            liked = StdIn.readBoolean();
            genre = StdIn.readString();
            length = StdIn.readInt();

            Song newSong = new Song(name, artist, length, liked, genre);

            songList[i] = newSong;
        }

        return songList;
    }
}
