public class Squirtle extends Pokemon implements IAgua{
    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle ha usado placaje");

    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Squirtle ha usado araniazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle ha usado mordisco");

    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle ha usado hidrobomba");

    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle ha usado pistola de agua");

    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle ha usado burbuja");

    }
}
