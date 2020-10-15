package OOD.FacadeAndSingleton.facedeOrPatternSingleton;

import OOD.FacadeAndSingleton.search.Movie;

//Паттерн Одиночка

public final class SearchFacade {
    private static SearchFacade instance;

    private SearchFacade()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static SearchFacade getInstance()
    {
        if(instance ==null)
        {
            instance = new SearchFacade();
        }
        return instance;
    }

    public Movie getListCinema(String type,String genre)
    {
        return new Movie(type, genre);
    }

    public static void print(Movie movie)
    {
        movie.print();
    }

}
