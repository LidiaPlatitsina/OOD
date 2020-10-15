package OOD.FacadeAndSingleton;

import OOD.FacadeAndSingleton.facedeOrPatternSingleton.SearchFacade;

import java.util.Scanner;

import static OOD.FacadeAndSingleton.facedeOrPatternSingleton.SearchFacade.print;

public class Total {

    public static void main(String[] args) {
        SearchFacade searchFacade = SearchFacade.getInstance();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите жанр (Про программистов, Для детей, Про математиков)");
        String genre = in.nextLine();
        System.out.println("Введите тип (Сериал, Фильм)");
        String type =in.nextLine();
        print(searchFacade.getListCinema(type,genre));
    }
}
