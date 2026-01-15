class Tamagotchi(var InitName : String) {
    var Name = InitName;
    var Age : Int = 0
    var Hunger : Int = 100
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
    var Happiness : Int = 0
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
    var Energy : Int = 50
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

}