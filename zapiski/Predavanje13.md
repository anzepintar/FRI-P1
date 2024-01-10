# Programiranje - 10. 01. 2024

## Vmesnik List

```java
List<Cas> seznam = new LinkedList<>();
seznam.add(new Cas(10, 35));
seznam.add(new Cas(4, 55));
seznam.add(0, new Cas(15, 10));
seznam.add(1, new Cas(21, 20));
System.out.println(seznam); // [15:10, 21:20, 10:35, 4:55]
seznam.remove(1);

System.out.println(seznam); // [15:10, 10:35, 4:55]
System.out.println(seznam.size()); // 3

System.out.println(seznam.indexOf(new Cas(10, 20))); // -1
System.out.println(seznam.indexOf(new Cas(4, 55))); // 2

```

```java
seznam.last();
seznam.ceiling()
seznam.headSet(); // množica elementov, ki so manjši ali enaki podanemu elementu
// ne ustvari nove množice -
// množici postaneta povezani (kot neka lupa, ki se osredotoči na določene elemente)
seznam.tailSet(); // množica elementov, ki so večji ali enaki podanemu elementu

```

## TreeSet

```java
// razred Cas implementira Comparable<Cas>
NavigableSet<Cas> mnozica = new TreeSet<>();
mnozica.addAll(List.of(
    new Cas(10, 35), new Cas(10, 35), new Cas(6, 50),
    new Cas(5, 15), new Cas(23, 40), new Cas(12, 0)));
System.out.println(mnozica); // [5:15, 6:50, 10:35, 12:00, 23:40]
System.out.println(mnozica.last()); // 23:40
System.out.println(mnozica.floor(new Cas(13, 0))); // 12:00
Set<Cas> pod = mnozica.headSet(new Cas(12, 0), false);
System.out.println(pod); // [5:15, 6:50, 10:35]

pod.remove(new Cas(6, 50));
System.out.println(pod); // [5:15, 10:35]
System.out.println(mnozica); // [5:15, 10:35, 12:00, 23:40]

```

## Slovar - HashMap in TreeMap

```java
// v razredu Cas sta redefinirani metodi equals in hashCode
Map<Cas, String> opravki = new HashMap<>();
opravki.put(new Cas(8, 15), "predavanja");
opravki.put(new Cas(11, 10), "govorilne ure");
opravki.put(new Cas(12, 30), "kosilo");
opravki.put(new Cas(14, 0), "sestanek");
opravki.put(new Cas(18, 30), "večerja");

System.out.println(opravki); // {18:30=večerja, 14:00=sestanek, ...}
System.out.println(opravki.get(new Cas(12, 0))); // null
System.out.println(opravki.get(new Cas(14, 0))); // sestanek
System.out.println(opravki.containsKey(new Cas(8, 15))); // true
opravki.remove(new Cas(14, 0));
System.out.println(opravki);
// {18:30=večerja, 11:10=govorilne ure, 12:30=kosilo, 8:15=predavanja}

for (Cas cas: opravki.keySet()) {
    System.out.printf("%s -> %s%n", cas, opravki.get(cas));
}
```

## Funkcijski vmesnik

Vmesnik z eno samo metodo (comparable, itarable ...)

## Anonimni notranji razred

## Lambde

Deluje podobno kot anonimni notranji razred, napišemo samo telo metode

```java
public class Oseba {
...
    public static Comparator<Oseba> primerjalnikSpolStarost() {
        return (Oseba prva, Oseba druga) -> {
            if (prva.spol != druga.spol) {
                return druga.spol - prva.spol;
            }
            return prva.letoRojstva - druga.letoRojstva;
        };
    }
}

```
