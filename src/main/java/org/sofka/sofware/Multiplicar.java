package org.sofka.sofware;

import org.sofka.sofware.utilities.Start;

import java.util.List;

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

    public void multiplicar(){
      Integer  lista1 = list1.stream().reduce(0, (acumulador, num) -> acumulador + num);
      Integer  lista2 = list2.stream().reduce(0, (acumulador, num) -> acumulador + num);
      Integer total = lista1 * lista2;

      logMessage5(list1.toString(),"*", list2.toString(), "=", total.toString());
    }
}
