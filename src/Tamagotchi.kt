class Tamagotchi(var initName : String) {
    var name = initName;
    var age : Int = 0
    var hunger : Int = 100
        set(value) {
            if (value < 0) {
                field = 0
            }
            else if (value > 100) {
                field = 100
            }
            else {
                field = value
            }
        }
        get() {
            return field
        }
    var happiness : Int = 0
        set(value) {
            if (value < 0) {
                field = 0
            }
            else if (value > 100) {
                field = 100
            }
            else {
                field = value
            }
        }
        get() {
            return field
        }
    var energy : Int = 50
        set(value) {
            if (value < 0) {
                field = 0
            }
            else if (value > 100) {
                field = 100
            }
            else {
                field = value
            }
        }
        get() {
            return field

        }

    fun display() {
        println("Tamagotchi: " + this.name)
        println("Age: " + this.age + " days")
        println("Hunger: " + this.hunger + "/100")
        println("Happiness: " + this.happiness + "/100")
        println("Energy: " + this.energy + "/100")
    }

    fun Eat() {
        if (hunger == 0) {
            println(this.name + " is full.")
        }
        else {
            this.hunger -= 25
            this.happiness += 3
            this.energy += 10
            println("Yum!")

        }
    }

    fun Play() {
        if (this.hunger > 50) {
            println(this.name + " is too hungry to play.")
        }

        else if (this.energy < 20) {
            println(this.name + " is too tired to play.")
        }

        else {
            this.hunger += 10
            this.happiness += 4
            this.energy -= 20
            println(this.name + " chased a digital ball")
        }
    }

    fun Sleep() {
        if (this.hunger > 70) {
            println(this.name + " is too hungry to sleep.")
        }
        else {
            println(this.name + " slept through the rest of the day")
            this.hunger += 30
            this.energy += 10
            this.happiness -= 10
            this.age += 1
        }
    }

}