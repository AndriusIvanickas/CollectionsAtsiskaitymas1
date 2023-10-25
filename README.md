# Library_Atsiskaitymas
Testo darbas, Library

Klasės       Savybės
Library      name(get, set)
Department   name(get, set)   numberOfPublications (get, set)
Edition      name (get, set)   author(get, set)   yearOfPublication (get, set)

Testo reikalavimai:
Reikia suformuoti leidinio tekstinį aprašymą tokia forma:
knygai: Autorius: <author>
Išleidimo metai: < yearOfPublication>
Leidykla: <name>
Santrauka: < summary>
žurnalui: Autorius: <author>
Išleidimo metai: < yearOfPublication>
Leidykla: <name>
Straipsniai: < articleTitle1>< articleTitle2>…
Atlikite šiuos veiksmus:
1. Edition klasę padaryti abstrakčia; 
2. Edition klasėje pridėti abstraktų metodą aprašymui sukurti generateDescription; 
3. sukurti dvi išvestines klases Book ir Magazine; 
4. Magazine klasėje pridėti savybę articleTitles (get);
5. Magazine ir Book klasėse užkloti generateDescription() metodą.
6. Pridėkite dvi knygas ir vieną žurnalą į tam tikrą bibliotekos skyrių. Pridėkite du straipsnius prie žurnalo.
7. Ekrane rodyti kiekvieno skyriaus leidinių aprašą. 
8. Surikiuokite leidinius pagal jų išleidimo metus mažėjimo tvarka. Gautą rezultatą išveskite į
ekraną. 
