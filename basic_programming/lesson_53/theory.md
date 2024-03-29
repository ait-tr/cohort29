***Лямбда выражения***

Среди новшеств, которые были привнесены в язык Java с выходом JDK 8, особняком стоят лямбда-выражения. Лямбда представляет набор инструкций, которые можно выделить в отдельную переменную и затем многократно вызвать в различных местах программы.

Основу лямбда-выражения составляет лямбда-оператор, который представляет стрелку ->. Этот оператор разделяет лямбда-выражение на две части: левая часть содержит список параметров выражения, а правая собственно представляет тело лямбда-выражения, где выполняются все действия.

Лямбда-выражение не выполняется само по себе, а образует реализацию метода, определенного в функциональном интерфейсе. При этом важно, что функциональный интерфейс должен содержать только один единственный метод без реализации.

***Ссылка на метод***  
Начиная с JDK 8 в Java можно в качестве параметра в метод передавать ссылку на другой метод. В принципе данный способ аналогичен передаче в метод лямбда-выражения.

Ссылка на метод передается в виде имя_класса::имя_статического_метода (если метод статический) или объект_класса::имя_метода (если метод нестатический). 
  
***Встроенные функциональные интерфейсы***  
В JDK 8 вместе с самой функциональностью лямбда-выражений также было добавлено некоторое количество встроенных функциональных интерфейсов, которые мы можем использовать в различных ситуациях и в различные API. В частности,  в Stream API -  прикладном интерфейсе для работы с данными. основные из этих интерфейсов:
  
Predicate<T>  

Consumer<T>  

Function<T,R>  

Supplier<T>  

UnaryOperator<T>  

BinaryOperator<T>  

