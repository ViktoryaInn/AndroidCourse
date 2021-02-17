import kotlin.random.Random

class OpossumGroupGenerator {
    private var maxOpossumCount: Int
    private var minOpossumCount: Int
    private var finalOpossumCount: Int
    private var opossums: ArrayList<Opossum>

    constructor(_maxOpossumCount: Int, _minOpossumCount:Int){
        maxOpossumCount = _maxOpossumCount
        minOpossumCount = _minOpossumCount
        finalOpossumCount = (minOpossumCount..maxOpossumCount).random()
        opossums = createOpossums(finalOpossumCount)
    }

    private fun createOpossums(opossumsCount: Int):ArrayList<Opossum>{
        var listOfOpossums = ArrayList<Opossum>()
        for(n in 1..opossumsCount){
            listOfOpossums.add(createOpossum())
        }
        return listOfOpossums
    }

    private fun createOpossum():Opossum{
        var height: Int = Random.nextInt(35,53)
        var weight: Double = Math.round(Random.nextDouble(1.6,5.7) * 100.0) / 100.0
        var age: Int = Random.nextInt(0,8)
        var opossum: Opossum = Opossum(height, weight, age)
        opossum.printOpossum()
        return opossum
    }
}