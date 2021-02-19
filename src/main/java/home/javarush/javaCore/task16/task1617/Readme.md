
1. Разберись, что делает программа.
2. Реализуй логику метода run так, чтобы каждую секунду через пробел
выдавался отсчет начиная с numSeconds до 1, а потом слово [Марш!] (см примеры).
3. Если нить работает 3.5 секунды или более, прерви ее методом interrupt и внутри нити выведи в консоль слово [Прервано!].
Пример для numSeconds=4 : &quot;4 3 2 1 Прервано!&quot;
4. Если нить работает менее 3.5 секунд, она должна завершиться сама.
Пример для numSeconds=3 : &quot;3 2 1 Марш!&quot;
PS: метод sleep выбрасывает InterruptedException.


Требования:
1.	Метод run класса RacingClock должен содержать цикл.
2.	Объект класса RacingClock должен каждую секунду уменьшать значение переменной numSeconds на единицу.
3.	Метод main должен вызывать Thread.sleep(3500).
4.	Метод main должен вызывать метод interrupt у объекта clock.
5.	Если numSeconds равно 3, то программа должна вывести &quot;3 2 1 Марш!&quot;.
6.	Если numSeconds равно 4, то программа должна вывести &quot;4 3 2 1 Прервано!&quot;.

