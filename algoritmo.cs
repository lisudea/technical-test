using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    class Program
    {
        //Es una lista con todas las oficinas adyacenetes
        public static List <Office>oficinaAdyacente= new List<Office>();


        static void Main(string[] args)
        {
            //INCOMPLETOO :(

            Office[,] edificio=new Office[,];
            //Le mandaba a la funcion un edificio con oficinas(Era la intención)
            numOffices(edificio);
            
            Console.ReadKey();

        }

        static  void numOffices(Office[,] edificio)
        {

            //Recorria cada elemento buscando oficinas
            for (int i = 0; i < length; i++)
            {
                for (int j= 0;  < length; ++)
                {
                    if (edificio[i, j].value == 1)
                    {
                        Office oficinaActual = edificio[i, j];
                        if (!oficinaAdyacente.Contains(oficinaActual))
                        {
                            oficinaAdyacente.Add(oficinaActual);
                            buscaOffices(); //Si encontraba la oficina buscaba sus adyecentes
                        }
                    }
                }
            }
            
        }

        static void buscaOffices()
        {
            if(!SearchNeighBors()); //Retorna verdadero si todos sus vecinos son bloques, falso si algun vecino es una oficina
            {

            }
            return; //Volvia al ciclo principal si encontraba vecinos que eran oficinas
        }

        static bool SearchNeighBors()
        {
            if (oficinaAdyacente.Count > 1)//Si hay mas de una oficina adyacente busco en ese "bloque de oficinas" si cumple que tenga muros alrededor
            {
                int downLimit = LimitSearch("down");
                int upLimit = LimitSearch("up");
                int leftLimit= LimitSearch("left");
                int rightLimit=LimitSearch("right");
            }

            
        }

        int LimitSearch(string kindOfSide) //Busca si en los limites hay muros 
        {
            if (kindOfSide.Equals("down"))
            {

                return ;
            }
            else if (kindOfSide.Equals("up"))
            {
                return
            }
            else if (kindOfSide.Equals("right"))
            {
                return
            }
            else if (kindOfSide.Equals("left"))
            {
                return
            }
        }

        



       
    }
    class Office{

        public int value;//1 o 0, 0 en caso de que sea un muro
        public int row;//Su correspondiente fila
        public int col;//Su correspondiente columna
    }
}
