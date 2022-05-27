import java.util.ArrayList;
import java.util.Scanner;

public class QueueMaker 
{
    public static int songNum = 0;

    public static void main(String[] args)
    {
        Song[] songList = createSongList();
        Scanner scan = new Scanner(System.in);

        String end = "";

        int iterations = 0;
        int songSelect = 0;
        
        StdOut.setFile("preliminaryData.txt");

        while (end.toUpperCase() != "END" && iterations != 30) // collect preliminary data 
        {
            if (songSelect > songNum - 1) songSelect = 0;

            System.out.println(songList[songSelect]);

            System.out.println("Type SKIP to skip this song. Type END to exit. Type anything else to play.");

            end = scan.next();

            if (end.toUpperCase().equals("SKIP")) 
            {
                songList[songSelect].skip();
                System.out.println("Song has been skipped");
            }
            else
            {
                songList[songSelect].play();
                System.out.println("Playing this song");
            }
            
            iterations++;
            songSelect++;
        }

        for (int i = 0; i < songNum; i++)
        {
            StdOut.println(songList[i]);
        }

        // there's probably a way more elegant approach that don't waste run time or memory but who cares 

        ArrayList<Integer> nums0 = new ArrayList<>();
        ArrayList<Integer> nums1 = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();
        ArrayList<Integer> nums3 = new ArrayList<>();
        ArrayList<Integer> nums4 = new ArrayList<>();
        ArrayList<Integer> nums5 = new ArrayList<>();
        ArrayList<Integer> nums6 = new ArrayList<>();
        ArrayList<Integer> nums7 = new ArrayList<>();
        ArrayList<Integer> nums8 = new ArrayList<>();
        ArrayList<Integer> nums9 = new ArrayList<>();

        // also probably a better way to do this. this is going to add up quick. 

        for (int i = 0; i < 100; i++)
        {
            String sector = i + "";
            int num = (int)(sector.charAt(0));
            
            if (num == 0) nums0.add(i);
            else if (num == 1) nums1.add(i);
            else if (num == 2) nums2.add(i);
            else if (num == 3) nums3.add(i);
            else if (num == 4) nums4.add(i);
            else if (num == 5) nums5.add(i);
            else if (num == 6) nums6.add(i);
            else if (num == 7) nums7.add(i);
            else if (num == 8) nums8.add(i);
            else if (num == 9) nums9.add(i);
        }

        while (end.toUpperCase() != "END") // actual reccomendations 
        {
            int rand = (int)(Math.random() * 100);
            int sector = 0;
            
            // create ranges with variables. Whatever range correspondes
            if (nums0.contains(rand)) sector = 0;
            else if (nums1.contains(rand)) sector = 1;
            else if (nums2.contains(rand)) sector = 2;
            else if (nums3.contains(rand)) sector = 3;
            else if (nums4.contains(rand)) sector = 4;
            else if (nums5.contains(rand)) sector = 5;
            else if (nums6.contains(rand)) sector = 6;
            else if (nums7.contains(rand)) sector = 7;
            else if (nums8.contains(rand)) sector = 8;
            else if (nums9.contains(rand)) sector = 9;

            System.out.println(songList[sector]);

            System.out.println("Type SKIP to skip this song. Type END to exit. Type anything else to play.");

            end = scan.next();

            if (end.toUpperCase().equals("SKIP")) 
            {
                songList[sector].skip();
                System.out.println("Song has been skipped");
            }
            else
            {
                songList[sector].play();
                System.out.println("Playing this song");

                for (int i = 0; i < 9; i++)
                {
                    if (i != sector)
                    {
                        if (i == 0)
                        {
                            int num = nums0.remove(0);
                            
                            // oh my god i need to fix this later this is such bad code

                            // i am so sorry programming gods

                            if (sector == 0) nums0.add(num);
                            else if (sector == 1) nums1.add(num);
                            else if (sector == 2) nums2.add(num);
                            else if (sector == 3) nums3.add(num);
                            else if (sector == 4) nums4.add(num);
                            else if (sector == 5) nums5.add(num);
                            else if (sector == 6) nums6.add(num);
                            else if (sector == 7) nums7.add(num);
                            else if (sector == 8) nums8.add(num);
                            else if (sector == 9) nums9.add(num);
                        }
                        else if (i == 1)
                        {
                            int num = nums0.remove(0);

                            if (sector == 0) nums0.add(num);
                            else if (sector == 1) nums1.add(num);
                            else if (sector == 2) nums2.add(num);
                            else if (sector == 3) nums3.add(num);
                            else if (sector == 4) nums4.add(num);
                            else if (sector == 5) nums5.add(num);
                            else if (sector == 6) nums6.add(num);
                            else if (sector == 7) nums7.add(num);
                            else if (sector == 8) nums8.add(num);
                            else if (sector == 9) nums9.add(num);
                        }
                        else if (i == 2)
                        {
                            int num = nums0.remove(0);

                            if (sector == 0) nums0.add(num);
                            else if (sector == 1) nums1.add(num);
                            else if (sector == 2) nums2.add(num);
                            else if (sector == 3) nums3.add(num);
                            else if (sector == 4) nums4.add(num);
                            else if (sector == 5) nums5.add(num);
                            else if (sector == 6) nums6.add(num);
                            else if (sector == 7) nums7.add(num);
                            else if (sector == 8) nums8.add(num);
                            else if (sector == 9) nums9.add(num);
                        }
                        else if (i == 3)
                        {
                            int num = nums0.remove(0);

                            if (sector == 0) nums0.add(num);
                            else if (sector == 1) nums1.add(num);
                            else if (sector == 2) nums2.add(num);
                            else if (sector == 3) nums3.add(num);
                            else if (sector == 4) nums4.add(num);
                            else if (sector == 5) nums5.add(num);
                            else if (sector == 6) nums6.add(num);
                            else if (sector == 7) nums7.add(num);
                            else if (sector == 8) nums8.add(num);
                            else if (sector == 9) nums9.add(num);
                        }
                        else if (i == 4)
                        {
                            int num = nums0.remove(0);

                            if (sector == 0) nums0.add(num);
                            else if (sector == 1) nums1.add(num);
                            else if (sector == 2) nums2.add(num);
                            else if (sector == 3) nums3.add(num);
                            else if (sector == 4) nums4.add(num);
                            else if (sector == 5) nums5.add(num);
                            else if (sector == 6) nums6.add(num);
                            else if (sector == 7) nums7.add(num);
                            else if (sector == 8) nums8.add(num);
                            else if (sector == 9) nums9.add(num);
                        }
                        else if (i == 5)
                        {
                            int num = nums0.remove(0);

                            if (sector == 0) nums0.add(num);
                            else if (sector == 1) nums1.add(num);
                            else if (sector == 2) nums2.add(num);
                            else if (sector == 3) nums3.add(num);
                            else if (sector == 4) nums4.add(num);
                            else if (sector == 5) nums5.add(num);
                            else if (sector == 6) nums6.add(num);
                            else if (sector == 7) nums7.add(num);
                            else if (sector == 8) nums8.add(num);
                            else if (sector == 9) nums9.add(num);
                        }
                        else if (i == 6)
                        {
                            int num = nums0.remove(0);

                            if (sector == 0) nums0.add(num);
                            else if (sector == 1) nums1.add(num);
                            else if (sector == 2) nums2.add(num);
                            else if (sector == 3) nums3.add(num);
                            else if (sector == 4) nums4.add(num);
                            else if (sector == 5) nums5.add(num);
                            else if (sector == 6) nums6.add(num);
                            else if (sector == 7) nums7.add(num);
                            else if (sector == 8) nums8.add(num);
                            else if (sector == 9) nums9.add(num);
                        }
                        else if (i == 7)
                        {
                            int num = nums0.remove(0);

                            if (sector == 0) nums0.add(num);
                            else if (sector == 1) nums1.add(num);
                            else if (sector == 2) nums2.add(num);
                            else if (sector == 3) nums3.add(num);
                            else if (sector == 4) nums4.add(num);
                            else if (sector == 5) nums5.add(num);
                            else if (sector == 6) nums6.add(num);
                            else if (sector == 7) nums7.add(num);
                            else if (sector == 8) nums8.add(num);
                            else if (sector == 9) nums9.add(num);
                        }
                        else if (i == 8)
                        {
                            int num = nums0.remove(0);

                            if (sector == 0) nums0.add(num);
                            else if (sector == 1) nums1.add(num);
                            else if (sector == 2) nums2.add(num);
                            else if (sector == 3) nums3.add(num);
                            else if (sector == 4) nums4.add(num);
                            else if (sector == 5) nums5.add(num);
                            else if (sector == 6) nums6.add(num);
                            else if (sector == 7) nums7.add(num);
                            else if (sector == 8) nums8.add(num);
                            else if (sector == 9) nums9.add(num);
                        }
                        else if (i == 9)
                        {
                            int num = nums0.remove(0);

                            if (sector == 0) nums0.add(num);
                            else if (sector == 1) nums1.add(num);
                            else if (sector == 2) nums2.add(num);
                            else if (sector == 3) nums3.add(num);
                            else if (sector == 4) nums4.add(num);
                            else if (sector == 5) nums5.add(num);
                            else if (sector == 6) nums6.add(num);
                            else if (sector == 7) nums7.add(num);
                            else if (sector == 8) nums8.add(num);
                            else if (sector == 9) nums9.add(num);
                        }
                    }
                }
            }
        }

        StdOut.setFile("output.txt");
    }
    
    public static Song[] createSongList()
    {
        StdIn.setFile("data.txt");

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
