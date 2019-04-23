package weather.airly.model;

public class Indexes {

    private String color;

    private String level;

    private String advice;

    private String name;

    private String description;

    private String value;

    public String getColor ()
    {
        return color;
    }

    public void setColor (String color)
    {
        this.color = color;
    }

    public String getLevel ()
    {
        return level;
    }

    public void setLevel (String level)
    {
        this.level = level;
    }

    public String getAdvice ()
    {
        return advice;
    }

    public void setAdvice (String advice)
    {
        this.advice = advice;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [color = "+color+", level = "+level+", advice = "+advice+", name = "+name+", description = "+description+", value = "+value+"]";
    }

}
