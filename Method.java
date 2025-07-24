/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraysummer;
import java.util.*;
/**
 *
 * @author Abu-Khaleil
 */
import java.util.Random;
public class Method {
    public static void main(String[] args) {
        ArrayList <Integer> a=new ArrayList<>();
        a.add(1);
a.add(1);
a.add(2);
a.add(2);   
a.add(1); 
 ArrayList <Integer> b=new ArrayList<>();
 b.add(1);
 b.add(2);
 b.add(3);
  b.add(4);
   b.add(5);

 ArrayList<Character> c= new ArrayList<>();
 c.add('c');
 c.add('a');
 c.add('b');
 
 System.out.println(duplicate(a));
        System.out.println(largest(a));
        System.out.println("common"+commen(a,b));
        System.out.println("REV"+reverse2pionters(c));
        palindrome(b);
        System.out.println(isSUB(a,b));
        System.out.println(movezero(b));
        System.out.println(bubleSort(b));
        System.out.println( rotateRight(b,3));
        System.out.println(shuffle(b));
    }
    public static ArrayList<Integer> duplicate(ArrayList<Integer> a){
        ArrayList<Integer> dup=new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            for (int j = i+1; j <a.size(); j++) {
                if (Objects.equals(a.get(i), a.get(j))&&! dup.contains(a.get(i)))dup.add(a.get(i));
                
            }
 
        }
        return dup;
    }
 public static int largest( ArrayList<Integer>a){
     int x=a.get(0);
            for (int i = 0; i < a.size(); i++) {
                if(a.get(i)>x) x=a.get(i);
            }
            return x;
 }
 public static ArrayList <Integer> commen(ArrayList<Integer>a , ArrayList<Integer>b){
     ArrayList <Integer> common=new ArrayList<>();
     for (int i = 0; i < a.size(); i++) {
         for (int j = 0; j < b.size(); j++) {
             if(a.get(i).equals(b.get(j))&&!common.contains(a.get(i)))common.add(a.get(i));
         }
   // if(a.contains(b.get(j) && !common.contains(a.get(i))
         
     }
     return common;
 }
 public static ArrayList<Character> reverse2pionters(ArrayList<Character>a){
   //first pointer 
   int i=0;
   //second pointer 
   int j=a.size()-1;
     while(i<j){
         char temp=a.get(i);
    
         a.set(i, a.get(j));
         
              a.set(j, temp);
              i++;
              j--;
     }return a;
 }
 public static void palindrome(ArrayList<Integer> a){
  int i=0,j=a.size()-1;
  boolean flag=true;
     while(i<j){
         if(!a.get(i).equals(a.get(j))){
            flag= false;
             break;
             
         }
      
         i++;
         j--;
     }
     if(flag)System.out.println("pallindrome");
     else System.out.println("not pal");
 }
 
 //q5 
 public static void swap(ArrayList <Integer>a,int i1, int i2){
   int temp=a.get(i1);
     a.set(i1, a.get(i2));
     a.set(i2, temp);
 }
 //6
 public static boolean isSUB(ArrayList <Integer> a,ArrayList<Integer>b){
    
     for (int i = 0; i < b.size(); i++) {
         if(!a.contains(b.get(i))) {
             return false;
         }

     }
         return true; }
 
 //q10
 public static ArrayList<Integer>movezero(ArrayList<Integer>s){
    
     int j= s.size()-1;
     for (int z = 0; z < s.size(); z++) {
         if(s.get(z).equals(0)){
            s.addLast(s.remove(z));
             
         }
     }return s;
 
}

public static ArrayList<Integer> bubleSort(ArrayList<Integer>a){
    for (int i = 0; i < a.size(); i++) {
        for (int j = 0; j < a.size()-1-i; j++) {
            if(a.get(j)>a.get(j+1) )
                swap(a,j+1,j);
        }
        
    }return a;
}

public static ArrayList<Integer>merge(ArrayList<Integer>a, ArrayList<Integer>b){
    ArrayList<Integer>ans=new ArrayList<>();
    for (int i = 0; i < a.size(); i++) {
ans.add(a.get(i));
    }
    for (int i = 0; i < b.size(); i++) {
        ans.add(b.get(i));
    }
    return bubleSort(ans);
}
//q11
public static ArrayList<Integer>removettok(ArrayList<Integer>a,int k ,int j){
    for (int i=j ; i <k; i++) {
        a.remove(a.remove(i));
    }
    return a;
}
public static ArrayList<Integer> rotateLeft(ArrayList<Integer>a, int k){
   int n=a.size()-1;
    if(k>n) k=k%n;// if kis bigger than the sizr
    for (int i = 0; i < k; i++) {
        int temp= a.remove(0);
        a.add(temp);
        
    }return a;}
    public static ArrayList<Integer> rotateRight(ArrayList<Integer>a, int k){
        int n=a.size()-1;
    
    if(k>n){
        k=k%n;
    }
        for (int i = 0; i < k; i++) {
            int last= a.removeLast();
            a.addFirst(last);
        } return a;
}
public static ArrayList<Integer> shuffle(ArrayList<Integer> a){
Random rand=new Random();

    for (int i = 0; i <a.size(); i++) {
       int randomIndex=rand.nextInt(i+1);
        swap(a,i,randomIndex);
        
    }return a;
   
    }
}











