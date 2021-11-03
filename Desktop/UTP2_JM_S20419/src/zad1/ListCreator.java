package zad1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ListCreator<T> {

    List<T> lista;

    public ListCreator(List<T> lista) {

        this.lista = lista;

    }


    public static <T> ListCreator<T> collectFrom(List<T> lista){

        return new ListCreator<>(lista);

    }

    public ListCreator<T> when(Predicate<T> function){

        List<T> lista2 = new ArrayList<>();

        for (T a: lista) {
            if (function.test(a)){
                lista2.add(a);
            }
        }
        this.lista = lista2;

        return this;

    }

    public <R> List<R> mapEvery(Function<T,R> function){

        List<R> lista3 = new ArrayList<>();

        for (T a: lista) {

            lista3.add(function.apply(a));

        }

        return lista3;
    }
}
