package camara;

public class Raft {

    private ObiectDinCamara[] obiecte = new ObiectDinCamara[10];

    public void afisare() {
        System.out.print("(");
        for (int i = 0; i < obiecte.length; i++) {
            if (obiecte[i] != null) {
                obiecte[i].afisare();
            } else {
                System.out.print("_");
            }
            if (i < obiecte.length - 1)
                System.out.print(",");
        }
        System.out.println(")");
    }

    public boolean isEmpty() {
        boolean empty = true;
        for (ObiectDinCamara obj : obiecte)
            empty = empty && (obj == null);
        return empty;
    }

    public boolean adauga(ObiectDinCamara obiect) {
        for (int i = 0; i < obiecte.length; i++)
            if (obiecte[i] == null) {
                obiecte[i] = obiect;
                return true;
            }
        return false;
    }
    }

