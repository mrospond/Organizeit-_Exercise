# Organizeit-_Exercise
## Zadanie 1
Zaimplementuj metodę updateNote() w klasie NotelistController. Metoda powinna przyjmować argumenty zdefiniowane przez interfejs (id notatki, którą zmieniamy, oraz nową notatkę, która zastąpi poprzednią). 'Nowa' notatka musi zachować swoje stare id.

Napisz testy jednostkowe dla utworzonej w ten sposób metody. Powinny one obejmować takie przypadki jak:
+ brak odpowiadającego obiektu na liście notes (czyli gdy id, którego szukamy, nie istnieje)
+ przypadek pozytywny (udało się zmodyfikować obiekt na liście)

hint: Wykorzystaj metody assertEquals i assertThrows z biblioteki JUnit.

## Zadanie 2
Utwórz metodę tłumaczącą obiekt typu Task na mapę, którą można przekazać Flutterowi. W tym celu w klasie SimpleTaskMapper dokończ implementację metody public Map<String,String> taskToMap(SimpleTask task) {}. Zwracana mapa ma zawierać pola takie jak: "type" ("simple"), "title", "topicName", "topicSubject", "date"(rrrr-MM-dd), "status"(jako int wg kolejności definicji w klasie TaskStatus).

hint: przydatna metoda w klasach enum: ordinal()

## Zadanie 3
Zaimplementuj metodę updateStatus() w klasie ReoccurringTask. Powinna ona zmieniać status obiektu na podstawie obecnej daty w następujący sposób:
- jeśli obecna data (LocalDate.now()) jest przed datą startową zadania, to powinno mieć ono status SCHEDULED
- jeśli obecna data jest pomiędzy datą startową i datą końcową zadania, to powinno mieć ono status:
  a) ACTIVE, jeśli trwający aktualnie dzień tygodnia ZNAJDUJE się w zbiorze daysOfWeek
  b) SCHEDULED, jeśli trwający aktualnie dzień tygodnia NIE ZNAJDUJE się w zbiorze daysOfWeek
- jeśli obecna data jest po dacie końcowej zadania, to powinno mieć ono status FINISHED.
