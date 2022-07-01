package com.api_numeros_romanos.api_numeros_romanos.Model;

public class Romano {
    private String numero;

    public Romano(int decimal){
        this.numero = convertDecimalToRomano(decimal);
    }

    public String getNumero() {
        return numero;
    }

    public String convertDecimalToRomano(int decimal){
        String romano = "";
        while(decimal != 0) {
            if (decimal >= 1000) {
                romano += "M";
                decimal -= 1000;
            } else if (decimal >= 900) {
                romano += "CM";
                decimal -= 900;
            } else if (decimal >= 500) {
                romano += "D";
                decimal -= 500;
            } else if (decimal >= 400) {
                romano += "CD";
                decimal -= 400;
            } else if (decimal >= 100) {
                romano += "C";
                decimal -= 100;
            } else if (decimal >= 90) {
                romano += "XC";
                decimal -= 90;
            } else if (decimal >= 50) {
                romano += "L";
                decimal -= 50;
            } else if (decimal >= 40) {
                romano += "XL";
                decimal -= 40;
            } else if (decimal >= 10) {
                romano += "X";
                decimal -= 10;
            } else if (decimal >= 9) {
                romano += "IX";
                decimal -= 9;
            } else if (decimal >= 5) {
                romano += "V";
                decimal -= 5;
            } else if (decimal >= 4) {
                romano += "IV";
                decimal -= 4;
            } else if (decimal >= 1) {
                romano += "I";
                decimal -= 1;
            }
        }
        return romano;
    }
}
