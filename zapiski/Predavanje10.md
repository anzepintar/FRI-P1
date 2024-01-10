# Programiranje t10 - 13. 12. 2023

## Razred Object

Nadrazred vseh razredov v javi.
Pred lastno uporabo moramo redefinirati te metode z @Override.

```java
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

```java
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
