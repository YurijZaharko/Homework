package old;

import java.util.Random;
import java.util.Scanner;



/**
 * Created by SCIP on 23.05.2016.
 */
public class Task {
    public void getSeparator(){
        separator();
    }

    private void separator(){
        System.out.println("================================================================================================================================================================");
    }

    private int random(int from, int to){
        int number = from + (int) (Math.random() *  (to - from ) + 1);
        return number;
    }

    public void task1(){
        int n;
        Random rm = new Random();

        n = rm.nextInt(1000);

        System.out.println("Завдання: створити програму, що перевіряє і повідомляє на екран, чи є ціле число записане в змінну n, парним або непарним.");
        System.out.println();
        if(n%2 == 0){
            System.out.println("Число " + n + " парне.");
        }else {
            System.out.println("Число " + n + " непарне.");
        }
        separator();

    }

    public void task2(){
        double a, b;
        double from = 0.1d;
        double to = 20d;


        System.out.println("Завдання: створити програму, що виводить на екран найближче до 10 з двох чисел, записаних в змінні m і n. Наприклад, серед чисел 8,5 і 11,45 найближче до десяти 11,45.");
        System.out.println();
        Random rm = new Random();
        a = from + (rm.nextDouble() * (to - from));
        b = from + (rm.nextDouble() * (to - from));

        if(Math.abs(a - 10) < Math.abs(b - 10)){
            System.out.println("З чисел " + a + "і " + b + " найблище до 10 число " + a);
        }else if(Math.abs(a - 10) > Math.abs(b - 10)){
            System.out.println("З чисел " + a + "і " + b + " найблище до 10 число " + b);
        }else {
            System.out.println("Числа " + a + "і " + b + " одинаково близькі до 10 ");
        }
        separator();
    }

    public void task3(){
        Random rm = new Random();

        int a = rm.nextInt(5);
        int b = rm.nextInt(10);
        int c = rm.nextInt(15);
        double xOne;
        double xTwo;
        double d;

        System.out.println("Завдання: У три змінні a, b і c записані три дійсних числа. " +
                "Створити програму, яка буде знаходити і виводити на екран речові коріння квадратного рівняння ax² + bx + c = 0, або повідомляти, що коріння немає.");
        System.out.println();
        System.out.println("Змінна a = " + a);
        System.out.println("Змінна b = " + b);
        System.out.println("Змінна c = " + c);

        d = Math.sqrt(b) - 4 *a *c;

        if(d > 0){
            xOne = -b + Math.sqrt(d)/(2 * a);
            xTwo = -b - Math.sqrt(d)/(2 * a);
            System.out.println("Дискрімінант " + d + " більше нуля, розвяки два: x1 = " + xOne + ", x2 = " + xTwo);
        }else if(d == 0){
            xOne = -2/(2 * a);
            System.out.println("Дискрімінант " + d + " рівне нулю, розвязок один: x1 = " + xOne );
        } else {
            System.out.println("Дискрімінант " + d + " менше нуля, дійсних коренів немає.");
        }

        separator();
    }

    public void task4(){
        System.out.println("Завдання: Створіть програму, що виводить на екран всі чотиризначні числа послідовності 1000 1003 1006 1009 1012 1015");
        System.out.println();
        for (int i = 1000; i < 10000; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();
        separator();
    }

    public void task5(){
        int a = 1;
        System.out.println("Завдання: Створіть програму, що виводить на екран перші 55 елементів послідовності 1 3 5 7 9 11 13 15 17 ....");
        System.out.println();
        for (int i = 0; i < 55; i++) {
            a += 2;
            System.out.print(a + " ");
        }
        System.out.println();
        separator();
    }

    public void task6(){
        System.out.println("Завдання:  Створіть програму, що виводить на екран всі невід'ємні елементи послідовності 90 85 80 75 70 65 60 ....");
        System.out.println();

        int a = 90;
        while (a >= 0){
            System.out.print(a + " ");
            a -= 5;
        }

        System.out.println();
        separator();
    }

    public void task7(){
        System.out.println("Завдання: Створіть програму, що виводить на екран перші 20 елементів послідовності 2 4 8 16 32 64 128 ....");
        System.out.println();
        int a = 2;

        for (int i = 0; i < 20; i++) {
            System.out.print(a + " ");
            a = a * 2;
        }
        System.out.println();
        separator();

    }

    public void task8(){
        System.out.println("Завдання: Виведіть на екран всі числа в послідовності 2a-1, де a1 = 2, які менше 10000.");
        System.out.println();
        int a = 2;

        while (a < 10000){
            System.out.print(a + " ");
            a = (2 * a) - 1;
        }

        System.out.println();
        separator();
    }

    public void task9(){
        System.out.println("Завдання: Виведіть на екран всі двозначні члени послідовності 2a+200, де a1 = -166.");
        System.out.println();

        int a = -166;
        while (a < 100){
            if (a > -100 && a < 100){
                System.out.print(a + " ");
            }
            a = (2 * a) + 200;
        }

        System.out.println();
        separator();
    }

    public void task10(){
        System.out.println("завдання: Створіть програму, яка обчислює факторіал натурального числа n, яке користувач введе з клавіатури.");
        System.out.println();

        int rezult = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть ціле чило: ");
        int b = sc.nextInt();

        for (int i = 1; i < b; i++) {
            rezult = rezult * i;
        }

        System.out.println("Факторіал числа " + b + " дорівнює " + rezult);
        System.out.println();
        separator();

    }

    public void task11(){
        System.out.println("Завдання: Виведіть на екран всі позитивні подільники натурального числа, введеного користувачем з клавіатури.");
        System.out.println();
        int tested = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть ціле чило: ");
        if (sc.hasNextInt()){
            tested = sc.nextInt();
        }else { task11();}

        for (int i = 1; i < tested; i++) {

        }
        if (tested%2 == 0){
            System.out.print(tested + " ");
        }
        System.out.println();
        separator();


    }

    public void task12(){
        System.out.println("Завдання: Перевірте, чи є число записане в змінну n натуральне число - простим. Постарайтеся не виконувати зайвих дій " +
                "(наприклад, після того, як ви знайшли хоча б один нетривіальний дільник вже ясно, що число складене і перевірку продовжувати не потрібно). " +
                "Також врахуйте, що найменший дільник натурального числа n, якщо він взагалі є, обов'язково розташовується в відрізку [2; √n]. ");
        System.out.println();
        boolean dontStop = true;
        int counter = 2;

        Random rm = new Random();
        int n = rm.nextInt(100);
        System.out.println("Задане число " + n);
        do {
            if (n%counter == 0){
                dontStop = false;
                System.out.println("Число є складним");
            }
            counter++;
        }while (dontStop || counter > Math.sqrt(n));

        System.out.println();
        separator();

    }

    public void task13(){
        System.out.println("Завдання: Створіть програму, що виводить на екран 12 перших елементів послідовності з кроком 2an-2, де a1 = 3 і a2 = 2.");
        System.out.println();
        int a = 3;

        for (int i = 1; i < 13; i++) {
            int rez = (2 * a-- * i) - 2;
            System.out.print(rez + " ");
        }
        System.out.println();
        separator();
    }

    public void task14(){
        System.out.println("Завдання: Виведіть на екран перші 11 членів послідовності Фібоначчі. Нагадуємо, що перший і другий члени послідовності рівні одиницям, а кожен наступний - сумою двох попередніх. ");
        System.out.println();
        int a1 = 1;
        int a2 = 1;
        System.out.print(a1 + " " + a2 + " ");
        for (int i = 0; i < 10; i++) {
            int next = a1 + a2;
            System.out.print(next + " ");
            a1 = a2;
            a2 = next;
        }

        System.out.println();
        separator();


    }

    public void task15(){
        System.out.println("завдання: Для записаного в змінну n натурального числа порахуйте суму всіх його цифр (заздалегідь не відомо скільки цифр буде в числі).");
        System.out.println();

        Random rm = new Random();
        int n = rm.nextInt(10000);
        System.out.println("Число n " + n);
        String number = Integer.toString(n);
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            char x = number.charAt(i);
            String y = Character.toString(x);
            sum += Integer.parseInt(y);

        }
        System.out.println("Сумма чисел дорівнює " + sum);
        System.out.println();
        separator();

    }

    public double task16(int from, int to){
        System.out.println("Завдання:  написати метод static double rendom(int from, int to){ повинен повертати рандомне значення " +
                "в межах які задаються при виклику метода через змінні фром і ту, наприклад double random = random(3, 10)");
        System.out.println();
        Random rm = new Random();

        double result = from + (rm.nextDouble() +(to - from));



        return result;
    }

    public void taskArray1(){
        System.out.println(" Створіть масив з усіх парних чисел від 2 до 20 і виведіть елементи масиву на екран спочатку в рядок, відокремлюючи один елемент від іншого прогалиною, " +
                "а потім в стовпчик (відокремлюючи один елемент від іншого початком нового рядка). Перед створенням масиву подумайте, якого він буде розміру. ");
        System.out.println();

        int[] array = new int[10];

        for (int i = 2, j = 0; i <= 20; i+=2, j++) {
            array[j] = i;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println();
        separator();
    }

    public void taskArray2(){
        System.out.println(" Створіть масив з усіх непарних чисел від 1 до 99, виведіть його на екран у рядок, " +
                "а потім цей же масив виведіть на екран теж в рядок, але в зворотному порядку (99 97 95 93 ... 7 5 3 1). ");
        System.out.println();

        int[] array = new int[50];
        int j = 1;

        for (int i = 0; i < array.length; i++) {
            array[i] = j;
            System.out.print(j + " ");
            j +=2;

        }
        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        separator();

    }

    public void taskArray3(){
        System.out.println("Створіть масив з 15 випадкових цілих чисел з відрізка [0; 9]. Виведіть масив на екран. " +
                "Підрахуйте скільки в масиві парних елементів і виведете цю кількість на екран на окремому рядку. ");
        System.out.println();
        int even = 0;

        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random(0, 9);
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i]%2 == 0){
                even++;
            }
        }
        System.out.println();
        System.out.println("Клькість парних: " + even);
        System.out.println();
        separator();

    }

    public void taskArray4(){
        System.out.println(" Створіть масив з 8 випадкових цілих чисел з відрізка [1; 10]. Виведіть масив на екран у рядок. " +
                "Замініть кожен елемент з непарним індексом на нуль. Знову виведете масив на екран на окремому рядку. ");
        System.out.println();

        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = random(1, 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < array.length; i+=2) {
            array[i] = 0;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        separator();
    }

    public void taskArray5(){
        System.out.println("Створіть 2 масиви з 5 випадкових цілих чисел з відрізка [0; 5] кожен, виведіть масиви на екран у двох окремих рядках. " +
                "Порахуйте середнє арифметичне елементів кожного масиву і повідомте, " +
                "для якого з масивів це значення виявилося більше (або повідомте, що їх середні арифметичні рівні). ");
        System.out.println();

        int[] arrayFirst = new int[5];
        int[] arraySecond = new int[5];

        for (int i = 0; i < arrayFirst.length; i++) {
            arrayFirst[i] = random(0,5);
            arraySecond[i] = random(0,5);
            System.out.print(arrayFirst[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arraySecond.length; i++) {
            System.out.print(arraySecond[i]+ " ");
        }
        System.out.println();
        double summFirst = 0;
        double summSecond = 0;
        for (int i = 0; i < arrayFirst.length; i++) {
            summFirst += arrayFirst[i];
            summSecond += arraySecond[i];
        }
        System.out.println();
        System.out.println("Сумма першого " + summFirst);
        System.out.println("Сумма другого " + summSecond);
        System.out.println();

        double seredFirs = summFirst/arrayFirst.length;
        double seredSecond = summSecond/arraySecond.length;

        if(seredFirs > seredSecond){
            System.out.println("Cереднє арифметичне першого масиву " + seredFirs + " більше ніж " + seredSecond + " першого");
        }else if(seredFirs < seredSecond) {
            System.out.println("Cереднє арифметичне другого масиву " + seredFirs + " більше ніж " + seredSecond + " другого");
        }else {
            System.out.println("Середні арифметичні рівні " + seredFirs);
        }
        System.out.println();
        separator();

    }

    public void taskArray6(){
        System.out.println("Створіть масив з 4 випадкових цілих чисел з відрізка [10; 99], виведіть його на екран у рядок. " +
                "Визначити і вивести на екран повідомлення про те, чи є масив строго зростаючої послідовністю. ");
        System.out.println();
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = random(10, 99);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        boolean zrost = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]){
                System.out.println("Масив не є зростаючим, тому що " + (i - 1) + " елемент є більший ніж " +  i + " елемент.");
                zrost = false;
            }
        }
        if (zrost){
            System.out.println("Послідовність зростаюча");
        }


        System.out.println();
        separator();
    }

    public void taskArray7(){
        System.out.println(" Створіть масив з 20-ти перших чисел Фібоначчі і виведіть його на екран. Нагадуємо, що перший і другий члени " +
                "послідовності рівні одиницям, а кожен наступний - сумою двох попередніх. ");
        System.out.println();

        int[] array = new  int[20];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
        separator();
    }

    public void taskArray8(){
        System.out.println(" Створіть масив з 12 випадкових цілих чисел з відрізка [-15; 15]. " +
                "Визначте який елемент є в цьому масиві максимальним і повідомте індекс його останнього входження в масив. ");
        System.out.println();

        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = random(-15, 15);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = -15;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] >=  max){
                max = array[i];
                index = i;
            }
        }

        System.out.println("Максимальне число " + max + "  з індексом " + index);
        System.out.println();
        separator();

    }

    public void taskArray9(){
        System.out.println("Створіть два масиви з 10 цілих випадкових чисел з відрізка [1; 9] і третій масив з 10 дійсних чисел. " +
                "Кожен елемент з i-им індексом третього масиву повинен дорівнювати відношенню елементу з першого масиву з i-им індексом до елементу з другого масиву з i-им індексом." +
                " Вивести всі три масиву на екран (кожен на окремому рядку), потім вивести кількість цілих елементів в третьому масиві. ");
        System.out.println();
        int size = 10;

        double[] arrayFirst = new double[size];
        double[] arraySecond = new double[size];
        double[] arrayThird = new double[size];

        for (int i = 0; i < size; i++) {
            arrayFirst[i] = random(1,9);
            arraySecond[i] = random(1,9);
            arrayThird[i] = arrayFirst[i]/arraySecond[i];
        }

        for (int i = 0; i < arrayFirst.length; i++) {
            System.out.print(arrayFirst[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arraySecond.length; i++) {
            System.out.print(arraySecond[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arrayThird.length; i++) {
            System.out.print(arrayThird[i] + " ");
        }
        System.out.println();
        System.out.print("Цілі числа: ");
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if(arrayThird[i]%1 == 0){
                System.out.print(arrayThird[i] + " ");
                counter++;
            }
        }
        System.out.println();
        System.out.println("Кількість цілих чисел " + counter);
        System.out.println();
        separator();

    }

    public void taskArray10(){
        System.out.println("Створіть масив з 11 випадкових цілих чисел з відрізка [-1; 1], виведіть масив на екран у рядок. " +
                "Визначте який елемент зустрічається в масиві найчастіше і виведіть про це повідомлення на екран. " +
                "Якщо два якихось елемента зустрічаються однакову кількість разів, то не виводьте нічого. ");
        System.out.println();
        int[] array = new int[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = random(-2, 1);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int counterFirst = 0;
        int counterSecond = 0;
        int counterThird = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == -1){
                counterFirst++;
            }else if (array[i] == 0){
                counterSecond++;
            }else {
                counterThird++;
            }
        }

        if(counterFirst != counterSecond && counterFirst != counterThird && counterSecond != counterThird) {
            int[] number = {-1, 0, 1};
            int[] quantity = {counterFirst, counterSecond, counterThird};

            int max = quantity[0];
            int maxIdex = 0;
            for (int i = 0; i < quantity.length - 1; i++) {
                if (quantity[i + 1] > quantity[i]) {
                    maxIdex = i + 1;
                }
            }
            System.out.println();
            System.out.print("Число " + number[maxIdex] + " зустрічається найбільше раз " + quantity[maxIdex]);
        }




    }


}
