package com.mahmood.OsrsDb.Item;

public class itemPOJO
{
    private int id;
    private int high;
    private int highTime; // UNIX time
    private int low;
    private int lowTime; // UNIX time

    public itemPOJO(int id, int high, int highTime, int low, int lowTime)
    {
        this.id = id;
        this.high = high;
        this.highTime = highTime;
        this.low = low;
        this.lowTime = lowTime;
    }

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
