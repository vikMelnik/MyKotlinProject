package come.geekbrains.mykotlinproject

data class Movie(var name: String, var director: String, var year: Int) {
    override fun toString(): String {
        return  "name: '" + name + '\'' +
                ", auther: '" + director + '\'' +
                ", year: " + year
    }
}