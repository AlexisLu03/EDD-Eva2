/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_10_mcd;

/**
 *
 * @author dell
 */
public class Eva2_10_MCD {

    public static void main(String[] args) {
        System.out.println(mcdRecursivo(48, 18));
    }
    
    public static int mcdRecursivo(int a, int b) {
    if (b == 0) {
        return a;
    } else {
        return mcdRecursivo(b, a % b);
    }}
}
