public class FileIO
{
<<<<<<< Updated upstream
}
=======


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
        File file = new File("Data/seriesList.txt");
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
                FileWriter writer = new FileWriter("Data/userData.txt", true);
                System.out.println("Please write your name:");
                writer.write(input.nextLine() + ", ");
                System.out.println("Please write your new password");
                writer.write(input.nextLine() + ", \n");
                System.out.println("Thank you.");
                writer.close();

            }
            catch (IOException e)
            {
                System.out.println(e + "You fucked up mate");
            }
    }
}
>>>>>>> Stashed changes
