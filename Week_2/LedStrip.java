public class LedStrip
{
    private int red;
    private int blue;
    private int green;
    private int dimmer;

    public LedStrip()
    {
        red = 0;
        blue = 0;
        green = 0;
        dimmer = 0;
    }

    public void setRed(int red)
    {
        this.red = red;
    }

    public void setBlue(int blue)
    {
        this.blue = blue;
    }

    public void setGreen(int green)
    {
        this.green = green;
    }

    public void setDimmer(int dimmer)
    {
        this.dimmer = dimmer;
    }

    public boolean setColorByName(String color)
    {
        switch (color.toLowerCase())
        {
            case "red":
                setRed(255);
                setBlue(0);
                setGreen(0);
                break;
            case "green":
                setRed(0);
                setBlue(0);
                setGreen(255);
            case "blue":
                setRed(0);
                setBlue(255);
                setGreen(0);
                break;
            case "purple":
                setRed(255);
                setBlue(255);
                setGreen(0);
                break;
            case "orange":
                setRed(255);
                setBlue(0);
                setGreen(165);
                break;
            case "sun":
                setRed(201);
                setBlue(38);
                setGreen(141);
                break;
            default:
                return false;
        }
        return true;
    }

    public int getRed()
    {
        return red;
    }

    public int getBlue()
    {
        return blue;
    }

    public int getGreen()
    {
        return green;
    }

    public int getDimmer()
    {
        return dimmer;
    }

    public String getColorByRgb (int red, int blue, int green)
    {
        return switch (String.valueOf(red) + String.valueOf(blue) + String.valueOf(green))
        {
            case "25500" -> "red";
            case "00255" -> "green";
            case "02550" -> "blue";
            case "2552550" -> "purple";
            case "2550166" -> "orange";
            case "20138141" -> "sun";
            default -> "Cannot define color name.";
        };
    }

    public boolean adjustDimmerPers (int percentage)
    {
        if (percentage < 100 && percentage >= 0) { //>= 0 doesnt workkkk
            int dimmerValue = (int) (percentage / 100.0) * 255;
            setDimmer(dimmerValue);
            return true;
        }
        else
        {
            return false;
        }
    }
}
