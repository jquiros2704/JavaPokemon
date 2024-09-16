public class Charmander extends Pokemon implements IFuego{
    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander ha usado placaje");

    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Charmander ha usado araniazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander ha usado mordisco");

    }

    @Override
    public void atacarpuniofuego() {
        System.out.println("Charmander ha usado punio fuego");

    }

    @Override
    public void atacarlanzallamas() {
        System.out.println("Charmander ha usado lanzallamas");

    }

    @Override
    public void atacarascuas() {
        System.out.println("Charmander ha usado ascuas");

    }
}
