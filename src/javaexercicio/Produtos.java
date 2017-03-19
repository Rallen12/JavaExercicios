package javaexercicio;





import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author Ruben
 */
public class Produtos {
    private static Scanner dataIn = new Scanner(System.in);

    
    public static void addrandstock (ArrayList<String> list) {
    
 list.add("Leite");
 list.add("Queijo");
 list.add("Arroz");
    }
            
     public static void addmanstock (ArrayList<String> list) {
     Scanner dataIn2 = new Scanner(System.in);
         int a;
      String b;
System.out.print(" insira o Produto a adicionar :  ");
        b = dataIn2.nextLine();
 list.add(b);

 
    }
     
     public static void liststock (ArrayList<String> list) {
      
         list.forEach((object) -> {
             System.out.println(object);
        });
}
    
     
     public static void removestock (ArrayList<String> list) {
      int i = 0; 
    System.out.print(" insira o Produto a eliminar :  ");
        i = dataIn.nextInt();
         list.remove(i);
    }
    
    public static void main(String[] args) {
ArrayList<String> lista = new ArrayList<>();
        int l = 1;
        
while(true){
System.out.print("o que pretende fazer? :\n 0 - Inserir produtos prefeitos\n 1 - Inserir produto manualmente\n 2 - Listar produtos \n 3 - remover produto \n 4 - sair ");
l = dataIn.nextInt();
        
            
switch (l){
        case 0:  
                Produtos.addrandstock(lista);     break;
        case 1:  
                Produtos.addmanstock(lista);     break;
        case 2:  
                Produtos.liststock(lista);     break;
        case 3:  
                Produtos.removestock(lista);     break;
        case 4:  System.exit(0);
                     break;
                     
                  
    
    
}
    }
    } 
}
