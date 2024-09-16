public class Pickachu extends Pokemon implements IElectrico{
    public Pickachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Pickachu ha usado placaje");

    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Pickachu ha usado araniazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pickachu ha usado mordisco");

    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pickachu ha usado impactrueno");
    }

    @Override
    public void puniotrueno() {
        System.out.println("Pickachu ha usado puniotrueno");

    }
}
