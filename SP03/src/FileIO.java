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
        File file = new File("Data/movieList.txt");
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
        File file = new File("Data/seriesList");
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



    public ArrayList<String> readUserData()
    {
        File file = new File("Data/userData.txt");
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

    public static void writeUserData()
    {
            try
            {
                Scanner input = new Scanner(System.in);
                FileWriter writer = new FileWriter("Data/userData.txt");
                System.out.println("Please write your name:");
                writer.write(input.nextLine() + ", ");
                System.out.println("Please write yout new password");
                writer.write(input.nextLine() + ", ");
                System.out.println("Thank you.");
                writer.close();

            }
            catch (IOException e)
            {
                System.out.println(e + "You fucked up mate");
            }
    }



}
