package es.studium.Cartas;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements WindowListener, MouseListener
{
	Vista vista;
	Modelo modelo;
	int mazoJugador1[] = new int[26];
	int mazoJugador2[] = new int[26];
	int cartaActualJugador1 = 0;
	int cartaActualJugador2 = 0;
	int puntosJugador1 = 0;
	int puntosJugador2 = 0;
	int turno = 0; // 0 turno jugador 1, 1 turno jugador 2
	int uno, dos;

	public Controlador(Vista v, Modelo m)
	{
		this.vista = v;
		this.modelo = m;
		this.vista.addWindowListener(this);
		this.vista.addMouseListener(this);
		this.vista.dlgMensajeFinPartida.addWindowListener(this);
		this.vista.dlgMensajeRonda.addWindowListener(this);
		this.modelo.barajar(mazoJugador1, mazoJugador2);
		for(int i= 0; i < 26; i++)
		{
			System.out.println(mazoJugador1[i]+"-->"+mazoJugador2[i]);
		}
	}

	@Override
	public void windowActivated(WindowEvent arg0){}
	@Override
	public void windowClosed(WindowEvent arg0){}

	@Override
	public void windowClosing(WindowEvent arg0)
	{
		if(this.vista.dlgMensajeFinPartida.isActive())
		{
			this.vista.dlgMensajeFinPartida.setVisible(false);
			// Reinicio
			cartaActualJugador1 = 0;
			cartaActualJugador2 = 0;
			puntosJugador1 = 0;
			puntosJugador2 = 0;
			this.vista.resetearContadores();
			turno = 0;
			this.vista.mostrarCartaMazo1(-1); // Quitar última carta mostrada
			this.vista.mostrarCartaMazo2(-1); // Quitar última carta mostrada
			this.modelo.barajar(mazoJugador1, mazoJugador2);
		}
		else if(this.vista.dlgMensajeRonda.isActive())
		{
			this.vista.dlgMensajeRonda.setVisible(false);
		}
		else
		{
			System.exit(0);
		}
	}
	@Override
	public void windowDeactivated(WindowEvent arg0){}

	@Override
	public void windowDeiconified(WindowEvent arg0){}

	@Override
	public void windowIconified(WindowEvent arg0){}

	@Override
	public void windowOpened(WindowEvent arg0){}
	@Override
	public void mouseClicked(MouseEvent evento)
	{		
		int x = evento.getX();
		int y = evento.getY();
		if((x>=320)&&(x<=429)&&(y>=80)&&(y<=230)&&(turno==0))
		{
			// Mostrar la carta del Mazo 1
			this.vista.mostrarCartaMazo1(mazoJugador1[cartaActualJugador1]);
			turno = 1;
		}
		else if ((x>=320)&&(x<=429)&&(y>=250)&&(y<=400)&&(turno==1))
		{
			// Mostrar la carta del Mazo 2
			this.vista.mostrarCartaMazo2(mazoJugador2[cartaActualJugador2]);
			// 1  2  3  4  5  6  7  8  9  10 11 12 13
			// 1  2  3  4  5  6  7  8  9  10 11 12 0+13

			// 14 15 16 17 18 19 20 21 22 23 24 25 26
			// 1  2  3  4  5  6  7  8  9  10 11 12 0+13

			// 27 28 29 30 31 32 33 34 35 36 37 38 39
			// 1  2  3  4  5  6  7  8  9  10 11 12 0+13

			// 40 41 42 43 44 45 46 47 48 49 50 51 52
			// 1  2  3  4  5  6  7  8  9  10 11 12 0+13
			uno = mazoJugador1[cartaActualJugador1] % 13;
			if(uno==0)
			{
				uno = 13;
			}
			dos = mazoJugador2[cartaActualJugador2] % 13;
			if(dos==0)
			{
				dos = 13;
			}
			if(uno>dos)
			{
				puntosJugador1++;
				this.vista.aumentarPuntosJugador1();
				this.vista.lblMensajeRonda.setText("Jugador 1 gana esta ronda!");
				this.vista.dlgMensajeRonda.setVisible(true);
			}
			else if (uno<dos)
			{
				puntosJugador2++;
				this.vista.aumentarPuntosJugador2();
				this.vista.lblMensajeRonda.setText("Jugador 2 gana esta ronda!");
				this.vista.dlgMensajeRonda.setVisible(true);
			}
			else // uno = dos
			{
				this.vista.lblMensajeRonda.setText("Nadie gana esta ronda!");
				this.vista.dlgMensajeRonda.setVisible(true);
			}
			cartaActualJugador1++;
			cartaActualJugador2++;
			turno = 0;
		}
		if((puntosJugador1 >= 4) && (puntosJugador1 >= puntosJugador2+2))
		{
			// Ganador el Jugador 1
			this.vista.lblMensajeFinPartida.setText("GANA Jugador 1");
			this.vista.dlgMensajeFinPartida.setVisible(true);
		}
		else if ((puntosJugador2 >= 4) && (puntosJugador2 >= puntosJugador1+2))
		{
			// Ganador el Jugador 2
			this.vista.lblMensajeFinPartida.setText("GANA Jugador 2");
			this.vista.dlgMensajeFinPartida.setVisible(true);
		}
	}
	@Override
	public void mouseEntered(MouseEvent arg0){}
	@Override
	public void mouseExited(MouseEvent arg0){}
	@Override
	public void mousePressed(MouseEvent arg0){}
	@Override
	public void mouseReleased(MouseEvent arg0){}
}
