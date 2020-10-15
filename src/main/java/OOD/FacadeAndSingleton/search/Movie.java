package OOD.FacadeAndSingleton.search;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private List<String> list;

    public Movie(String type, String genre)
    {
        this.list = getRecommendation(type,genre);
    }

    public List<String> getRecommendation(String type, String genre)
    {

        List<String> result = new ArrayList<>();
        if (Type.series.getName().equalsIgnoreCase(type))
        {
            result = Series.getList(genre);
        }

        if(Type.cinema.getName().equalsIgnoreCase(type))
        {
            result = Cinema.getList(genre);
        }
        return result;
    }

    public void print() {
        for (String elem: list)
        {
            System.out.println(elem);
        }
    }
}
