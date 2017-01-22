package LinkedIn;

 import java.util.*;
 import java.io.*;

 class dictionariesAndMaps{
     Map<String,Integer> contacts;
     dictionariesAndMaps(){
         contacts =new HashMap<>();
     }
     private void addContact(String  name, int number){
         if(contacts != null && !contacts.containsKey(name)){
             contacts.put(name,number);
         }
     }
     
     private String getContact(String name){
         if(contacts != null && contacts.containsKey(name)){
             return name+"="+contacts.get(name);
         }else{
             return "Not found";
         }
     }
     public static void main(String []argh){
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         dictionariesAndMaps sol=new dictionariesAndMaps();
         for(int i = 0; i < n; i++){
             String name = in.next();
             int phone = in.nextInt();
             sol.addContact(name,phone);
         }
         while(in.hasNext()){
             String s = in.next();
             System.out.println(sol.getContact(s));
         }
         in.close();
     }
 }


