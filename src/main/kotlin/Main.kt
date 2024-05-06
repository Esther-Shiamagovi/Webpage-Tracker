fun main() {
    val page= VisitTrackers()
    page.tracker("Home")
    page.tracker("About")
    page.tracker("Contacts")
    page.tracker("Home")
    page.tracker("About")
    page.tracker("Contacts")
    page.tracker("Home")
    page.tracker("Home")
    page.tracker("Home")
    page.tracker("About")
    page.tracker("About")
    page.tracker("Contacts")
    page.tracker("sign up")
    page.tracker("login")
    page.tracker("Home")
    page.tracker("sign up")
    page.tracker("login")
    page.tracker("contacts")
    page.tracker("fan facts")
    page.tracker("fan facts")
    page.tracker("comments")
    page.tracker("fan fact")
    page.tracker("comments")
    page.tracker("fan facts")
    page.tracker("sign up ")
    page.tracker("sign up")



    println(page.topFive())
}
class VisitTrackers(){
    val visits= mutableMapOf<String,Int>()
    fun tracker(page:String){
        //getting the value with specific key else returns a default
        visits[page] = visits.getOrDefault(page,0)+1
    }
    fun topFive():List<Pair<String , Int>>{
        return visits.toList().sortedByDescending { it.second }.take(5)
    }
}