# Vetélkedő (Monty Hall) Játék

## 1. Feladat leírása
A Vetélkedő egy egyszerű szerencsejáték-szimuláció, amely a klasszikus Monty Hall-problémán alapul.  
A játék célja, hogy a játékos kitalálja, melyik ajtó mögött található a nyeremény.

### Játékmenet:
1. Három ajtó van: az egyik mögött nyeremény található, a másik kettő üres.
2. A műsorvezető tudja, melyik ajtó mögött van a nyeremény.
3. A játékos kiválaszt egy ajtót.
4. A műsorvezető kinyit egy másik ajtót, amely mögött nincs nyeremény.
5. A játékosnak lehetősége van megváltoztatni a választását, de nem kötelező.
6. A játék végeztével a választott ajtót kinyitjuk, és eldől, nyert-e a játékos.

---

## 2. Követelmények

### 2.1 Funkcionális követelmények
A programnak rendelkeznie kell a következő funkciókkal:
- Véletlenszerűen elhelyezni a nyereményt az egyik ajtó mögött.
- A játékos kiválaszthasson egy ajtót.
- A műsorvezető automatikusan nyisson ki egy üres ajtót a maradék kettő közül.
- A játékosnak lehessen lehetősége változtatni a választását.
- Kiírni az eredményt (nyert / nem nyert).
- Többször lehessen játszani a játékot (opcionális).

### 2.2 Nem-funkcionális követelmények
- Platform: Java (NetBeans IDE kompatibilis).
- GUI: Egyszerű, felhasználóbarát grafikus felület (Swing vagy JavaFX).
- Tesztelhetőség: A program modulárisan legyen felépítve, hogy könnyen lehessen unit teszteket írni.
- Eladható / demonstrálható: A program legyen stabil, hibamentes, könnyen futtatható.

---

## 3. Tervezési szempontok

### Architektúra
- MVC (Model-Nezet-Vezerlo) minta alkalmazása:
  - **Model**: A játék logikája (ajtók, nyeremény, játékos választása).
  - **Nezet**: Felhasználói felület (GUI).
  - **Vezerlo**: Játék irányítása, események kezelése.

### Osztályterv
- **AjtoModell**: Egy ajtót reprezentál (nyeremény, nyitott/zárt állapot).
- **JatekModell**: Játék logikája (ajtók generálása, nyeremény elhelyezése, eredmény kiszámítása).
- **JatekosModell**: Játékos választása, döntésváltás kezelése.
- **JatekVezerlo**: A játék menetét vezérli, kommunikál a Model-lel és a Nezet-el.
- **JatekNezet**: GUI, interaktív felület, ahol a játékos választhat és láthatja az eredményt.

### Funkcionális követelmények
- Véletlenszerű nyeremény-elhelyezés.
- Játékos választása és döntésváltoztatása.
- Műsorvezető ajtónyitási logikája (nem nyitja ki a nyereményes ajtót).
- Eredmény kiírása (nyert / nem nyert).

### Nem-funkcionális követelmények
- Java nyelv, NetBeans kompatibilis.
- GUI felület Swing vagy JavaFX segítségével.
- Tesztelhetőség: moduláris felépítés, unit tesztek.
- Stabil és bemutatható (demonstrálható, hibamentes működés).

### Játékélmény és GUI
- Letisztult és áttekinthető felület.
- Egyértelmű utasítások a játékos számára.
- Visszajelzés minden lépésnél.
- Új játék indításának lehetősége.

---

## Alapszerkezet

```
vetelkedo
├─ main
│  └─ Vetelkedo.java
├─ model
│  ├─ AjtoModell.java
│  ├─ JatekModell.java
│  └─ JatekosModell.java
├─ nezet
│  ├─ GuiJatekNezet.java (GUI)
   └─ ajto.png
└─ vezerlo
   └─ JatekVezerlo.java
```
