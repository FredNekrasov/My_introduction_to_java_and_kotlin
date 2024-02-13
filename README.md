# My introduction to Java and Kotlin

В этом проекте я изучал основы работы с Kotlin, выполняя практические работы из [файла](https://github.com/FredNekrasov/My_introduction_to_java_and_kotlin/blob/main/PWs.pdf), которые заставят вспомнить базу. С каждой практической работой становиться все сложнее и сложнее, учитывая уделенное на задание время. По этому файлу возможно выучить любой язык программирования, наверное.

### Коротко обо всех работах:
1) Разработать [программы](https://github.com/FredNekrasov/My_introduction_to_java_and_kotlin/tree/main/src/main/java/kotlinf/pws/firstPW), в которой нельзя использовать дополнительные строки. Следует избегать сложных структур (списков, множеств и т. д.). Также не должно быть вложенных циклов и функций вроде split.
2) [Преобразовать код из предыдущей работы с использованием различных функций](https://github.com/FredNekrasov/My_introduction_to_java_and_kotlin/tree/main/src/main/java/kotlinf/pws/secondPW).
3) [Выполнить задания из первой практической работы и не только с использованием функционального подхода в одну строку](https://github.com/FredNekrasov/My_introduction_to_java_and_kotlin/tree/main/src/main/java/kotlinf/pws/thirdPW).
4) [Создать программу проверки синтаксической корректности фрагмента программы на языке Паскаль с использованием регулярных выражений](https://github.com/FredNekrasov/My_introduction_to_java_and_kotlin/blob/main/src/main/java/kotlinf/pws/fourthPW.kt).
5) Реализовать с использованием ООП консольное [приложение](https://github.com/FredNekrasov/My_introduction_to_java_and_kotlin/tree/main/src/main/java/kotlinf/pws/fifthPW), которое взаимодействует с "базой данных" (на самом деле нет) с функциями: добавления, изменения, удаления, сортировки, поиска и вывода на экран содержимого. База данных не предполагает сохранении информации между сеансами работы, но подразумевает, что программа не "падает" при (почти) любых действиях пользователя. В ходе разработки необходимо строго использовать принципы Dry и Solid.
6) [Внедрить Dagger 2 в предыдущую работу](https://github.com/FredNekrasov/My_introduction_to_java_and_kotlin/tree/main/src/main/java/kotlinf/pws/sixthPW).
7) [Работа с функциями и Generic'ами](https://github.com/FredNekrasov/My_introduction_to_java_and_kotlin/tree/main/src/main/java/kotlinf/pws/seventhPW).

### Источники для выполнения практических работ по файлу "PWs":
1. Открываем файл [kotlin](https://github.com/FredNekrasov/My_introduction_to_java_and_kotlin/blob/main/src/main/java/kotlinf/course/Basic.kt) или [java](https://github.com/FredNekrasov/My_introduction_to_java_and_kotlin/blob/main/src/main/java/javaf/basics/ForBasics.java). Читаем и гуглим, если не знаете или забыли, а уже потом начинаем выполнять работы.
2. [Официальная документация по функциям в Kotin](https://kotlinlang.org/docs/functions.html#parameters).
3. [Документация по функциям расширения и высшего порядка](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/), которая необходима для выполнения работы.
4. [Cайт](https://regex101.com/), в котором можно узнать про специальные символы, используемые в регулярных выражениях. В правом нижнем углу все эти знаки указаны.
5. Коротко про [SOLID](https://www.youtube.com/watch?v=A6wEkG4B38E&list=LL&index=27) с примерами. Don’t repeat yourself (DRY) - это принцип, который означает, что программист должен избегать повторов в реализации кода и в логике работы, а вместо этого использовать то, что есть.
6. Курс по [dagger 2](https://www.youtube.com/watch?v=G5P_vDL1ZLg&list=PL0SwNXKJbuNkYFUda5rlA-odAVyWItRCP). Раз [для чайников](https://www.youtube.com/watch?v=G5P_vDL1ZLg&list=PL0SwNXKJbuNkYFUda5rlA-odAVyWItRCP), то должно быть понятно. [Документация по dagger'у](https://dagger.dev/dev-guide/), вроде.
7. [Документация по generic'ам](https://kotlinlang.org/docs/generics.html#underscore-operator-for-type-arguments), [примеры](https://www.youtube.com/watch?v=b4-4Q-xekHs&list=PLxizNdMtXgxo0y4n-jK_YrQNrI4sPoDFo&index=23) их использования. [Использование generic и extension функций](https://www.youtube.com/watch?v=V-3L2TEdJXs&t=74s).

В папке javaf/pws я пробую выполнить эти же работы только на языке java, но пока времени не нахожу, чтобы доделать до конца. В папке src/main/java/javaf/basics я изучал язык java по данному [плейлисту](https://www.youtube.com/watch?v=FR7vWoCWOMM&list=PLw265NhvhLXHptSyZ93dFd_7AoPnJTF1T). Очень даже хорошо и понятно. В папке "practical_tasks" готовился к экзамену. Можно сказать, что вспоминал прошлое и заодно помог одногруппникам.

Быстрое введение в [Kotlin](https://stepik.org/course/4222/promo) от авторов языка.
