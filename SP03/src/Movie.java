public class Movie extends Media
{
    public Movie(String name, int year, String[] genre, float rating)
    {
        super(name, year, genre, rating);
    }

    @Override
    public String toString()
    {
        return super.toString() + "Type: Movie";
    }

}
