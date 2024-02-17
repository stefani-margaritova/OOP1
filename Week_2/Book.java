public class Book
{
    private String name;
    private String author;
    private boolean isHardcover;
    private double price;
    private int numberOfPages;
    private int timesRead;

    public Book (String name, String author, boolean isHardcover, double price, int numberOfPages)
    {
        this.name = name;
        this.author = author;
        this.isHardcover = isHardcover;
        this.price = price;
        this.numberOfPages = numberOfPages;
        timesRead = 0;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setHardcover(boolean hardcover)
    {
        isHardcover = hardcover;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setNumberOfPages(int numberOfPages)
    {
        this.numberOfPages = numberOfPages;
    }

    public void setTimesRead(int timesRead)
    {
        this.timesRead = timesRead;
    }

    public String getName()
    {
        return name;
    }

    public String getAuthor()
    {
        return author;
    }

    public double getPrice()
    {
        return price;
    }

    public int getNumberOfPages()
    {
        return numberOfPages;
    }

    public int getTimesRead()
    {
        return timesRead;
    }

    public double getAverageReadTime()
    {
        double averageTime;
        averageTime = numberOfPages * 0.8;

        return averageTime;
    }

    public void Read()
    {
        timesRead+=1;
    }

    public boolean isHardcover()
    {
        return isHardcover;
    }

    public String isReadableByReadTime()
    {
        double averageTime = getAverageReadTime();

        if(averageTime < 61) {
            return "You can read this.";
        }
        else if (averageTime > 60 && averageTime < 240)
        {
            return "Are you sure you want to read this now?";
        }
        else
        {
            return "You should not start reading this right now";
        }
    }

}
