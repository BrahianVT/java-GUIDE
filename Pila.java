//Confeccionar una clase que administre una lista tipo pila (se debe poder insertar, extraer e imprimir los datos de la pila)

public class Pila{
	class Nodo{
		int info;
		Nodo sig;
	}
	private Nodo raiz;
	public Pila(){
		raiz = null;
	}
	public void insertar (int x){
		Nodo nuevo;
		nuevo = new Nodo();
		nuevo.info = x;
		if(raiz == null){
			nuevo.sig = null;
			raiz = nuevo;
		   }
		else{
		    nuevo.sig = raiz;
			raiz = nuevo;
		}
	}
	public int extraer(){
		if(raiz != null){
			int informacion = raiz.info;
			raiz = raiz.sig;
			return informacion;
		   }
		else{
			return Integer.MAX_VALUE;
		}
	}
	public void imprimir(){
		Nodo reco = raiz;
		System.out.println("Lista de todos los elementos de las pilas");
		while(reco != null){
			System.out.print(reco.info + "-");
			reco = reco.sig;
		}
		System.out.println();
	}
	public boolean vacia(){
		if(raiz == null)
			return true;
		else
			return false;
	}
	public int cantidad_nodos(){
		int cont = 0;
		Nodo aux = raiz;
		while(aux != null){
			aux = aux.sig;
			cont++;
		}
		return cont;
	}
	public int retornar(){
	int ultimo =0;
	  if(raiz != null)
		   return ultimo = raiz.info;
		else
		return Integer.MAX_VALUE;
		
	}
	public static void main (String[] args){
		Pila pila1 = new Pila();
		pila1.insertar(1);
		pila1.insertar(2);
		pila1.insertar(3);
		pila1.imprimir();
		//System.out.println("Dato a extraer :" + pila1.extraer());
		//pila1.imprimir();
		System.out.println("El ultimo valor es: " + pila1.retornar());
		System.out.println("Cantidad de nodos + :" + pila1.cantidad_nodos());
		while(pila1.vacia() == false){
			System.out.println(pila1.extraer());
		}
	}
} 