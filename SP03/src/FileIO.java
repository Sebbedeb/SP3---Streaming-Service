import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO
{


    public ArrayList<String> readMovieData()
    {
        File file = new File("Documents/intelli/SP3---Streaming-Service/SP03/Data/movieList.txt.csv");
        ArrayList<String> data = new ArrayList<>();
        try {
            Scanner input = new Scanner(file);

            while (input.hasNextLine())
            {
                data.add(input.nextLine());
            }
        }
        catch (FileNotFoundException e)
        {
            data = null;
        }
        return data;
    }

    public ArrayList<String> readSeriesData()
    {
        File file = new File("Documents/intelli/SP3---Streaming-Service/SP03/Data/seriesList.txt.csv");
        ArrayList<String> data = new ArrayList<>();
        try {
            Scanner input = new Scanner(file);

            while (input.hasNextLine())
            {
                data.add(input.nextLine());
            }
        }
        catch (FileNotFoundException e)
        {
            data = null;
        }
        return data;
    }


       /*
        public static void writeGameData(ArrayList<Player> players)
        {
            try {
                FileWriter writer = new FileWriter("Data/gamedata.csv");
                writer.write( "name, amount\n");

                for (Player p : players)
                {
                    writer.write(p.getName() + "," + p.getBalance()+"\n");
                }
                writer.close();
            } catch (IOException e) {
                System.out.println(e + "You fucked up mate");
            }
        }

        */

}
