//2. Написать метод, принимающий на вход два целых числа и проверяющий, 
//что их сумма лежит в пределах от 10 до 20 (включительно), 
//если да – вернуть true, в противном случае – false.

    static boolean doThree(int a, int b) {
        System.out.println("\nЗадание 2.");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }