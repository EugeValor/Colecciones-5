/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Paises;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author 54343
 */
public class ServicioPaises {
    Scanner leer = new Scanner(System.in);

    TreeSet <String> Pais = new TreeSet();
    
    public void crearPaises(){
       int opc;
        
        do{
        System.out.println("Ingrese el nombre del pais");
        String nombre = leer.next();
        Paises P1 = new Paises(nombre);
        Pais.add(nombre);
        System.out.println("Desaa agregas mas paises? 1-Si/2-No");
        opc = leer.nextInt();
        
        }while(opc==1);
        
    }
    
    public void mostrarPaises(){
        System.out.println("Los paises ingresados son: ");
        for (String Pai : Pais) {
           
            System.out.println(Pai);
            
        }
    }

    public void buscarPais(){
        System.out.println("Ingrese el Pais que desea eliminar de la lista");
        String buscador = leer.next();
        
        Iterator <String> it = Pais.iterator();
        
                while (it.hasNext()){
                    if(it.next().equalsIgnoreCase(buscador))
                        it.remove();
                 
                    else{
                System.out.println("El pais no se encuentra en la lista");
                
        System.out.println("Los paises que quedaron son: ");
        for (String Pai : Pais) {
            System.out.println(Pai);
            
        }
    }
    }}}
/*   
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.*/