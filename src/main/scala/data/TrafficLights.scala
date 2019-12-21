package data

sealed trait TrafficLights {
  def next: TrafficLights
}

case object Red extends TrafficLights {
  override def next: TrafficLights = Green
}

case object Green extends TrafficLights {
  override def next: TrafficLights = Yellow
}

case object Yellow extends TrafficLights {
  override def next: TrafficLights = Red
}

