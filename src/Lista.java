//Autor Przemysław Pawlak
//Lista Dwukierunkowa Sortowana
//Sortowanie odbywa się podczas wpisywania liczby do listy

public class Lista
{
    public ElementListy Poczatek; //Początek listy
    public ElementListy Koniec; //Koniec Listy


    private ElementListy Nowy;
    public Lista()
    {
        Poczatek=null;
        Koniec=null;
    }


    public void MakeKorzen(int x) //metoda zamieniające liczbę rozpoczynającą liste
    {
        Nowy=new ElementListy(x,null);
        Nowy.Nastepny=Poczatek;
        Poczatek=Nowy;

    }


    public void Dopisz(int x) {
        Nowy = new ElementListy(x, null);
        if (Poczatek == null) {
            Poczatek = Nowy;
            Koniec=Nowy;
        } else {

            if (x < Poczatek.Liczba) {
                MakeKorzen(x); //Jeżeli liczba wpisywana mniejsza od dopisywanej
            }
            else {
                Poczatek.Dopisz(x);//Dopisywanie do początku listy
            }

            if(x>Koniec.Liczba) //metoda wpisująca liczbę na koniec liczby, jeżeli jest większa od reszty liczb
            {
                Nowy.Poprzedni=Koniec;
                Koniec=Nowy;
            }
            else
            {
                Koniec.DopiszK(x); //Dopisywanie do końca listy
            }

        }
    }




public void WyswP() //Wyświetlanie listy od początku
{
    ElementListy Aktualny = Poczatek;
    while(Aktualny!=null)
    {
        System.out.print(Aktualny.Liczba + " ");
        Aktualny=Aktualny.Nastepny;
    }


}
    public void WyswK() //Wyświetlanie listy od końca
    {
        ElementListy Aktualny = Koniec;
        while(Aktualny!=null)
        {
            System.out.print(Aktualny.Liczba + " ");
            Aktualny=Aktualny.Poprzedni;
        }


    }

    public int[] ZwrocDoTablicy(int[] tab) //Zwracanie posortowanej listy do tablicy (od początku)
    {
        int[] Tablica;
        int i;
        ElementListy Aktualny;

        Aktualny= Poczatek;
        Tablica = new int[tab.length];

        for(i=0;i<Tablica.length;i++)
        {
            if(Aktualny!=null) {
                Tablica[i] = Aktualny.Liczba;
            }
            else
                break;
            Aktualny=Aktualny.Nastepny;

        }

        return Tablica;
    }
    public int[] ZwrocDoTablicyTyl(int[] tab) //Zwracanie posortowanej listy do tablicy (od końca)
    {
        int[] Tablica;
        int i;
        ElementListy Aktualny;

        Aktualny= Koniec;
        Tablica = new int[tab.length];

        for(i=0;i<Tablica.length;i++)
        {
            if(Aktualny!=null) {
                Tablica[i] = Aktualny.Liczba;
            }
            else
                break;
            Aktualny=Aktualny.Poprzedni;

        }

        return Tablica;
    }


}
