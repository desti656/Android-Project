import 'dart:io';

void main(List<String> args) {
  print("Memilih karakter dan peran");
     print("name: ");
   String masukanNama = stdin.readLineSync()!;
   //print(masukanNama + masukanPeran);
    print("masukan Peran: ");
    String masukanPeran = stdin.readLineSync()!;
   if(masukanNama =='' && masukanPeran==''){
     print("masukan nama dan peran");
   } else if(masukanNama == 'john' && masukanPeran==''){
     print("halo john pilih peran mu");
   }
    else if( masukanNama=='jane' && masukanPeran=='penyihir'){
     print("Selamat datang di Dunia Werewolf, Jane\nHalo Penyihir Jane, kamu dapat melihat siapa yang menjadi werewolf!");
   }
    else if(masukanNama =='jenita' && masukanPeran =='guard'){
     print("Selamat datang di Dunia Werewolf, Jenita\nHalo Guard Jenita, kamu akan membantu melindungi temanmu dari serangan werewolf.");
   }
    else if(masukanNama=='junaidi' && masukanPeran=="werewolf"){
     print("Selamat datang di Dunia Werewolf, Junaedi\nHalo Werewolf Junaedi, Kamu akan memakan mangsa setiap malam!");
   } else{
     print("kamu akan menjadi penonton");
   }
}