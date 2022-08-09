fun main() {
    
    // Read-only (immutable)
    val names = listOf("Ahad", "Turki", "Raghad", "Nasser", "Sumayah", "Fahdah")
    val namesAll = listOf("Ahad", "Turki", "Raghad", "Nasser")
    val color = listOf<String>()
    
    // Read and Write (mutable)
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val weekDays = mutableListOf("Sun", "Mon", "Tue", "Wed", "Thurs", "Fri", "Sat")
    
    // Read-Write (mutable) List - Operations
    // Add (Element)
   	numbers.add("six")
    println("$numbers")
    // Add (Index, Element)
   	numbers.add(1,"1")
    println("$numbers")
    // Add All (List)
    numbers.addAll(weekDays)
   	println("$numbers")
    // Add All (Index, List)
    numbers.addAll(0,weekDays)
   	println("$numbers")
    // Clear 
  	weekDays.clear()
    println("$weekDays")
    // Remove
    numbers.remove("two")
    println("$numbers")
    // Remove At 
    numbers.removeAt(1)
    println("$numbers")
    // Remove All
   	numbers.removeAll(numbers)
    println("$numbers")

    // Read-only (immutable) List - Operations
    // The size of the list
    val size = names.size
    println("$size")
    // Contains
    val Contains = names.contains("Turki")
   	println("$Contains")
    // Contains All
   	val ContainsAll =names.containsAll(namesAll)
    println("$ContainsAll")
    // get
    val geet = names.get(0)
   	println("$geet")
    // indexOf
    val indexOf = names.indexOf("Raghad")
   	println("$indexOf")
    // isEmpty
    val isEmpty = color.isEmpty()
   	println("$isEmpty")
    // Sublist
    val Sublist = names.subList(2,5)
    println("$Sublist")
    
}
