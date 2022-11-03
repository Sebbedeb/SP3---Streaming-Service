import java.util.Arrays;

abstract public class Media implements IMedia
{
    private String name;

    private int year;

    private String[] genre;

    private float rating;

    public Media(String name, int year, String[] genre, float rating)
    {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
    }
    public void play()
    {
        System.out.println("Now Playing " + name +"...");
    }

    @Override
    public String toString()
    {
        return "Media | " +
                "Name: " + name +
                ", Year: " + year +
                ", Genre: " + Arrays.toString(genre) +
                ", Rating: " + rating;
    }

    public String getName()
    {
        return name;
    }

    public int getYear()
    {
        return year;
    }

    public String[] getGenre()
    {
        return genre;
    }

    public float getRating()
    {
        return rating;
    }
}
