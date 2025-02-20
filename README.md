Project Assignment: Password Generator
Description: This project aims to develop a Java program that generates secure and customizable passwords based on user-defined criteria.
Functionality:
Input:

Allow users to specify the desired password length (minimum and maximum).
Offer options to include various character types (lowercase, uppercase letters, numbers, symbols).
Enable users to define custom character sets for specific needs.
Output:
Generate and print a random password.
Ensure the password meets the chosen criteria (length, character types).
Display password strength based on industry standards (e.g.,zxcvbn score).

ПРОБЛЕМЫ И ТРУДНОСТИ:
В процессе написании кода после input.nextInt() оставался как я понял символ перевода строки,

Из-за этого программа не давала пользователю ввести нужные символы. Долго не мог понять, с чем это может быть связано, и в интернете нашел статью на эту тему:

(https://sky.pro/media/problema-propuska-metoda-nextline-posle-ispolzovaniya-next-ili-nextfoo-v-java/) 

После input.nextInt(), всегда нужно добавлять input.nextLine();, чтобы убрать лишний Enter. 

На данный момент есть проблемы с реализацией той части программы, которая отвечает за отбор нужных символов, цифр, строчных и заглавных букв именно в рандомном 

порядке, учитывая длину пароля введенного пользователем. (18.02.25)
