# Programiranje - 04. 10. 2023

## Osnovni pojmi

- program - datoteka z navodili računalniku
- programiranje
- programski jezik
- java - primer programskega jezika

## Osnove jave

- platformna neodvisnost,
- javanski navidezni stroj (JVM)
- Jshell - java console

### Osnovne aritmetične operacije

| Operator | pomen                | primer izraza | vrednost |
| -------- | -------------------- | ------------- | -------- |
| +        | seštevanje           | 4 + 3         | 7        |
| -        | odštevanje           | 2 - 6         | -4       |
| \*       | množenje             | 3 \* 5        | 15       |
| /        | deljenje             | 7 / 2         | 3        |
| /        | deljenje             | 7.0 / 2       | 3.5      |
| %        | ostanek pri deljenju | 7 % 2         | 1        |

### Omejitve

`Integer.MAX_VALUE`

### Spremenljivke

```java
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
