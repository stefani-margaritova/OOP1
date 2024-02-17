import java.util.List;

public class Photo
{
    private int width;
    private int length;
    private int dpi;
    private String description;
    private List<String> peopleInPicture;

    public Photo(int width, int length, int dpi, String description, List<String> peopleInPicture)
    {
        this.width = width;
        this.length = length;
        this.dpi = dpi;
        this.description = description;
        this.peopleInPicture = peopleInPicture;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public void setDpi(int dpi)
    {
        this.dpi = dpi;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setPeopleInPicture(List<String> peopleInPicture)
    {
        this.peopleInPicture = peopleInPicture;
    }

    public int getWidth()
    {
        return width;
    }

    public int getLength()
    {
        return length;
    }

    public int getDpi()
    {
        return dpi;
    }

    public String getDescription()
    {
        return description;
    }

    public List<String> getPeopleInPicture()
    {
        return peopleInPicture;
    }

    public boolean isPrintable()
    {
        return length >= 585 && width >= 878 && dpi > 150;
    }

    public boolean isGroupPhoto()
    {
        return peopleInPicture.size() > 2;
    }
}
