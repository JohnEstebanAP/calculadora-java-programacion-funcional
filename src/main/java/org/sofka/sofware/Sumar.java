package org.sofka.sofware;

import org.sofka.sofware.utilities.Start;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sumar extends Start {

    private List<Integer> list1;
    private List<Integer> list2;

    public Sumar(List<Integer> list1, List<Integer> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    @Override
    public void start() {
        sumar();
    }

    public void sumar(){
      Integer  sumaLista1 = list1.stream().reduce(0, (a, b) -> a+b);
      Integer  sumaLista2 = list2.stream().reduce(0, (a, b) -> a+b);
      Integer totalSuma = sumaLista1 + sumaLista2;

      //IntStream.range(0, list1.size()).filter(index -> players.get(index).contains("a")).forEach();

      logMessage5(list1.toString(),"+", list2.toString(), "=", totalSuma.toString());
    }
}
