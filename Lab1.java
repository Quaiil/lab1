/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;
import java.util.Scanner;
/**
 *
 * @author qtaro
 */
public class Lab1 
{

    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        int n = 0;
        
        System.out.println("Please input a number for n: ");
        n = reader.nextInt();
        
        
        int num = 0;
        for(int i = 1; i < n; i++)
        {
            num += i;
        }
        reader.close();
        System.out.println("1 + 2 + ... + n = " + num);
    }
}
