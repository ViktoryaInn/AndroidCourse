class Opossum {
    private var height: Int
        set (value){
            if((value > 35) and (value < 53)){
                field = value
            }
        }

    private var weight: Double
        set(value){
            if((value >= 1.6) and (value <= 5.7)){
                field = value
            }
        }

    private var age: Int
        set(value){
            if((value >= 0) and (value <= 8)){
                field = value
            }
        }

    constructor(_height:Int, _weight:Double, _age:Int){
        height = _height
        weight = _weight
        age = _age
    }

    fun printOpossum(){
        println("Характеристики опоссума:")
        println("Рост (см): $height")
        println("Вес (кг): $weight")
        println("Возраст (полных лет): $age")
        println("------------------------")
    }
}