package examenlab5progra2_carlosnoé;

public class PC_Escritorio extends PC {
    public String capacidadRAM;
    public String CapacidadALMA;
    public String TipoAlma;
    public boolean TarjetaGrafica;

    public PC_Escritorio(String capacidadRAM, String CapacidadALMA, String TipoAlma, boolean TarjetaGrafica, String direccionIp, String MascaradeRed, String hostName) {
        super(direccionIp, MascaradeRed, hostName);
        this.capacidadRAM = capacidadRAM;
        this.CapacidadALMA = CapacidadALMA;
        this.TipoAlma = TipoAlma;
        this.TarjetaGrafica = TarjetaGrafica;
    }

    public String getCapacidadRAM() {
        return capacidadRAM;
    }

    public void setCapacidadRAM(String capacidadRAM) {
        this.capacidadRAM = capacidadRAM;
    }

    public String getCapacidadALMA() {
        return CapacidadALMA;
    }

    public void setCapacidadALMA(String CapacidadALMA) {
        this.CapacidadALMA = CapacidadALMA;
    }

    public String isTipoAlma() {
        return TipoAlma;
    }

    public void setTipoAlma(String TipoAlma) {
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
        return super.toString()+"\n"
                + "PC Escritorio\n"
                + "capacidad RAM" + capacidadRAM + "\n"
                + "Capacidad Almacenamiento " + CapacidadALMA + "\n"
                + " Tipo Almacenamiento " + TipoAlma + "\n"
                + " Tarjeta Grafica" + TarjetaGrafica;
    }


    
    
}
