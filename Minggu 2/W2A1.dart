void main() {
 //--STRING
 print("String");
 var sentences = "dart";
 print(sentences[0]); // "D"
 print(sentences[2]);// "W"



 //--NUMBERS
 print("");
 print("Numbers");
 // declare an integer
 int num1 = 10;

 // declare a double value
 double num2 = 10.50;
 // print the values

 print(num1); //10
 print(num2); //10.5



 //--MENGUBAH STRING MENJADI INTEGER
 print("");
 print("Mengubah String menjadi Integer");
 print(num.parse('12')); //12
 print(num.parse('10.91')); //10.91



 //--MENGUBAH INTEGER MENJADI STRING
 print("");
 print("Mengubah Integer menjadi String");
 int j = 45;
 String t = "$j";
 print("hello"+ t);
}