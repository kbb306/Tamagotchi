fun main() {
    print("Enter a name for your tamagotchi: ")
    val name: String = readln()
    val pet = Tamagotchi(name)
    var choice = 0
    while(choice != 5) {
        println("1. Display tamagotchi")
        println("2. Play with tamagotchi")
        println("3. Feed tamagotchi")
        println("4. Put tamagotchi to bed")
        println("5. Quit game")
        print("Enter your choice: ")
        choice = readln().toInt()
        when (choice) {
            1 -> pet.display()
            2 -> pet.play()
            3 -> pet.eat()
            4 -> pet.sleep()
            5 -> println("Goodbye!")
            else -> println("Invalid choice")
        }
    }

}