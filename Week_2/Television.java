public class Television
{
    private String brand;
    private String model;
    private int currentVolume;
    private int currentChannel;
    private int childLockPin;

    public Television(String brand, String model)
    {
        this.brand = brand;
        this.model = model;
        currentChannel = 0;
        currentVolume = 0;
        childLockPin = 0;
    }

    public void setCurrentChannel(int channel)
    {
        this.currentChannel = channel;
    }

    public void setChildLockPin(int pin)
    {
        this.childLockPin = pin;
    }

    public String setChildLock(int pin)
    {
        if (pin > 10000 || pin < 0) {
            return "The pin can only be a four digit number.";
        }
        else
        {
            setChildLockPin(pin);
            return "Child lock has been set.";
        }
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setCurrentVolume(int currentVolume)
    {
        this.currentVolume = currentVolume;
    }

    public String getBrand()
    {
        return brand;
    }

    public String getModel()
    {
        return model;
    }

    public int getCurrentVolume()
    {
        return currentVolume;
    }

    public int getCurrentChannel()
    {
        return currentChannel;
    }

    public int getChildLockPin() {
        return childLockPin;
    }

    private void increaseVolume()
    {
        currentVolume++;
    }
    private void decreaseVolume()
    {
        currentVolume--;
    }

    private void increaseChannel()
    {
        currentChannel++;
    }
    private void decreaseChannel()
    {
        currentChannel--;
    }

    public String adjustVolume(String operator)
    {
        if (operator.equals("+"))
        {
            if (currentVolume == 100)
            {
                return "The maximum volume is already reached.";
            }
            else
            {
                increaseVolume();
            }
        }
        else if (operator.equals("-"))
        {
            if(currentVolume == 0)
            {
                return "The minimum volume is already reached.";
            }
            else
            {
                decreaseVolume();
            }
        }
        else
        {
            return "Invalid operator.";
        }

        return "Volume had been adjusted.";
    }

    public String adjustChannel(String operator)
    {
        if (operator.equals("+"))
        {
            if (currentChannel == 100)
            {
                return "The highest channel is already reached.";
            }
            else
            {
                increaseChannel();
            }
        }
        else if (operator.equals("-"))
        {
            if(currentChannel == 0)
            {
                return "The lowest channel is already reached.";
            }
            else
            {
                decreaseChannel();
            }
        }
        else
        {
            return "Invalid operator.";
        }

        return "Channel has been adjusted.";
    }

    public void changeChannelByNumber(int channel)
    {
        setCurrentChannel(channel);
    }

    public boolean hasChildLock()
    {
        return childLockPin != 0;
    }

    public String removeChildLock(int pin)
    {
        if (pin == childLockPin)
        {
            setChildLock(0);
            return "Child lock has been removed.";
        }
        else
        {
            return "The inputted pin is incorrect, please try again.";
        }
    }
}
