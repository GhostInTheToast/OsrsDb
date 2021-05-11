package com.mahmood.OsrsDb.Item;

public class ItemIdPOJO
{
    private int id;
    private String name;

    public ItemIdPOJO()
    {
    }

    public ItemIdPOJO(int id)
    {
        this.id = id;
    }

    public ItemIdPOJO(String name)
    {
        this.name = name;
    }

    public ItemIdPOJO(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ItemIdPOJO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

