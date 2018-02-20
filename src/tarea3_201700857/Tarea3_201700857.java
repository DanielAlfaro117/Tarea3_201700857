/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_201700857;

import java.util.Scanner;

/**
 *
 * @author Bminas
 */
public class Tarea3_201700857 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b;
        String m1[] = {"1.Usuarios","2.Contador de dígitos","3.Tres números de mayor a menor","4.Calcular promedio","5.Salir"};//Sirve para poder hacer el primer menu
        String m2[] = {"1.Ingresar Usuarios","2.Mostrar Usuarios ascendente","3.Mostrar Usuarios descendente","4.Menu principal"};//Menu de los hnombres el cual se accede al ingresra el número 1
        String m3[] = {"1.Ingresar numero","2.Mostrar numero de digitos","4.Menu principal"};//Menu donde se muestran los digitos que tiene un número al cual se accede al ingresar el número 2
        String m4[] = {"1.Ingrsar números","2.Mostrar ordenados","4.Menu principal"};//Menu de números ordenados de mayor a menor al cual se accede al ingresar el número 3
        String nombres[] = new String[4];
        System.out.println("[IPC1]Tarea3_201700857\n");
      for (String elemento: m1)
          System.out.println(elemento);
      Scanner entrada = new Scanner(System.in);
      a = entrada.nextInt();
      switch (a){
          case 1:
              for (String menu2: m2)
                  System.out.println(menu2);
              b = entrada.nextInt();
              
              switch (b){
                  case 1:
                      nombres[0] = entrada.next();
                      nombres[1] = entrada.next();
                      nombres[2] = entrada.next();
                      nombres[3] = entrada.next();
                      nombres[4] = entrada.next();
                      break;
              }
              break;
              
          case 2:
              for (String menu3:m3)
                  System.out.println(menu3);
              break;
          
          case 3:
              for (String menu4:m4)
                  System.out.println(menu4);
              break;
          
          case 5:
              System.exit(0);
          
          default:
              System.exit(0);
      }
     
     
    }

}
