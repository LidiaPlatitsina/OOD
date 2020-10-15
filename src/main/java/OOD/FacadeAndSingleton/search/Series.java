package OOD.FacadeAndSingleton.search;

import java.util.ArrayList;
import java.util.List;

public class Series {


    public static List<String> getList(String name)
    {
        List<String> list = new ArrayList<>();
        if(name.equalsIgnoreCase(Genre.IT.getName()))
        {
            list.add("Черное зеркало (2011-2017)");
            list.add("Доктор Кто (2005-2017)");
            list.add("Мистер Робот (2015-2017)");
            list.add("Кремниевая долина (2014-2017)");
            list.add("Компьютерщики (2006-2016)");
            list.add("Остановись и гори (2014-2017)");
            list.add("Человек будущего (2017)");
            list.add("Стартап (2016-2017)");
            list.add("Настоящие люди (2012-2013)");
            list.add("Скорпион (2014-2018)");
        }

        if(name.equalsIgnoreCase(Genre.KIDS.getName())){
            list.add("Ну, погоди! (1969 – 2006)");
            list.add("Маша и Медведь (2009 – ...)");
            list.add("Ералаш (1974-2017)");
            list.add("Папины дочки (2007-2011)");
            list.add("Фиксики (2010-...)");
            list.add("Смешарики (2004-...)");
        }

        if(name.equalsIgnoreCase(Genre.MATH.getName()))
        {
            list.add("4исла (2005 – 2010)");
            list.add("Что и требовалось доказать (2016)");
        }
        return list;
    }

}
