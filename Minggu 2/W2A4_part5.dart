import 'dart:io';

void main(List<String> args) {
  print("PERSEGI 4X8");
  var pagar = '#';

  for (var i = 0; i < 4; i++) {
    for (var j = 0; j < 8; j++) {
      stdout.write(pagar);
    }
    print("");
  }

  print("SEGITIGA");

  var tinggi = 7;
  var newPagar = "";

  for (var k = 1; k <= tinggi; k++) {
    for (var l = 1; l <= k; l++) {
      newPagar += "#";
    }
    print(newPagar);
    newPagar = "";
  }
}