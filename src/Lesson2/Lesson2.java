package Lesson2;

import java.util.Scanner; //модуль для роботи с системой ввода



public class Lesson2 {
    public static void main(String[] args)
    {

        //условные операторы
        //region if

//        //оператор полной развертки(if -else if-else)
//        int num1 = 6;
//        int num2 = 8;
//        if(num1>num2){
//            System.out.println("Первое число больше второго");
//        }
//        else if(num1<num2){
//            System.out.println("Первое число меньше второго");
//        }
//        else{
//            System.out.println("Числа равны");
//        }
//
//        //оператор не полноый развертки
//        int a = 8;
//        int b = 6;
//        if(a > b && a>7){
//            System.out.println("Первое число больше второго и больше 7");
//        }

        //endregion

        //region switch
//        int num = 8;
//        switch(num){
//
//            case 1:
//                System.out.println("число равно 1");
//                break;
//            case 8:
//                System.out.println("число равно 8");
//                num++;
//                break;
//            case 9:
//                System.out.println("число равно 9");
//                break;
//            default:
//                System.out.println("число не равно 1, 8, 9");
//        }
        //endregion

        //region ввод значений пользователем

//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Enter your name");
//        String str = in.nextLine();
//
//        System.out.println("Developer name is " + str);

        //endregion

        //region switch example
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите Y или N: ");
//        String input= in.nextLine();
//
//        switch(input){
//
//            case "Y":
//                System.out.println("Вы нажали букву Y");
//                break;
//            case "N":
//                System.out.println("Вы нажали букву N");
//                break;
//            default:
//                System.out.println("Вы нажали неизвестную букву");
//        }
        //endregion

        //region short if
//        int x=3;
//        int y=2;
//        int z = x<y? (x+y) : (x-y);
//        System.out.println(z);
        //endregion

        //циклические операторы

        //region for
        //базовая структура
//        for (int i = 0; i< 5; i++)
//        {
//            System.out.println("Iteration №" + i);
//        }

        //стуктура без условия


//        for (int i = 0;; i++)
//        {
//            System.out.println("Iteration №" + i);
//        }

        //пустой оператор for
//        for(;;)
//        {
//            System.out.println("Зацикливание");
//        }

        //endregion

        //region while
//            int j;
//        j = 10;
//        while(j<100)
//        {
//            System.out.println("Квадрат числа " + j + " = " + (j*j));
//            j++;
            //j+=10;
//        }
        //endregion

        //region do while

//        int j = 7;
//        do{
//            System.out.println(j);
//            j--;
//        }
//        while (j > 0);

        //
//        int j = -1;
//        do{
//            System.out.println(j);
//            j--;
//        }
//        while (j > 0);

        //endregion

        //Массивы
        //region одномерные массивы
//        int[] array = new int[5];
//        int array2[] = new int[5];
//
//        array[0] = 3;
//        array[1] = 10;
//        array[2] = 40;
//        array[3] = 13;
//        array[4] = 60;
//
//        System.out.println("значение элемента 3 = " + array[3]);
//
//        for(int i = 0; i<5; i++)
//        {
//            System.out.println("значение элемента " + i + " = " + array[i]);
//        }

//        String[] days = new String[]{"Понедельник", "Вторник", "Среда"};
//        String[] month = new String[]{"Январь", "Февраль", "Март"};
//
//        System.out.println(days[1] +  " " + month[1]);
        //endregion

        //region двумерные массивы
        Scanner in = new Scanner(System.in);
        int[][] mulArr = new int[3][3];

        for(int i = 0; i< 3; i++)
        {
            for(int j=0; j< 3; j++)
            {
                System.out.println("Введите элемент с номером["+i+"]["+j+"]");
                mulArr[i][j] = in.nextInt();
            }
        }

        //вывод массива на экран

        for(int i = 0; i< 3; i++)
        {
            for(int j=0; j< 3; j++)
            {
                System.out.print( "|" + mulArr[i][j] );

            }
            System.out.println();
        }
        //endregion
    }

}
