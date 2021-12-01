package com.veterinaria.salarios;public class Operaciones {



    public double calcularSalario(int cat, int horas){


        double salario=0;

        if(cat==1){

            if(horas>40){
                int extras=horas-40;
                salario= (40*12000)+ (extras*15000);
            }else{
                salario=horas*12000;
            }

        }
        else{
            if(cat==2){

                if(horas>40){
                    int extras=horas-40;
                    salario= (40*17000)+ (extras*21250);
                }else{
                    salario=horas*17000;
                }

            }else{
                if(cat==3){


                    if(horas>40){
                        int extras=horas-40;
                        salario= (40*22000)+ (extras*27500);
                    }else{
                        salario=horas*22000;
                    }
                }
                else{

                    salario=0;
                }

            }

        }


        return salario;
    }



    }

