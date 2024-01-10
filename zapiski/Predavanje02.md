# Programiranje - 11. 10. 2023

## Izrazi

- vrednost: 42, 7.3, 'A', "abc", true
- tip: int, double, char, String, boolean
- spremenljivka: int a
- izraz: 1 + 2, 3 > 4
- stavek: `System.out.println("abc")`

## Krmilni stavki

```java
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

| Operator | Pomen              | Primer izraza za true |
| -------- | ------------------ | --------------------- |
| >        | večji od           | 5 > 3                 |
| >=       | večji ali enak od  | 8 >= 2                |
| <        | manjši od          | 4 < 9                 |
| <=       | manjši ali enak od | 7 <= 7                |
| ==       | enak kot           | 3 == 3                |
| !=       | različen od        | 2 != 5                |

### Zaporedje operacij

! ima prednost pred &&, && ima prednost pred ||

[Prestopno.java](primeri/Prestopno.java)

## Zanke

### Zanka WHILE

```java
int i = 1
while (i <= 3){
  System.out.println("a");
  i = i+1;
}
System.out.println("b");

```

| i   | izpis |
| --- | ----- |
| 1   | a     |
| 2   | a     |
| 3   | a     |
| 4   | b     |

[Sestevanje.java](primeri/Sestevanje.java)

#### Okrajšave

```java
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

```java
do {
  stavki;
} while (pogoj)

```

Zanka se vsaj enkrat izvrši

[Nadlegovanje](primeri/Nadlegovanje.java)

## Zanka FOR

```java
for (inicializacija, pogoj, posodobitev) {
  stavki;
}
```

Uporablja se za intervale števil

Primer:

```java
for (int i = 1; i <= 3; i++) {
  System.out.println("a");
}
System.out.println("b");
```

[Sestevanje2For.java](primeri/Sestevanje2For.java)

[Najboljsi](primeri/Najboljsi.java)
