package es.psp.unidad1.centralita;

public class LlamadaLocal extends Llamada {
	 
	 private double coste;
	 
	 public LlamadaLocal(String nor,String ndes,int dur){
	  super(nor,ndes,dur);
	  coste=0.15;
	 }
	 
	 public double costeLlamada(){
	  double costetotal=coste*super.getDuracion();
	  return costetotal;
	 }
	}