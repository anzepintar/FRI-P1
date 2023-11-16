# Programiranje t06 - 15. 11. 2023

## Eraotstenovo Sito

[EratostenovoSito.java](primeri/EratostenovoSito.java)

## Fibonaccijevo zaporedje z iteracijo

Postopek se imenuje _memoizacija_

[FibonacciMemo](primeri/FibonacciMemo.java)

## Primitivni in referenčni tipi

Primitivni: byte, short, int, long, float, double, boolean, char

- vsebujejo neko vrednost

Referenčni tipi: T[], String, Scanner

- vsebujejo pomnilniški naslov (kazalec/referenca) tega podatka

## Prenašanje parametrov

```java
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

```java
Tip[][] t = new Tip[m][n];
```

### Stopničasta 2D tabela

```java
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

```java
System.out.println(Arrays.deepToString(tabela));
// izpiše vse nivoje tabele
```

[Tabela2d](primeri/Tabela2d.java)
