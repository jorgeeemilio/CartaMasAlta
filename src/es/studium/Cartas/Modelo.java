package es.studium.Cartas;

import java.util.Random;

public class Modelo
{
	Random rnd = new Random();
	
	public void barajar(int uno[], int dos[])
	{		
		int jugador = 0;
		int iUno=0, iDos=0;
		
		for(int i = 1; i <= 52; i++)
		{
			jugador = rnd.nextInt(2);
			if((jugador==0)&&(iUno<26)) // Jugador 1
			{
				uno[iUno] = i;
				iUno++;
			}
			else if(iDos<26) // Jugador 2
			{
				dos[iDos] = i;
				iDos++;
			}
		}
		rebarajar(uno);
		rebarajar(dos);
	}
	public void rebarajar(int t[])
	{
		int aleatorio, auxiliar;
		for(int i=0; i<26; i++)
		{
			aleatorio = rnd.nextInt(25)+1;
			auxiliar = t[i];
			t[i] = t[aleatorio];
			t[aleatorio] = auxiliar;
		}
	}
}
