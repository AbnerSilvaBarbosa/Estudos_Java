package Relação;

public class ClassePrinciapal {

    public static void main(String[] args) {

      Lutador[] l = new Lutador[6];

      l[0] = new Lutador("Abner0","Brasil",18, (float) 1.65,100,9,60,20);
      l[1] = new Lutador("Abner1","Brasil",18, (float) 1.65,60,9,60,20);
      l[2] = new Lutador("Abner2","Brasil",18, (float) 1.65,50,9,60,20);
      l[3] = new Lutador("Abner3","Brasil",18, (float) 1.65,50,9,60,20);
      l[4] = new Lutador("Abner4","Brasil",18, (float) 1.65,50,9,60,20);
      l[5] = new Lutador("Abner5","Brasil",18, (float) 1.65,50,9,60,20);

      Luta ring1 = new Luta(l[0],l[1]);

      ring1.marcarLuta();
      ring1.lutar();




    }




}
