## 1. Einleitung

Die Zukünftige Random Access Machine (RAM) ist ein abstraktes Modell einer Rechenmaschine, die entwickelt wurde, um grundlegende Rechenoperationen durchzuführen. Die RAM kann mit einer begrenzten Anzahl von Instruktionen arbeiten und ermöglicht es Benutzern, einfache Programme auszuführen, indem sie Instruktionen ausführen, die auf den Inhalten des Speichers und des Akkumulators basieren.

Die grundlegenden Funktionen sind in folgender Darstellung ersichtlich:

![[Pasted image 20230930112010.png]]

## 2. Bedienungsanleitung des RAM

### 2.1. Befehle

Die RAM unterstützt die folgenden Befehle:

- `m150_ram.ADD X`: Addiere den Inhalt des Speichers an Adresse X zum Inhalt des Akkumulators.
- `m150_ram.SUB X`: Subtrahiere den Inhalt des Speichers an Adresse X vom Inhalt des Akkumulators.
- `m150_ram.LDA X`: Lade den Akkumulator mit dem Inhalt der Speicheradresse X.
- `m150_ram.STA X`: Speichere den Inhalt des Akkumulators in der Speicheradresse X.
- `m150_ram.LDI X`: Lade den Akkumulator indirekt mit dem Inhalt der Speicheradresse X.
- `m150_ram.STI X`: Speichere den Inhalt des Akkumulators indirekt in der Speicheradresse X.
- `m150_ram.JMP X`: Springe zur markierten Instruktion X im Programm.
- `m150_ram.JMZ X`: Springe zur markierten Instruktion X im Programm, wenn der Akkumulator den Wert 0 enthält.
- `m150_ram.HLT`: Beende das Programm.

### 2.2. Ablauf

Das Programm wird von oben nach unten ausgeführt. Jede Instruktion wird nacheinander verarbeitet, wobei der Akkumulator und der Speicher entsprechend aktualisiert werden.

### 2.3. Nutzung

1. Laden Sie ein Programm in den Speicher der RAM.
2. Starten Sie die RAM.
3. Die RAM wird die Instruktionen im Programm ausführen und den Zustand des Akkumulators und des Speichers aktualisieren.
4. Das Programm kann mit einer `m150_ram.HLT`-Instruktion beendet werden.

## 3. Ideen und Absichten

Die Idee hinter der Zukünftigen RAM ist es, ein einfaches und abstraktes Modell einer Rechenmaschine zu bieten, um grundlegende Berechnungen und Algorithmus-Tests durchzuführen. Dieses Konzeptpapier legt den Grundstein für die Entwicklung eines Software-Emulators für die RAM, der es ermöglicht, Programme auszuführen und die Funktionalitäten zu testen.

## 4. Klassendiagramm





## 5. Anwendungsszenarien für Tests

1. **Algorithmustests**: Die RAM kann verwendet werden, um einfache Algorithmen zu testen und deren Funktionalität zu überprüfen. Dies ist hilfreich, um grundlegende Konzepte der Algorithmik zu lehren und zu verstehen.

2. **Lehrmittel**: Die RAM kann als Lehrmittel in der Informatikausbildung dienen, um Schülern und Studenten die Grundlagen der Rechnerarchitektur und des Maschinen-Codierens näherzubringen.

3. **Entwicklung eines Emulators**: Auf Basis des Klassendiagramms kann ein Software-Emulator entwickelt werden, um die Funktionalitäten der RAM zu simulieren und Programme auszuführen.

4. **Entwicklung von Testprogrammen**: Testprogramme können erstellt werden, um die RAM-Funktionalitäten zu überprüfen und sicherzustellen, dass sie gemäß den Spezifikationen arbeitet.

## 6. Fazit

Die Zukünftige Random Access Machine (RAM) ist ein abstraktes Modell einer Rechenmaschine, das sich für pädagogische Zwecke und algorithmische Experimente eignet. Das vorgestellte Konzeptpapier gibt einen Überblick über die Funktionalitäten, das Klassendiagramm und mögliche Anwendungsszenarien für Tests und Weiterentwicklungen. Die Implementierung eines Emulators auf Basis dieses Konzepts ermöglicht es, die RAM-Funktionalitäten in der Praxis zu nutzen und zu erforschen.
