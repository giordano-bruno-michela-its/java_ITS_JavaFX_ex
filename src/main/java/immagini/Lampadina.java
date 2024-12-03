package immagini;

public class Lampadina {
    private boolean accesa;
    private boolean rotta;
    private int nClick;
    private int clickMax;
    
    public Lampadina(int clickMax) {
        this.clickMax = clickMax;
        this.accesa = false;
        this.rotta = false;
        this.nClick = 0;
    }

    public boolean isAccesa() {
        return accesa;
    }

    public void setAccesa(boolean accesa) {
        this.accesa = accesa;
    }

    public boolean isRotta() {
        return rotta;
    }

    public void setRotta(boolean rotta) {
        this.rotta = rotta;
    }

    public int getClick() {
        return nClick;
    }

    public void setClick(int click) {
        this.nClick = click;
    }

    public int getClickMax() {
        return clickMax;
    }

    public void setClickMax(int clickMax) {
        this.clickMax = clickMax;
    }

    public String stato() {
        String state="";
        if(this.isRotta()) {
            state="rotta";
        }else {
            if (this.isAccesa()) {
                state="accesa";
            }else {
                state="spenta";
            }
        }
        return "La lampadina è "+state+"\n Numero di click: "+this.nClick;
    }

    public void click() {
        if (this.nClick < this.clickMax) {
            this.accesa = !this.accesa;
            this.nClick++;
        } else
        {
            this.rotta = true;
        }
    }
}
