fun main() {
    var num = arrayOf(
        //0        1     2
        arrayOf<String>("Peter", "Paul", "Mary"),//0
        arrayOf<String>("John", "Mark", "Matthew"),//1
        arrayOf<String>("James", "Luke", "MZachery"),//2
    )


    var row: Int = 0;
    while (row < 3) {
        var column: Int = 0;
        while (column < 3) {
            println(" ${num[row][column]} ")
            column++
        }
        println()
        row++

    }
}