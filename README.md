## Pflichtaufgabe Java Programmer Zertifizierung - Teil1
 
1. Schreiben Sie ein kleines Programm bestehend aus einer Klasse, definieren Sie in der Klasse einige Datenfelder
	und eine main-Methode.
 	�berpr�fen Sie an den Datenfeldern die Namensregeln f�r Identifier. �berpr�fen Sie die m�glichen Modifier f�r
 	die Klasse und f�r die Datenfelder. �berpr�fen Sie die Regeln, die f�r die main-Methode gelten.
 
2. Schreiben Sie ein kleines Programm bestehend aus einer Klasse, definieren Sie in der Klasse einen Konstruktor,
	Instanz- und Klassen-Variablen, einen Initialisierungsblock sowie einen statischen Initialisierungsblock.
 	�berpr�fen Sie in Ihrer Anwendung die Reihenfolge der Initialisierungen.
 
3. Schreiben Sie ein kleines Programm bestehend aus einer Klasse, definieren Sie in der Klasse verschiedene
	Datenfelder vom Typ der numerischen Wrapper Klassen.
 	�berpr�fen Sie in Ihrer Anwendung die Funktionsweise der Methoden der numerischen Wrapper Klassen.
 
4. Schreiben Sie ein kleines Programm bestehend aus einer Klasse, definieren Sie in der Klasse ein Datenfeld
	vom Typ StringBuilder und ein Datenfeld vom Typ String.
 	�berpr�fen Sie in Ihrer Anwendung die Funktionsweise der Methoden der Klassen StringBuilder und String.
 	F�hren Sie in einem Loop Konkatenierungs-Operationen aus f�r StringBuilder und String und vergleichen Sie
 	die Performance der beiden Klassen.

## Pflichtaufgabe Java Programmer Zertifizierung - Teil2
 
1. Schreiben Sie ein kleines Programm, in dem Sie die Java Operatoren <<, >>, >>>, ^, & und  | auf ihre Funktionalit�t
	testen.
 
2. Schreiben Sie ein kleines Programm, in dem Sie eine Klasse Kunde mit einigen Datenfeldern definieren. �berschreiben
	Sie die equals()-Methode f�r die Klasse Kunde dahin, dass Objekte der Klasse Kunde auf Gleichheit der Datenfelder
	�berpr�ft werden.
 
3. Schreiben Sie ein kleines Programm, in dem Sie einen zweidimensionalen Array definieren, erzeugen und initialisieren,
	initialisieren Sie den Array auf zwei verschiedene Arten.
 
4. Schreiben Sie ein kleines Programm bestehend aus einer Klasse, definieren Sie in der Klasse ein Datenfeld vom Typ
	ArrayList .
 	�berpr�fen Sie in Ihrer Anwendung die Funktionsweise der Methoden und die Features der Klasse ArrayList.
	Wenden Sie dir arraycopy()-Methode der Klasse System auf die ArrayList an.
	Wenden Sie die Algorithmen zur Manipulation von Listen (siehe Folien) der Klasse Collections auf die ArrayList an.

## Pflichtaufgabe Java Programmer Zertifizierung - Teil3 

1. Schreiben Sie ein kleines Programm, in dem Sie die unterschiedlichen loop-Konstrukte auf ihre Funktionsf�higkeit hin
	�berpr�fen.
 
2. Schreiben Sie ein kleines Programm, in dem Sie drei Klassen mit beliebigen Datenfeldern implementieren, 2 der Klassen
	sollen in einem Package abgelegt werden(eine davon soll zus�tzlich eine einfache innere Klasse haben), die andere
	Klasse in einem anderen Package, sie soll eine Vererbungsbeziehung zu einer der beiden anderen Klassen haben, testen
	Sie die Anwendung bez�glich unterschiedlicher Access Modifiers.
 
3. Implementieren Sie eine Klasse Outer mit einem Datenfeld x und einer Methode m1().
	Implementieren Sie nun in der Methode m1() eine lokale Klasse Inner, die auf das Datenfeld x der Klasse Outer
	zugreift und ihren Wert am Bildschirm ausgibt.
 	Implementieren Sie schliesslich noch eine main-Methode, wo Sie die Methode m1() aufrufen.
 	Versuchen Sie in einem 2. Schritt, der lokalen Klasse einen Zugriffsmodifikator zuzuweisen, was passiert und warum?
 
4. Implementieren Sie bitte eine Klasse Outer mit einer Methode m1(int y), in der Methode definieren Sie bitte zun�chst
	eine weitere lokale Variable x und anschliessend eine lokale Klasse Inner, in der Sie auf die Variablen y und x
	zugreifen.
 	Testen Sie Ihren Code in einer main-Methode.
 	Untersuchen Sie zus�tzlich noch die Funktionsweise von anonymen inneren Klassen und statischen inneren Klassen.
	
## Pflichtaufgabe Java Programmer Zertifizierung - Teil4

1. Schreiben Sie ein kleines Programm, in dem Sie die verschiedenen M�glichkeiten des �berschreiben und �berladen von
	Methoden sowie das Verdecken von Datenfeldern �berpr�fen. Zeigen Sie in dem Programm auch, wie Polymorphismus
	angewendet wird.

2. Schreiben Sie ein kleines Programm, in dem Sie eine Klasse B implementieren, diese Klasse soll von einer abstrakten
	Klasse A abgeleitet sein die wiederum ein Interface mit zwei Methodendeklarationen sowie zwei Konstanten implementiert,
	das Interface wiederum soll zwei weitere Interfaces ableiten, jedes dieser Interfaces definiert eine Methodendeklaration.
	Instanzieren Sie ein Objekt der Klasse B, greifen Sie auf die Konstanten zu und rufen Sie die Methoden auf.

3. Implementieren Sie eine Java Anwendung, die zwei Parameter entgegennimmt. �berpr�fen Sie die korrekte Anzahl der
	entgegengenommenen Parameter �ber eine Assertion.

4. Implementieren Sie drei verschiedene Exceptions, die Vererbungsbeziehungen zueinander haben. Zeigen Sie in Ihrer Anwendung,
	dass eine �berschriebene Methode nur gerade die Exceptions werfen kann, die die Originalmethode wirft.
	
## Pflichtaufgabe Java Programmer Zertifizierung - Teil5 

1. Schreiben Sie ein kleines Programm, in dem Sie eine eigene enum-Klasse implementieren. Erproben Sie an Ihrem Programm
	die verschiedenen M�glichkeiten von Enums gem�ss Vorlesungsunterlagen.

2. Schreiben Sie ein kleines Programm, in dem Sie das Singleton Design Pattern implementieren. Testen Sie ihr Singleton
	auf korrekte Funktionsweise.

3. Schreiben Sie ein kleines Programm, in dem Sie das DAO Design Pattern implementieren. Als Datasource k�nnen Sie gerne
	Dummydaten oder aber auch eine Datenbank verwenden.

4. Schreiben Sie ein kleines Programm, in dem Sie eine eigene Factory implementieren. Testen Sie ihre Factory auf korrekte
	Funktionsweise.

## Pflichtaufgabe Java Programmer Zertifizierung - Teil6

1. Schreiben Sie ein kleines Programm, in dem Sie eine eigene generische Stack-Klasse mit den Methoden push() und pop()
	implementieren, in der Sie Objekte vom Typ Student(ein Student hat einen Namen und eine Matrikelnummer) auf dem Stack
	ablegen und vom Stack holen. Geben Sie nach jeder Operation den Inhalt des Stacks aus. Implementieren Sie die
	Stack-Klasse als eigene generische Klasse.

2. Schreiben Sie ein kleines Programm, in dem Sie eine eigene generische Klasse implementieren. Experimentieren Sie mit
	mehreren Typ-Variablen, Typ-Variablen mit Einschr�nkungen, Parametrisierten Typen und Interfaces mit Typ-Variablen
	gem�ss Vorlesungsunterlagen.

3. Schreiben Sie ein kleines Programm, in dem Sie eine eigene nicht-generische Klasse implementieren. Implementieren Sie
	in dieser Klasse generische Methoden und experimentieren Sie mit diesen generischen Methoden gem�ss
	Vorlesungsunterlagen.

4. Schreiben Sie ein kleines Programm, in dem Sie die Technik des Auto/Unboxing untersuchen gem�ss Vorlesungsunterlagen.

5. Schreiben Sie ein kleines Programm, in dem Sie die verschiedenen Collectionarten (Set, List, Map) mit ihren Klassen auf ihre Funktionsweisen hin untersuchen.

## Pflichtaufgabe Java Programmer Zertifizierung - Teil7

1. Schreiben Sie ein kleines Programm, in dem Sie regul�re Expressions verarbeiten mit der Pattern- und der Matcher-Klasse
	gem�ss Vorlesungsunterlagen.

2. Schreiben Sie ein kleines Programm, in dem Sie die Ausgabe von formatierten Strings �ber die format()-Methode bzw.
	printf()-Methode, sowie die Formatierung von numerischem Output �ber die DecimalFormat Klasse gem�ss
	Vorlesungsunterlagen �ben.

3. Schreiben Sie ein kleines Programm, in dem Sie das try-with-ressources-Statement sowie die Implementierung von
	Assertions �ben gem�ss Vorlesungsunterlagen.

4. Schreiben Sie ein kleines Programm, in dem Sie die Streamklassen im java.io Paket sowie die Klassen im  java.nio.file
	auf ihre Funktionalit�t hin untersuchen gem�ss Vorlesungsunterlagen.

## Pflichtaufgabe Java Programmer Zertifizierung - Teil8

1. Schreiben Sie ein kleines Programm :
	Untersuchen der Path Klasse im nio Paket ( Path erzeugen, Path Informationen abfragen, 2 Paths zusammenf�hren �ber die
	resolve() Methode, 2 Paths vergleichen).
	Untersuchen der Files Klasse im nio Paket ( File Zugriff �berpr�fen, File Location in verschiedenen Paths �berpr�fen,
	File/Directory l�schen/kopieren/versetzen, Metadaten abfragen).
	Untersuchen der PathMatcher Klasse  im nio Paket (Files finden �ber die unterschiedlichen Glob Patterns gem�ss
	Vorlesungsunterlagen).

2. Schreiben Sie ein kleines Programm, in dem Sie das JDBC API benutzen um auf eine Datenbank zuzugreifen gem�ss
	Vorlesungsunterlagen.

3. Schreiben Sie ein kleines Programm, in dem Sie einen Thread starten, der Thread soll eine einfache Nachricht �ber
	die Standardausgabe ausgeben.
	Implementieren Sie Ihre Thread-Klasse auf 2 verschiedene Arten.

4. Schreiben Sie ein kleines Programm, in dem Sie eine Synchronisation mit Reihenfolge �ber die Methoden wait() und
	notify() durchf�hren.
	Es soll eine Queue zum Austausch von Zeichen zwischen Threads entwickelt werden, benutzen Sie als Datenstruktur f�r
	die Queue einen Array der Gr�sse 50.
	Implementieren Sie zum Lesen aus der Queue eine read-Methode, zum Schreiben aus der Queue eine write-Methode.
	Wenn die Queue voll ist, dann soll der schreibende Thread solange gestoppt werden, bis wieder Platz in der Queue ist,
	falls der lesende Thread versucht, aus einer leeren Queue zu lesen, so soll dieser gestoppt und in den Wartezustand
	versetzt werden.
	Verwenden Sie hierzu die Methoden wait() und notify(), implementieren Sie eine entsprechende Testklasse zum Testen der
	Anwendung.
	
## Pflichtaufgabe Java Programmer Zertifizierung - Teil9 

1. Schreiben Sie ein kleines Programm in dem Sie die Collection-Klassen BlockingQueue, ConcurrentHashMap und 
	ConcurrentSkipListMap im Paket java.util.concurrent auf ihre Funktionalit�t hin �berpr�fen.

2. Fork/Join Framework:
	Untersuchen Sie das Programm http://docs.oracle.com/javase/tutorial/essential/concurrency/examples/ForkBlur.java
	auf seine Funktionalit�t hin, kompilieren Sie das Programm und f�hren Sie es aus.

3. Localisation: 
	Untersuchen Sie die beiden Programme http://docs.oracle.com/javase/tutorial/i18n/resbundle/examples/PropertiesDemo.java 
	und http://docs.oracle.com/javase/tutorial/i18n/resbundle/examples/RBControl.java  auf ihre Funktionalit�t hin,
	kompilieren Sie die beiden Programme und f�hren Sie sie aus. 

4. Numbers and Currencies :
	Untersuchen Sie den Sourcecode in den Folien zum Formatieren von Numbers, Currencies, Dates und Times. Kompilieren
	Sie den Code und f�hren Sie ihn aus.
	