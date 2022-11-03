
public class ExceptionCatcher
{
    public static void wrongInput()
    {
        System.out.println("That input is not valid... please try again ");
    }

    // v maybe use this one below instead of the one above ^
    public static void indexOutOfBoundsException()
    {
        System.out.println("Index out of bounds!");
    }

    //TODO (idea) add fileNotFoundException to the FileIO class instead of data = null;
    public static void fileNotFoundException()
    {
        System.out.println("File not found");
    }

    public static void nullPointerExceptiontion()
    {
        System.out.println("Null pointer exception");
    }


    public static void ioException()
    {
        System.out.println("IO exception");
    }

}
