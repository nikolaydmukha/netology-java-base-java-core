
У нас есть кинофабрика, но она работает не в полную силу.
Давай расширим ее функционал по аналогии с тем, что уже есть, и добавим чтение с консоли.
Вот что тебе нужно сделать для успешного решения:
1. Разобраться, что программа умеет делать.
2. Все классы должны быть внутри класса Solution.
3. Добавить классы Cartoon, Thriller.
4. Разобраться, как мы получаем объект класса SoapOpera по ключу &quot;soapOpera&quot;.
5. Аналогично получению объекта SoapOpera:
- добавить в MovieFactory.getMovie получение объекта Cartoon для ключа &quot;cartoon&quot;;
- добавить в MovieFactory.getMovie получение объекта Thriller для ключа &quot;thriller&quot;.

6. Считать с консоли несколько ключей (строк).
Важно: ввод заканчивается, как только вводится строка, не совпадающая с одной из: &quot;cartoon&quot;, &quot;thriller&quot;, &quot;soapOpera&quot;.
7. Создать переменную movie типа Movie, и для каждой введенной строки (ключа):
- получить объект, используя MovieFactory.getMovie и присвоить его переменной movie;
- вывести на экран movie.getClass().getSimpleName().


Требования:
1.	Классы Cartoon и Thriller должны быть статическими и существовать внутри класса Solution.
2.	Метод MovieFactory.getMovie должен возвращать объект типа Cartoon при передаче ему строки &quot;cartoon&quot; в качестве параметра.
3.	Метод MovieFactory.getMovie должен возвращать объект типа Thriller при передаче ему строки &quot;thriller&quot; в качестве параметра.
4.	Метод main должен считывать строки с клавиатуры.
5.	Метод main должен прекращать считывать строки с клавиатуры, если была введена некорректная строка (не &quot;cartoon&quot;, не &quot;thriller&quot; или не &quot;soapOpera&quot;).
6.	Для каждой введенной строки (в том числе для некорректной) необходимо вызвать метод MovieFactory.getMovie().
7.	Для всех введенных корректных строк необходимо вывести на экран простые имена (movie.getClass().getSimpleName()) типов объектов, возвращаемых методом MovieFactory.getMovie().

