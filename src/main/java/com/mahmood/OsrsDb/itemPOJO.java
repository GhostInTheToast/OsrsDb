package com.mahmood.OsrsDb;

public class itemPOJO
{
    private int id;
    private int high;
    private int highTime; // UNIX time
    private int low;
    private int lowTime; // UNIX time

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getHigh()
    {
        return high;
    }

    public void setHigh(int high)
    {
        this.high = high;
    }

    public int getHighTime()
    {
        return highTime;
    }

    public void setHighTime(int highTime)
    {
        this.highTime = highTime;
    }

    public int getLow()
    {
        return low;
    }

    public void setLow(int low)
    {
        this.low = low;
    }

    public int getLowTime()
    {
        return lowTime;
    }

    public void setLowTime(int lowTime)
    {
        this.lowTime = lowTime;
    }
}
