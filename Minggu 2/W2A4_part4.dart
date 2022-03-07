void main() {
  var i = 2;
  var textSatu = "I Love Coding";
  var textDua = "I will be a mobile programmer";

  print("LOOPING PERTAMA");
  while (i <= 20) {
    print("${i}-" + textSatu);
    i += 2;
  }

  print("LOOPING KEDUA");
  while (i >= 2) {
    i -= 2;
    if (i != 0) {
      print(i.toString() + "-" + textDua);
    }
  }
}