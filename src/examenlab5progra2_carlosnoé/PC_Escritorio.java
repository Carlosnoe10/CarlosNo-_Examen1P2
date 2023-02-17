package examenlab5progra2_carlosnoé;

public class PC_Escritorio extends PC {
    public int capacidadRAM;
    public int CapacidadALMA;
    public boolean TipoAlma;
    public boolean TarjetaGrafica;

    public PC_Escritorio(int capacidadRAM, int CapacidadALMA, boolean TipoAlma, boolean TarjetaGrafica, String direccionIp, String MascaradeRed, String hostName) {
        super(direccionIp, MascaradeRed, hostName);
        this.capacidadRAM = capacidadRAM;
        this.CapacidadALMA = CapacidadALMA;
        this.TipoAlma = TipoAlma;
        this.TarjetaGrafica = TarjetaGrafica;
    }

    public int getCapacidadRAM() {
        return capacidadRAM;
    }

    public void setCapacidadRAM(int capacidadRAM) {
        this.capacidadRAM = capacidadRAM;
    }

    public int getCapacidadALMA() {
        return CapacidadALMA;
    }

    public void setCapacidadALMA(int CapacidadALMA) {
        this.CapacidadALMA = CapacidadALMA;
    }

    public boolean isTipoAlma() {
        return TipoAlma;
    }

    public void setTipoAlma(boolean TipoAlma) {
        this.TipoAlma = TipoAlma;
    }

    public boolean isTarjetaGrafica() {
        return TarjetaGrafica;
    }

    public void setTarjetaGrafica(boolean TarjetaGrafica) {
        this.TarjetaGrafica = TarjetaGrafica;
    }

    public String getDireccionIp() {
        return direccionIp;
    }

    public void setDireccionIp(String direccionIp) {
        this.direccionIp = direccionIp;
    }

    public String getMascaradeRed() {
        return MascaradeRed;
    }

    public void setMascaradeRed(String MascaradeRed) {
        this.MascaradeRed = MascaradeRed;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    @Override
    public String toString() {
        return "PC_Escritorio{" + "capacidadRAM=" + capacidadRAM + ", CapacidadALMA=" + CapacidadALMA + ", TipoAlma=" + TipoAlma + ", TarjetaGrafica=" + TarjetaGrafica + '}';
    }


    
    
}
