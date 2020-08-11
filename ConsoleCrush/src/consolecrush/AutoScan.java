package consolecrush;

public class AutoScan {

    public boolean AutoScann(int[][] matriz) {
        int cont = 0;
        boolean retorno = false;
        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz.length; x++) {
                //Caso 1 (minimo 2 3 casillas en uno de sus lados de frente)
                //Abajo
                try {
                    if (matriz[y + 2][x] == matriz[y][x]) {
                        cont++;
                    }
                } catch (Exception e) {
                }
                try {
                    if (matriz[y + 3][x] == matriz[y][x]) {
                        cont++;
                    }
                } catch (Exception e) {
                }
                if (cont == 2) {//Case1
                    retorno = true;
                    break;
                }
                //Arriba
                cont = 0;
                try {
                    if (matriz[y - 2][x] == matriz[y][x]) {
                        cont++;
                    }
                } catch (Exception e) {
                }
                try {
                    if (matriz[y - 3][x] == matriz[y][x]) {
                        cont++;
                    }
                } catch (Exception e) {
                }
                if (cont == 2) {//Cased1
                    retorno = true;
                    break;
                }
                //Derecha
                cont = 0;
                try {
                    if (matriz[y][x + 2] == matriz[y][x]) {
                        cont++;
                    }
                } catch (Exception e) {
                }
                try {
                    if (matriz[y][x + 3] == matriz[y][x]) {
                        cont++;
                    }
                } catch (Exception e) {
                }
                if (cont == 2) {//Case1
                    retorno = true;
                    break;
                }
                //Izquierda
                cont = 0;
                try {
                    if (matriz[y][x - 2] == matriz[y][x]) {
                        cont++;
                    }
                } catch (Exception e) {
                }
                try {
                    if (matriz[y][x - 3] == matriz[y][x]) {
                        cont++;
                    }
                } catch (Exception e) {
                }
                if (cont == 2) {//Case1

                    retorno = true;
                    break;
                }
                //Caso 2 (minimo 2 hacia un lado pero no de frente)
                //Arriba/Abajo
                cont = 0;
                try {
                    if (matriz[y + 1][x - 1] == matriz[y][x]) {
                        cont++;
                    }
                } catch (Exception e) {
                }
                try {
                    if (matriz[y + 2][x - 1] == matriz[y][x]) {
                        cont++;
                    }
                } catch (Exception e) {
                }
                if (cont == 2) {
                    retorno = true;
                    break;
                }
                cont = 0;
                try {
                    if (matriz[y - 1][x - 1] == matriz[y][x]) {
                        cont++;
                    }
                } catch (Exception e) {
                }
                try {
                    if (matriz[y - 2][x - 1] == matriz[y][x]) {
                        cont++;
                    }
                } catch (Exception e) {
                }
                if (cont == 2) {
                    retorno = true;
                    break;
                }
                cont = 0;
                try {
                    if (matriz[y + 1][x + 1] == matriz[y][x]) {
                        cont++;
                    }
                } catch (Exception e) {
                }
                try {
                    if (matriz[y + 2][x + 1] == matriz[y][x]) {
                        cont++;
                    }
                } catch (Exception e) {
                }
                if (cont == 2) {
                    retorno = true;
                    break;
                }
                cont = 0;
                try {
                    if (matriz[y + 1][x + 1] == matriz[y][x]) {
                        cont++;
                    }
                } catch (Exception e) {
                }
                try {
                    if (matriz[y + 2][x + 1] == matriz[y][x]) {
                        cont++;
                    }
                } catch (Exception e) {
                }
                if (cont == 2) {
                    retorno = true;
                    break;
                }
                cont = 0;
                //Derecha/Izquierda
                try {
                    if (matriz[y + 1][x + 1] == matriz[y][x]) {
                        cont++;
                    }
                } catch (Exception e) {
                }
                try {
                    if (matriz[y + 1][x + 2] == matriz[y][x]) {
                        cont++;
                    }
                } catch (Exception e) {
                }
                if (cont == 2) {
                    retorno = true;
                    break;
                }
                cont = 0;
                try {
                    if (matriz[y - 1][x + 1] == matriz[y][x]) {
                        cont++;
                    }
                } catch (Exception e) {
                }
                try {
                    if (matriz[y - 1][x + 2] == matriz[y][x]) {
                        cont++;
                    }
                } catch (Exception e) {
                }
                if (cont == 2) {
                    retorno = true;
                    break;
                }
                cont = 0;
                try {
                    if (matriz[y + 1][x - 1] == matriz[y][x]) {
                        cont++;
                    }
                } catch (Exception e) {
                }
                try {
                    if (matriz[y + 1][x - 2] == matriz[y][x]) {
                        cont++;
                    }
                } catch (Exception e) {
                }
                if (cont == 2) {
                    retorno = true;
                    break;
                }
                cont = 0;
                try {
                    if (matriz[y - 1][x - 1] == matriz[y][x]) {
                        cont++;
                    }
                } catch (Exception e) {
                }
                try {
                    if (matriz[y - 1][x - 2] == matriz[y][x]) {
                        cont++;
                    }
                } catch (Exception e) {
                }
                if (cont == 2) {
                    retorno = true;
                    break;
                }else{
                //No quedan fmovimientos posibles
                retorno = false;
                }
                cont=0;
            }
            if (retorno) {
                break;
            }
        }
        return retorno;
    }

    public boolean AutoPoints(Matriz m,int[][] matriz, Jugador jugador) {
        boolean retorno = false;
        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz.length; x++) {
                if (m.Movimiento(x, y, x, y, true, jugador,matriz,true)) {
                    //System.out.println("======================================================================Extra===============================================================");
                    retorno=true;
                }
            }
        }
        return retorno;
    }

    public AutoScan() {
    }
}
