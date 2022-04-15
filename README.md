# HackerRank_Java_Currency_Formatter
Given a double precision number, payment, denoting an amount of money, use the number format class getCurrencyinstance method to convert payment onto the US, Indian, Chinese and French currency formats. Then print the formatted values as follows:

US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment

where formatted Payment is payment formatted according to the appropriate locale's currency.

NOte India does not have a built in locale, do you must construct one where the language is en (i.e. English)

Input Formatt

A single double precision number denoting payment.


Constraints
    .0 <= payment <= 10^9
    

Output Format
  On the first line, print Us: u where u is payment formatted for Us currency.
  On the second line, print India: i where i is payment formatted for indian currency.
  On the second line, print China: c where c is payment formatted for chinese currency.
  On the second line, print France: f where f is payment formatted for France currency.
  

Sample input
   12324.134
   
 
 Sample Output
    Us: $12,324.13
    India: Rs. 12,324.13
    China: 12, 324.13
    France: 12 324, 13
 
Explanation
    Each line contains the value of payment formatted accourding to the four countries' respective currencies.
