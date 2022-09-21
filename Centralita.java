package es.psp.unidad1.centralita;

public class Centralita {

	 private int nLLamadas;
	 private double costeTotal;
	 
	 public Centralita(){
	  nLLamadas=0;
	  costeTotal=0;
	 }
	 
	 public int getNLLamadas(){
	  return nLLamadas;
	 }
	 
	 public double getCosteLLamadas(){
	  return costeTotal;
	 }
	 
	 public void registraLLamada(Llamada llamada){
	  nLLamadas++;
	  costeTotal+=llamada.costeLlamada();
	 }
	 
	 public void printInforme (){
	  System.out.println("El nº total de llamadas es: "+nLLamadas+" y el coste total es: "+costeTotal);
	 }
	}