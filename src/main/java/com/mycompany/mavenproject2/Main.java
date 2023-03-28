/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import com.mycompany.mavenproject2.forms.Formulario;

/**
 *
 * @author Luciano
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
       Formulario ventana = new Formulario();
       ventana.show();
       
       //cienPrimos();
       
       
      
    }
    
    /*
        PARA CREAR UN ARREGLO:
    
        tipo_dato nombre = new tipo_dato[tamanio];
    
        OTRA FORMA:
    
        tipo_dato nombre[];
        nombre = new tipo_dato[tamanio]
    
        OTRA FORMA SIN TAMANIO (hay que importar las clases List y ArrayList):
        List<tipo_dato> nombre_lista = new ArrayList<tipo_dato>(); 
        lista.add(dato);
    */
    
    
    /*
    
    //FUNCION QUE DEVUELVE LOS 100 PRIMEROS NUMEROS PRIMOS
    
        private static void cienPrimos(){
           int i=0;
           int x=1;
           String str = "";


            while(i<100){

               if(esPrimo(x)){
                str += x + ", ";
                 i+=1;
                 x+=1;
               }
               else {
                   x+=1;
               }
            }

           System.out.println("Estos son los 100 primeros numeros primos: " + str );
        }
        */
    
    
    /*
        //FUNCION PARA SABER SI UN NUMERO ES PRIMO
       
    private static Boolean esPrimo(int num){
           
        Boolean esPrimo = true;
                              
        for (int h = 2; h < num; h++){
                if (num % h == 0){
                esPrimo = false;
                }
        }
        return esPrimo;
    }
    */
    
}
    
     
    
    
    
    
    
    
    
    

