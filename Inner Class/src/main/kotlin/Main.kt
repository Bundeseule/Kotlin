fun main() {
    val listView = ListView(arrayOf("Name 1","Name 2","Name 3"))

    listView.ListViewItem().displayItem(2)
}

class ListView(val items: Array<String>){

    inner class ListViewItem() {
        fun displayItem(position: Int){
            println(items[position])
        }
    }
}