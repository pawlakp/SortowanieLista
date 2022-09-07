//Autor Przemysław Pawlak
//Lista Dwukierunkowa Sortowana
//Sortowanie odbywa się podczas wpisywania liczby do listy
import java.util.*;
public class Main {

    public static void main(String[] args) {

		Lista Nowa;
		Random Generator;
		int[] Tab;
		int x;
		int i;

		int[] TabPosortowana;
		int[] TabPosortowanaWTył;

		Nowa = new Lista();
		Generator = new Random();
		Tab = new int[20];

		for (i = 0; i < Tab.length; i++) {
			Tab[i] = Generator.nextInt(50);
		}
		System.out.println("Tablica przed sortowaniem: ");
		for (i = 0; i < Tab.length; i++) {
			System.out.print(Tab[i] + " ");
			Nowa.Dopisz(Tab[i]);
		}
		System.out.println();
		System.out.println("Posortowana lista : ");
		Nowa.WyswP();
		System.out.println();
		System.out.println("Lista od tyłu: ");
		Nowa.WyswK();

		System.out.println();
		System.out.println();

		TabPosortowana=Nowa.ZwrocDoTablicy(Tab);
		TabPosortowanaWTył=Nowa.ZwrocDoTablicyTyl(Tab);

		System.out.println("Posortowana lista wpisana z powrotem do tablicy: ");
		for(i=0;i<Tab.length;i++)
		{
			System.out.print(TabPosortowana[i] + " ");
		}

        System.out.println();
        System.out.println("Posortowana lista wpisana od tyłu z powrotem do tablicy: ");
        for(i=0;i<Tab.length;i++)
        {
            System.out.print(TabPosortowanaWTył[i] + " ");
        }




    }
}