package org.sofka.sofware;

import org.sofka.sofware.utilities.Start;

import java.util.List;

public class Minimo extends Start {

  private List<Integer> list1;
  private List<Integer> list2;

  public Minimo(List<Integer> list1, List<Integer> list2) {
    this.list1 = list1;
    this.list2 = list2;
  }

  @Override
  public void start() {
    minimo();
  }

  public void minimo() {
    var lista1 = list1.stream().min(Integer::compare);
    var lista2 = list2.stream().min((num1, num2) -> num1.compareTo(num2));
    List<Integer> lista3 = List.of(lista1.get().intValue(), lista2.get().intValue());

    var minimo = lista3.stream().min(Integer::compare);

    logMessage4(list1.toString(), list2.toString(), "= El número mínimo entre las dos litas es el ", minimo.get().toString());
  }
}
