void main(List<String> args) async {
  print("Yovie and Nuno- Laksana Surgaku");
  print(await "--------------------");
  print(await line1());
  print(await line2());
  print(await line3());
  print(await line4());
  print(await line5());
  print(await "--------------------");
}
Future<String> line1() async {
  String lirik = "Dirimu laksana surgaku tempat ku mencurahkan";
  return await Future.delayed(Duration(seconds: 5), () => (lirik));
}
Future<String> line2() async {
  String lirik = "Segala rasa cinta suci yang tulus di dalam batinku";
  return await Future.delayed(Duration(seconds: 6), () => (lirik));
}
Future<String> line3() async {
  String lirik = "Tiada yang mampu gantikan titahmu di hatiku";
  return await Future.delayed(Duration(seconds: 7), () => (lirik));
}
Future<String> line4() async {
  String lirik = "Menyejukkan seluruh jiwa";
  return await Future.delayed(Duration(seconds: 8), () => (lirik));
}
Future<String> line5() async {
  String lirik = "Melebur ke dasar sukmaku";
  return await Future.delayed(Duration(seconds: 8), () => (lirik));
}