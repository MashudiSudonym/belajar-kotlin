fun main(args: Array<String>) {
    for (x in 1..5) {
        for (y in 2..3){
            print(y)
        }
        println()
    }
    for (i in 1..5) {
        for (j in 4 downTo i) {
            print(" ")
        }
        for (k in 1..i) {
            print("*")
        }
        println()
    }
}