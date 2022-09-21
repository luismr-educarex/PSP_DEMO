package es.psp.unidad1.centralita;

public abstract class Llamada {
	 
	 private String nOrigen;
	 private String nDestino;
	 private int duracion;
	 
	 public Llamada(String nOr, String nDes, int dur){
	  nOrigen=nOr;
	  nDestino=nDes;
	  duracion=dur;
	 }
	 public int getDuracion(){
	  return duracion;
	 }
	 public abstract double costeLlamada();
	}
