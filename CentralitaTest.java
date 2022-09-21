package es.psp.unidad1.centralita;

public class CentralitaTest {

	 public static void main(String[] args) {
	  Centralita centralita=new Centralita();
	  LlamadaLocal local1=new LlamadaLocal("666341010","666312502",10);
	  LlamadaLocal local2=new LlamadaLocal("666341010","666312502",10);
	  LlamadaLocal local3=new LlamadaLocal("666341010","666312502",10);
	  LlamadaProvincial prov1=new LlamadaProvincial("555341010","555312502",3,1);
	  LlamadaProvincial prov2=new LlamadaProvincial("555341010","555312502",2,2);
	  LlamadaProvincial prov3=new LlamadaProvincial("555341010","555312502",5,3);
	  centralita.registraLLamada(local1);
	  centralita.registraLLamada(prov1);
	  centralita.registraLLamada(local2);
	  centralita.registraLLamada(prov2);
	  centralita.registraLLamada(local3);
	  centralita.registraLLamada(prov3);
	  centralita.printInforme();
	 }
	}
