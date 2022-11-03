import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {

        FileIO file = new FileIO();

        System.out.println(file.readMovieData());
        System.out.println();
        System.out.println(file.readSeriesData());
        System.out.println();
        System.out.println(file.readUserData());

    }
}