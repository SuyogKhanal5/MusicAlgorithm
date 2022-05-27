import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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

                int i = 0;
           
                // Initialize maximum element
                Double maxNum = songList[0].getScore();
                int maxSong = 0;
                
                // Traverse array elements from second and
                // compare every element with current max  
                for (i = 1; i < songList.length; i++)
                {
                    if (songList[i].getScore() > maxNum)
                    {
                        maxNum = songList[i].getScore();
                        maxSong = i;
                    }   
                }
                
                int num = 0;

                // this code is pretty bad as well

                if (sector == 0) num = nums0.remove(0);
                else if (sector == 1) num = nums1.remove(0);
                else if (sector == 2) num = nums2.remove(0);
                else if (sector == 3) num = nums3.remove(0);
                else if (sector == 4) num = nums4.remove(0);
                else if (sector == 5) num = nums5.remove(0);
                else if (sector == 6) num = nums6.remove(0);
                else if (sector == 7) num = nums7.remove(0);
                else if (sector == 8) num = nums8.remove(0);
                else if (sector == 9) num = nums9.remove(0);

                if (maxSong == 0) nums0.add(num);
                else if (maxSong == 1) nums1.add(num);
                else if (maxSong == 2) nums2.add(num);
                else if (maxSong == 3) nums3.add(num);
                else if (maxSong == 4) nums4.add(num);
                else if (maxSong == 5) nums5.add(num);
                else if (maxSong == 6) nums6.add(num);
                else if (maxSong == 7) nums7.add(num);
                else if (maxSong == 8) nums8.add(num);
                else if (maxSong == 9) nums9.add(num);
            }
            else if (end.toUpperCase() == "END") return;
            else
            {
                songList[sector].play();
                System.out.println("Playing this song");
            }
        }

        StdOut.setFile("output.txt");

        StdOut.println(songList);
        StdOut.println(nums0);
        StdOut.println(nums1);
        StdOut.println(nums2);
        StdOut.println(nums3);
        StdOut.println(nums4);
        StdOut.println(nums5);
        StdOut.println(nums6);
        StdOut.println(nums7);
        StdOut.println(nums8);
        StdOut.println(nums9);

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
