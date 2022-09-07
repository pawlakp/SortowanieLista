//Autor Przemysław Pawlak
//Lista Dwukierunkowa Sortowana
//Sortowanie odbywa się podczas wpisywania liczby do listy

public class ElementListy
{
    public int Liczba;
    public ElementListy Poprzedni;
    public ElementListy Nastepny;

    private ElementListy NowyElement;

    public ElementListy(int x, ElementListy poprzedni)
    {
        Poprzedni=poprzedni;
        Nastepny=null;
        Liczba=x;
        NowyElement=null;

    }

    public void Dopisz(int x) //Dopisywanie następnego elementu listy
    {
        if(this.Liczba<x)
        {
            if(this.Nastepny==null) Nastepny=new ElementListy(x,null);
            else
            {
                if(Nastepny.Liczba<x)Nastepny.Dopisz(x);
                else
                {
                    NowyElement = new ElementListy(x,null);
                    NowyElement.Nastepny=this.Nastepny;
                    Nastepny=NowyElement;
                    NowyElement=null;
                }
            }
        }
        if(this.Liczba==x)
        {
            NowyElement = new ElementListy(x,null);
            NowyElement.Nastepny=this.Nastepny;
            Nastepny=NowyElement;
            NowyElement=null;
        }

    }

    public void DopiszK(int x) //Dopisywanie poprzedniego elementu listy
    {
        if(this.Liczba>x)
        {
            if(this.Poprzedni==null) Poprzedni=new ElementListy(x,null);
            else
            {
                if(Poprzedni.Liczba>x)Poprzedni.DopiszK(x);
                else
                {
                    NowyElement = new ElementListy(x,null);
                    NowyElement.Poprzedni=this.Poprzedni;
                    Poprzedni=NowyElement;
                    NowyElement=null;
                }
            }
        }

        if(this.Liczba==x)
        {
            NowyElement = new ElementListy(x,null);
            NowyElement.Poprzedni=this.Poprzedni;
            Poprzedni=NowyElement;
            NowyElement=null;
        }
    }


}
