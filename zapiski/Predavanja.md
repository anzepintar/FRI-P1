# Programiranje - 04. 10. 2023

## Osnovni pojmi

-   program - datoteka z navodili računalniku
-   programiranje
-   programski jezik
-   java - primer programskega jezika

## Osnove jave

-   platformna neodvisnost,
-   javanski navidezni stroj (JVM)
-   Jshell - java console

### Osnovne aritmetične operacije

Operator pomen primer izraza vrednost

------------------------------------------------------------------------

\+ seštevanje 4 + 3 7 - odštevanje 2 - 6 -4 \* množenje 3 \* 5 15 /
deljenje 7 / 2 3 / deljenje 7.0 / 2 3.5 % ostanek pri deljenju 7 % 2 1

### Omejitve

`Integer.MAX_VALUE`

### Spremenljivke

``` java
int a = 5;
int b = a + 1;
double d = 2.0;
double povprecje = (a + b + c) / 3; // 5 + 6 + 2.0 = 13 -> 13.0 / 3 = 4

double x = 5.0;
int y = (int) x; // izrecna pretvorba tipa - casting

double novoPovprecje = ((double)(a + b + c)) / 3.0; // 13.0 / 3.0 ->4,33

char stevka = '1'; // A -> 65, a -> 96 ...int
(int) stevka; // 49, ker je ASCII koda od 1 -> 49
(char) ('c' - 'a' + 'A') // C
```

Spremenljivke ohranjajo vrednost, razen če jih eksplicitno nastavimo

### Prvi program

Hello World

Računanje starosti iz leta rojstva

[Pozdrav.java](primeri/Pozdrav.java)

# Programiranje - 11. 10. 2023

## Izrazi

-   vrednost: 42, 7.3, 'A', "abc", true
-   tip: int, double, char, String, boolean
-   spremenljivka: int a
-   izraz: 1 + 2, 3 \> 4
-   stavek: `System.out.println("abc")`

## Krmilni stavki

``` java
if (pogoj) {
  stavki
}
else {
  stavki2
}
```

[Vecje.java](primeri/Vecje.java)

[Vecje2.java](primeri/Vecje2.java)

### Operatorji

Operator Pomen Primer izraza za true

------------------------------------------------------------------------

\> večji od 5 \> 3 \>= večji ali enak od 8 \>= 2 \< manjši od 4 \< 9 \<=
manjši ali enak od 7 \<= 7 == enak kot 3 == 3 != različen od 2 != 5

### Zaporedje operacij

! ima prednost pred &&, && ima prednost pred \|\|

[Prestopno.java](primeri/Prestopno.java)

## Zanke

### Zanka WHILE

``` java
int i = 1
while (i <= 3){
  System.out.println("a");
  i = i+1;
}
System.out.println("b");
```

i izpis

------------------------------------------------------------------------

1 a 2 a 3 a 4 b

[Sestevanje.java](primeri/Sestevanje.java)

#### Okrajšave

``` java
a = a + b; // navadno
a += b; // okrajšava
a = a + 1; // navadni zapis inkrementa
a += 1; // inkrement zapisan na krajše
a++; // kratek zapis inkrementa - najprej se shrani in nato poveča
++a; // najprej se poveča spremenljivka in se nato shrani
a--;
--a;
```

[Sestevanje2.java](primeri/Sestevanje2.java)

## Zanka DO

``` java
do {
  stavki;
} while (pogoj)
```

Zanka se vsaj enkrat izvrši

[Nadlegovanje](primeri/Nadlegovanje.java)

## Zanka FOR

``` java
for (inicializacija, pogoj, posodobitev) {
  stavki;
}
```

Uporablja se za intervale števil

Primer:

``` java
for (int i = 1; i <= 3; i++) {
  System.out.println("a");
}
System.out.println("b");
```

[Sestevanje2For.java](primeri/Sestevanje2For.java)

[Najboljsi](primeri/Najboljsi.java)

# Programiranje - 18. 10. 2023

## Primeri programov

[Ugibanje](primeri/Ugibanje.java)

[Deljitelji](primeri/Deljitelji.java)

[Postevanka](primeri/Postevanka)

## Praštevila

[Prastevila1](primeri/Prastevila1.java)

### Boljši izpis

``` java
System.out.printf("Sem %s %s. Doma sem iz %s.", ime, priimek, dom);
System.out.printf("Zaokroženo =  <%4d>, a");
```

### Stavek break in continue

``` java
zanka {
    break; // prekine zanko (enako kot da bi bil pogoj že dosežen)
    .
    .
    .
    continue; // preskoči vse do konca zanke a nadaljuje z zanko v naslednji iteraciji
}
```

# Programiranje - 25. 10. 2023

## Switch

``` java
switch (izraz) {
    case konstanta_1:
        stavki_1
        break;
    case konstanta_2:
        stavki_2
        break;
    //...
    case konstanta_n:
        stavki_n
        break;
    default:
        stavki_{n+1}
        break;
}
```

Konstanta:

-   int
-   byte
-   char
-   String (samo v novejših verzijah jave)

[Ocene.java](primeri/Ocene.java)

### Dostopnost spremenljivk v switch stavku

Spremeljivke so dostopne v blokuzavitih oklepajev. Če želimo dodati
spremenljivke v case stavek dodamo zavite oklepaje, da je spremenljivka
dostopna samo v tem določenem case stavku.

## Pogojni operator (? stavek)

``` java
(pogoj)?(izraz_1):(izraz_2); // pogoj == true -> izraz_1, pogoj == false -> izraz_2
// primer
int c = (a >= 3)?(7):(10);
```

## Metode

``` java
public static void metoda(Tip ime, Tip ime2 ...) {
    ...
}

public static void ...(...) {
    metoda(...)
}
```

[Kriz1.java](primeri/Kriz1.java)

### Rekurzija

#### Fibonaccijevo zaporedje

0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 24

[Fibonacci.java](primeri/Fibonacci.java)

# Programiranje - 08. 11. 2023

## Tabele

Tabela je zaporedje spremenljivk istega tipa. Posamezne spremenljivke so
dosegljive prek indeksov. Spremenljivke se imenujejo elementi tabele.
Indeksi tečejo od 0 do n-1

``` java
int[] tabela = new int[5];
//                  0, 0, 0, 0, 0
int[] tabela = {1, 2, 3, 4, 5};
int[] tabela = new int[]{1, 2, 3, 4, 5};

// nastavljanje vrednost
tabela[1] = 5;

// dolžina tabele

tabela.length;
```

[Sprehod.java](primeri/Sprehod.java)
[Iskanje.java](primeri/Iskanje.java)

### Urejanje z navadnim vstavljanjem

[NavadnoVstavljanje.java](primeri/NavadnoVstavljanje.java)

# Programiranje - 15. 11. 2023

## Eraotstenovo Sito

[EratostenovoSito.java](primeri/EratostenovoSito.java)

## Fibonaccijevo zaporedje z iteracijo

Postopek se imenuje *memoizacija*

[FibonacciMemo](primeri/FibonacciMemo.java)

## Primitivni in referenčni tipi

Primitivni: byte, short, int, long, float, double, boolean, char

-   vsebujejo neko vrednost

Referenčni tipi: T\[\], String, Scanner

-   vsebujejo pomnilniški naslov (kazalec/referenca) tega podatka

## Prenašanje parametrov

``` java
public stativ void main(String[] args){
    int a = 42;
    int[] t = {1,2,3};
    int[] u = {4,5,6};
    int[] v = {a,t,u};
}

public static int[] f(int aa, int[] tt, int[] uu){
    aa = 66;
    tt[1] = 10;
    uu = new int[]{7,8};
    return uu;
}
```

## Dvodimenzionalna tabela

``` java
Tip[][] t = new Tip[m][n];
```

### Stopničasta 2D tabela

``` java
int n = 5;
int [][] t = new int[n][];
for(int i = 0; i < n; i++){
    new int[i + 1];
}
/*
       []
      [][]
     [][][]
    [][][][]
   [][][][][]
*/
```

``` java
System.out.println(Arrays.deepToString(tabela));
// izpiše vse nivoje tabele
```

[Tabela2d](primeri/Tabela2d.java)

# Programiranje - 13. 12. 2023

## Razred Object

Nadrazred vseh razredov v javi. Pred lastno uporabo moramo redefinirati
te metode z @Override.

``` java
@Override
public String toString(){}
public boolean equals(Object obj){}
public int hashCode(){}

// izpis lahko direktno kličemo - sam posredno pokliče metodo toString
Cas cas = new Cas(10, 35);
System.out.println(cas.toString()); // 10:35
System.out.println(cas); // 10:35
// Oboje izpiše enako
// privzeto primerja po kazalcih in ne po atributih
@Override
public boolean equals(Object obj){
    if(this = obj){
        return true;
    }
    if(!(obj instanceOf Cas)){
        return false;
    }
    Cas drugi = (Cas) obj;
    return this.ura == drugi.ura && this.minuta == drugi.minuta;
}
// ko redefinramo equals moramo redefiniratio tudi hashCode()
obj.hashCode() // vrne število, ki se izračuna na podlagi pomilniškega naslova objekta

@Override
    public int hashCode() {
    return (17 * Integer.hashCode(this.ura) +
    31 * Integer.hashCode(this.minuta));
}
// metoda hashCode naj bi bila usklajena z metodo equals
a.equals(b) ==> (a.hashCode() == b.hashCode());
// zaželeno je da velja tudi <==
```

## Primitivni in ovojni tipi

``` java
int a = 10;
Integer b = Integer.valueOf(10);
// podobo, a z drugimi lastnostmi: npr. 0 proti null, ko ustvarimo
// vsak primitivni tip ima svoj ovojni tip
// retvarjanje
Integer c = Integer.valueOf(a);
int d = b.intValue();
// obstaja tudi samodejno pretvarjanje imenovano autoboxing
//- prevajalnik samodejno izvede metodo .valueOf() ali .intValue
```

## Slovar

Kot tabela, pri kateri so ključi karkoli namesto številke

Osnovna implementacija: tabela parov ključ-vrednost (vektor)

Lahko uporabimo hashCode in modul, da nastavimo lokacije

# Programiranje - 20. 12. 2023

## Generični razredi

``` java
class VektorInt{
    private int[] tabela;
}

class VektorString{
    private String[] tabela;
}

class VektorObject{
    private Object[] tabela;
}

VektorObject v = new VektorObject();
v.dodaj("abc");
Object obj = v.vrni(0);
String niz = (String) obj;
Cas cas = (Cas) obj; // deluje samo ko je obj insanca razreda ali podrazreda časa
// če obj ni instanca razreda to vidimo šele po izvedbi prgrama.
// Ker želimo to ugotoviti prej, uvedemo vektor.
```

[Ovojnik.java](primeri/Ovojnik.java)

``` java
public class GenOvojnik<T> {
    private T a;
    public GenOvojnik(T a){
        this.a = a;
    }
    public T vrni(){
        return this.a;
    }
}

class TestGenOvojnik {
    public static void main(String[] args){
        GenOvojnik<String> p = newtem.out. GenOvojnik<String>("Dober dan");
        GenOvojnik<String> p2 new GenOvojnik<>("Dober dan"); // drug zapis
        String s = p.vrni();
        System.out.println(s);

        GenOvojnik<Cas> q = new GenOvojnik<Cas>(new Cas(10, 20));
    GenOvojnik<Cas> q2 = new GenOvojnik<>(new Cas(10, 20)); // drug zapis
        Cas c = q.vrni();
        System.out.println(c.plus(5, 20));
        Object o = q.vrni();
        System.out.println(((Cas) o).plus(5, 20));
    }
}
```

Generiki so neki avtomatsko generirani razredi, ki se ustvarijo, ko
dobijo podan tip razreda. Prevajalnik prevede generike v type caste.
Temu procesu se reče type erasure.

Generiki obstajajo samo v času prevajanja. Izvajalnik ne prepozna
generikov.

## Generične metode

``` java
public static <T> int poisci(T[] tabele, t iskani){
    for(int i = 0; i < tabela.length; i++){
        if (tabela[i].equals(iskani)){
            return i;
        }
    }
    return -1;
}
// klic metode
poisci(stevila, 25);
GenIskanje.<Cas>poisci(casi, new Cas(20,10)); // na dolgo
```

Tipnega parametra `<T>`{=html} ni mogoče nadomestiti s primitivnim
tipom.

## Vmesniki

Vmesnik je abstraktni razred z določenimi omejitvami.

Lahko vsebuje le: abstraktne, statične in privzete (default) metode ter
statične konstante (static final).

``` java
public abstract int pretvori(String niz);
// lahko napišemo kot
int pretvor(String niz);
// razred implementira vmesnik če implementira vse njegove abstraktne metode
public interface Narisljiv {
    public abstract void narisi(Platno platno);
}
public interface Izracunljiv {
    public abstract int ploscina();
    public abstract int obseg();
}

public class Pravokotnik implements Narisljiv, Izracunljiv{
    @Override
    public void narisi(Platno platno){

    }

    @Override
    public int ploscina(){

    }

    @Override
    public int obseg(){

    }
}
```

### Vmesnik Comparable

Objekte tega razreda je mogoče primerjati med seboj - določimo naravno
urejenost

``` java
public interface Compareable<T>{
    public abstract int compareTo(T drugi);
}
...
public abstract int compareTo(T drugi)
```

### Vmesnik Comparator

``` java
public interface Comparator<T> {
    public abstract int compare(T prvi, T drugi);
}
```

### Vmesnik Iterator

objekt, ki omogoča zaporedni sprehod po elemetnih vsebovalnika, npr.
tabela, vektor, slovar

``` java
public interface Iterator<T> {
    public abstract boolean hasNext();
    public abstract T next();
}
```

metoda hasNext vrne true natanko tedaj, ko se v vsebovalniku nahaja še
kak element

metoda next vrne naslednji element vsebovalnika:

-   če takega elementa ni, sproži izjemo tipa NoSuchElementException

### Vmesnik Iterable

vrne objekt tipa Iterator, ki omogoča zaporedni sprehod povsebovalniku
this

če nek objekt defenira Iterable se lahko po njem sprehodimo s for each

``` java
public interface Iterable<T> {
    public abstract Iterator<T> iterator();
}
```

# Programiranje - 03. 01. 2024

## Vsebovalniki

-   Collection:
    -   Set:
        -   HashSet
        -   NavigableSet:
            -   TreeSet
    -   List:
        -   ArrayList
        -   LinkedList
-   Map:
    -   HashMap
    -   NavigableMap:
        -   TreeMap

### Collection

Množica elementov - elementi se ne morejo podvajati

``` java
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

LinkedList uporabimo, če pričakujemo veliko dodajanj in odvzemanj na
poljubnih položajih

# Programiranje - 10. 01. 2024

## Vmesnik List

``` java
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

``` java
seznam.last();
seznam.ceiling()
seznam.headSet(); // množica elementov, ki so manjši ali enaki podanemu elementu
// ne ustvari nove množice -
// množici postaneta povezani (kot neka lupa, ki se osredotoči na določene elemente)
seznam.tailSet(); // množica elementov, ki so večji ali enaki podanemu elementu
```

## TreeSet

``` java
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

``` java
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

# Programiranje - 04. 10. 2023

## Osnovni pojmi

-   program - datoteka z navodili računalniku
-   programiranje
-   programski jezik
-   java - primer programskega jezika

## Osnove jave

-   platformna neodvisnost,
-   javanski navidezni stroj (JVM)
-   Jshell - java console

### Osnovne aritmetične operacije

Operator pomen primer izraza vrednost

------------------------------------------------------------------------

\+ seštevanje 4 + 3 7 - odštevanje 2 - 6 -4 \* množenje 3 \* 5 15 /
deljenje 7 / 2 3 / deljenje 7.0 / 2 3.5 % ostanek pri deljenju 7 % 2 1

### Omejitve

`Integer.MAX_VALUE`

### Spremenljivke

``` java
int a = 5;
int b = a + 1;
double d = 2.0;
double povprecje = (a + b + c) / 3; // 5 + 6 + 2.0 = 13 -> 13.0 / 3 = 4

double x = 5.0;
int y = (int) x; // izrecna pretvorba tipa - casting

double novoPovprecje = ((double)(a + b + c)) / 3.0; // 13.0 / 3.0 ->4,33

char stevka = '1'; // A -> 65, a -> 96 ...int
(int) stevka; // 49, ker je ASCII koda od 1 -> 49
(char) ('c' - 'a' + 'A') // C
```

Spremenljivke ohranjajo vrednost, razen če jih eksplicitno nastavimo

### Prvi program

Hello World

Računanje starosti iz leta rojstva

[Pozdrav.java](primeri/Pozdrav.java)

# Programiranje - 11. 10. 2023

## Izrazi

-   vrednost: 42, 7.3, 'A', "abc", true
-   tip: int, double, char, String, boolean
-   spremenljivka: int a
-   izraz: 1 + 2, 3 \> 4
-   stavek: `System.out.println("abc")`

## Krmilni stavki

``` java
if (pogoj) {
  stavki
}
else {
  stavki2
}
```

[Vecje.java](primeri/Vecje.java)

[Vecje2.java](primeri/Vecje2.java)

### Operatorji

Operator Pomen Primer izraza za true

------------------------------------------------------------------------

\> večji od 5 \> 3 \>= večji ali enak od 8 \>= 2 \< manjši od 4 \< 9 \<=
manjši ali enak od 7 \<= 7 == enak kot 3 == 3 != različen od 2 != 5

### Zaporedje operacij

! ima prednost pred &&, && ima prednost pred \|\|

[Prestopno.java](primeri/Prestopno.java)

## Zanke

### Zanka WHILE

``` java
int i = 1
while (i <= 3){
  System.out.println("a");
  i = i+1;
}
System.out.println("b");
```

i izpis

------------------------------------------------------------------------

1 a 2 a 3 a 4 b

[Sestevanje.java](primeri/Sestevanje.java)

#### Okrajšave

``` java
a = a + b; // navadno
a += b; // okrajšava
a = a + 1; // navadni zapis inkrementa
a += 1; // inkrement zapisan na krajše
a++; // kratek zapis inkrementa - najprej se shrani in nato poveča
++a; // najprej se poveča spremenljivka in se nato shrani
a--;
--a;
```

[Sestevanje2.java](primeri/Sestevanje2.java)

## Zanka DO

``` java
do {
  stavki;
} while (pogoj)
```

Zanka se vsaj enkrat izvrši

[Nadlegovanje](primeri/Nadlegovanje.java)

## Zanka FOR

``` java
for (inicializacija, pogoj, posodobitev) {
  stavki;
}
```

Uporablja se za intervale števil

Primer:

``` java
for (int i = 1; i <= 3; i++) {
  System.out.println("a");
}
System.out.println("b");
```

[Sestevanje2For.java](primeri/Sestevanje2For.java)

[Najboljsi](primeri/Najboljsi.java)

# Programiranje - 18. 10. 2023

## Primeri programov

[Ugibanje](primeri/Ugibanje.java)

[Deljitelji](primeri/Deljitelji.java)

[Postevanka](primeri/Postevanka)

## Praštevila

[Prastevila1](primeri/Prastevila1.java)

### Boljši izpis

``` java
System.out.printf("Sem %s %s. Doma sem iz %s.", ime, priimek, dom);
System.out.printf("Zaokroženo =  <%4d>, a");
```

### Stavek break in continue

``` java
zanka {
    break; // prekine zanko (enako kot da bi bil pogoj že dosežen)
    .
    .
    .
    continue; // preskoči vse do konca zanke a nadaljuje z zanko v naslednji iteraciji
}
```

# Programiranje - 25. 10. 2023

## Switch

``` java
switch (izraz) {
    case konstanta_1:
        stavki_1
        break;
    case konstanta_2:
        stavki_2
        break;
    //...
    case konstanta_n:
        stavki_n
        break;
    default:
        stavki_{n+1}
        break;
}
```

Konstanta:

-   int
-   byte
-   char
-   String (samo v novejših verzijah jave)

[Ocene.java](primeri/Ocene.java)

### Dostopnost spremenljivk v switch stavku

Spremeljivke so dostopne v blokuzavitih oklepajev. Če želimo dodati
spremenljivke v case stavek dodamo zavite oklepaje, da je spremenljivka
dostopna samo v tem določenem case stavku.

## Pogojni operator (? stavek)

``` java
(pogoj)?(izraz_1):(izraz_2); // pogoj == true -> izraz_1, pogoj == false -> izraz_2
// primer
int c = (a >= 3)?(7):(10);
```

## Metode

``` java
public static void metoda(Tip ime, Tip ime2 ...) {
    ...
}

public static void ...(...) {
    metoda(...)
}
```

[Kriz1.java](primeri/Kriz1.java)

### Rekurzija

#### Fibonaccijevo zaporedje

0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 24

[Fibonacci.java](primeri/Fibonacci.java)

# Programiranje - 08. 11. 2023

## Tabele

Tabela je zaporedje spremenljivk istega tipa. Posamezne spremenljivke so
dosegljive prek indeksov. Spremenljivke se imenujejo elementi tabele.
Indeksi tečejo od 0 do n-1

``` java
int[] tabela = new int[5];
//                  0, 0, 0, 0, 0
int[] tabela = {1, 2, 3, 4, 5};
int[] tabela = new int[]{1, 2, 3, 4, 5};

// nastavljanje vrednost
tabela[1] = 5;

// dolžina tabele

tabela.length;
```

[Sprehod.java](primeri/Sprehod.java)
[Iskanje.java](primeri/Iskanje.java)

### Urejanje z navadnim vstavljanjem

[NavadnoVstavljanje.java](primeri/NavadnoVstavljanje.java)

# Programiranje - 15. 11. 2023

## Eraotstenovo Sito

[EratostenovoSito.java](primeri/EratostenovoSito.java)

## Fibonaccijevo zaporedje z iteracijo

Postopek se imenuje *memoizacija*

[FibonacciMemo](primeri/FibonacciMemo.java)

## Primitivni in referenčni tipi

Primitivni: byte, short, int, long, float, double, boolean, char

-   vsebujejo neko vrednost

Referenčni tipi: T\[\], String, Scanner

-   vsebujejo pomnilniški naslov (kazalec/referenca) tega podatka

## Prenašanje parametrov

``` java
public stativ void main(String[] args){
    int a = 42;
    int[] t = {1,2,3};
    int[] u = {4,5,6};
    int[] v = {a,t,u};
}

public static int[] f(int aa, int[] tt, int[] uu){
    aa = 66;
    tt[1] = 10;
    uu = new int[]{7,8};
    return uu;
}
```

## Dvodimenzionalna tabela

``` java
Tip[][] t = new Tip[m][n];
```

### Stopničasta 2D tabela

``` java
int n = 5;
int [][] t = new int[n][];
for(int i = 0; i < n; i++){
    new int[i + 1];
}
/*
       []
      [][]
     [][][]
    [][][][]
   [][][][][]
*/
```

``` java
System.out.println(Arrays.deepToString(tabela));
// izpiše vse nivoje tabele
```

[Tabela2d](primeri/Tabela2d.java)

# Programiranje - 13. 12. 2023

## Razred Object

Nadrazred vseh razredov v javi. Pred lastno uporabo moramo redefinirati
te metode z @Override.

``` java
@Override
public String toString(){}
public boolean equals(Object obj){}
public int hashCode(){}

// izpis lahko direktno kličemo - sam posredno pokliče metodo toString
Cas cas = new Cas(10, 35);
System.out.println(cas.toString()); // 10:35
System.out.println(cas); // 10:35
// Oboje izpiše enako
// privzeto primerja po kazalcih in ne po atributih
@Override
public boolean equals(Object obj){
    if(this = obj){
        return true;
    }
    if(!(obj instanceOf Cas)){
        return false;
    }
    Cas drugi = (Cas) obj;
    return this.ura == drugi.ura && this.minuta == drugi.minuta;
}
// ko redefinramo equals moramo redefiniratio tudi hashCode()
obj.hashCode() // vrne število, ki se izračuna na podlagi pomilniškega naslova objekta

@Override
    public int hashCode() {
    return (17 * Integer.hashCode(this.ura) +
    31 * Integer.hashCode(this.minuta));
}
// metoda hashCode naj bi bila usklajena z metodo equals
a.equals(b) ==> (a.hashCode() == b.hashCode());
// zaželeno je da velja tudi <==
```

## Primitivni in ovojni tipi

``` java
int a = 10;
Integer b = Integer.valueOf(10);
// podobo, a z drugimi lastnostmi: npr. 0 proti null, ko ustvarimo
// vsak primitivni tip ima svoj ovojni tip
// retvarjanje
Integer c = Integer.valueOf(a);
int d = b.intValue();
// obstaja tudi samodejno pretvarjanje imenovano autoboxing
//- prevajalnik samodejno izvede metodo .valueOf() ali .intValue
```

## Slovar

Kot tabela, pri kateri so ključi karkoli namesto številke

Osnovna implementacija: tabela parov ključ-vrednost (vektor)

Lahko uporabimo hashCode in modul, da nastavimo lokacije

# Programiranje - 20. 12. 2023

## Generični razredi

``` java
class VektorInt{
    private int[] tabela;
}

class VektorString{
    private String[] tabela;
}

class VektorObject{
    private Object[] tabela;
}

VektorObject v = new VektorObject();
v.dodaj("abc");
Object obj = v.vrni(0);
String niz = (String) obj;
Cas cas = (Cas) obj; // deluje samo ko je obj insanca razreda ali podrazreda časa
// če obj ni instanca razreda to vidimo šele po izvedbi prgrama.
// Ker želimo to ugotoviti prej, uvedemo vektor.
```

[Ovojnik.java](primeri/Ovojnik.java)

``` java
public class GenOvojnik<T> {
    private T a;
    public GenOvojnik(T a){
        this.a = a;
    }
    public T vrni(){
        return this.a;
    }
}

class TestGenOvojnik {
    public static void main(String[] args){
        GenOvojnik<String> p = newtem.out. GenOvojnik<String>("Dober dan");
        GenOvojnik<String> p2 new GenOvojnik<>("Dober dan"); // drug zapis
        String s = p.vrni();
        System.out.println(s);

        GenOvojnik<Cas> q = new GenOvojnik<Cas>(new Cas(10, 20));
    GenOvojnik<Cas> q2 = new GenOvojnik<>(new Cas(10, 20)); // drug zapis
        Cas c = q.vrni();
        System.out.println(c.plus(5, 20));
        Object o = q.vrni();
        System.out.println(((Cas) o).plus(5, 20));
    }
}
```

Generiki so neki avtomatsko generirani razredi, ki se ustvarijo, ko
dobijo podan tip razreda. Prevajalnik prevede generike v type caste.
Temu procesu se reče type erasure.

Generiki obstajajo samo v času prevajanja. Izvajalnik ne prepozna
generikov.

## Generične metode

``` java
public static <T> int poisci(T[] tabele, t iskani){
    for(int i = 0; i < tabela.length; i++){
        if (tabela[i].equals(iskani)){
            return i;
        }
    }
    return -1;
}
// klic metode
poisci(stevila, 25);
GenIskanje.<Cas>poisci(casi, new Cas(20,10)); // na dolgo
```

Tipnega parametra `<T>`{=html} ni mogoče nadomestiti s primitivnim
tipom.

## Vmesniki

Vmesnik je abstraktni razred z določenimi omejitvami.

Lahko vsebuje le: abstraktne, statične in privzete (default) metode ter
statične konstante (static final).

``` java
public abstract int pretvori(String niz);
// lahko napišemo kot
int pretvor(String niz);
// razred implementira vmesnik če implementira vse njegove abstraktne metode
public interface Narisljiv {
    public abstract void narisi(Platno platno);
}
public interface Izracunljiv {
    public abstract int ploscina();
    public abstract int obseg();
}

public class Pravokotnik implements Narisljiv, Izracunljiv{
    @Override
    public void narisi(Platno platno){

    }

    @Override
    public int ploscina(){

    }

    @Override
    public int obseg(){

    }
}
```

### Vmesnik Comparable

Objekte tega razreda je mogoče primerjati med seboj - določimo naravno
urejenost

``` java
public interface Compareable<T>{
    public abstract int compareTo(T drugi);
}
...
public abstract int compareTo(T drugi)
```

### Vmesnik Comparator

``` java
public interface Comparator<T> {
    public abstract int compare(T prvi, T drugi);
}
```

### Vmesnik Iterator

objekt, ki omogoča zaporedni sprehod po elemetnih vsebovalnika, npr.
tabela, vektor, slovar

``` java
public interface Iterator<T> {
    public abstract boolean hasNext();
    public abstract T next();
}
```

metoda hasNext vrne true natanko tedaj, ko se v vsebovalniku nahaja še
kak element

metoda next vrne naslednji element vsebovalnika:

-   če takega elementa ni, sproži izjemo tipa NoSuchElementException

### Vmesnik Iterable

vrne objekt tipa Iterator, ki omogoča zaporedni sprehod povsebovalniku
this

če nek objekt defenira Iterable se lahko po njem sprehodimo s for each

``` java
public interface Iterable<T> {
    public abstract Iterator<T> iterator();
}
```

# Programiranje - 03. 01. 2024

## Vsebovalniki

-   Collection:
    -   Set:
        -   HashSet
        -   NavigableSet:
            -   TreeSet
    -   List:
        -   ArrayList
        -   LinkedList
-   Map:
    -   HashMap
    -   NavigableMap:
        -   TreeMap

### Collection

Množica elementov - elementi se ne morejo podvajati

``` java
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

LinkedList uporabimo, če pričakujemo veliko dodajanj in odvzemanj na
poljubnih položajih

# Programiranje - 10. 01. 2024

## Vmesnik List

``` java
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

``` java
seznam.last();
seznam.ceiling()
seznam.headSet(); // množica elementov, ki so manjši ali enaki podanemu elementu
// ne ustvari nove množice -
// množici postaneta povezani (kot neka lupa, ki se osredotoči na določene elemente)
seznam.tailSet(); // množica elementov, ki so večji ali enaki podanemu elementu
```

## TreeSet

``` java
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

``` java
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

# Programiranje - 04. 10. 2023

## Osnovni pojmi

-   program - datoteka z navodili računalniku
-   programiranje
-   programski jezik
-   java - primer programskega jezika

## Osnove jave

-   platformna neodvisnost,
-   javanski navidezni stroj (JVM)
-   Jshell - java console

### Osnovne aritmetične operacije

Operator pomen primer izraza vrednost

------------------------------------------------------------------------

\+ seštevanje 4 + 3 7 - odštevanje 2 - 6 -4 \* množenje 3 \* 5 15 /
deljenje 7 / 2 3 / deljenje 7.0 / 2 3.5 % ostanek pri deljenju 7 % 2 1

### Omejitve

`Integer.MAX_VALUE`

### Spremenljivke

``` java
int a = 5;
int b = a + 1;
double d = 2.0;
double povprecje = (a + b + c) / 3; // 5 + 6 + 2.0 = 13 -> 13.0 / 3 = 4

double x = 5.0;
int y = (int) x; // izrecna pretvorba tipa - casting

double novoPovprecje = ((double)(a + b + c)) / 3.0; // 13.0 / 3.0 ->4,33

char stevka = '1'; // A -> 65, a -> 96 ...int
(int) stevka; // 49, ker je ASCII koda od 1 -> 49
(char) ('c' - 'a' + 'A') // C
```

Spremenljivke ohranjajo vrednost, razen če jih eksplicitno nastavimo

### Prvi program

Hello World

Računanje starosti iz leta rojstva

[Pozdrav.java](primeri/Pozdrav.java)

# Programiranje - 11. 10. 2023

## Izrazi

-   vrednost: 42, 7.3, 'A', "abc", true
-   tip: int, double, char, String, boolean
-   spremenljivka: int a
-   izraz: 1 + 2, 3 \> 4
-   stavek: `System.out.println("abc")`

## Krmilni stavki

``` java
if (pogoj) {
  stavki
}
else {
  stavki2
}
```

[Vecje.java](primeri/Vecje.java)

[Vecje2.java](primeri/Vecje2.java)

### Operatorji

Operator Pomen Primer izraza za true

------------------------------------------------------------------------

\> večji od 5 \> 3 \>= večji ali enak od 8 \>= 2 \< manjši od 4 \< 9 \<=
manjši ali enak od 7 \<= 7 == enak kot 3 == 3 != različen od 2 != 5

### Zaporedje operacij

! ima prednost pred &&, && ima prednost pred \|\|

[Prestopno.java](primeri/Prestopno.java)

## Zanke

### Zanka WHILE

``` java
int i = 1
while (i <= 3){
  System.out.println("a");
  i = i+1;
}
System.out.println("b");
```

i izpis

------------------------------------------------------------------------

1 a 2 a 3 a 4 b

[Sestevanje.java](primeri/Sestevanje.java)

#### Okrajšave

``` java
a = a + b; // navadno
a += b; // okrajšava
a = a + 1; // navadni zapis inkrementa
a += 1; // inkrement zapisan na krajše
a++; // kratek zapis inkrementa - najprej se shrani in nato poveča
++a; // najprej se poveča spremenljivka in se nato shrani
a--;
--a;
```

[Sestevanje2.java](primeri/Sestevanje2.java)

## Zanka DO

``` java
do {
  stavki;
} while (pogoj)
```

Zanka se vsaj enkrat izvrši

[Nadlegovanje](primeri/Nadlegovanje.java)

## Zanka FOR

``` java
for (inicializacija, pogoj, posodobitev) {
  stavki;
}
```

Uporablja se za intervale števil

Primer:

``` java
for (int i = 1; i <= 3; i++) {
  System.out.println("a");
}
System.out.println("b");
```

[Sestevanje2For.java](primeri/Sestevanje2For.java)

[Najboljsi](primeri/Najboljsi.java)

# Programiranje - 18. 10. 2023

## Primeri programov

[Ugibanje](primeri/Ugibanje.java)

[Deljitelji](primeri/Deljitelji.java)

[Postevanka](primeri/Postevanka)

## Praštevila

[Prastevila1](primeri/Prastevila1.java)

### Boljši izpis

``` java
System.out.printf("Sem %s %s. Doma sem iz %s.", ime, priimek, dom);
System.out.printf("Zaokroženo =  <%4d>, a");
```

### Stavek break in continue

``` java
zanka {
    break; // prekine zanko (enako kot da bi bil pogoj že dosežen)
    .
    .
    .
    continue; // preskoči vse do konca zanke a nadaljuje z zanko v naslednji iteraciji
}
```

# Programiranje - 25. 10. 2023

## Switch

``` java
switch (izraz) {
    case konstanta_1:
        stavki_1
        break;
    case konstanta_2:
        stavki_2
        break;
    //...
    case konstanta_n:
        stavki_n
        break;
    default:
        stavki_{n+1}
        break;
}
```

Konstanta:

-   int
-   byte
-   char
-   String (samo v novejših verzijah jave)

[Ocene.java](primeri/Ocene.java)

### Dostopnost spremenljivk v switch stavku

Spremeljivke so dostopne v blokuzavitih oklepajev. Če želimo dodati
spremenljivke v case stavek dodamo zavite oklepaje, da je spremenljivka
dostopna samo v tem določenem case stavku.

## Pogojni operator (? stavek)

``` java
(pogoj)?(izraz_1):(izraz_2); // pogoj == true -> izraz_1, pogoj == false -> izraz_2
// primer
int c = (a >= 3)?(7):(10);
```

## Metode

``` java
public static void metoda(Tip ime, Tip ime2 ...) {
    ...
}

public static void ...(...) {
    metoda(...)
}
```

[Kriz1.java](primeri/Kriz1.java)

### Rekurzija

#### Fibonaccijevo zaporedje

0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 24

[Fibonacci.java](primeri/Fibonacci.java)

# Programiranje - 08. 11. 2023

## Tabele

Tabela je zaporedje spremenljivk istega tipa. Posamezne spremenljivke so
dosegljive prek indeksov. Spremenljivke se imenujejo elementi tabele.
Indeksi tečejo od 0 do n-1

``` java
int[] tabela = new int[5];
//                  0, 0, 0, 0, 0
int[] tabela = {1, 2, 3, 4, 5};
int[] tabela = new int[]{1, 2, 3, 4, 5};

// nastavljanje vrednost
tabela[1] = 5;

// dolžina tabele

tabela.length;
```

[Sprehod.java](primeri/Sprehod.java)
[Iskanje.java](primeri/Iskanje.java)

### Urejanje z navadnim vstavljanjem

[NavadnoVstavljanje.java](primeri/NavadnoVstavljanje.java)

# Programiranje - 15. 11. 2023

## Eraotstenovo Sito

[EratostenovoSito.java](primeri/EratostenovoSito.java)

## Fibonaccijevo zaporedje z iteracijo

Postopek se imenuje *memoizacija*

[FibonacciMemo](primeri/FibonacciMemo.java)

## Primitivni in referenčni tipi

Primitivni: byte, short, int, long, float, double, boolean, char

-   vsebujejo neko vrednost

Referenčni tipi: T\[\], String, Scanner

-   vsebujejo pomnilniški naslov (kazalec/referenca) tega podatka

## Prenašanje parametrov

``` java
public stativ void main(String[] args){
    int a = 42;
    int[] t = {1,2,3};
    int[] u = {4,5,6};
    int[] v = {a,t,u};
}

public static int[] f(int aa, int[] tt, int[] uu){
    aa = 66;
    tt[1] = 10;
    uu = new int[]{7,8};
    return uu;
}
```

## Dvodimenzionalna tabela

``` java
Tip[][] t = new Tip[m][n];
```

### Stopničasta 2D tabela

``` java
int n = 5;
int [][] t = new int[n][];
for(int i = 0; i < n; i++){
    new int[i + 1];
}
/*
       []
      [][]
     [][][]
    [][][][]
   [][][][][]
*/
```

``` java
System.out.println(Arrays.deepToString(tabela));
// izpiše vse nivoje tabele
```

[Tabela2d](primeri/Tabela2d.java)

# Programiranje - 13. 12. 2023

## Razred Object

Nadrazred vseh razredov v javi. Pred lastno uporabo moramo redefinirati
te metode z @Override.

``` java
@Override
public String toString(){}
public boolean equals(Object obj){}
public int hashCode(){}

// izpis lahko direktno kličemo - sam posredno pokliče metodo toString
Cas cas = new Cas(10, 35);
System.out.println(cas.toString()); // 10:35
System.out.println(cas); // 10:35
// Oboje izpiše enako
// privzeto primerja po kazalcih in ne po atributih
@Override
public boolean equals(Object obj){
    if(this = obj){
        return true;
    }
    if(!(obj instanceOf Cas)){
        return false;
    }
    Cas drugi = (Cas) obj;
    return this.ura == drugi.ura && this.minuta == drugi.minuta;
}
// ko redefinramo equals moramo redefiniratio tudi hashCode()
obj.hashCode() // vrne število, ki se izračuna na podlagi pomilniškega naslova objekta

@Override
    public int hashCode() {
    return (17 * Integer.hashCode(this.ura) +
    31 * Integer.hashCode(this.minuta));
}
// metoda hashCode naj bi bila usklajena z metodo equals
a.equals(b) ==> (a.hashCode() == b.hashCode());
// zaželeno je da velja tudi <==
```

## Primitivni in ovojni tipi

``` java
int a = 10;
Integer b = Integer.valueOf(10);
// podobo, a z drugimi lastnostmi: npr. 0 proti null, ko ustvarimo
// vsak primitivni tip ima svoj ovojni tip
// retvarjanje
Integer c = Integer.valueOf(a);
int d = b.intValue();
// obstaja tudi samodejno pretvarjanje imenovano autoboxing
//- prevajalnik samodejno izvede metodo .valueOf() ali .intValue
```

## Slovar

Kot tabela, pri kateri so ključi karkoli namesto številke

Osnovna implementacija: tabela parov ključ-vrednost (vektor)

Lahko uporabimo hashCode in modul, da nastavimo lokacije

# Programiranje - 20. 12. 2023

## Generični razredi

``` java
class VektorInt{
    private int[] tabela;
}

class VektorString{
    private String[] tabela;
}

class VektorObject{
    private Object[] tabela;
}

VektorObject v = new VektorObject();
v.dodaj("abc");
Object obj = v.vrni(0);
String niz = (String) obj;
Cas cas = (Cas) obj; // deluje samo ko je obj insanca razreda ali podrazreda časa
// če obj ni instanca razreda to vidimo šele po izvedbi prgrama.
// Ker želimo to ugotoviti prej, uvedemo vektor.
```

[Ovojnik.java](primeri/Ovojnik.java)

``` java
public class GenOvojnik<T> {
    private T a;
    public GenOvojnik(T a){
        this.a = a;
    }
    public T vrni(){
        return this.a;
    }
}

class TestGenOvojnik {
    public static void main(String[] args){
        GenOvojnik<String> p = newtem.out. GenOvojnik<String>("Dober dan");
        GenOvojnik<String> p2 new GenOvojnik<>("Dober dan"); // drug zapis
        String s = p.vrni();
        System.out.println(s);

        GenOvojnik<Cas> q = new GenOvojnik<Cas>(new Cas(10, 20));
    GenOvojnik<Cas> q2 = new GenOvojnik<>(new Cas(10, 20)); // drug zapis
        Cas c = q.vrni();
        System.out.println(c.plus(5, 20));
        Object o = q.vrni();
        System.out.println(((Cas) o).plus(5, 20));
    }
}
```

Generiki so neki avtomatsko generirani razredi, ki se ustvarijo, ko
dobijo podan tip razreda. Prevajalnik prevede generike v type caste.
Temu procesu se reče type erasure.

Generiki obstajajo samo v času prevajanja. Izvajalnik ne prepozna
generikov.

## Generične metode

``` java
public static <T> int poisci(T[] tabele, t iskani){
    for(int i = 0; i < tabela.length; i++){
        if (tabela[i].equals(iskani)){
            return i;
        }
    }
    return -1;
}
// klic metode
poisci(stevila, 25);
GenIskanje.<Cas>poisci(casi, new Cas(20,10)); // na dolgo
```

Tipnega parametra `<T>`{=html} ni mogoče nadomestiti s primitivnim
tipom.

## Vmesniki

Vmesnik je abstraktni razred z določenimi omejitvami.

Lahko vsebuje le: abstraktne, statične in privzete (default) metode ter
statične konstante (static final).

``` java
public abstract int pretvori(String niz);
// lahko napišemo kot
int pretvor(String niz);
// razred implementira vmesnik če implementira vse njegove abstraktne metode
public interface Narisljiv {
    public abstract void narisi(Platno platno);
}
public interface Izracunljiv {
    public abstract int ploscina();
    public abstract int obseg();
}

public class Pravokotnik implements Narisljiv, Izracunljiv{
    @Override
    public void narisi(Platno platno){

    }

    @Override
    public int ploscina(){

    }

    @Override
    public int obseg(){

    }
}
```

### Vmesnik Comparable

Objekte tega razreda je mogoče primerjati med seboj - določimo naravno
urejenost

``` java
public interface Compareable<T>{
    public abstract int compareTo(T drugi);
}
...
public abstract int compareTo(T drugi)
```

### Vmesnik Comparator

``` java
public interface Comparator<T> {
    public abstract int compare(T prvi, T drugi);
}
```

### Vmesnik Iterator

objekt, ki omogoča zaporedni sprehod po elemetnih vsebovalnika, npr.
tabela, vektor, slovar

``` java
public interface Iterator<T> {
    public abstract boolean hasNext();
    public abstract T next();
}
```

metoda hasNext vrne true natanko tedaj, ko se v vsebovalniku nahaja še
kak element

metoda next vrne naslednji element vsebovalnika:

-   če takega elementa ni, sproži izjemo tipa NoSuchElementException

### Vmesnik Iterable

vrne objekt tipa Iterator, ki omogoča zaporedni sprehod povsebovalniku
this

če nek objekt defenira Iterable se lahko po njem sprehodimo s for each

``` java
public interface Iterable<T> {
    public abstract Iterator<T> iterator();
}
```

# Programiranje - 03. 01. 2024

## Vsebovalniki

-   Collection:
    -   Set:
        -   HashSet
        -   NavigableSet:
            -   TreeSet
    -   List:
        -   ArrayList
        -   LinkedList
-   Map:
    -   HashMap
    -   NavigableMap:
        -   TreeMap

### Collection

Množica elementov - elementi se ne morejo podvajati

``` java
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

LinkedList uporabimo, če pričakujemo veliko dodajanj in odvzemanj na
poljubnih položajih

# Programiranje - 10. 01. 2024

## Vmesnik List

``` java
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

``` java
seznam.last();
seznam.ceiling()
seznam.headSet(); // množica elementov, ki so manjši ali enaki podanemu elementu
// ne ustvari nove množice -
// množici postaneta povezani (kot neka lupa, ki se osredotoči na določene elemente)
seznam.tailSet(); // množica elementov, ki so večji ali enaki podanemu elementu
```

## TreeSet

``` java
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

``` java
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

# Programiranje - 04. 10. 2023

## Osnovni pojmi

-   program - datoteka z navodili računalniku
-   programiranje
-   programski jezik
-   java - primer programskega jezika

## Osnove jave

-   platformna neodvisnost,
-   javanski navidezni stroj (JVM)
-   Jshell - java console

### Osnovne aritmetične operacije

  Operator   pomen                  primer izraza   vrednost
  ---------- ---------------------- --------------- ----------
  \+         seštevanje             4 + 3           7
  \-         odštevanje             2 - 6           -4
  \*         množenje               3 \* 5          15
  /          deljenje               7 / 2           3
  /          deljenje               7.0 / 2         3.5
  \%         ostanek pri deljenju   7 % 2           1

### Omejitve

`Integer.MAX_VALUE`

### Spremenljivke

``` java
int a = 5;
int b = a + 1;
double d = 2.0;
double povprecje = (a + b + c) / 3; // 5 + 6 + 2.0 = 13 -> 13.0 / 3 = 4

double x = 5.0;
int y = (int) x; // izrecna pretvorba tipa - casting

double novoPovprecje = ((double)(a + b + c)) / 3.0; // 13.0 / 3.0 ->4,33

char stevka = '1'; // A -> 65, a -> 96 ...int
(int) stevka; // 49, ker je ASCII koda od 1 -> 49
(char) ('c' - 'a' + 'A') // C
```

Spremenljivke ohranjajo vrednost, razen če jih eksplicitno nastavimo

### Prvi program

Hello World

Računanje starosti iz leta rojstva

[Pozdrav.java](primeri/Pozdrav.java)

# Programiranje - 11. 10. 2023

## Izrazi

-   vrednost: 42, 7.3, 'A', "abc", true
-   tip: int, double, char, String, boolean
-   spremenljivka: int a
-   izraz: 1 + 2, 3 \> 4
-   stavek: `System.out.println("abc")`

## Krmilni stavki

``` java
if (pogoj) {
  stavki
}
else {
  stavki2
}
```

[Vecje.java](primeri/Vecje.java)

[Vecje2.java](primeri/Vecje2.java)

### Operatorji

  Operator   Pomen                Primer izraza za true
  ---------- -------------------- -----------------------
  \>         večji od             5 \> 3
  \>=        večji ali enak od    8 \>= 2
  \<         manjši od            4 \< 9
  \<=        manjši ali enak od   7 \<= 7
  ==         enak kot             3 == 3
  !=         različen od          2 != 5

### Zaporedje operacij

! ima prednost pred &&, && ima prednost pred \|\|

[Prestopno.java](primeri/Prestopno.java)

## Zanke

### Zanka WHILE

``` java
int i = 1
while (i <= 3){
  System.out.println("a");
  i = i+1;
}
System.out.println("b");
```

  i   izpis
  --- -------
  1   a
  2   a
  3   a
  4   b

[Sestevanje.java](primeri/Sestevanje.java)

#### Okrajšave

``` java
a = a + b; // navadno
a += b; // okrajšava
a = a + 1; // navadni zapis inkrementa
a += 1; // inkrement zapisan na krajše
a++; // kratek zapis inkrementa - najprej se shrani in nato poveča
++a; // najprej se poveča spremenljivka in se nato shrani
a--;
--a;
```

[Sestevanje2.java](primeri/Sestevanje2.java)

## Zanka DO

``` java
do {
  stavki;
} while (pogoj)
```

Zanka se vsaj enkrat izvrši

[Nadlegovanje](primeri/Nadlegovanje.java)

## Zanka FOR

``` java
for (inicializacija, pogoj, posodobitev) {
  stavki;
}
```

Uporablja se za intervale števil

Primer:

``` java
for (int i = 1; i <= 3; i++) {
  System.out.println("a");
}
System.out.println("b");
```

[Sestevanje2For.java](primeri/Sestevanje2For.java)

[Najboljsi](primeri/Najboljsi.java)

# Programiranje - 18. 10. 2023

## Primeri programov

[Ugibanje](primeri/Ugibanje.java)

[Deljitelji](primeri/Deljitelji.java)

[Postevanka](primeri/Postevanka)

## Praštevila

[Prastevila1](primeri/Prastevila1.java)

### Boljši izpis

``` java
System.out.printf("Sem %s %s. Doma sem iz %s.", ime, priimek, dom);
System.out.printf("Zaokroženo =  <%4d>, a");
```

### Stavek break in continue

``` java
zanka {
    break; // prekine zanko (enako kot da bi bil pogoj že dosežen)
    .
    .
    .
    continue; // preskoči vse do konca zanke a nadaljuje z zanko v naslednji iteraciji
}
```

# Programiranje - 25. 10. 2023

## Switch

``` java
switch (izraz) {
    case konstanta_1:
        stavki_1
        break;
    case konstanta_2:
        stavki_2
        break;
    //...
    case konstanta_n:
        stavki_n
        break;
    default:
        stavki_{n+1}
        break;
}
```

Konstanta:

-   int
-   byte
-   char
-   String (samo v novejših verzijah jave)

[Ocene.java](primeri/Ocene.java)

### Dostopnost spremenljivk v switch stavku

Spremeljivke so dostopne v blokuzavitih oklepajev. Če želimo dodati
spremenljivke v case stavek dodamo zavite oklepaje, da je spremenljivka
dostopna samo v tem določenem case stavku.

## Pogojni operator (? stavek)

``` java
(pogoj)?(izraz_1):(izraz_2); // pogoj == true -> izraz_1, pogoj == false -> izraz_2
// primer
int c = (a >= 3)?(7):(10);
```

## Metode

``` java
public static void metoda(Tip ime, Tip ime2 ...) {
    ...
}

public static void ...(...) {
    metoda(...)
}
```

[Kriz1.java](primeri/Kriz1.java)

### Rekurzija

#### Fibonaccijevo zaporedje

0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 24

[Fibonacci.java](primeri/Fibonacci.java)

# Programiranje - 08. 11. 2023

## Tabele

Tabela je zaporedje spremenljivk istega tipa. Posamezne spremenljivke so
dosegljive prek indeksov. Spremenljivke se imenujejo elementi tabele.
Indeksi tečejo od 0 do n-1

``` java
int[] tabela = new int[5];
//                  0, 0, 0, 0, 0
int[] tabela = {1, 2, 3, 4, 5};
int[] tabela = new int[]{1, 2, 3, 4, 5};

// nastavljanje vrednost
tabela[1] = 5;

// dolžina tabele

tabela.length;
```

[Sprehod.java](primeri/Sprehod.java)
[Iskanje.java](primeri/Iskanje.java)

### Urejanje z navadnim vstavljanjem

[NavadnoVstavljanje.java](primeri/NavadnoVstavljanje.java)

# Programiranje - 15. 11. 2023

## Eraotstenovo Sito

[EratostenovoSito.java](primeri/EratostenovoSito.java)

## Fibonaccijevo zaporedje z iteracijo

Postopek se imenuje *memoizacija*

[FibonacciMemo](primeri/FibonacciMemo.java)

## Primitivni in referenčni tipi

Primitivni: byte, short, int, long, float, double, boolean, char

-   vsebujejo neko vrednost

Referenčni tipi: T\[\], String, Scanner

-   vsebujejo pomnilniški naslov (kazalec/referenca) tega podatka

## Prenašanje parametrov

``` java
public stativ void main(String[] args){
    int a = 42;
    int[] t = {1,2,3};
    int[] u = {4,5,6};
    int[] v = {a,t,u};
}

public static int[] f(int aa, int[] tt, int[] uu){
    aa = 66;
    tt[1] = 10;
    uu = new int[]{7,8};
    return uu;
}
```

## Dvodimenzionalna tabela

``` java
Tip[][] t = new Tip[m][n];
```

### Stopničasta 2D tabela

``` java
int n = 5;
int [][] t = new int[n][];
for(int i = 0; i < n; i++){
    new int[i + 1];
}
/*
       []
      [][]
     [][][]
    [][][][]
   [][][][][]
*/
```

``` java
System.out.println(Arrays.deepToString(tabela));
// izpiše vse nivoje tabele
```

[Tabela2d](primeri/Tabela2d.java)

# Programiranje - 13. 12. 2023

## Razred Object

Nadrazred vseh razredov v javi. Pred lastno uporabo moramo redefinirati
te metode z @Override.

``` java
@Override
public String toString(){}
public boolean equals(Object obj){}
public int hashCode(){}

// izpis lahko direktno kličemo - sam posredno pokliče metodo toString
Cas cas = new Cas(10, 35);
System.out.println(cas.toString()); // 10:35
System.out.println(cas); // 10:35
// Oboje izpiše enako
// privzeto primerja po kazalcih in ne po atributih
@Override
public boolean equals(Object obj){
    if(this = obj){
        return true;
    }
    if(!(obj instanceOf Cas)){
        return false;
    }
    Cas drugi = (Cas) obj;
    return this.ura == drugi.ura && this.minuta == drugi.minuta;
}
// ko redefinramo equals moramo redefiniratio tudi hashCode()
obj.hashCode() // vrne število, ki se izračuna na podlagi pomilniškega naslova objekta

@Override
    public int hashCode() {
    return (17 * Integer.hashCode(this.ura) +
    31 * Integer.hashCode(this.minuta));
}
// metoda hashCode naj bi bila usklajena z metodo equals
a.equals(b) ==> (a.hashCode() == b.hashCode());
// zaželeno je da velja tudi <==
```

## Primitivni in ovojni tipi

``` java
int a = 10;
Integer b = Integer.valueOf(10);
// podobo, a z drugimi lastnostmi: npr. 0 proti null, ko ustvarimo
// vsak primitivni tip ima svoj ovojni tip
// retvarjanje
Integer c = Integer.valueOf(a);
int d = b.intValue();
// obstaja tudi samodejno pretvarjanje imenovano autoboxing
//- prevajalnik samodejno izvede metodo .valueOf() ali .intValue
```

## Slovar

Kot tabela, pri kateri so ključi karkoli namesto številke

Osnovna implementacija: tabela parov ključ-vrednost (vektor)

Lahko uporabimo hashCode in modul, da nastavimo lokacije

# Programiranje - 20. 12. 2023

## Generični razredi

``` java
class VektorInt{
    private int[] tabela;
}

class VektorString{
    private String[] tabela;
}

class VektorObject{
    private Object[] tabela;
}

VektorObject v = new VektorObject();
v.dodaj("abc");
Object obj = v.vrni(0);
String niz = (String) obj;
Cas cas = (Cas) obj; // deluje samo ko je obj insanca razreda ali podrazreda časa
// če obj ni instanca razreda to vidimo šele po izvedbi prgrama.
// Ker želimo to ugotoviti prej, uvedemo vektor.
```

[Ovojnik.java](primeri/Ovojnik.java)

``` java
public class GenOvojnik<T> {
    private T a;
    public GenOvojnik(T a){
        this.a = a;
    }
    public T vrni(){
        return this.a;
    }
}

class TestGenOvojnik {
    public static void main(String[] args){
        GenOvojnik<String> p = newtem.out. GenOvojnik<String>("Dober dan");
        GenOvojnik<String> p2 new GenOvojnik<>("Dober dan"); // drug zapis
        String s = p.vrni();
        System.out.println(s);

        GenOvojnik<Cas> q = new GenOvojnik<Cas>(new Cas(10, 20));
    GenOvojnik<Cas> q2 = new GenOvojnik<>(new Cas(10, 20)); // drug zapis
        Cas c = q.vrni();
        System.out.println(c.plus(5, 20));
        Object o = q.vrni();
        System.out.println(((Cas) o).plus(5, 20));
    }
}
```

Generiki so neki avtomatsko generirani razredi, ki se ustvarijo, ko
dobijo podan tip razreda. Prevajalnik prevede generike v type caste.
Temu procesu se reče type erasure.

Generiki obstajajo samo v času prevajanja. Izvajalnik ne prepozna
generikov.

## Generične metode

``` java
public static <T> int poisci(T[] tabele, t iskani){
    for(int i = 0; i < tabela.length; i++){
        if (tabela[i].equals(iskani)){
            return i;
        }
    }
    return -1;
}
// klic metode
poisci(stevila, 25);
GenIskanje.<Cas>poisci(casi, new Cas(20,10)); // na dolgo
```

Tipnega parametra `<T>`{=html} ni mogoče nadomestiti s primitivnim
tipom.

## Vmesniki

Vmesnik je abstraktni razred z določenimi omejitvami.

Lahko vsebuje le: abstraktne, statične in privzete (default) metode ter
statične konstante (static final).

``` java
public abstract int pretvori(String niz);
// lahko napišemo kot
int pretvor(String niz);
// razred implementira vmesnik če implementira vse njegove abstraktne metode
public interface Narisljiv {
    public abstract void narisi(Platno platno);
}
public interface Izracunljiv {
    public abstract int ploscina();
    public abstract int obseg();
}

public class Pravokotnik implements Narisljiv, Izracunljiv{
    @Override
    public void narisi(Platno platno){

    }

    @Override
    public int ploscina(){

    }

    @Override
    public int obseg(){

    }
}
```

### Vmesnik Comparable

Objekte tega razreda je mogoče primerjati med seboj - določimo naravno
urejenost

``` java
public interface Compareable<T>{
    public abstract int compareTo(T drugi);
}
...
public abstract int compareTo(T drugi)
```

### Vmesnik Comparator

``` java
public interface Comparator<T> {
    public abstract int compare(T prvi, T drugi);
}
```

### Vmesnik Iterator

objekt, ki omogoča zaporedni sprehod po elemetnih vsebovalnika, npr.
tabela, vektor, slovar

``` java
public interface Iterator<T> {
    public abstract boolean hasNext();
    public abstract T next();
}
```

metoda hasNext vrne true natanko tedaj, ko se v vsebovalniku nahaja še
kak element

metoda next vrne naslednji element vsebovalnika:

-   če takega elementa ni, sproži izjemo tipa NoSuchElementException

### Vmesnik Iterable

vrne objekt tipa Iterator, ki omogoča zaporedni sprehod povsebovalniku
this

če nek objekt defenira Iterable se lahko po njem sprehodimo s for each

``` java
public interface Iterable<T> {
    public abstract Iterator<T> iterator();
}
```

# Programiranje - 03. 01. 2024

## Vsebovalniki

-   Collection:
    -   Set:
        -   HashSet
        -   NavigableSet:
            -   TreeSet
    -   List:
        -   ArrayList
        -   LinkedList
-   Map:
    -   HashMap
    -   NavigableMap:
        -   TreeMap

### Collection

Množica elementov - elementi se ne morejo podvajati

``` java
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

LinkedList uporabimo, če pričakujemo veliko dodajanj in odvzemanj na
poljubnih položajih

# Programiranje - 10. 01. 2024

## Vmesnik List

``` java
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

``` java
seznam.last();
seznam.ceiling()
seznam.headSet(); // množica elementov, ki so manjši ali enaki podanemu elementu
// ne ustvari nove množice -
// množici postaneta povezani (kot neka lupa, ki se osredotoči na določene elemente)
seznam.tailSet(); // množica elementov, ki so večji ali enaki podanemu elementu
```

## TreeSet

``` java
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

``` java
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
