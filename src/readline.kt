fun main(args: Array<String>){
    print("Masukkan nama: ")
    var name = readLine()
    print("Masukkan umur: ")
    var umur = readLine()?.toInt()
    println("Nama = ${name}")
    println("Umur = ${umur}")
}