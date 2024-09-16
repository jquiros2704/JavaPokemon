//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Pickachu pickachu = new Pickachu();
        Bulbasur bulbasur = new Bulbasur();
        Charmander charmander = new Charmander();

        squirtle.atacarAraniazo();
        squirtle.atacarBurbuja();
        charmander.atacarAraniazo();
        charmander.atacarlanzallamas();
        bulbasur.atacarAraniazo();
        bulbasur.atacarLatigoCepa();
        pickachu.atacarAraniazo();
        pickachu.atacarImpactrueno();


    }
}