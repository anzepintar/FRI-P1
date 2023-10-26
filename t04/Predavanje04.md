# Programiranje t04 - 25. 10. 2023

## Switch

```java
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

- int
- byte
- char
- String (samo v novejših verzijah jave)

[Ocene.java](primeri/Ocene.java)

### Dostopnost spremenljivk v switch stavku

Spremeljivke so dostopne v blokuzavitih oklepajev.
Če želimo dodati spremenljivke v case stavek dodamo zavite oklepaje,
da je spremenljivka dostopna samo v tem določenem case stavku.

## Pogojni operator (? stavek)

```java
(pogoj)?(izraz_1):(izraz_2); // pogoj == true -> izraz_1, pogoj == false -> izraz_2
// primer
int c = (a >= 3)?(7):(10);
```

## Metode

```java
public static void metoda(Tip ime, Tip ime2 ...) {
    ...
}

public static void ...(...) {
    metoda(...)
}
```

[Kriz1.java](primeri/Kriz1.java)
