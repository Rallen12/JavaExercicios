package javaexercicio;

import java.util.ArrayList;
  import java.util.Arrays;

public class Convert {
  public static void  main(String[] args) 
  {
  String[]  my_array = new String[] {"Nuno", "Ana", "David",  "Joao", "Catarina", "Mario"};
  ArrayList  list = new ArrayList(Arrays.asList(my_array));
  
  System.out.println(list);
  }
}