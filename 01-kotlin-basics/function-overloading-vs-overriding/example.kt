// Overloading example: same function name, different parameters
fun showMessage(message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}

fun showMessage(messageResId: Int) {
    Toast.makeText(context, context.getString(messageResId), Toast.LENGTH_SHORT).show()
}

// Overriding example: overriding a function in RecyclerView.Adapter
class MyAdapter : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // Custom logic for binding data
    }

    override fun getItemCount(): Int {
        return 10
    }
}
