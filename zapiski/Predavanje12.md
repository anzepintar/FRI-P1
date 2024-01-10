# Programiranje t11 - 3. 1. 2024

## Vsebovalniki

- Collection:
  - Set:
    - HashSet
    - NavigableSet:
      - TreeSet
  - List:
    - ArrayList
    - LinkedList
- Map:
  - HashMap
  - NavigableMap:
    - TreeMap

### Collection

Množica elementov - elementi se ne morejo podvajati

```java
Collection<String> zbirka = new HashSet<>();
zbirka.add("Ana");
zbirka.add("Bojan");
System.out.println(zbirka);
for(String element: zbirka) {
    System.out.println(element);
}

zbirka.addAll(List.of("Franci", "Niko"));
System.out.println(zbirka.contains("Franci")); // false

System.out.println(zbirka.contains(List.of("Lojzek", "Niko")));

zbirka.remove("Franci");

zbirka.removeAll(List.of("Ana", "Bojan"));
// presek z zbirko - ostaneta Hinko in Niko
zbirka.retainAll(List.of("Hinko", "Niko"));

zbirka.size();
zbirka.isEmpty();
zbirka.clear();


ArrayList<String> alist = new ArrayList<>();
alist.sort();
alist.indexOf("niz");

```

#### ArrayList proti LinkedList

LinkedList uporabimo, če pričakujemo veliko dodajanj in odvzemanj na poljubnih položajih
