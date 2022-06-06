# Organizeit-_Exercise
## Zadanie 1
Napisz testy jednostkowe dla metody updateTask() klasy SimpleTaskListController. Powinny one testować takie przypadki jak:
+ brak odpowiadającego obiektu na liście tasks (czyli gdy jako argument ‘oldTask’ przekażemy taki, który nie istnieje)
+ przypadek pozytywny (udało się zmodyfikować obiekt na liście)

hint: Wykorzystaj metody assertEquals i assertThrows z biblioteki JUnit.

## Zadanie 2
Utwórz metodę tłumaczącą obiekt typu Task na mapę, którą można przekazać Flutterowi. W tym celu w klasie SimpleTaskMapper dokończ implementację metody public Map<String,String> taskToMap(SimpleTask task) {}. Zwracana mapa ma zawierać pola takie jak: "type", "title", "topicName", "topicSubject", "date", "status", "note".

## Zadanie 3
