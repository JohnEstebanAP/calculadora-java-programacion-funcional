package org.sofka.sofware;

import org.sofka.sofware.utilities.Start;

import java.util.List;

public class Restar extends Start {

    private List<Integer> list1;
    private List<Integer> list2;

    public Restar(List<Integer> list1, List<Integer> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    @Override
    public void start() {
        restar();
    }

    public void restar(){
      Integer  restaLista1 = list1.stream().reduce(0, (acumulador, numero) -> acumulador+numero);
      Integer  restaLista2 = list2.stream().reduce(0, (acumulador, numero) -> acumulador+numero);
      Integer totalResta = restaLista1 + restaLista2;

      logMessage5(list1.toString(),"+", list2.toString(), "=", totalResta.toString());
    }
}
