public class Series extends Media
{
    int seasons;

    public Series(String name, int year, String[] genre, float rating, int seasons)
    {
        super(name, year, genre, rating);
        this.seasons = seasons;
    }

    public String toString()
    {
        return super.toString() + ", Type: Series, Seasons: " + seasons;
    }
}
