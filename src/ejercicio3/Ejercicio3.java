/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Erika Rodriguez
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        ArrayList<Integer> par= new ArrayList<>();
        ArrayList<Integer> impar= new ArrayList<>();

        System.out.println("Cuantos numeros desea ingresar?: ");
        int num = in.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese un numero: ");
            lista.add(in.nextInt());
        }

        System.out.println("Su lista es: " + lista);
        int suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i);
        }
        System.out.println("La suma es: " + suma);
        double media = 0;

        for (int i = 0; i < lista.size(); i++) {
            media = suma / lista.size();
        }
        System.out.println("La media es: " + media);
        
        for(int i=0; i<lista.size(); i++){
            if (lista.get(i)%2==0){
                par.add(lista.get(i));
            }else{
                impar.add(lista.get(i));
            }
        }
        for(int i=0;i<par.size();i++){
            System.out.println("Los pares son: "+par.get(i));
        }
        for(int i=0;i<impar.size();i++){
            System.out.println("Los impares son: "+impar.get(i));
        }

    }
}
