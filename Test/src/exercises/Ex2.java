/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.ArrayList;

/**
 *
 * @author Kamila
 */
public class Ex2 {
    
    
    
    public static void main(String[] args) {
        
    //in 1st contains elements of Fibonnaci Sequence and 2even numbers from this sequence
    ArrayList<Integer> lista1 = new ArrayList<Integer>();
    ArrayList<Integer> lista2 = new ArrayList<Integer>();
    lista1.add(0, 1);
    lista1.add(1, 2);
    int sum=0;
    int i=0;

    //Creating list which elements are Fibonacci sequence
        while((lista1.get(lista1.size()-1)+lista1.get(lista1.size()-2)) <=4000000){
            i=lista1.size();
            sum = lista1.get(i-1)+lista1.get(i-2);
            lista1.add(i,sum);
        }
    //Presenting list
        
        System.out.println("Fibonacci sequence whose values do not exceed four million: "+ "\n"+ lista1);
        
        System.out.println("List of even elements of sequence"+"\n"+sumOfElements(listOfEvenElements(lista1, lista2)));

    }
    
    //Function which creates list of even elements from the list
    
    public static ArrayList<Integer> listOfEvenElements(ArrayList<Integer> list,ArrayList<Integer> y){
        for(Integer element:list){
            if(element%2==0){
                y.add(element);
            }
        }
        return y;
    }
    
    
   //function which is sum of all elements from ArrayList   
    public static Integer sumOfElements(ArrayList<Integer> list){
        
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum = sum + list.get(i);
        }
        return sum;
    } 
    
}

//kamila bla
