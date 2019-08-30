/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayselfpractice;

import java.util.Arrays;

/**
 *
 * @author 92020474
 */
public class ArraySelfPractice {

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        
        //Integer long form
        int[] arrayOfInt = new int[4];
        arrayOfInt[0] = 1;
        arrayOfInt[1] = 5;
        arrayOfInt[2] = 3;
        arrayOfInt[3] = 6;
        
        System.out.println(arrayOfInt[1]);
        System.out.println(Arrays.toString(arrayOfInt));
        
        //Integer short form
        int[] arrayOfInt2 = {2, 8, 7, 4, 3, 6};
        
        System.out.println(arrayOfInt2[2]);
        System.out.println(Arrays.toString(arrayOfInt2));
        
        //Using for loop to display an array
        int[] arrayOfInt3 = new int[30];
        
        for(int i = 0; i < arrayOfInt3.length; i++) {
            arrayOfInt3[i] = i + 1;
            // +1 since we want 1-100 and not 0-99
        }
        
        System.out.println(Arrays.toString(arrayOfInt3));
        
        
        //Printing the alphabet
        //97
        char[] alpha = new char[26];
        
        for(int i = 0; i < 26; i++) {
            alpha[i] = (char)(97 + i);
        }
        
        System.out.println(Arrays.toString(alpha));
        
        
        //Multidimensional Arrays
        int boardDim = 8;
        char[][] board = new char[boardDim][boardDim];
        boolean isWhite = false;
        for(int y = 0; y < board.length; y++)
        {
            isWhite = !isWhite;
            for(int x = 0; x < board[y].length; x++)
            {
                if(isWhite) board[y][x] = 'W';
                if(!isWhite) board[y][x] = 'B';
                isWhite = !isWhite;
            }
        }
        
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }

    }
    
}
