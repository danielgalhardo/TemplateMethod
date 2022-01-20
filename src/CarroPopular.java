public class CarroPopular extends AutomovelTemplate{
    @Override
    public void arrumarBase()
    {
        this.base = "simples";
    }

    @Override
    public void arrumarCarcaca()
    {
        this.carcaca = "simples";
    }

    @Override
    public void pintura()
    {
        this.pintura = "padrao";
    }

    @Override
    public void fixInterior()
    {
        this.interior = "padrao";
    }
}
