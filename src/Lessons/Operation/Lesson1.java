package Lessons.Operation;


class Lesson1 {
    public static void main(String[] args)
    {
        //region  Арифметические операции
        int first, second, result;

//        first = 100;
//        second = 4321;
//        result = first + second;
//        System.out.println("Result + = " + result);
//        result = first - second;
//        System.out.println("Result - = " + result);
//        result = first * second;
//        System.out.println("Result * = " + result);
//        result = first / second;
//        System.out.println("Result / = " + result);
//
//        //остаток от деления
//
//        first = 10;
//        result = first % 2; //
//        System.out.println("Result % 2 = " + result);
//
//        result = first % 3;
//        System.out.println("Result % 3 = " + result);
//
//
//        //Инкремент и дикремент
//
//        first = 100;
//        first ++; // префиксный инкремент
//        ++first; // постфиксный инкремент
//        System.out.println(first);
//
//        first = 100;
//        first --; // префиксный инкремент
//        --first; // постфиксный инкремент
//        System.out.println(first);



        //endregion

        //region логические операции
        //логическое умножение
//        int a1 = 2; //010
//        int b1 = 5;//101
//        System.out.println(a1&b1); // результат 0
//
//        int a2 = 4; //100
//        int b2 = 5; //101
//        System.out.println(a2 & b2); // результат 4

        //логическое сложение
//        int a1 = 2; //010
//        int b1 = 5;//101
//        System.out.println(a1|b1); // результат 7 - 111
//        int a2 = 4; //100
//        int b2 = 5;//101
//        System.out.println(a2 | b2); // результат 5 - 101

        //исключающее или

//        int number = 45; // 1001 Значение, которое надо зашифровать - в двоичной форме  101101
//        int key = 102;                         // Ключ шифрования - в двоичной системе 1100110
//        int encrypt = number ^ key;                          //Результатом будет число 1001011 или 75
//        System.out.println("Зашифрованное число: " +encrypt);
//
//        int decrypt = encrypt ^ key; // Результатом будет исходное число 45
//        System.out.println("Расшифрованное число: " + decrypt);
        //логическое отрицание

//        int a = 56;
//        System.out.println(~a);

        //endregion

        //region операции сдвига
//        byte a = -50;
//        System.out.println(a << 1);
//        System.out.println(a >> 1);
//        int res = a<<3;
//        System.out.println(res);
//        //Без знаковый сдвиг
//        System.out.println(a >>> 1);
        //endregion

        //region  Операции сравнения
//        boolean a1 = (5 > 6) || (4 < 6);  // 5 > 6 - false, 4 < 6 - true, поэтому возвращается true
//        boolean a2 = (5 > 6) || (4 > 6);  // 5 > 6 - false, 4 > 6 - false, поэтому возвращается false
//        boolean a3 = (5 > 6) && (4 < 6);  // 5 > 6 - false, 4 < 6 - true, поэтому возвращается false
//        boolean a4 = (50 > 6) && (4 / 2 < 3);  // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается true
//        boolean a5 = (5 > 6) ^ (4 < 6);  // 5 > 6 - false, 4 < 6 - true, поэтому возвращается true
//        boolean a6 = (50 > 6) ^ (4 / 2 < 3);  // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается false
        //endregion

        //region комбинированные операторы
        int a , b, c;
        a = 10;

        c = 30;

        c += a;
        System.out.println("+=  - " + c);


        //region типы комбинированных операторов

//-=         c-=b; (переменной c присваивается результат вычитания b из c)
//
//*=         c*=b; (переменной c присваивается результат произведения c и b)
//
///=         c/=b; (переменной c присваивается результат деления c на b)
//
//%=        c%=b; (переменной c присваивается остаток от деления c на b)
//
//&=         c&=b; (переменной c присваивается значение c&b)
//
//|=         c|=b; (переменной c присваивается значение c|b)
//
//^=         c^=b; (переменной c присваивается значение c^b)
//
//<<=         c<<=b; (переменной c присваивается значение c<<b)
//
//>>=         c>>=b; (переменной c присваивается значение c>>b)
//
//>>>=         c>>>=b; (переменной c присваивается значение c>>>b)
        //endregion


        //endregion

        //region приоритет операций

//     1    expr++ expr--
//     2   ++expr --expr +expr -expr ~ !
//     3   * / %
//     4   + -
//     5   << >> >>>
//     6   < > <= >=
//     7   == !=
//     8   &
//     9   ^
//     10   |
//     11   &&
//     12   ||
//     13   = += -= *= /= %= &= ^= |= <<= >>= >>>= (операторы присваивания)
        //endregion

    }

}
