package org.sofka.sofware;

import org.sofka.sofware.utilities.Start;

import java.util.List;

public class Dividir extends Start {

    private List<Integer> list1;
    private List<Integer> list2;

    public Dividir(List<Integer> list1, List<Integer> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    @Override
    public void start() {
        dividir();
    }

    public void dividir(){
      Integer  lista1 = list1.stream().reduce(0, (acumulador, num) -> acumulador+num);
      Integer  lista2 = list2.stream().reduce(0, (acumulador, num) -> acumulador+num);
      if(lista2 != 0){
          Double total = lista1.doubleValue() / lista2.doubleValue();
          logMessage5(list1.toString(),"/", list2.toString(), "=", total.toString());
      }else{
          logMessage5(list1.toString(),"/", list2.toString(), "=", "No se pude dividir por 0");
      }
    }
}
