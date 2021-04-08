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
public class Lab2 {

    private float _a;
    private float _b;
    private float _c;
    private float _x;
    
    public Lab2()
    {
        _a = 0;
        _b = 0;
        _c = 0;
        _x = 0;
    }

    public Lab2(float a, float b, float c, float x) {
        _a = a;
        _b = b;
        _c = c;
        _x = x;
    }
    
    public float CalculateFormula(){
        float d = (float)Math.pow(_b, 2) - 4 * _a * _c;
        float equation = (_a * (float)Math.pow(_x, 2) + _b * _x + _c);
        if(equation == 0)
            return Integer.MAX_VALUE;
        return d / equation;
    }
    
    public float CalculateFormula(float a, float b, float c, float x){
        _a = a;
        _b = b;
        _c = c;
        _x = x;
        return CalculateFormula();
    }

    public float getA() {
        return _a;
    }

    public void setA(float a) {
        _a = a;
    }

    public float getB() {
        return _b;
    }

    public void setB(float b) {
        _b = b;
    }

    public float getC() {
        return _c;
    }

    public void setC(float c) {
        _c = c;
    }

    public float getX() {
        return _x;
    }

    public void setX(float x) {
        _x =_x;
    }
    
}
