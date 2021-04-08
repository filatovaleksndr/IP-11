/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fit.knu.ua.TA;

/**
 *
 * @author Alex
 */
public class Lab1 {

 private int _number;
    
    public Lab1(){
        _number = 100;
    }
    
    public Lab1(int number){
        _number = number;
    }

    public int getNumber() {
        return _number;
    }

    public void setNumber(int number) {
        _number = number;
    }

    @Override
    public String toString() {
        return "Lab1{" + "_number=" + _number + '}';
    }
    
    public void IncreaseNumber(int value)
    {
        _number += value;
    }
    
     public void DecreaseNumber(int value)
    {
        _number -= value;
    }
}


