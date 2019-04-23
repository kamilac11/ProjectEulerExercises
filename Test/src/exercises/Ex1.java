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
public class Ex1 {
    
    
    
    
    public static void main(String[] args) {
        
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();
      
    //creating list with elements from 1 do 999
        for(int i = 1; i < 1000; i++){
            list1.add(i);
        }

    //Creating list with all numbers which are multiples of 3 or 5 below 1000
        for(int item : list1){
            for(int check : list1){
                if(item*3 == check || item*5 == check){
                    list2.add(check);
                }
            }
        } 
      //showing and sorting list, removing duplicates and returning sum of list elements
        System.out.println("This is list of multiples of 3 or 5 below 1000"+ "\n" + list2);
        System.out.println("This is sorted list"+"\n"+doSort(list2));
        System.out.println("This is list without duplicates"+ "\n" + removeDuplicate(doSort(list2)));
        System.out.println("Sum of all the multiples of 3 or 5 below 1000 (without duplicates: "+ sumOfElements(removeDuplicate(doSort(list2))));
        
        
        
    }
    
    
    
    
    
    
    
    
    
//function which is sum of all elements from ArrayList   
    public static Integer sumOfElements(ArrayList<Integer> list){
        
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum = sum + list.get(i);
        }
        return sum;
    }
    
//function which sorts elements in ArrayList in ascending order
    
    public static ArrayList<Integer> doSort(ArrayList<Integer> list){

        for(int i =0; i < list.size(); i++){
            for(int j=0; j < list.size() - 1 ; j++){
                if(list.get(j) > list.get(j+1)){
                    Integer temp = list.get(j);
                    list.set(j+1, list.get(j));
                    list.set(j, temp);
                    
                }
               
            }
        }
        return list;
        
    }
    //https://stackoverflow.com/questions/42042660/remove-duplicates-in-arraylist-java
    //modify this function - not working properly
    public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list){
        for(int j = list.size(); j>0; j--){
        for(int i = j-1; i >= 0; i--){
            if(list.get(i) == list.get(i+1)){
                list.remove(j);
                //list.set(i, list.get(i+1));
                
            }
        }
        }
        
        return list;
    }
    }
    
