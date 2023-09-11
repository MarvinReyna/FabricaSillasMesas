package com.mgro.FabricaSillasMesas;

public class EjecutarFabrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FabricaSillasMesas fabrica;
		fabrica = new FabricaSillas();
		SillasMesas Silla = fabrica.armarSillasMesas();
		Silla.armarSillasMesas();
		fabrica = new FabricaMesas();
		SillasMesas Mesa = fabrica.armarSillasMesas();
		Mesa.armarSillasMesas();
	}

}
