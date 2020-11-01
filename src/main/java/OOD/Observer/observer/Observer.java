package OOD.Observer.observer;

import OOD.Observer.reader.Reader;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    private List<String> list;

    public void setNextBook(Reader reader)
    {
        if(reader.getSeries().equalsIgnoreCase("Гарри Поттер"))
        {
            nextBooKSeries(reader,listNP());
        }
        if (reader.getSeries().equalsIgnoreCase("Три мушкетера"))
        {
            nextBooKSeries(reader,listTM());
        }
        if (reader.getSeries().equalsIgnoreCase("Шерлок Холмс"))
        {
            nextBooKSeries(reader,listSH());
        }
    }

    public static void nextBooKSeries(Reader reader, List<String> list)
    {
        if(reader.getNumBook()==0)
        {
            if(null==reader.getBook())
            {
                System.out.println(list.get(0));
            }
            else{
                for (int i = 0; i < list.size(); i++) {
                    if(list.get(i).equalsIgnoreCase(reader.getBook())){
                        if(i+1<list.size())
                        {
                            System.out.println(list.get(i+1));
                        }
                        else {
                            System.out.println("Книги этой серии закончились(");
                        }
                    }
                }
            }
        }
        else
        {
            if(reader.getNumBook()<list.size())
            {
                System.out.println(list.get(reader.getNumBook()));
            }
            else {
                System.out.println("Книги этой серии закончились(");
            }
        }
    }


    public static List<String> listNP()
    {
        List<String> list = new ArrayList<>();
        list.add("Гарри Поттер и философский камень (1997)");
        list.add("Гарри Поттер и Тайная комната (1998)");
        list.add("Гарри Поттер и узник Азкабана (1999)");
        list.add("Гарри Поттер и Кубок огня (2000)");
        list.add("Гарри Поттер и Орден Феникса (2003)");
        list.add("Гарри Поттер и Принц-полукровка (2005)");
        list.add("Гарри Поттер и Дары Смерти (2007)");
        return list;
    }

    public static List<String> listTM()
    {
        List<String> list = new ArrayList<>();
        list.add("Три мушкетера (1844)");
        list.add("Двадцать лет спустя (1845)");
        list.add("Виконт де Бражелон, или Десять лет спустя (1847)");
        return list;
    }

    public static List<String> listSH()
    {
        List<String> list = new ArrayList<>();
        list.add("Этюд в багровых тонах (повесть, 1887)");
        list.add("Знак четырех (повесть, 1890)");
        list.add("Приключения Шерлока Холмса (сборник, 1891–1892)");
        list.add("Воспоминания Шерлока Холмса (Записки о Шерлоке Холмсе) (сборник, 1892–1893)");
        list.add("Возвращение Шерлока Холмса (сборник, 1903–1904)");
        list.add("Его прощальный поклон (сборник, 1893, 1908–1913, 1917)");
        list.add("Архив Шерлока Холмса (сборник, 1921–1927)");
        return list;
    }
}
