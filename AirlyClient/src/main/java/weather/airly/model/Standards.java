package weather.airly.model;

public class Standards
{
    private String name;

    private String limit;

    private String percent;

    private String pollutant;

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getLimit ()
    {
        return limit;
    }

    public void setLimit (String limit)
    {
        this.limit = limit;
    }

    public String getPercent ()
    {
        return percent;
    }

    public void setPercent (String percent)
    {
        this.percent = percent;
    }

    public String getPollutant ()
    {
        return pollutant;
    }

    public void setPollutant (String pollutant)
    {
        this.pollutant = pollutant;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [name = "+name+", limit = "+limit+", percent = "+percent+", pollutant = "+pollutant+"]";
    }
}
