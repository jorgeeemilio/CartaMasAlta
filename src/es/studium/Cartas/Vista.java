package es.studium.Cartas;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;

public class Vista extends Frame
{
	private static final long serialVersionUID = 1L;
	Toolkit herramientas;
	Image tapete, reverso;
	// A --> Diamantes
	// B --> Corazones
	// C --> Tréboles
	// D --> Picas
	Image A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13;
	Image B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13;
	Image C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13;
	Image D1, D2, D3, D4, D5, D6, D7, D8, D9, D10, D11, D12, D13;
	int imagenAmostrar1 = 0;
	int imagenAmostrar2 = 0;
	int puntosJugador1 = 0;
	int puntosJugador2 = 0;
	
	Dialog dlgMensajeFinPartida = new Dialog(this, "Fin", true);
	Label lblMensajeFinPartida = new Label("Gana Jugador 1");
	
	Dialog dlgMensajeRonda = new Dialog(this, "Resultado Ronda", true);
	Label lblMensajeRonda = new Label("Jugador 1 gana esta ronda!");
	
	public Vista()
	{
		herramientas = getToolkit();
		tapete = herramientas.getImage("img/tapete.jpg");
		reverso = herramientas.getImage("img/reverso.png");
		cargarCartas();
		this.setTitle("Cartas");
		this.setSize(628,454);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		
		dlgMensajeFinPartida.setLayout(new FlowLayout());
		dlgMensajeFinPartida.setSize(100,100);
		dlgMensajeFinPartida.setLocationRelativeTo(null);
		dlgMensajeFinPartida.setResizable(false);
		dlgMensajeFinPartida.add(lblMensajeFinPartida);
		
		dlgMensajeRonda.setLayout(new FlowLayout());
		dlgMensajeRonda.setSize(200,100);
		dlgMensajeRonda.setLocationRelativeTo(null);
		dlgMensajeRonda.setResizable(false);
		dlgMensajeRonda.add(lblMensajeRonda);
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(tapete, 0, 30, this);
		Font fuente = new Font("Jokerman", Font.BOLD, 24);
		g.setFont(fuente);
		g.setColor(Color.red);
		g.drawString("Jugador 1: " + puntosJugador1 + " puntos", 200, 60);
		g.drawImage(reverso, 320, 80, this);
		g.setColor(Color.yellow);
		g.drawString("Jugador 2: " + puntosJugador2 + " puntos", 200, 430);
		g.drawImage(reverso, 320, 250, this);
		switch(imagenAmostrar1)
		{
		case 1:
			g.drawImage(A1, 210, 80, this);
			break;
		case 2:
			g.drawImage(A2, 210, 80, this);
			break;
		case 3:
			g.drawImage(A3, 210, 80, this);
			break;
		case 4:
			g.drawImage(A4, 210, 80, this);
			break;
		case 5:
			g.drawImage(A5, 210, 80, this);
			break;
		case 6:
			g.drawImage(A6, 210, 80, this);
			break;
		case 7:
			g.drawImage(A7, 210, 80, this);
			break;
		case 8:
			g.drawImage(A8, 210, 80, this);
			break;
		case 9:
			g.drawImage(A9, 210, 80, this);
			break;
		case 10:
			g.drawImage(A10, 210, 80, this);
			break;
		case 11:
			g.drawImage(A11, 210, 80, this);
			break;
		case 12:
			g.drawImage(A12, 210, 80, this);
			break;
		case 13:
			g.drawImage(A13, 210, 80, this);
			break;
		case 14:
			g.drawImage(B1, 210, 80, this);
			break;
		case 15:
			g.drawImage(B2, 210, 80, this);
			break;
		case 16:
			g.drawImage(B3, 210, 80, this);
			break;
		case 17:
			g.drawImage(B4, 210, 80, this);
			break;
		case 18:
			g.drawImage(B5, 210, 80, this);
			break;
		case 19:
			g.drawImage(B6, 210, 80, this);
			break;
		case 20:
			g.drawImage(B7, 210, 80, this);
			break;
		case 21:
			g.drawImage(B8, 210, 80, this);
			break;
		case 22:
			g.drawImage(B9, 210, 80, this);
			break;
		case 23:
			g.drawImage(B10, 210, 80, this);
			break;
		case 24:
			g.drawImage(B11, 210, 80, this);
			break;
		case 25:
			g.drawImage(B12, 210, 80, this);
			break;
		case 26:
			g.drawImage(B13, 210, 80, this);
			break;
		case 27:
			g.drawImage(C1, 210, 80, this);
			break;
		case 28:
			g.drawImage(C2, 210, 80, this);
			break;
		case 29:
			g.drawImage(C3, 210, 80, this);
			break;
		case 30:
			g.drawImage(C4, 210, 80, this);
			break;
		case 31:
			g.drawImage(C5, 210, 80, this);
			break;
		case 32:
			g.drawImage(C6, 210, 80, this);
			break;
		case 33:
			g.drawImage(C7, 210, 80, this);
			break;
		case 34:
			g.drawImage(C8, 210, 80, this);
			break;
		case 35:
			g.drawImage(C9, 210, 80, this);
			break;
		case 36:
			g.drawImage(C10, 210, 80, this);
			break;
		case 37:
			g.drawImage(C11, 210, 80, this);
			break;
		case 38:
			g.drawImage(C12, 210, 80, this);
			break;
		case 39:
			g.drawImage(C13, 210, 80, this);
			break;
		case 40:
			g.drawImage(D1, 210, 80, this);
			break;
		case 41:
			g.drawImage(D2, 210, 80, this);
			break;
		case 42:
			g.drawImage(D3, 210, 80, this);
			break;
		case 43:
			g.drawImage(D4, 210, 80, this);
			break;
		case 44:
			g.drawImage(D5, 210, 80, this);
			break;
		case 45:
			g.drawImage(D6, 210, 80, this);
			break;
		case 46:
			g.drawImage(D7, 210, 80, this);
			break;
		case 47:
			g.drawImage(D8, 210, 80, this);
			break;
		case 48:
			g.drawImage(D9, 210, 80, this);
			break;
		case 49:
			g.drawImage(D10, 210, 80, this);
			break;
		case 50:
			g.drawImage(D11, 210, 80, this);
			break;
		case 51:
			g.drawImage(D12, 210, 80, this);
			break;
		case 52:
			g.drawImage(D13, 210, 80, this);
			break;
		}
		switch(imagenAmostrar2)
		{
		case 1:
			g.drawImage(A1, 210, 250, this);
			break;
		case 2:
			g.drawImage(A2, 210, 250, this);
			break;
		case 3:
			g.drawImage(A3, 210, 250, this);
			break;
		case 4:
			g.drawImage(A4, 210, 250, this);
			break;
		case 5:
			g.drawImage(A5, 210, 250, this);
			break;
		case 6:
			g.drawImage(A6, 210, 250, this);
			break;
		case 7:
			g.drawImage(A7, 210, 250, this);
			break;
		case 8:
			g.drawImage(A8, 210, 250, this);
			break;
		case 9:
			g.drawImage(A9, 210, 250, this);
			break;
		case 10:
			g.drawImage(A10, 210, 250, this);
			break;
		case 11:
			g.drawImage(A11, 210, 250, this);
			break;
		case 12:
			g.drawImage(A12, 210, 250, this);
			break;
		case 13:
			g.drawImage(A13, 210, 250, this);
			break;
		case 14:
			g.drawImage(B1, 210, 250, this);
			break;
		case 15:
			g.drawImage(B2, 210, 250, this);
			break;
		case 16:
			g.drawImage(B3, 210, 250, this);
			break;
		case 17:
			g.drawImage(B4, 210, 250, this);
			break;
		case 18:
			g.drawImage(B5, 210, 250, this);
			break;
		case 19:
			g.drawImage(B6, 210, 250, this);
			break;
		case 20:
			g.drawImage(B7, 210, 250, this);
			break;
		case 21:
			g.drawImage(B8, 210, 250, this);
			break;
		case 22:
			g.drawImage(B9, 210, 250, this);
			break;
		case 23:
			g.drawImage(B10, 210, 250, this);
			break;
		case 24:
			g.drawImage(B11, 210, 250, this);
			break;
		case 25:
			g.drawImage(B12, 210, 250, this);
			break;
		case 26:
			g.drawImage(B13, 210, 250, this);
			break;
		case 27:
			g.drawImage(C1, 210, 250, this);
			break;
		case 28:
			g.drawImage(C2, 210, 250, this);
			break;
		case 29:
			g.drawImage(C3, 210, 250, this);
			break;
		case 30:
			g.drawImage(C4, 210, 250, this);
			break;
		case 31:
			g.drawImage(C5, 210, 250, this);
			break;
		case 32:
			g.drawImage(C6, 210, 250, this);
			break;
		case 33:
			g.drawImage(C7, 210, 250, this);
			break;
		case 34:
			g.drawImage(C8, 210, 250, this);
			break;
		case 35:
			g.drawImage(C9, 210, 250, this);
			break;
		case 36:
			g.drawImage(C10, 210, 250, this);
			break;
		case 37:
			g.drawImage(C11, 210, 250, this);
			break;
		case 38:
			g.drawImage(C12, 210, 250, this);
			break;
		case 39:
			g.drawImage(C13, 210, 250, this);
			break;
		case 40:
			g.drawImage(D1, 210, 250, this);
			break;
		case 41:
			g.drawImage(D2, 210, 250, this);
			break;
		case 42:
			g.drawImage(D3, 210, 250, this);
			break;
		case 43:
			g.drawImage(D4, 210, 250, this);
			break;
		case 44:
			g.drawImage(D5, 210, 250, this);
			break;
		case 45:
			g.drawImage(D6, 210, 250, this);
			break;
		case 46:
			g.drawImage(D7, 210, 250, this);
			break;
		case 47:
			g.drawImage(D8, 210, 250, this);
			break;
		case 48:
			g.drawImage(D9, 210, 250, this);
			break;
		case 49:
			g.drawImage(D10, 210, 250, this);
			break;
		case 50:
			g.drawImage(D11, 210, 250, this);
			break;
		case 51:
			g.drawImage(D12, 210, 250, this);
			break;
		case 52:
			g.drawImage(D13, 210, 250, this);
			break;
		}
	}
	
	public void cargarCartas()
	{
		A1 = herramientas.getImage("img/A1.png");
		A2 = herramientas.getImage("img/A2.png");
		A3 = herramientas.getImage("img/A3.png");
		A4 = herramientas.getImage("img/A4.png");
		A5 = herramientas.getImage("img/A5.png");
		A6 = herramientas.getImage("img/A6.png");
		A7 = herramientas.getImage("img/A7.png");
		A8 = herramientas.getImage("img/A8.png");
		A9 = herramientas.getImage("img/A9.png");
		A10 = herramientas.getImage("img/A10.png");
		A11 = herramientas.getImage("img/A11.png");
		A12 = herramientas.getImage("img/A12.png");
		A13 = herramientas.getImage("img/A13.png");
		B1 = herramientas.getImage("img/B1.png");
		B2 = herramientas.getImage("img/B2.png");
		B3 = herramientas.getImage("img/B3.png");
		B4 = herramientas.getImage("img/B4.png");
		B5 = herramientas.getImage("img/B5.png");
		B6 = herramientas.getImage("img/B6.png");
		B7 = herramientas.getImage("img/B7.png");
		B8 = herramientas.getImage("img/B8.png");
		B9 = herramientas.getImage("img/B9.png");
		B10 = herramientas.getImage("img/B10.png");
		B11 = herramientas.getImage("img/B11.png");
		B12 = herramientas.getImage("img/B12.png");
		B13 = herramientas.getImage("img/B13.png");
		C1 = herramientas.getImage("img/C1.png");
		C2 = herramientas.getImage("img/C2.png");
		C3 = herramientas.getImage("img/C3.png");
		C4 = herramientas.getImage("img/C4.png");
		C5 = herramientas.getImage("img/C5.png");
		C6 = herramientas.getImage("img/C6.png");
		C7 = herramientas.getImage("img/C7.png");
		C8 = herramientas.getImage("img/C8.png");
		C9 = herramientas.getImage("img/C9.png");
		C10 = herramientas.getImage("img/C10.png");
		C11 = herramientas.getImage("img/C11.png");
		C12 = herramientas.getImage("img/C12.png");
		C13 = herramientas.getImage("img/C13.png");
		D1 = herramientas.getImage("img/D1.png");
		D2 = herramientas.getImage("img/D2.png");
		D3 = herramientas.getImage("img/D3.png");
		D4 = herramientas.getImage("img/D4.png");
		D5 = herramientas.getImage("img/D5.png");
		D6 = herramientas.getImage("img/D6.png");
		D7 = herramientas.getImage("img/D7.png");
		D8 = herramientas.getImage("img/D8.png");
		D9 = herramientas.getImage("img/D9.png");
		D10 = herramientas.getImage("img/D10.png");
		D11 = herramientas.getImage("img/D11.png");
		D12 = herramientas.getImage("img/D12.png");
		D13 = herramientas.getImage("img/D13.png");
	}
	
	public void mostrarCartaMazo1(int carta)
	{
		imagenAmostrar1 = carta;
		repaint();
	}
	public void mostrarCartaMazo2(int carta)
	{
		imagenAmostrar2 = carta;
		repaint();
	}
	public void aumentarPuntosJugador1()
	{
		puntosJugador1++;
		repaint();
	}
	public void aumentarPuntosJugador2()
	{
		puntosJugador2++;
		repaint();
	}
	public void resetearContadores()
	{
		puntosJugador1 = 0;
		puntosJugador2 = 0;
		repaint();
	}
}
