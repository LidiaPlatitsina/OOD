package OOD.FacadeAndSingleton.search;

import java.util.ArrayList;
import java.util.List;

public class Cinema {


    public static List<String> getList(String name)
    {
        List<String> list =new ArrayList<>();
        if (name.equalsIgnoreCase(Genre.IT.getName())) {
            list.add("Тринадцатый этаж (1999)");
            list.add("Робот по имени Чаппи (2015)");
            list.add("Люди (2015)");
            list.add("Матрица (1999)");
            list.add("Кто я (2014)");
            list.add("Хакеры (1995)");
        }
        if (name.equalsIgnoreCase(Genre.KIDS.getName()))
        {
            list.add("Король Лев (1994)");
            list.add("Зверополис (2016)");
            list.add("ВАЛЛ·И (2008)");
            list.add("Как приручить дракона (2010)");
            list.add("Холодное сердце (2013)");
            list.add("Жил-был пёс (1982)");
            list.add("Корпорация монстров (2001)");
        }
        if(name.equalsIgnoreCase(Genre.MATH.getName()))
        {
            list.add("Пи (1998)");
            list.add("Х+Y (2014)");
            list.add("Любимое уравнение профессора (2006)");
            list.add("Умница Уилл Хантинг (1997)");
            list.add("Игра в имитацию (2014)");
            list.add("Игры разума (2001)");
            list.add("Доказательство (2004)");
        }
        return list;
    }
}
