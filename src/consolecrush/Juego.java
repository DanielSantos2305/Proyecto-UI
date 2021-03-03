package consolecrush;

import data.DBPuntajes;
import java.applet.AudioClip;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Juego extends javax.swing.JFrame {

    //Variable jugador (Puntaje,Vida)
    private Jugador jugador = new Jugador();
    //Variables Matriz
    private Matriz matriz = new Matriz(jugador);

    //No eras private
    private AutoScan autoScan = new AutoScan();

    //Para los botones
    private Icon icono;

    private boolean SeleccionandoCasilla = true;

    private int Movimientos = 0;
    
    AudioClip Game;
    DBPuntajes puntaje = new DBPuntajes();

    public Juego() {
        initComponents();
        
        Game = java.applet.Applet.newAudioClip(getClass().getResource("/Music/space-invaders-space-invaders.wav"));
        Game.loop();
        

        //CrearTablero
        while (true) {
            if (autoScan.AutoScann(matriz.getMatriz())) {
                //Todo en orden, la matriz permite jugar    
                break;
            } else {
                //La matriz generada no permitia ningun movimiento, reseteando matriz...
                matriz = new Matriz(jugador);
            }
        }

        //Actualizar Tablero
        ActualizarTablero();
    }

    //Actualizar tablero de planetas segun la matriz
    public void ActualizarTablero() {
        ActualizarPlanetas(0, 0, B00);
        ActualizarPlanetas(1, 0, B10);
        ActualizarPlanetas(2, 0, B20);
        ActualizarPlanetas(3, 0, B30);
        ActualizarPlanetas(4, 0, B40);
        ActualizarPlanetas(5, 0, B50);
        ActualizarPlanetas(6, 0, B60);
        ActualizarPlanetas(7, 0, B70);
        ActualizarPlanetas(8, 0, B80);

        ActualizarPlanetas(0, 1, B01);
        ActualizarPlanetas(1, 1, B11);
        ActualizarPlanetas(2, 1, B21);
        ActualizarPlanetas(3, 1, B31);
        ActualizarPlanetas(4, 1, B41);
        ActualizarPlanetas(5, 1, B51);
        ActualizarPlanetas(6, 1, B61);
        ActualizarPlanetas(7, 1, B71);
        ActualizarPlanetas(8, 1, B81);

        ActualizarPlanetas(0, 2, B02);
        ActualizarPlanetas(1, 2, B12);
        ActualizarPlanetas(2, 2, B22);
        ActualizarPlanetas(3, 2, B32);
        ActualizarPlanetas(4, 2, B42);
        ActualizarPlanetas(5, 2, B52);
        ActualizarPlanetas(6, 2, B62);
        ActualizarPlanetas(7, 2, B72);
        ActualizarPlanetas(8, 2, B82);

        ActualizarPlanetas(0, 3, B03);
        ActualizarPlanetas(1, 3, B13);
        ActualizarPlanetas(2, 3, B23);
        ActualizarPlanetas(3, 3, B33);
        ActualizarPlanetas(4, 3, B43);
        ActualizarPlanetas(5, 3, B53);
        ActualizarPlanetas(6, 3, B63);
        ActualizarPlanetas(7, 3, B73);
        ActualizarPlanetas(8, 3, B83);

        ActualizarPlanetas(0, 4, B04);
        ActualizarPlanetas(1, 4, B14);
        ActualizarPlanetas(2, 4, B24);
        ActualizarPlanetas(3, 4, B34);
        ActualizarPlanetas(4, 4, B44);
        ActualizarPlanetas(5, 4, B54);
        ActualizarPlanetas(6, 4, B64);
        ActualizarPlanetas(7, 4, B74);
        ActualizarPlanetas(8, 4, B84);

        ActualizarPlanetas(0, 5, B05);
        ActualizarPlanetas(1, 5, B15);
        ActualizarPlanetas(2, 5, B25);
        ActualizarPlanetas(3, 5, B35);
        ActualizarPlanetas(4, 5, B45);
        ActualizarPlanetas(5, 5, B55);
        ActualizarPlanetas(6, 5, B65);
        ActualizarPlanetas(7, 5, B75);
        ActualizarPlanetas(8, 5, B85);

        ActualizarPlanetas(0, 6, B06);
        ActualizarPlanetas(1, 6, B16);
        ActualizarPlanetas(2, 6, B26);
        ActualizarPlanetas(3, 6, B36);
        ActualizarPlanetas(4, 6, B46);
        ActualizarPlanetas(5, 6, B56);
        ActualizarPlanetas(6, 6, B66);
        ActualizarPlanetas(7, 6, B76);
        ActualizarPlanetas(8, 6, B86);

        ActualizarPlanetas(0, 7, B07);
        ActualizarPlanetas(1, 7, B17);
        ActualizarPlanetas(2, 7, B27);
        ActualizarPlanetas(3, 7, B37);
        ActualizarPlanetas(4, 7, B47);
        ActualizarPlanetas(5, 7, B57);
        ActualizarPlanetas(6, 7, B67);
        ActualizarPlanetas(7, 7, B77);
        ActualizarPlanetas(8, 7, B87);

        ActualizarPlanetas(0, 8, B08);
        ActualizarPlanetas(1, 8, B18);
        ActualizarPlanetas(2, 8, B28);
        ActualizarPlanetas(3, 8, B38);
        ActualizarPlanetas(4, 8, B48);
        ActualizarPlanetas(5, 8, B58);
        ActualizarPlanetas(6, 8, B68);
        ActualizarPlanetas(7, 8, B78);
        ActualizarPlanetas(8, 8, B88);
    }

    private void ActualizarPlanetas(int x, int y, JButton boton) {
        switch (matriz.getMatriz()[y][x]) {
            case 1:
                icono = new ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"));
                break;
            case 2:
                icono = new ImageIcon(getClass().getResource("/Imagenes/Planeta2.png"));
                break;
            case 3:
                icono = new ImageIcon(getClass().getResource("/Imagenes/Planeta3.png"));
                break;
            case 4:
                icono = new ImageIcon(getClass().getResource("/Imagenes/Planeta4.png"));
                break;
            case 5:
                icono = new ImageIcon(getClass().getResource("/Imagenes/Planeta5.png"));
                break;
            case 6:
                icono = new ImageIcon(getClass().getResource("/Imagenes/plsRecurso 36.png"));
                break;    
            case 10:
                icono = new ImageIcon(getClass().getResource("/Imagenes/Explosion.jpg"));
                break;
        }
        boton.setIcon(icono);
    }

    //Se ejecuta cada que se da click a un planetya
    private void CaprurarMovimiento(int x, int y) {
        boolean mover = false;

        //Aqui averiguamos si el boton es casilla seleccionada o casilla destino
        if (SeleccionandoCasilla) {
            matriz.setXcasilla(x);
            matriz.setYcasilla(y);
        } else {
            matriz.setXmovimiento(x);
            matriz.setYmovimiento(y);
        }

        //Cambiando valor de SeleccionandoCasilla
        SeleccionandoCasilla = !SeleccionandoCasilla;
        //Si SeleccionandoCasilla a vuelto a ser true, habremos completado un movimiento y procederemos a efectuarlo
        if (SeleccionandoCasilla) {
            //Verificando validez del movimiento

            if ((matriz.getXcasilla()+1==matriz.getXmovimiento() || matriz.getXcasilla()-1==matriz.getXmovimiento()) && (matriz.getYcasilla() == matriz.getYmovimiento())) {
                mover=true;
            }else if ((matriz.getYcasilla()+1==matriz.getYmovimiento() || matriz.getYcasilla()-1==matriz.getYmovimiento()) && (matriz.getXcasilla() == matriz.getXmovimiento())) {
                mover=true;
            }
           
            if (mover) {
                if (matriz.Movimiento(matriz.getXcasilla(), matriz.getYcasilla(), matriz.getXmovimiento(), matriz.getYmovimiento(), true, jugador, matriz.getMatriz(), false)) {
                    Movimientos++;//Contamos el movimiento
                    
                    //Verificamos si la matriz permite movimientos
                    if (autoScan.AutoScann(matriz.getMatriz())) {
                        //Hay movimientos disponibles, todo sigue normal
                    } else {
                        //No hay movimientos disponibles, reiniciamos la matriz
                        //generando nuevo tablero para  continuar el juego...
                        while (true) {
                            matriz = new Matriz(jugador);
                            if (autoScan.AutoScann(matriz.getMatriz())) {
                                break;
                            } else {
                                //Esta matriz tampoco permitia movimientos, creando otra...
                            }
                        }
                    }
                    //Verificando filas y columnas residuales
                    while (true) {
                        if (autoScan.AutoPoints(matriz, matriz.getMatriz(), jugador)) {
                            //Se encontraron filas o columnas por lo que volvemos a escanear si de esta ultima eliminacion hay nuevas filas o columnas
                            //+Puntos Extra
                        } else {
                            //Ya no hay mas filas o columnas residuales
                            break;
                        }
                    }
                    /////break;
                } else {
                    //¡Movimiento imposible!
                }
            }
        }

        //Verificando Puntaje y vidas
        if (jugador.getPuntaje() >= 1000) {
            //¡Has conseguido 1000 puntos!
            //Juego terminado
            jugador.setJugar(false);
            /////break;
            Ganaste ventana = new Ganaste();
            ventana.setVisible(true);
            
            this.puntaje.insertPuntaje(this.jugador.getPuntaje());
            
            Game.stop();
            this.setVisible(false);
        }
        if (Movimientos >= 50) {
            //Restando una vida
            jugador.restarVidas();
            //Quitando Corazones (Naves)
            switch (jugador.getVidas()) {
                case 0:
                    Vida1.setVisible(false);
                    break;
                case 1:
                    Vida2.setVisible(false);
                    break;
                case 2:
                    Vida3.setVisible(false);
                    break;
                case 3:
                    Vida4.setVisible(false);
                    break;
                case 4:
                    Vida5.setVisible(false);
                    break;
            }
            //Reseteando movimientos
            Movimientos = 0;
        }
        if (jugador.getVidas() <= 0) {
            matriz.Dibujar(matriz.getMatriz(), jugador.getPuntaje(), jugador.getVidas(), this);
            //¡Juego terminado!
            //Te quedaste sin vidas
            jugador.setJugar(false);

            Perdiste ventana = new Perdiste();
            ventana.setVisible(true);
            Game.stop();
            this.setVisible(false);
        }
        Puntaje.setText("" + jugador.getPuntaje());
        ActualizarTablero();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B00 = new javax.swing.JButton();
        B10 = new javax.swing.JButton();
        B20 = new javax.swing.JButton();
        B30 = new javax.swing.JButton();
        B40 = new javax.swing.JButton();
        B50 = new javax.swing.JButton();
        B60 = new javax.swing.JButton();
        B70 = new javax.swing.JButton();
        B80 = new javax.swing.JButton();
        B01 = new javax.swing.JButton();
        B11 = new javax.swing.JButton();
        B21 = new javax.swing.JButton();
        B31 = new javax.swing.JButton();
        B41 = new javax.swing.JButton();
        B51 = new javax.swing.JButton();
        B61 = new javax.swing.JButton();
        B71 = new javax.swing.JButton();
        B81 = new javax.swing.JButton();
        B02 = new javax.swing.JButton();
        B12 = new javax.swing.JButton();
        B22 = new javax.swing.JButton();
        B32 = new javax.swing.JButton();
        B42 = new javax.swing.JButton();
        B52 = new javax.swing.JButton();
        B62 = new javax.swing.JButton();
        B72 = new javax.swing.JButton();
        B82 = new javax.swing.JButton();
        B03 = new javax.swing.JButton();
        B13 = new javax.swing.JButton();
        B23 = new javax.swing.JButton();
        B33 = new javax.swing.JButton();
        B43 = new javax.swing.JButton();
        B53 = new javax.swing.JButton();
        B63 = new javax.swing.JButton();
        B73 = new javax.swing.JButton();
        B83 = new javax.swing.JButton();
        B04 = new javax.swing.JButton();
        B14 = new javax.swing.JButton();
        B24 = new javax.swing.JButton();
        B34 = new javax.swing.JButton();
        B44 = new javax.swing.JButton();
        B54 = new javax.swing.JButton();
        B64 = new javax.swing.JButton();
        B74 = new javax.swing.JButton();
        B84 = new javax.swing.JButton();
        B05 = new javax.swing.JButton();
        B15 = new javax.swing.JButton();
        B25 = new javax.swing.JButton();
        B35 = new javax.swing.JButton();
        B45 = new javax.swing.JButton();
        B55 = new javax.swing.JButton();
        B65 = new javax.swing.JButton();
        B75 = new javax.swing.JButton();
        B85 = new javax.swing.JButton();
        B06 = new javax.swing.JButton();
        B16 = new javax.swing.JButton();
        B26 = new javax.swing.JButton();
        B36 = new javax.swing.JButton();
        B46 = new javax.swing.JButton();
        B56 = new javax.swing.JButton();
        B66 = new javax.swing.JButton();
        B76 = new javax.swing.JButton();
        B86 = new javax.swing.JButton();
        B07 = new javax.swing.JButton();
        B17 = new javax.swing.JButton();
        B27 = new javax.swing.JButton();
        B37 = new javax.swing.JButton();
        B47 = new javax.swing.JButton();
        B57 = new javax.swing.JButton();
        B67 = new javax.swing.JButton();
        B77 = new javax.swing.JButton();
        B87 = new javax.swing.JButton();
        B08 = new javax.swing.JButton();
        B18 = new javax.swing.JButton();
        B28 = new javax.swing.JButton();
        B38 = new javax.swing.JButton();
        B48 = new javax.swing.JButton();
        B58 = new javax.swing.JButton();
        B68 = new javax.swing.JButton();
        B78 = new javax.swing.JButton();
        B88 = new javax.swing.JButton();
        Vida1 = new javax.swing.JLabel();
        Vida2 = new javax.swing.JLabel();
        Vida3 = new javax.swing.JLabel();
        Vida4 = new javax.swing.JLabel();
        Vida5 = new javax.swing.JLabel();
        PlataformNaves = new javax.swing.JLabel();
        Puntaje = new javax.swing.JLabel();
        FondoJuego = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(801, 425));
        setMinimumSize(new java.awt.Dimension(801, 425));
        setPreferredSize(new java.awt.Dimension(801, 425));
        setResizable(false);
        getContentPane().setLayout(null);

        B00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B00.setBorder(null);
        B00.setBorderPainted(false);
        B00.setContentAreaFilled(false);
        B00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B00ActionPerformed(evt);
            }
        });
        getContentPane().add(B00);
        B00.setBounds(310, 90, 23, 23);

        B10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B10.setBorder(null);
        B10.setBorderPainted(false);
        B10.setContentAreaFilled(false);
        B10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B10ActionPerformed(evt);
            }
        });
        getContentPane().add(B10);
        B10.setBounds(340, 90, 23, 23);

        B20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B20.setBorder(null);
        B20.setBorderPainted(false);
        B20.setContentAreaFilled(false);
        B20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B20ActionPerformed(evt);
            }
        });
        getContentPane().add(B20);
        B20.setBounds(370, 90, 23, 23);

        B30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B30.setBorder(null);
        B30.setBorderPainted(false);
        B30.setContentAreaFilled(false);
        B30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B30ActionPerformed(evt);
            }
        });
        getContentPane().add(B30);
        B30.setBounds(400, 90, 23, 23);

        B40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B40.setBorder(null);
        B40.setBorderPainted(false);
        B40.setContentAreaFilled(false);
        B40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B40ActionPerformed(evt);
            }
        });
        getContentPane().add(B40);
        B40.setBounds(430, 90, 23, 23);

        B50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B50.setBorder(null);
        B50.setBorderPainted(false);
        B50.setContentAreaFilled(false);
        B50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B50ActionPerformed(evt);
            }
        });
        getContentPane().add(B50);
        B50.setBounds(460, 90, 23, 23);

        B60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B60.setBorder(null);
        B60.setBorderPainted(false);
        B60.setContentAreaFilled(false);
        B60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B60ActionPerformed(evt);
            }
        });
        getContentPane().add(B60);
        B60.setBounds(490, 90, 23, 23);

        B70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B70.setBorder(null);
        B70.setBorderPainted(false);
        B70.setContentAreaFilled(false);
        B70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B70ActionPerformed(evt);
            }
        });
        getContentPane().add(B70);
        B70.setBounds(520, 90, 23, 23);

        B80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B80.setBorder(null);
        B80.setBorderPainted(false);
        B80.setContentAreaFilled(false);
        B80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B80ActionPerformed(evt);
            }
        });
        getContentPane().add(B80);
        B80.setBounds(550, 90, 23, 23);

        B01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B01.setBorder(null);
        B01.setBorderPainted(false);
        B01.setContentAreaFilled(false);
        B01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B01ActionPerformed(evt);
            }
        });
        getContentPane().add(B01);
        B01.setBounds(310, 120, 23, 23);

        B11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B11.setBorder(null);
        B11.setBorderPainted(false);
        B11.setContentAreaFilled(false);
        B11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B11ActionPerformed(evt);
            }
        });
        getContentPane().add(B11);
        B11.setBounds(340, 120, 23, 23);

        B21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B21.setBorder(null);
        B21.setBorderPainted(false);
        B21.setContentAreaFilled(false);
        B21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B21ActionPerformed(evt);
            }
        });
        getContentPane().add(B21);
        B21.setBounds(370, 120, 23, 23);

        B31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B31.setBorder(null);
        B31.setBorderPainted(false);
        B31.setContentAreaFilled(false);
        B31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B31ActionPerformed(evt);
            }
        });
        getContentPane().add(B31);
        B31.setBounds(400, 120, 23, 23);

        B41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B41.setBorder(null);
        B41.setBorderPainted(false);
        B41.setContentAreaFilled(false);
        B41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B41ActionPerformed(evt);
            }
        });
        getContentPane().add(B41);
        B41.setBounds(430, 120, 23, 23);

        B51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B51.setBorder(null);
        B51.setBorderPainted(false);
        B51.setContentAreaFilled(false);
        B51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B51ActionPerformed(evt);
            }
        });
        getContentPane().add(B51);
        B51.setBounds(460, 120, 23, 23);

        B61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B61.setBorder(null);
        B61.setBorderPainted(false);
        B61.setContentAreaFilled(false);
        B61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B61ActionPerformed(evt);
            }
        });
        getContentPane().add(B61);
        B61.setBounds(490, 120, 23, 23);

        B71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B71.setBorder(null);
        B71.setBorderPainted(false);
        B71.setContentAreaFilled(false);
        B71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B71ActionPerformed(evt);
            }
        });
        getContentPane().add(B71);
        B71.setBounds(520, 120, 23, 23);

        B81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B81.setBorder(null);
        B81.setBorderPainted(false);
        B81.setContentAreaFilled(false);
        B81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B81ActionPerformed(evt);
            }
        });
        getContentPane().add(B81);
        B81.setBounds(550, 120, 23, 23);

        B02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B02.setBorder(null);
        B02.setBorderPainted(false);
        B02.setContentAreaFilled(false);
        B02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B02ActionPerformed(evt);
            }
        });
        getContentPane().add(B02);
        B02.setBounds(310, 150, 23, 23);

        B12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B12.setBorder(null);
        B12.setBorderPainted(false);
        B12.setContentAreaFilled(false);
        B12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B12ActionPerformed(evt);
            }
        });
        getContentPane().add(B12);
        B12.setBounds(340, 150, 23, 23);

        B22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B22.setBorder(null);
        B22.setBorderPainted(false);
        B22.setContentAreaFilled(false);
        B22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B22ActionPerformed(evt);
            }
        });
        getContentPane().add(B22);
        B22.setBounds(370, 150, 23, 23);

        B32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B32.setBorder(null);
        B32.setBorderPainted(false);
        B32.setContentAreaFilled(false);
        B32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B32ActionPerformed(evt);
            }
        });
        getContentPane().add(B32);
        B32.setBounds(400, 150, 23, 23);

        B42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B42.setBorder(null);
        B42.setBorderPainted(false);
        B42.setContentAreaFilled(false);
        B42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B42ActionPerformed(evt);
            }
        });
        getContentPane().add(B42);
        B42.setBounds(430, 150, 23, 23);

        B52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B52.setBorder(null);
        B52.setBorderPainted(false);
        B52.setContentAreaFilled(false);
        B52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B52ActionPerformed(evt);
            }
        });
        getContentPane().add(B52);
        B52.setBounds(460, 150, 23, 23);

        B62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B62.setBorder(null);
        B62.setBorderPainted(false);
        B62.setContentAreaFilled(false);
        B62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B62ActionPerformed(evt);
            }
        });
        getContentPane().add(B62);
        B62.setBounds(490, 150, 23, 23);

        B72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B72.setBorder(null);
        B72.setBorderPainted(false);
        B72.setContentAreaFilled(false);
        B72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B72ActionPerformed(evt);
            }
        });
        getContentPane().add(B72);
        B72.setBounds(520, 150, 23, 23);

        B82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B82.setBorder(null);
        B82.setBorderPainted(false);
        B82.setContentAreaFilled(false);
        B82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B82ActionPerformed(evt);
            }
        });
        getContentPane().add(B82);
        B82.setBounds(550, 150, 23, 23);

        B03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B03.setBorder(null);
        B03.setBorderPainted(false);
        B03.setContentAreaFilled(false);
        B03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B03ActionPerformed(evt);
            }
        });
        getContentPane().add(B03);
        B03.setBounds(310, 180, 23, 23);

        B13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B13.setBorder(null);
        B13.setBorderPainted(false);
        B13.setContentAreaFilled(false);
        B13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B13ActionPerformed(evt);
            }
        });
        getContentPane().add(B13);
        B13.setBounds(340, 180, 23, 23);

        B23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B23.setBorder(null);
        B23.setBorderPainted(false);
        B23.setContentAreaFilled(false);
        B23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B23ActionPerformed(evt);
            }
        });
        getContentPane().add(B23);
        B23.setBounds(370, 180, 23, 23);

        B33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B33.setBorder(null);
        B33.setBorderPainted(false);
        B33.setContentAreaFilled(false);
        B33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B33ActionPerformed(evt);
            }
        });
        getContentPane().add(B33);
        B33.setBounds(400, 180, 23, 23);

        B43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B43.setBorder(null);
        B43.setBorderPainted(false);
        B43.setContentAreaFilled(false);
        B43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B43ActionPerformed(evt);
            }
        });
        getContentPane().add(B43);
        B43.setBounds(430, 180, 23, 23);

        B53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B53.setBorder(null);
        B53.setBorderPainted(false);
        B53.setContentAreaFilled(false);
        B53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B53ActionPerformed(evt);
            }
        });
        getContentPane().add(B53);
        B53.setBounds(460, 180, 23, 23);

        B63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B63.setBorder(null);
        B63.setBorderPainted(false);
        B63.setContentAreaFilled(false);
        B63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B63ActionPerformed(evt);
            }
        });
        getContentPane().add(B63);
        B63.setBounds(490, 180, 23, 23);

        B73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B73.setBorder(null);
        B73.setBorderPainted(false);
        B73.setContentAreaFilled(false);
        B73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B73ActionPerformed(evt);
            }
        });
        getContentPane().add(B73);
        B73.setBounds(520, 180, 23, 23);

        B83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B83.setBorder(null);
        B83.setBorderPainted(false);
        B83.setContentAreaFilled(false);
        B83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B83ActionPerformed(evt);
            }
        });
        getContentPane().add(B83);
        B83.setBounds(550, 180, 23, 23);

        B04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B04.setBorder(null);
        B04.setBorderPainted(false);
        B04.setContentAreaFilled(false);
        B04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B04ActionPerformed(evt);
            }
        });
        getContentPane().add(B04);
        B04.setBounds(310, 210, 23, 23);

        B14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B14.setBorder(null);
        B14.setBorderPainted(false);
        B14.setContentAreaFilled(false);
        B14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B14ActionPerformed(evt);
            }
        });
        getContentPane().add(B14);
        B14.setBounds(340, 210, 23, 23);

        B24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B24.setBorder(null);
        B24.setBorderPainted(false);
        B24.setContentAreaFilled(false);
        B24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B24ActionPerformed(evt);
            }
        });
        getContentPane().add(B24);
        B24.setBounds(370, 210, 23, 23);

        B34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B34.setBorder(null);
        B34.setBorderPainted(false);
        B34.setContentAreaFilled(false);
        B34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B34ActionPerformed(evt);
            }
        });
        getContentPane().add(B34);
        B34.setBounds(400, 210, 23, 23);

        B44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B44.setBorder(null);
        B44.setBorderPainted(false);
        B44.setContentAreaFilled(false);
        B44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B44ActionPerformed(evt);
            }
        });
        getContentPane().add(B44);
        B44.setBounds(430, 210, 23, 23);

        B54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B54.setBorder(null);
        B54.setBorderPainted(false);
        B54.setContentAreaFilled(false);
        B54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B54ActionPerformed(evt);
            }
        });
        getContentPane().add(B54);
        B54.setBounds(460, 210, 23, 23);

        B64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B64.setBorder(null);
        B64.setBorderPainted(false);
        B64.setContentAreaFilled(false);
        B64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B64ActionPerformed(evt);
            }
        });
        getContentPane().add(B64);
        B64.setBounds(490, 210, 23, 23);

        B74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B74.setBorder(null);
        B74.setBorderPainted(false);
        B74.setContentAreaFilled(false);
        B74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B74ActionPerformed(evt);
            }
        });
        getContentPane().add(B74);
        B74.setBounds(520, 210, 23, 23);

        B84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B84.setBorder(null);
        B84.setBorderPainted(false);
        B84.setContentAreaFilled(false);
        B84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B84ActionPerformed(evt);
            }
        });
        getContentPane().add(B84);
        B84.setBounds(550, 210, 23, 23);

        B05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B05.setBorder(null);
        B05.setBorderPainted(false);
        B05.setContentAreaFilled(false);
        B05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B05ActionPerformed(evt);
            }
        });
        getContentPane().add(B05);
        B05.setBounds(310, 240, 23, 23);

        B15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B15.setBorder(null);
        B15.setBorderPainted(false);
        B15.setContentAreaFilled(false);
        B15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B15ActionPerformed(evt);
            }
        });
        getContentPane().add(B15);
        B15.setBounds(340, 240, 23, 23);

        B25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B25.setBorder(null);
        B25.setBorderPainted(false);
        B25.setContentAreaFilled(false);
        B25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B25ActionPerformed(evt);
            }
        });
        getContentPane().add(B25);
        B25.setBounds(370, 240, 23, 23);

        B35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B35.setBorder(null);
        B35.setBorderPainted(false);
        B35.setContentAreaFilled(false);
        B35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B35ActionPerformed(evt);
            }
        });
        getContentPane().add(B35);
        B35.setBounds(400, 240, 23, 23);

        B45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B45.setBorder(null);
        B45.setBorderPainted(false);
        B45.setContentAreaFilled(false);
        B45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B45ActionPerformed(evt);
            }
        });
        getContentPane().add(B45);
        B45.setBounds(430, 240, 23, 23);

        B55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B55.setBorder(null);
        B55.setBorderPainted(false);
        B55.setContentAreaFilled(false);
        B55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B55ActionPerformed(evt);
            }
        });
        getContentPane().add(B55);
        B55.setBounds(460, 240, 23, 23);

        B65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B65.setBorder(null);
        B65.setBorderPainted(false);
        B65.setContentAreaFilled(false);
        B65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B65ActionPerformed(evt);
            }
        });
        getContentPane().add(B65);
        B65.setBounds(490, 240, 23, 23);

        B75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B75.setBorder(null);
        B75.setBorderPainted(false);
        B75.setContentAreaFilled(false);
        B75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B75ActionPerformed(evt);
            }
        });
        getContentPane().add(B75);
        B75.setBounds(520, 240, 23, 23);

        B85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B85.setBorder(null);
        B85.setBorderPainted(false);
        B85.setContentAreaFilled(false);
        B85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B85ActionPerformed(evt);
            }
        });
        getContentPane().add(B85);
        B85.setBounds(550, 240, 23, 23);

        B06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B06.setBorder(null);
        B06.setBorderPainted(false);
        B06.setContentAreaFilled(false);
        B06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B06ActionPerformed(evt);
            }
        });
        getContentPane().add(B06);
        B06.setBounds(310, 270, 23, 23);

        B16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B16.setBorder(null);
        B16.setBorderPainted(false);
        B16.setContentAreaFilled(false);
        B16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B16ActionPerformed(evt);
            }
        });
        getContentPane().add(B16);
        B16.setBounds(340, 270, 23, 23);

        B26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B26.setBorder(null);
        B26.setBorderPainted(false);
        B26.setContentAreaFilled(false);
        B26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B26ActionPerformed(evt);
            }
        });
        getContentPane().add(B26);
        B26.setBounds(370, 270, 23, 23);

        B36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B36.setBorder(null);
        B36.setBorderPainted(false);
        B36.setContentAreaFilled(false);
        B36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B36ActionPerformed(evt);
            }
        });
        getContentPane().add(B36);
        B36.setBounds(400, 270, 23, 23);

        B46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B46.setBorder(null);
        B46.setBorderPainted(false);
        B46.setContentAreaFilled(false);
        B46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B46ActionPerformed(evt);
            }
        });
        getContentPane().add(B46);
        B46.setBounds(430, 270, 23, 23);

        B56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B56.setBorder(null);
        B56.setBorderPainted(false);
        B56.setContentAreaFilled(false);
        B56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B56ActionPerformed(evt);
            }
        });
        getContentPane().add(B56);
        B56.setBounds(460, 270, 23, 23);

        B66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B66.setBorder(null);
        B66.setBorderPainted(false);
        B66.setContentAreaFilled(false);
        B66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B66ActionPerformed(evt);
            }
        });
        getContentPane().add(B66);
        B66.setBounds(490, 270, 23, 23);

        B76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B76.setBorder(null);
        B76.setBorderPainted(false);
        B76.setContentAreaFilled(false);
        B76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B76ActionPerformed(evt);
            }
        });
        getContentPane().add(B76);
        B76.setBounds(520, 270, 23, 23);

        B86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B86.setBorder(null);
        B86.setBorderPainted(false);
        B86.setContentAreaFilled(false);
        B86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B86ActionPerformed(evt);
            }
        });
        getContentPane().add(B86);
        B86.setBounds(550, 270, 23, 23);

        B07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B07.setBorder(null);
        B07.setBorderPainted(false);
        B07.setContentAreaFilled(false);
        B07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B07ActionPerformed(evt);
            }
        });
        getContentPane().add(B07);
        B07.setBounds(310, 300, 23, 23);

        B17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B17.setBorder(null);
        B17.setBorderPainted(false);
        B17.setContentAreaFilled(false);
        B17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B17ActionPerformed(evt);
            }
        });
        getContentPane().add(B17);
        B17.setBounds(340, 300, 23, 23);

        B27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B27.setBorder(null);
        B27.setBorderPainted(false);
        B27.setContentAreaFilled(false);
        B27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B27ActionPerformed(evt);
            }
        });
        getContentPane().add(B27);
        B27.setBounds(370, 300, 23, 23);

        B37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B37.setBorder(null);
        B37.setBorderPainted(false);
        B37.setContentAreaFilled(false);
        B37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B37ActionPerformed(evt);
            }
        });
        getContentPane().add(B37);
        B37.setBounds(400, 300, 23, 23);

        B47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B47.setBorder(null);
        B47.setBorderPainted(false);
        B47.setContentAreaFilled(false);
        B47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B47ActionPerformed(evt);
            }
        });
        getContentPane().add(B47);
        B47.setBounds(430, 300, 23, 23);

        B57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B57.setBorder(null);
        B57.setBorderPainted(false);
        B57.setContentAreaFilled(false);
        B57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B57ActionPerformed(evt);
            }
        });
        getContentPane().add(B57);
        B57.setBounds(460, 300, 23, 23);

        B67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B67.setBorder(null);
        B67.setBorderPainted(false);
        B67.setContentAreaFilled(false);
        B67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B67ActionPerformed(evt);
            }
        });
        getContentPane().add(B67);
        B67.setBounds(490, 300, 23, 23);

        B77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B77.setBorder(null);
        B77.setBorderPainted(false);
        B77.setContentAreaFilled(false);
        B77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B77ActionPerformed(evt);
            }
        });
        getContentPane().add(B77);
        B77.setBounds(520, 300, 23, 23);

        B87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B87.setBorder(null);
        B87.setBorderPainted(false);
        B87.setContentAreaFilled(false);
        B87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B87ActionPerformed(evt);
            }
        });
        getContentPane().add(B87);
        B87.setBounds(550, 300, 23, 23);

        B08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B08.setBorder(null);
        B08.setBorderPainted(false);
        B08.setContentAreaFilled(false);
        B08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B08ActionPerformed(evt);
            }
        });
        getContentPane().add(B08);
        B08.setBounds(310, 330, 23, 23);

        B18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B18.setBorder(null);
        B18.setBorderPainted(false);
        B18.setContentAreaFilled(false);
        B18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B18ActionPerformed(evt);
            }
        });
        getContentPane().add(B18);
        B18.setBounds(340, 330, 23, 23);

        B28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B28.setBorder(null);
        B28.setBorderPainted(false);
        B28.setContentAreaFilled(false);
        B28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B28ActionPerformed(evt);
            }
        });
        getContentPane().add(B28);
        B28.setBounds(370, 330, 23, 23);

        B38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B38.setBorder(null);
        B38.setBorderPainted(false);
        B38.setContentAreaFilled(false);
        B38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B38ActionPerformed(evt);
            }
        });
        getContentPane().add(B38);
        B38.setBounds(400, 330, 23, 23);

        B48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B48.setBorder(null);
        B48.setBorderPainted(false);
        B48.setContentAreaFilled(false);
        B48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B48ActionPerformed(evt);
            }
        });
        getContentPane().add(B48);
        B48.setBounds(430, 330, 23, 23);

        B58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B58.setBorder(null);
        B58.setBorderPainted(false);
        B58.setContentAreaFilled(false);
        B58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B58ActionPerformed(evt);
            }
        });
        getContentPane().add(B58);
        B58.setBounds(460, 330, 23, 23);

        B68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B68.setBorder(null);
        B68.setBorderPainted(false);
        B68.setContentAreaFilled(false);
        B68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B68ActionPerformed(evt);
            }
        });
        getContentPane().add(B68);
        B68.setBounds(490, 330, 23, 23);

        B78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B78.setBorder(null);
        B78.setBorderPainted(false);
        B78.setContentAreaFilled(false);
        B78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B78ActionPerformed(evt);
            }
        });
        getContentPane().add(B78);
        B78.setBounds(520, 330, 23, 23);

        B88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planeta1.png"))); // NOI18N
        B88.setBorder(null);
        B88.setBorderPainted(false);
        B88.setContentAreaFilled(false);
        B88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B88ActionPerformed(evt);
            }
        });
        getContentPane().add(B88);
        B88.setBounds(550, 330, 23, 23);

        Vida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VidaNaveSpaceX.png"))); // NOI18N
        getContentPane().add(Vida1);
        Vida1.setBounds(370, 350, 20, 40);

        Vida2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VidaNaveSpaceX.png"))); // NOI18N
        getContentPane().add(Vida2);
        Vida2.setBounds(400, 350, 20, 40);

        Vida3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VidaNaveSpaceX.png"))); // NOI18N
        getContentPane().add(Vida3);
        Vida3.setBounds(430, 350, 20, 40);

        Vida4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VidaNaveSpaceX.png"))); // NOI18N
        getContentPane().add(Vida4);
        Vida4.setBounds(460, 350, 20, 40);

        Vida5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VidaNaveSpaceX.png"))); // NOI18N
        getContentPane().add(Vida5);
        Vida5.setBounds(490, 350, 20, 40);

        PlataformNaves.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PlataformaNaves.png"))); // NOI18N
        getContentPane().add(PlataformNaves);
        PlataformNaves.setBounds(360, 350, 150, 50);

        Puntaje.setForeground(new java.awt.Color(255, 0, 0));
        Puntaje.setText("0000");
        getContentPane().add(Puntaje);
        Puntaje.setBounds(550, 50, 40, 20);

        FondoJuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoJuego.png"))); // NOI18N
        getContentPane().add(FondoJuego);
        FondoJuego.setBounds(0, 0, 800, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void B00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B00ActionPerformed
        CaprurarMovimiento(0, 0);
    }//GEN-LAST:event_B00ActionPerformed

    private void B10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B10ActionPerformed
        CaprurarMovimiento(1, 0);
    }//GEN-LAST:event_B10ActionPerformed

    private void B20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B20ActionPerformed
        CaprurarMovimiento(2, 0);
    }//GEN-LAST:event_B20ActionPerformed

    private void B30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B30ActionPerformed
        CaprurarMovimiento(3, 0);
    }//GEN-LAST:event_B30ActionPerformed

    private void B40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B40ActionPerformed
        CaprurarMovimiento(4, 0);
    }//GEN-LAST:event_B40ActionPerformed

    private void B50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B50ActionPerformed
        CaprurarMovimiento(5, 0);
    }//GEN-LAST:event_B50ActionPerformed

    private void B60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B60ActionPerformed
        CaprurarMovimiento(6, 0);
    }//GEN-LAST:event_B60ActionPerformed

    private void B70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B70ActionPerformed
        CaprurarMovimiento(7, 0);
    }//GEN-LAST:event_B70ActionPerformed

    private void B80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B80ActionPerformed
        CaprurarMovimiento(8, 0);
    }//GEN-LAST:event_B80ActionPerformed

    private void B01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B01ActionPerformed
        CaprurarMovimiento(0, 1);
    }//GEN-LAST:event_B01ActionPerformed

    private void B11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B11ActionPerformed
        CaprurarMovimiento(1, 1);
    }//GEN-LAST:event_B11ActionPerformed

    private void B21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B21ActionPerformed
        CaprurarMovimiento(2, 1);
    }//GEN-LAST:event_B21ActionPerformed

    private void B31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B31ActionPerformed
        CaprurarMovimiento(3, 1);
    }//GEN-LAST:event_B31ActionPerformed

    private void B41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B41ActionPerformed
        CaprurarMovimiento(4, 1);
    }//GEN-LAST:event_B41ActionPerformed

    private void B51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B51ActionPerformed
        CaprurarMovimiento(5, 1);
    }//GEN-LAST:event_B51ActionPerformed

    private void B61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B61ActionPerformed
        CaprurarMovimiento(6, 1);
    }//GEN-LAST:event_B61ActionPerformed

    private void B71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B71ActionPerformed
        CaprurarMovimiento(7, 1);
    }//GEN-LAST:event_B71ActionPerformed

    private void B81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B81ActionPerformed
        CaprurarMovimiento(8, 1);
    }//GEN-LAST:event_B81ActionPerformed

    private void B02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B02ActionPerformed
        CaprurarMovimiento(0, 2);
    }//GEN-LAST:event_B02ActionPerformed

    private void B12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B12ActionPerformed
        CaprurarMovimiento(1, 2);
    }//GEN-LAST:event_B12ActionPerformed

    private void B22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B22ActionPerformed
        CaprurarMovimiento(2, 2);
    }//GEN-LAST:event_B22ActionPerformed

    private void B32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B32ActionPerformed
        CaprurarMovimiento(3, 2);
    }//GEN-LAST:event_B32ActionPerformed

    private void B42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B42ActionPerformed
        CaprurarMovimiento(4, 2);
    }//GEN-LAST:event_B42ActionPerformed

    private void B52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B52ActionPerformed
        CaprurarMovimiento(5, 2);
    }//GEN-LAST:event_B52ActionPerformed

    private void B62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B62ActionPerformed
        CaprurarMovimiento(6, 2);
    }//GEN-LAST:event_B62ActionPerformed

    private void B72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B72ActionPerformed
        CaprurarMovimiento(7, 2);
    }//GEN-LAST:event_B72ActionPerformed

    private void B82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B82ActionPerformed
        CaprurarMovimiento(8, 2);
    }//GEN-LAST:event_B82ActionPerformed

    private void B03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B03ActionPerformed
        CaprurarMovimiento(0, 3);
    }//GEN-LAST:event_B03ActionPerformed

    private void B13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B13ActionPerformed
        CaprurarMovimiento(1, 3);
    }//GEN-LAST:event_B13ActionPerformed

    private void B23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B23ActionPerformed
        CaprurarMovimiento(2, 3);
    }//GEN-LAST:event_B23ActionPerformed

    private void B33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B33ActionPerformed
        CaprurarMovimiento(3, 3);
    }//GEN-LAST:event_B33ActionPerformed

    private void B43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B43ActionPerformed
        CaprurarMovimiento(4, 3);
    }//GEN-LAST:event_B43ActionPerformed

    private void B53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B53ActionPerformed
        CaprurarMovimiento(5, 3);
    }//GEN-LAST:event_B53ActionPerformed

    private void B63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B63ActionPerformed
        CaprurarMovimiento(6, 3);
    }//GEN-LAST:event_B63ActionPerformed

    private void B73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B73ActionPerformed
        CaprurarMovimiento(7, 3);
    }//GEN-LAST:event_B73ActionPerformed

    private void B83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B83ActionPerformed
        CaprurarMovimiento(8, 3);
    }//GEN-LAST:event_B83ActionPerformed

    private void B04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B04ActionPerformed
        CaprurarMovimiento(0, 4);
    }//GEN-LAST:event_B04ActionPerformed

    private void B14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B14ActionPerformed
        CaprurarMovimiento(1, 4);
    }//GEN-LAST:event_B14ActionPerformed

    private void B24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B24ActionPerformed
        CaprurarMovimiento(2, 4);
    }//GEN-LAST:event_B24ActionPerformed

    private void B34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B34ActionPerformed
        CaprurarMovimiento(3, 4);
    }//GEN-LAST:event_B34ActionPerformed

    private void B44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B44ActionPerformed
        CaprurarMovimiento(4, 4);
    }//GEN-LAST:event_B44ActionPerformed

    private void B54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B54ActionPerformed
        CaprurarMovimiento(5, 4);
    }//GEN-LAST:event_B54ActionPerformed

    private void B64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B64ActionPerformed
        CaprurarMovimiento(6, 4);
    }//GEN-LAST:event_B64ActionPerformed

    private void B74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B74ActionPerformed
        CaprurarMovimiento(7, 4);
    }//GEN-LAST:event_B74ActionPerformed

    private void B84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B84ActionPerformed
        CaprurarMovimiento(8, 4);
    }//GEN-LAST:event_B84ActionPerformed

    private void B05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B05ActionPerformed
        CaprurarMovimiento(0, 5);
    }//GEN-LAST:event_B05ActionPerformed

    private void B15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B15ActionPerformed
        CaprurarMovimiento(1, 5);
    }//GEN-LAST:event_B15ActionPerformed

    private void B25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B25ActionPerformed
        CaprurarMovimiento(2, 5);
    }//GEN-LAST:event_B25ActionPerformed

    private void B35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B35ActionPerformed
        CaprurarMovimiento(3, 5);
    }//GEN-LAST:event_B35ActionPerformed

    private void B45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B45ActionPerformed
        CaprurarMovimiento(4, 5);
    }//GEN-LAST:event_B45ActionPerformed

    private void B55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B55ActionPerformed
        CaprurarMovimiento(5, 5);
    }//GEN-LAST:event_B55ActionPerformed

    private void B65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B65ActionPerformed
        CaprurarMovimiento(6, 5);
    }//GEN-LAST:event_B65ActionPerformed

    private void B75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B75ActionPerformed
        CaprurarMovimiento(7, 5);
    }//GEN-LAST:event_B75ActionPerformed

    private void B85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B85ActionPerformed
        CaprurarMovimiento(8, 5);
    }//GEN-LAST:event_B85ActionPerformed

    private void B06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B06ActionPerformed
        CaprurarMovimiento(0, 6);
    }//GEN-LAST:event_B06ActionPerformed

    private void B16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B16ActionPerformed
        CaprurarMovimiento(1, 6);
    }//GEN-LAST:event_B16ActionPerformed

    private void B26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B26ActionPerformed
        CaprurarMovimiento(2, 6);
    }//GEN-LAST:event_B26ActionPerformed

    private void B36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B36ActionPerformed
        CaprurarMovimiento(3, 6);
    }//GEN-LAST:event_B36ActionPerformed

    private void B46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B46ActionPerformed
        CaprurarMovimiento(4, 6);
    }//GEN-LAST:event_B46ActionPerformed

    private void B56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B56ActionPerformed
        CaprurarMovimiento(5, 6);
    }//GEN-LAST:event_B56ActionPerformed

    private void B66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B66ActionPerformed
        CaprurarMovimiento(6, 6);
    }//GEN-LAST:event_B66ActionPerformed

    private void B76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B76ActionPerformed
        CaprurarMovimiento(7, 6);
    }//GEN-LAST:event_B76ActionPerformed

    private void B86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B86ActionPerformed
        CaprurarMovimiento(8, 6);
    }//GEN-LAST:event_B86ActionPerformed

    private void B07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B07ActionPerformed
        CaprurarMovimiento(0, 7);
    }//GEN-LAST:event_B07ActionPerformed

    private void B17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B17ActionPerformed
        CaprurarMovimiento(1, 7);
    }//GEN-LAST:event_B17ActionPerformed

    private void B27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B27ActionPerformed
        CaprurarMovimiento(2, 7);
    }//GEN-LAST:event_B27ActionPerformed

    private void B37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B37ActionPerformed
        CaprurarMovimiento(3, 7);
    }//GEN-LAST:event_B37ActionPerformed

    private void B47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B47ActionPerformed
        CaprurarMovimiento(4, 7);
    }//GEN-LAST:event_B47ActionPerformed

    private void B57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B57ActionPerformed
        CaprurarMovimiento(5, 7);
    }//GEN-LAST:event_B57ActionPerformed

    private void B67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B67ActionPerformed
        CaprurarMovimiento(6, 7);
    }//GEN-LAST:event_B67ActionPerformed

    private void B77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B77ActionPerformed
        CaprurarMovimiento(7, 7);
    }//GEN-LAST:event_B77ActionPerformed

    private void B87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B87ActionPerformed
        CaprurarMovimiento(8, 7);
    }//GEN-LAST:event_B87ActionPerformed

    private void B08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B08ActionPerformed
        CaprurarMovimiento(0, 8);
    }//GEN-LAST:event_B08ActionPerformed

    private void B18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B18ActionPerformed
        CaprurarMovimiento(1, 8);
    }//GEN-LAST:event_B18ActionPerformed

    private void B28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B28ActionPerformed
        CaprurarMovimiento(2, 8);
    }//GEN-LAST:event_B28ActionPerformed

    private void B38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B38ActionPerformed
        CaprurarMovimiento(3, 8);
    }//GEN-LAST:event_B38ActionPerformed

    private void B48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B48ActionPerformed
        CaprurarMovimiento(4, 8);
    }//GEN-LAST:event_B48ActionPerformed

    private void B58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B58ActionPerformed
        CaprurarMovimiento(5, 8);
    }//GEN-LAST:event_B58ActionPerformed

    private void B68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B68ActionPerformed
        CaprurarMovimiento(6, 8);
    }//GEN-LAST:event_B68ActionPerformed

    private void B78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B78ActionPerformed
        CaprurarMovimiento(7, 8);
    }//GEN-LAST:event_B78ActionPerformed

    private void B88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B88ActionPerformed
        CaprurarMovimiento(8, 8);
    }//GEN-LAST:event_B88ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton B00;
    public javax.swing.JButton B01;
    public javax.swing.JButton B02;
    public javax.swing.JButton B03;
    public javax.swing.JButton B04;
    public javax.swing.JButton B05;
    public javax.swing.JButton B06;
    public javax.swing.JButton B07;
    public javax.swing.JButton B08;
    public javax.swing.JButton B10;
    public javax.swing.JButton B11;
    public javax.swing.JButton B12;
    public javax.swing.JButton B13;
    public javax.swing.JButton B14;
    public javax.swing.JButton B15;
    public javax.swing.JButton B16;
    public javax.swing.JButton B17;
    public javax.swing.JButton B18;
    public javax.swing.JButton B20;
    public javax.swing.JButton B21;
    public javax.swing.JButton B22;
    public javax.swing.JButton B23;
    public javax.swing.JButton B24;
    public javax.swing.JButton B25;
    public javax.swing.JButton B26;
    public javax.swing.JButton B27;
    public javax.swing.JButton B28;
    public javax.swing.JButton B30;
    public javax.swing.JButton B31;
    public javax.swing.JButton B32;
    public javax.swing.JButton B33;
    public javax.swing.JButton B34;
    public javax.swing.JButton B35;
    public javax.swing.JButton B36;
    public javax.swing.JButton B37;
    public javax.swing.JButton B38;
    public javax.swing.JButton B40;
    public javax.swing.JButton B41;
    public javax.swing.JButton B42;
    public javax.swing.JButton B43;
    public javax.swing.JButton B44;
    public javax.swing.JButton B45;
    public javax.swing.JButton B46;
    public javax.swing.JButton B47;
    public javax.swing.JButton B48;
    public javax.swing.JButton B50;
    public javax.swing.JButton B51;
    public javax.swing.JButton B52;
    public javax.swing.JButton B53;
    public javax.swing.JButton B54;
    public javax.swing.JButton B55;
    public javax.swing.JButton B56;
    public javax.swing.JButton B57;
    public javax.swing.JButton B58;
    public javax.swing.JButton B60;
    public javax.swing.JButton B61;
    public javax.swing.JButton B62;
    public javax.swing.JButton B63;
    public javax.swing.JButton B64;
    public javax.swing.JButton B65;
    public javax.swing.JButton B66;
    public javax.swing.JButton B67;
    public javax.swing.JButton B68;
    public javax.swing.JButton B70;
    public javax.swing.JButton B71;
    public javax.swing.JButton B72;
    public javax.swing.JButton B73;
    public javax.swing.JButton B74;
    public javax.swing.JButton B75;
    public javax.swing.JButton B76;
    public javax.swing.JButton B77;
    public javax.swing.JButton B78;
    public javax.swing.JButton B80;
    public javax.swing.JButton B81;
    public javax.swing.JButton B82;
    public javax.swing.JButton B83;
    public javax.swing.JButton B84;
    public javax.swing.JButton B85;
    public javax.swing.JButton B86;
    public javax.swing.JButton B87;
    public javax.swing.JButton B88;
    private javax.swing.JLabel FondoJuego;
    private javax.swing.JLabel PlataformNaves;
    public javax.swing.JLabel Puntaje;
    public javax.swing.JLabel Vida1;
    public javax.swing.JLabel Vida2;
    public javax.swing.JLabel Vida3;
    public javax.swing.JLabel Vida4;
    public javax.swing.JLabel Vida5;
    // End of variables declaration//GEN-END:variables
}
