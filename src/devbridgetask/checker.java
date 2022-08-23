package devbridgetask;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaco Coetsee
 */
import java.util.*;
import java.io.*;

public class checker {
    private String f_Name = "";
    public checker(){
        
    }
    public checker(String fName){
        f_Name = fName;
    }
    public String getfName(){
        return f_Name;
    }
    public void setfName(String fName){
        f_Name = fName;
    }
    public void startProcessing() throws FileNotFoundException{
        Scanner sc = new Scanner(new File(f_Name));
        while(sc.hasNext()){
            String line = sc.nextLine();
            if(hasNumBigger(line)){
                System.out.println(line);
            }
        }
    }
    private boolean isBigger(int num){
        return num>=10;
    }
    private boolean hasNumBigger(String line){
        StringBuilder sb = new StringBuilder(line);
        String num = "";
        boolean isBig = false;
        for(int i = 0; i < sb.length(); i++){
            char letter = sb.charAt(i);
            if(Character.isDigit(letter)){
                num += letter +"";
            }else{
                if(!num.equalsIgnoreCase("")){
                   if(isBigger(Integer.parseInt(num))){
                       isBig = true;
                   }
                   num = "";
                }
            }
            if( i == sb.length()-1){
                if(!num.equalsIgnoreCase("")){
                   if(isBigger(Integer.parseInt(num))){
                       isBig = true;
                   }
                   num = "";
                }
            }
        }
        return isBig;
    }
}
