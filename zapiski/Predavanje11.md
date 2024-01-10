# Programiranje - 20. 12. 2023

## Generični razredi

```java
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

```java
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

Generiki so neki avtomatsko generirani razredi, ki se ustvarijo,
ko dobijo podan tip razreda. Prevajalnik prevede generike v type caste.
Temu procesu se reče type erasure.

Generiki obstajajo samo v času prevajanja. Izvajalnik ne prepozna generikov.

## Generične metode

```java
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

Tipnega parametra <T> ni mogoče nadomestiti s primitivnim tipom.

## Vmesniki

Vmesnik je abstraktni razred z določenimi omejitvami.

Lahko vsebuje le: abstraktne, statične in privzete (default)
metode ter statične konstante (static final).

```java
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

Objekte tega razreda je mogoče primerjati med seboj - določimo naravno urejenost

```java
public interface Compareable<T>{
    public abstract int compareTo(T drugi);
}
...
public abstract int compareTo(T drugi)

```

### Vmesnik Comparator

```java
public interface Comparator<T> {
    public abstract int compare(T prvi, T drugi);
}
```

### Vmesnik Iterator

objekt, ki omogoča zaporedni sprehod po elemetnih vsebovalnika,
npr. tabela, vektor, slovar

```java
public interface Iterator<T> {
    public abstract boolean hasNext();
    public abstract T next();
}
```

metoda hasNext vrne true natanko tedaj, ko se v vsebovalniku nahaja še kak element

metoda next vrne naslednji element vsebovalnika:

- če takega elementa ni, sproži izjemo tipa NoSuchElementException

### Vmesnik Iterable

vrne objekt tipa Iterator, ki omogoča zaporedni sprehod povsebovalniku this

če nek objekt defenira Iterable se lahko po njem sprehodimo s for each

```java
public interface Iterable<T> {
    public abstract Iterator<T> iterator();
}
```
