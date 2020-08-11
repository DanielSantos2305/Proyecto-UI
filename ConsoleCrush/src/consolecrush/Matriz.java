package consolecrush;

import java.util.Random;

public class Matriz {

    //Variables matriz(y,x)
    private int matriz[][];
    private Random aleatorio;
    //Variables de control
    private int xCasilla, yCasilla, xMovimiento, yMovimiento;
    //Variables Extra

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public int getXcasilla() {
        return xCasilla;
    }

    public void setXcasilla(int xCasilla) {
        this.xCasilla = xCasilla;
    }

    public int getYcasilla() {
        return yCasilla;
    }

    public void setYcasilla(int yCasilla) {
        this.yCasilla = yCasilla;
    }

    public int getXmovimiento() {
        return xMovimiento;
    }

    public void setXmovimiento(int xMovimiento) {
        this.xMovimiento = xMovimiento;
    }

    public int getYmovimiento() {
        return yMovimiento;
    }

    public void setYmovimiento(int yMovimiento) {
        this.yMovimiento = yMovimiento;
    }

    public static void Dibujar(int[][] matriz, int puntos, int vidas,Juego juego) {
        //Aqui se mostrava Puntaje, vidas y matriz de forma grafica por consola
        
        
        /*
        //Dibujando matriz
        
        String cadena = "";
        //String puntaje = "" + puntos;
        //while (puntaje.length() != 4) {
        //    if (true) {
        //        puntaje = "0" + puntaje;
        //    }
        //}
        //juego.Puntaje.setText(puntaje);
        
        
        
        int cont = 0;
        if (matriz.length == 10) {
            //System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>CONSOLE CRUSH<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
            //System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>VIDAS:" + vidas + "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
            //System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>PUNTOS:<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
            //System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + puntaje + "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
            //System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||                                             |||||||||||||||||||||||||||||||||||||||||||");
            //System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||    X  0   1  2   3  4  5   6  7   8  9      |||||||||||||||||||||||||||||||||||||||||||");
            //System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||  Y   ---------------------------------      |||||||||||||||||||||||||||||||||||||||||||");
            for (int m = 0; m < matriz.length; m++) {//Y
                for (int n = 0; n < matriz.length; n++) {//X
                    //Internamente se trabajan numeros de 1 a 5 pero se muestran como simbolos
                    switch (matriz[m][n]) {
                        case 0:
                            //cadena = cadena + "  X";//Si llegamos a ver una X en la matriz es porque algo salio mal
                            break;
                        case 1:
                            //cadena = cadena + "  ♥";
                            break;
                        case 2:
                            //cadena = cadena + "  ♦";
                            break;
                        case 3:
                            //cadena = cadena + "  ♣";
                            break;
                        case 4:
                            //cadena = cadena + "  ♠";
                            break;
                        case 5:
                            //cadena = cadena + "  ☼";
                            break;
                    }
                }
                //System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||  " + cont + " -" + cadena + "      |||||||||||||||||||||||||||||||||||||||||||");
                cont++;
                //cadena = "";
            }
            
            
            
            //System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||                                             |||||||||||||||||||||||||||||||||||||||||||");
            //System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        } else {
            //System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>CONSOLE CRUSH<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
            //System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>VIDAS:" + vidas + "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
            //System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>PUNTOS:<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
            //System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + puntaje + "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
            //System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||                                             |||||||||||||||||||||||||||||||||||||||||||");
            //System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||    X  0   1  2   3  4  5   6  7   8  9      |||||||||||||||||||||||||||||||||||||||||||");
            //System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||  Y   ---------------------------------      |||||||||||||||||||||||||||||||||||||||||||");
            
            for (int m = 0; m < matriz.length; m++) {//Y
                for (int n = 0; n < matriz.length; n++) {//X
                    //Internamente se trabajan numeros de 1 a 5 pero se muestran como simbolos
                    switch (matriz[m][n]) {
                        case 1:
                            //cadena = cadena + "  ♥";
                            break;
                        case 2:
                            //cadena = cadena + "  ♦";
                            break;
                        case 3:
                            //cadena = cadena + "  ♣";
                            break;
                        case 4:
                            //cadena = cadena + "  ♠";//traigame 2 mas
                            break;
                        case 5:
                            //cadena = cadena + "  ☼";//como estos
                            break;
                    }
                }
                //System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||  " + cont + " -" + cadena + "         |||||||||||||||||||||||||||||||||||||||||||");
                cont++;
                //cadena = "";
            }
            //System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||                                             |||||||||||||||||||||||||||||||||||||||||||");
            //System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        }
        
        
       */
    }

    public boolean Movimiento(int x, int y, int nextX, int nextY, boolean sumarPuntos, Jugador jugador, int[][] matriz,boolean Auto) {
        boolean retorno = false, filaColumna = false;;
        //int puntos = 0;
        //Respaldando posiciones iniciales matriz(y,x)
        int casillaA = matriz[y][x];
        int casillaB = matriz[nextY][nextX];
        //Realizando movimiento //solo si no es un llamado de AtoScan extra points
        if (sumarPuntos) {
            if (!Auto) {
                matriz[y][x] = casillaB;
                matriz[nextY][nextX] = casillaA;
            } else {
                //Llamado de extra points, no movemos, solo verificamos si hay filas o columnas y las eliminamos otorgando puntos extra
            }
        }

        //Verificacion de posibles filas y columnas tras hacer el movimiento:
        filaColumna = BuscarFilasColumnas(nextX, nextY, casillaA, sumarPuntos, jugador);
        if (!retorno && filaColumna) {
            retorno = true;
        }
        if (sumarPuntos) {
            if (!Auto) {
                filaColumna = BuscarFilasColumnas(x, y, casillaB, sumarPuntos, jugador);
                if (!retorno && filaColumna) {
                    retorno = true;
                }
            }
        }
        if (sumarPuntos) {
            //System.out.println("caer");
            Caer(matriz);//matriz
        }
        if (retorno) {
            //Se encontraron filas o columnas
            //if (x == nextX && y == nextY && sumarPuntos) {
                //System.out.println("Puntos Extra");
            //}
            return true;
        } else {
            //No se encontraron FILAS ni COLUMNAS
            //Revirtiendo movimiento
            if (sumarPuntos) {
                if (!Auto) {
                    matriz[y][x] = casillaA;
                    matriz[nextY][nextX] = casillaB;
                }
            }
            return false;
        }
    }

    private boolean BuscarFilasColumnas(int nextX, int nextY, int casillaX, boolean sumarPuntos, Jugador jugador) {
        boolean filaColumna = false;
        int puntos = 0;
        //Derecha
        boolean rx0 = false, rx1 = false, rx2 = false, rx3 = false, rx4 = false, rx5 = false, rx6 = false, rx7 = false;
        int rx0v[] = {10, 10}, rx1v[] = {10, 10}, rx2v[] = {10, 10}, rx3v[] = {10, 10}, rx4v[] = {10, 10}, rx5v[] = {10, 10}, rx6v[] = {10, 10}, rx7v[] = {10, 10};
        int contadorX = 0;
        int vueltas = 0;
        //Encontrando coincidencias con la casilla seleccionada en X+
        for (int i = nextX + 1; i < matriz.length; i++) {
            if (matriz[nextY][i] == casillaX) {
                if (rx0 == false && vueltas == 0) {
                    rx0 = true;
                    rx0v[0] = i;
                    rx0v[1] = nextY;
                    contadorX++;
                }
                if (rx0 && vueltas == 1) {
                    rx1 = true;
                    rx1v[0] = i;
                    rx1v[1] = nextY;
                    contadorX++;
                }
                if (rx1 && vueltas == 2) {
                    rx2 = true;
                    rx2v[0] = i;
                    rx2v[1] = nextY;
                    contadorX++;
                }
                if (rx2 && vueltas == 3) {
                    rx3 = true;
                    rx3v[0] = i;
                    rx3v[1] = nextY;
                    contadorX++;
                }
                if (rx3 && vueltas == 4) {
                    rx4 = true;
                    rx4v[0] = i;
                    rx4v[1] = nextY;
                    contadorX++;
                }
                if (rx4 && vueltas == 5) {
                    rx5 = true;
                    rx5v[0] = i;
                    rx5v[1] = nextY;
                    contadorX++;
                }
                if (rx5 && vueltas == 6) {
                    rx6 = true;
                    rx6v[0] = i;
                    rx6v[1] = nextY;
                    contadorX++;
                }
                if (rx6 && vueltas == 7) {
                    rx7 = true;
                    rx7v[0] = i;
                    rx7v[1] = nextY;
                    contadorX++;
                }
            }
            vueltas++;
        }
        //Izquierda
        boolean lx0 = false, lx1 = false, lx2 = false, lx3 = false, lx4 = false, lx5 = false, lx6 = false, lx7 = false;
        int lx0v[] = {10, 10}, lx1v[] = {10, 10}, lx2v[] = {10, 10}, lx3v[] = {10, 10}, lx4v[] = {10, 10}, lx5v[] = {10, 10}, lx6v[] = {10, 10}, lx7v[] = {10, 10};
        vueltas = 0;
        //Encontrando coincidencias con la casilla seleccionada en X-
        for (int i = nextX - 1; i >= 0; i--) {
            if (matriz[nextY][i] == casillaX) {
                //System.out.println("1 coincidencia izquierda");
                if (lx0 == false && vueltas == 0) {
                    lx0 = true;
                    lx0v[0] = i;
                    lx0v[1] = nextY;
                    contadorX++;
                }
                if (lx0 && vueltas == 1) {
                    lx1 = true;
                    lx1v[0] = i;
                    lx1v[1] = nextY;
                    contadorX++;
                }
                if (lx1 && vueltas == 2) {
                    lx2 = true;
                    lx2v[0] = i;
                    lx2v[1] = nextY;
                    contadorX++;
                }
                if (lx2 && vueltas == 3) {
                    lx3 = true;
                    lx3v[0] = i;
                    lx3v[1] = nextY;
                    contadorX++;
                }
                if (lx3 && vueltas == 4) {
                    lx4 = true;
                    lx4v[0] = i;
                    lx4v[1] = nextY;
                    contadorX++;
                }
                if (lx4 && vueltas == 5) {
                    lx5 = true;
                    lx5v[0] = i;
                    lx5v[1] = nextY;
                    contadorX++;
                }
                if (lx5 && vueltas == 6) {
                    lx6 = true;
                    lx6v[0] = i;
                    lx6v[1] = nextY;
                    contadorX++;
                }
                if (lx6 && vueltas == 7) {
                    lx7 = true;
                    lx7v[0] = i;
                    lx7v[1] = nextY;
                    contadorX++;
                }
            }
            vueltas++;
        }
        //Abajo
        boolean dy0 = false, dy1 = false, dy2 = false, dy3 = false, dy4 = false, dy5 = false, dy6 = false, dy7 = false;
        int dy0v[] = {10, 10}, dy1v[] = {10, 10}, dy2v[] = {10, 10}, dy3v[] = {10, 10}, dy4v[] = {10, 10}, dy5v[] = {10, 10}, dy6v[] = {10, 10}, dy7v[] = {10, 10};
        int contadorY = 0;
        vueltas = 0;
        //Encontrando coincidencias con la casilla seleccionada en Y+
        for (int i = nextY + 1; i < matriz.length; i++) {
            if (matriz[i][nextX] == casillaX) {
                //System.out.println("1 coincidencia abajo");
                if (dy0 == false && vueltas == 0) {
                    dy0 = true;
                    dy0v[0] = nextX;
                    dy0v[1] = i;
                    contadorY++;
                }
                if (dy0 && vueltas == 1) {
                    dy1 = true;
                    dy1v[0] = nextX;
                    dy1v[1] = i;
                    contadorY++;
                }
                if (dy1 && vueltas == 2) {
                    dy2 = true;
                    dy2v[0] = nextX;
                    dy2v[1] = i;
                    contadorY++;
                }
                if (dy2 && vueltas == 3) {
                    dy3 = true;
                    dy3v[0] = nextX;
                    dy3v[1] = i;
                    contadorY++;
                }
                if (dy3 && vueltas == 4) {
                    dy4 = true;
                    dy4v[0] = nextX;
                    dy4v[1] = i;
                    contadorY++;
                }
                if (dy4 && vueltas == 5) {
                    dy5 = true;
                    dy5v[0] = nextX;
                    dy5v[1] = i;
                    contadorY++;
                }
                if (dy5 && vueltas == 6) {
                    dy6 = true;
                    dy6v[0] = nextX;
                    dy6v[1] = i;
                    contadorY++;
                }
                if (dy6 && vueltas == 7) {
                    dy7 = true;
                    dy7v[0] = nextX;
                    dy7v[1] = i;
                    contadorY++;
                }
            }
            vueltas++;
        }
        //Arriba
        boolean uy0 = false, uy1 = false, uy2 = false, uy3 = false, uy4 = false, uy5 = false, uy6 = false, uy7 = false;
        int uy0v[] = {10, 10}, uy1v[] = {10, 10}, uy2v[] = {10, 10}, uy3v[] = {10, 10}, uy4v[] = {10, 10}, uy5v[] = {10, 10}, uy6v[] = {10, 10}, uy7v[] = {10, 10};
        vueltas = 0;
        //Encontrando coincidencias con la casilla seleccionada en Y-
        for (int i = nextY - 1; i >= 0; i--) {
            if (matriz[i][nextX] == casillaX) {
                if (uy0 == false && vueltas == 0) {
                    uy0 = true;
                    uy0v[0] = nextX;
                    uy0v[1] = i;
                    contadorY++;
                }
                if (uy0 && vueltas == 1) {
                    uy1 = true;
                    uy1v[0] = nextX;
                    uy1v[1] = i;
                    contadorY++;
                }
                if (uy1 && vueltas == 2) {
                    uy2 = true;
                    uy2v[0] = nextX;
                    uy2v[1] = i;
                    contadorY++;
                }
                if (uy2 && vueltas == 3) {
                    uy3 = true;
                    uy3v[0] = nextX;
                    uy3v[1] = i;
                    contadorY++;
                }
                if (uy3 && vueltas == 4) {
                    uy4 = true;
                    uy4v[0] = nextX;
                    uy4v[1] = i;
                    contadorY++;
                }
                if (uy4 && vueltas == 5) {
                    uy5 = true;
                    uy5v[0] = nextX;
                    uy5v[1] = i;
                    contadorY++;
                }
                if (uy5 && vueltas == 6) {
                    uy6 = true;
                    uy6v[0] = nextX;
                    uy6v[1] = i;
                    contadorY++;
                }
                if (uy6 && vueltas == 7) {
                    uy7 = true;
                    uy7v[0] = nextX;
                    uy7v[1] = i;
                    contadorY++;
                }
            }
            vueltas++;
        }
        //Buscando FILAS y COLUMNAS
        if (contadorX >= 5) {
            //Fila de 6
            if (sumarPuntos) {
                jugador.setPuntaje(400);
                puntos = 400;
            }
            filaColumna = true;
        } else if (contadorX == 4) {
            //Fila de 5
            if (sumarPuntos) {
                jugador.setPuntaje(200);
                puntos = 200;
            }
            filaColumna = true;
        } else if (contadorX == 3) {
            //Fila de 4
            if (sumarPuntos) {
                jugador.setPuntaje(100);
                puntos = 100;
            }
            filaColumna = true;
        } else if (contadorX == 2) {
            //Fila de 3
            if (sumarPuntos) {
                jugador.setPuntaje(50);
                puntos = 50;
            }
            filaColumna = true;
        }

        if (contadorY >= 5) {
            //Columna de 6
            if (sumarPuntos) {
                jugador.setPuntaje(400);
                puntos = puntos + 400;
            }
            filaColumna = true;
        } else if (contadorY == 4) {
            //Columna de 5
            if (sumarPuntos) {
                jugador.setPuntaje(200);
                puntos = puntos + 200;
            }
            filaColumna = true;
        } else if (contadorY == 3) {
            //Columna de 4
            if (sumarPuntos) {
                jugador.setPuntaje(100);
                puntos = puntos + 100;
            }
            filaColumna = true;
        } else if (contadorY == 2) {
            //Columna de 3
            if (sumarPuntos) {
                jugador.setPuntaje(50);
                puntos = puntos + 50;
            }
            filaColumna = true;
        }
        if (sumarPuntos && filaColumna) {
            EliminarDestruir(matriz, puntos,
                    rx0v, rx1v, rx2v, rx3v, rx4v, rx5v, rx6v, rx7v,
                    lx0v, lx1v, lx2v, lx3v, lx4v, lx5v, lx6v, lx7v,
                    dy0v, dy1v, dy2v, dy3v, dy4v, dy5v, dy6v, dy7v,
                    uy0v, uy1v, uy2v, uy3v, uy4v, uy5v, uy6v, uy7v,
                    nextX, nextY);
        }
        return filaColumna;
    }

    private void EliminarDestruir(int[][] matriz, int puntos,
            int[] rx0v, int[] rx1v, int[] rx2v, int[] rx3v, int[] rx4v, int[] rx5v, int[] rx6v, int[] rx7v,
            int[] lx0v, int[] lx1v, int[] lx2v, int[] lx3v, int[] lx4v, int[] lx5v, int[] lx6v, int[] lx7v,
            int[] dy0v, int[] dy1v, int[] dy2v, int[] dy3v, int[] dy4v, int[] dy5v, int[] dy6v, int[] dy7v,
            int[] uy0v, int[] uy1v, int[] uy2v, int[] uy3v, int[] uy4v, int[] uy5v, int[] uy6v, int[] uy7v,
            int nextX, int nextY
    ) {
        ///String puntaje = "+" + puntos;
        ///while (puntaje.length() != 4) {
        ///    if (true) {
        ///        puntaje = puntaje + " ";
        ///    }
        ///}
        //System.out.println("==========================================================================================================================================");
        //System.out.println("===================================================================" + puntaje + "Puntos============================================================");
        
        
        
        //hasta aqui todo esta bien
        //Filtro
        matriz[nextY][nextX] = 10;
        if (rx0v[0] != 10) {
            matriz[rx0v[1]][rx0v[0]] = 10;
        }
        if (rx1v[0] != 10) {
            matriz[rx1v[1]][rx1v[0]] = 10;
        }
        if (rx2v[0] != 10) {
            matriz[rx2v[1]][rx2v[0]] = 10;
        }
        if (rx3v[0] != 10) {
            matriz[rx3v[1]][rx3v[0]] = 10;
        }
        if (rx4v[0] != 10) {
            matriz[rx4v[1]][rx4v[0]] = 10;
        }
        if (rx5v[0] != 10) {
            matriz[rx5v[1]][rx5v[0]] = 10;
        }
        if (rx6v[0] != 10) {
            matriz[rx6v[1]][rx6v[0]] = 10;
        }
        if (rx7v[0] != 10) {
            matriz[rx7v[1]][rx7v[0]] = 10;
        }

        if (lx0v[0] != 10) {
            matriz[lx0v[1]][lx0v[0]] = 10;
        }
        if (lx1v[0] != 10) {
            matriz[lx1v[1]][lx1v[0]] = 10;
        }
        if (lx2v[0] != 10) {
            matriz[lx2v[1]][lx2v[0]] = 10;
        }
        if (rx3v[0] != 10) {
            matriz[lx3v[1]][lx3v[0]] = 10;
        }
        if (rx4v[0] != 10) {
            matriz[lx4v[1]][lx4v[0]] = 10;
        }
        if (lx5v[0] != 10) {
            matriz[lx5v[1]][lx5v[0]] = 10;
        }
        if (lx6v[0] != 10) {
            matriz[lx6v[1]][lx6v[0]] = 10;
        }
        if (lx7v[0] != 10) {
            matriz[lx7v[1]][lx7v[0]] = 10;
        }

        if (dy0v[0] != 10) {
            matriz[dy0v[1]][dy0v[0]] = 10;
        }
        if (dy1v[0] != 10) {
            matriz[dy1v[1]][dy1v[0]] = 10;
        }
        if (dy2v[0] != 10) {
            matriz[dy2v[1]][dy2v[0]] = 10;
        }
        if (dy3v[0] != 10) {
            matriz[dy3v[1]][dy3v[0]] = 10;
        }
        if (dy4v[0] != 10) {
            matriz[dy4v[1]][dy4v[0]] = 10;
        }
        if (dy5v[0] != 10) {
            matriz[dy5v[1]][dy5v[0]] = 10;
        }
        if (dy6v[0] != 10) {
            matriz[dy6v[1]][dy6v[0]] = 10;
        }
        if (dy7v[0] != 10) {
            matriz[dy7v[1]][dy7v[0]] = 10;
        }

        if (uy0v[0] != 10) {
            matriz[uy0v[1]][uy0v[0]] = 10;
        }
        if (uy1v[0] != 10) {
            matriz[uy1v[1]][uy1v[0]] = 10;
        }
        if (uy2v[0] != 10) {
            matriz[uy2v[1]][uy2v[0]] = 10;
        }
        if (uy3v[0] != 10) {
            matriz[uy3v[1]][uy3v[0]] = 10;
        }
        if (uy4v[0] != 10) {
            matriz[uy4v[1]][uy4v[0]] = 10;
        }
        if (uy5v[0] != 10) {
            matriz[uy5v[1]][uy5v[0]] = 10;
        }
        if (uy6v[0] != 10) {
            matriz[uy6v[1]][uy6v[0]] = 10;
        }
        if (uy7v[0] != 10) {
            matriz[uy7v[1]][uy7v[0]] = 10;
        }
        
        //Marcar Listos para eliminar
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == 10) {
                    matriz[i][j] = 0;
                }
            }
        }
    }

    private void Caer(int[][] matriz) {
        //Caer
        boolean quedanCeros = true;

        while (quedanCeros) {
            for (int Y = 0; Y < matriz.length - 1; Y++) {//De 0 a 7
                for (int X = 0; X < matriz.length; X++) {//De 0 a 8
                    if (matriz[Y][X] != 0) {
                        if (matriz[Y + 1][X] == 0) {
                            matriz[Y + 1][X] = matriz[Y][X];
                            matriz[Y][X] = 0;
                        }
                    }
                }
            }
            quedanCeros = false;
            for (int Y = 1; Y < matriz.length; Y++) {//De 1 a 8
                for (int X = 0; X < matriz.length; X++) {//De 0 a 8
                    if (matriz[Y][X] == 0) {
                        if (matriz[Y - 1][X] != 0) {
                            quedanCeros = true;
                        }
                    }
                }
            }
        }

        //Rellenar con randoms
        aleatorio = new Random();
        //while (true) {
        for (int Y = 0; Y < matriz.length; Y++) {//Y
            for (int X = 0; X < matriz.length; X++) {//X
                if (matriz[Y][X] == 0) {
                    matriz[Y][X] = aleatorio.nextInt(5) + 1;
                }
            }
        }
    }

    public Matriz(Jugador jugador) {
        xCasilla = 0;
        yCasilla = 0;
        xMovimiento = 0;
        yMovimiento = 0;
        //Generando Matriz(y,x)
        matriz = new int[9][9];///Tamaño matriz, compatible con [10][10]
        aleatorio = new Random();
        //Rellenando matriz de ceros (probablemente innecesario)
        for (int i = 0; i < matriz.length; i++) {//Y
            for (int j = 0; j < matriz.length; j++) {//X
                //matriz(y,x)
                matriz[i][j] = 0;
            }
        }
        //Cargando valores aleatorios a la matriz(y,x)
        for (int k = 0; k < matriz.length; k++) {//Y
            for (int l = 0; l < matriz.length; l++) {//X
                while (true) {
                    //matriz(y,x)
                    matriz[k][l] = aleatorio.nextInt(5) + 1;//tipos de dulces (5 en este caso)
                    //verificando que la matriz no tenga filas o columnas de mas de 3 elementos
                    if (Movimiento(l, k, l, k, false, jugador, matriz,false)) {
                        //hay filas o columnas, cambiar numero hasta que no las haya
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
