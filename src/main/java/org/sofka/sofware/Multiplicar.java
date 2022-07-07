package org.sofka.sofware;

import org.sofka.sofware.utilities.Start;

import java.util.List;
import java.util.stream.IntStream;

public class Multiplicar extends Start {

    private List<Integer> list1;
    private List<Integer> list2;

    public Multiplicar(List<Integer> list1, List<Integer> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    @Override
    public void start() {
        multiplicar();
    }

    public Boolean multiplicar(){
        if(list1.size() == list2.size()){
            var total= IntStream.range(0, list1.size()).mapToObj((index) -> (list1.get(index) * list2.get(index))).toList();
            logMessage5(list1.toString(),"*", list2.toString(), "=", total.toString());
            return true;
        }
        log("La cantidad de elementos de la lista 1 debe ser igual a la cantidad de la lista 2 ");
        return false;
    }
}
