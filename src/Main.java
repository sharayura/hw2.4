public class Main {
    public static void main(String[] args) {

        var gazel = new Herbivores("газель", "Даша", 5, null, 25, "листья");
        var giraf = new Herbivores("жираф", "Руслан", 3, "Африка", 10, "листья");
        var loshad = new Herbivores("лошадь", "Зоя", 4, null, 20, "трава");

        var giena = new Predators("гиена", "Шакал", 3, "саванна", 13, "падаль");
        var tigr = new Predators("тигр", "Шерхан", 10, "джунгли", 20, "добыча");
        var medved = new Predators("медведь", "Миша", 5, "лес", 10, "все");

        var lyagushka = new Amphibians("лягушка", null, 1, "болото");
        var uzh = new Amphibians("уж пресноводный", null, 1, null);

        var pavlin = new NotFlyingBirds("павлин", "Виктор", 2, null, "ходьба");
        var pingvin = new NotFlyingBirds("пингвин", null, 3, "льды", "ходьба и плаванье");
        var dodo = new NotFlyingBirds("птица додо", "Жак", 2, null, null);

        var chaika = new FlyingBirds("чайка", "Джонатан", 2, "море", "полет");
        var albatros = new FlyingBirds("альбатрос", "Флетчер", 1, "море", "полет");
        var sokol = new FlyingBirds("сокол", null, 3, "лес", "полет");

        System.out.println(gazel);
        System.out.println(giraf);
        System.out.println(loshad);
        System.out.println(giena);
        System.out.println(tigr);
        System.out.println(medved);
        System.out.println(lyagushka);
        System.out.println(uzh);
        System.out.println(pavlin);
        System.out.println(pingvin);
        System.out.println(dodo);
        System.out.println(chaika);
        System.out.println(albatros);
        System.out.println(sokol);


    }
}