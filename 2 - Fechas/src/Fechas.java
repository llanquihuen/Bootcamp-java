import java.util.Scanner;
public class Fechas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la primera fecha como DD/MM/AAAA");
		String fecha = sc.nextLine();
		System.out.println("Ingrese la segunda fecha como DD/MM/AAAA");
		String fecha2 = sc.nextLine();
				
		int dia,mes,anio,dia2,mes2,anio2;
		dia = Integer.parseInt(fecha.substring(0,2));
		mes = Integer.parseInt(fecha.substring(3,5));
		anio = Integer.parseInt(fecha.substring(6));
		dia2 = Integer.parseInt(fecha2.substring(0,2));
		mes2 = Integer.parseInt(fecha2.substring(3,5));
		anio2 = Integer.parseInt(fecha2.substring(6));
		
		if (anio<anio2) {
			System.out.println("La persona 1 es mayor");
		}else if(anio>anio2){
			System.out.println("La persona 2 es mayor");
		}else {
			if(mes<mes2) {
				System.out.println("La persona 1 es mayor");
			}else if(mes>mes2) {
				System.out.println("La persona 2 es mayor");
			}else {
				if (dia<dia2) {
					System.out.println("La persona 1 es mayor");
				}
				else if(dia>dia2) {
					System.out.println("La persona 2 es mayor");
				}else {
					System.out.println("Tienen la misma edad");
				}
			}
		}
	}
}
