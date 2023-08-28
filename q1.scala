@main def init() ={
  def calculateAverage(temperatures: List[Double]): Double = {
    val fahrenheitTemperatures = temperatures.map(c => (c * 9/5) + 32)
    // println(fahrenheitTemperatures)
    val averageTemp = fahrenheitTemperatures.reduce(_ + _) / fahrenheitTemperatures.length
    averageTemp
  }

  val temperatures = List(0.0, 10.0, 20.0, 30.0)

  val averageTemperature = calculateAverage(temperatures)
  println(s"Average Fahrenheit temperature: $averageTemperature")
}