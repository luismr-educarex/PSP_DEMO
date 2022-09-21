package es.psp.unidad1.centralita;

public class LlamadaProvincial extends Llamada {
	 
	 private double coste=0;
	 private int franja;
	 
	 public LlamadaProvincial(String nor,String ndes,int dur, int f){
	  super(nor,ndes,dur);
	  franja=f;
	  switch (franja){
	  case 1: coste=0.20;break;
	  case 2: coste=0.25;break;
	  case 3: coste=0.30;break;
	  }
	 }
	 public double costeLlamada(){
	  double costetotal=coste*super.getDuracion();
	  return costetotal;
	 }
	}