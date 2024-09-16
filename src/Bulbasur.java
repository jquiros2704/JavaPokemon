public class Bulbasur extends Pokemon implements IPlanta{
    public Bulbasur() {
    }


    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasur ha usado placaje");

    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Bulbasur ha usado araniazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulbasur ha usado mordisco");

    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasur ha usado paralizar");

    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasur ha usado drenaje");

    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Bulbasur ha usado latigo cepa");

    }
}
