void main(List<String> args) {
  const tanggal = 20;
  const bulan = 12;
  const tahun = 2001;
  String namaBulan;

  switch (true) {
    case (tanggal < 1 || tanggal > 31):
      print("tanggal salah");
      break;
    case (bulan < 1 || bulan > 12):
      print("bulan salah");
      break;
    case (tahun < 1900 || tahun > 2200):
      print("tahun salah");
      break;
    default:
      {
        switch (true) {
          case bulan == 1:
            namaBulan = 'Januari';
            break;
          case bulan == 2:
            namaBulan = 'Februari';
            break;
          case bulan == 3:
            namaBulan = 'Maret';
            break;
          case bulan == 4:
            namaBulan = 'April';
            break;
          case bulan == 5:
            namaBulan = 'Mei';
            break;
          case bulan == 6:
            namaBulan = 'Juni';
            break;
          case bulan == 7:
            namaBulan = 'Juli';
            break;
          case bulan == 8:
            namaBulan = 'Agustus';
            break;
          case bulan == 9:
            namaBulan = 'September';
            break;
          case bulan == 10:
            namaBulan = 'Oktober';
            break;
          case bulan == 11:
            namaBulan = 'November';
            break;
          case bulan == 12:
            namaBulan = 'Desember';
            break;
          default:
            break;
        }
        print(tanggal);
        print(bulan);
        print(tahun);
      }
  }
}